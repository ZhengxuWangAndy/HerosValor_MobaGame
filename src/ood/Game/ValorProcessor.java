
package ood.Game;

import ood.Battle.Battle;
import ood.Battle.CheckRange;
import ood.Map.GameMap;
import ood.Map.Recall;
import ood.Map.Teleport;
import ood.Market.Market;
import ood.Market.MobaMarket;
import ood.Role.Generator;
import ood.Role.Hero;
import ood.Team.*;
import ood.Utils.ColorfulOutput;
import ood.Utils.Controller;
import ood.Utils.InputCheck;

import java.util.LinkedList;

/**
 * The processor of this specific game.
 */

public class ValorProcessor {
    public Boolean ValorProcessor() throws InterruptedException {

        // input and output class
        InputCheck inputCheck = new InputCheck();
        ColorfulOutput colorOut = new ColorfulOutput();
        colorOut.purpleOut(" __       _______   _______  _______ .__   __.  _______       _______.\n" +
                "|  |     |   ____| /  _____||   ____||  \\ |  | |       \\     /       |\n" +
                "|  |     |  |__   |  |  __  |  |__   |   \\|  | |  .--.  |   |   (----`\n" +
                "|  |     |   __|  |  | |_ | |   __|  |  . `  | |  |  |  |    \\   \\    \n" +
                "|  `----.|  |____ |  |__| | |  |____ |  |\\   | |  '--'  |.----)   |   \n" +
                "|_______||_______| \\______| |_______||__| \\__| |_______/ |_______/    \n" +
                "                                                                      \n" +
                "                          ______    _______                           \n" +
                "                         /  __  \\  |   ____|                          \n" +
                "                        |  |  |  | |  |__                             \n" +
                "                        |  |  |  | |   __|                            \n" +
                "                        |  `--'  | |  |                               \n" +
                "                         \\______/  |__|                               \n" +
                "                                                                      \n" +
                "         ____    ____  ___       __        ______   .______           \n" +
                "         \\   \\  /   / /   \\     |  |      /  __  \\  |   _  \\          \n" +
                "          \\   \\/   / /  ^  \\    |  |     |  |  |  | |  |_)  |         \n" +
                "           \\      / /  /_\\  \\   |  |     |  |  |  | |      /          \n" +
                "            \\    / /  _____  \\  |  `----.|  `--'  | |  |\\  \\----.     \n" +
                "             \\__/ /__/     \\__\\ |_______| \\______/  | _| `._____|     \n" +
                "                                                                      ");
        colorOut.blueOut("Welcome to the game!\t\tAuthor: Zhengxu Wang\n");
        colorOut.redOut("During the game process, whenever you input q, means quit game.");

        // init map
        GameMap gameMap = new GameMap(8,8);

        // move controller
        Controller controller = new Controller();


        // generate map
        Boolean validMap = false;
        while (!validMap) {
            gameMap.Moba();
            gameMap.printMap();
            System.out.println(colorOut.yellowBG(" N ") + " means Heroes Nexus, each Nexus is a market");
            System.out.println(colorOut.redBG(" X ") + " means obstacle");
            System.out.println(colorOut.purpleBG(" N ") + " means Monsters Nexus");
            System.out.println("    Blank or C , K , B means different landscape with some buff.");
            colorOut.cyanOut("Is that a reasonable map?(input Y to accept, other means reshuffle)");

            if(inputCheck.getInput().equals("Y")){
                validMap = true;
            }
        }


        // hero team
        Generator generator = new Generator();
        //round control
        LinkedList<HerosTeam> HeroQueue = generator.generateHero(gameMap.getHeight());


        //check for battle
        CheckRange checkRange = new CheckRange();



        LinkedList<MonsterTeam> MonsterQueue = new LinkedList<>();


        int roundNum = 0;
        while (true) {
            // sqawn monsters
            if(roundNum == 0 || (roundNum+1) % 8 == 0 ){
                generator.updateLevel(HeroQueue);
                MonsterQueue.addAll(generator.generateMonster());
            }


            //hero move
            int turn_hero = HeroQueue.size();
            for(int k = 0; k < turn_hero; k++) {
                HerosTeam hero = HeroQueue.pop();
                HeroQueue.add(hero);
                //move hero
//                gameMap.printMap();

                int i = hero.getTeamPos_i();
                int j = hero.getTeamPos_j();
                String currStatus = gameMap.getCurrentPosStatus(i, j);


                if (currStatus.equals(" N ")) {
                    // recharge hp
                    hero.getOnly().setHp();
                    //shopping
                    String userIn = "m";
                    while (userIn.equals("M") || userIn.equals("m")) {
                        Hero currRole = (Hero) hero.getOnly();
                        colorOut.blueOut("Hello, " + currRole.getName() + " . You are in Nexus");
                        colorOut.yellowOut("Do you want to trade?(only M/m for trade, other continue to move)");
                        userIn = inputCheck.getInput();
                        if (userIn.equals("M") || userIn.equals("m")) {

                            Market market;
                            // first time arrive
                            if (gameMap.board[i][j].getContent() == null) {
                                market = new MobaMarket();
                            } else {
                                // come again
                                market = gameMap.board[i][j].getContent();
                            }

                            int marketSelect = -1;
                            while (!inputCheck.checkInt(marketSelect, 0, 2)) {
                                colorOut.purpleOut("Do you wanna 1:buy 2:sell 0:passing by (input the serial number)");
                                marketSelect = inputCheck.getInt(inputCheck.getInput());
                            }
                            if (marketSelect == 1) {
                                market.buy(currRole);
                            } else if (marketSelect == 2) {
                                market.sell(currRole);
                            }
                            gameMap.board[i][j].setContent(market);
                        }
                    }

                }


                // find same lane opponent
                MonsterTeam sameLaneMonster = null;

                for (int q = 0; q < MonsterQueue.size(); q++) {
                    if (MonsterQueue.get(q).getLane().equals(hero.getLane())) {
                        sameLaneMonster = MonsterQueue.get(q);
                    }
                }

                // move hero
                Boolean validMove = false;
                while (!validMove) {
                    colorOut.blueOut("Hello, You are using " + hero.getOnly().getName());
                    String move = controller.move();
                    if(move.equals("t")){
                        // tp
                        Teleport tp = new Teleport();
                        tp.teleport(HeroQueue, hero, gameMap);

                        // switch lane, check opponent again
                        for (int q = 0; q < MonsterQueue.size(); q++) {
                            if (MonsterQueue.get(q).getLane().equals(hero.getLane())) {
                                sameLaneMonster = MonsterQueue.get(q);
                            }
                        }

                        break;
                    }

                    // recall
                    if(move.equals("r")){
                        // set pos
                        Recall r = new Recall();
                        r.recall(hero, gameMap);
                        colorOut.yellowOut("You are back to Nexus");
                        break;
                    }

                    validMove = gameMap.move(move, hero, sameLaneMonster);
                }
                gameMap.printMap();


                // GAME OVER
                if(hero.getTeamPos_i() == 0){
                    colorOut.redOut(" ### VICTORY ### ");
//                    System.exit(0);
                    return true;
                }


                // start battle
                if(sameLaneMonster != null) {
                    if (checkRange.checkRange(hero, sameLaneMonster)) {
                        colorOut.redOut("Battle Start");
                        Battle battle = new Battle<>(sameLaneMonster, hero);
                        String judge = battle.start();
                        if (judge.equals("WIN")) {
                            // monster die
                            gameMap.board[sameLaneMonster.getTeamPos_i()][sameLaneMonster.getTeamPos_j()].setSymbol(gameMap.board[sameLaneMonster.getTeamPos_i()][sameLaneMonster.getTeamPos_j()].getStatus());
                            MonsterQueue.remove(sameLaneMonster);
                            gameMap.printMap();
                        } else {
                            // hero die
                            gameMap.board[hero.getTeamPos_i()][hero.getTeamPos_j()].setSymbol(gameMap.board[hero.getTeamPos_i()][hero.getTeamPos_j()].getStatus());
                            hero.setTeamPos_i(hero.getInit_i());
                            hero.setTeamPos_j(hero.getInit_j());
                            hero.setLane(hero.getInitialLane());
                            hero.getOnly().setHp();
                            colorOut.redOut("Hero died, resurrect in Nexus");
                            gameMap.printMap();

                        }

                    }
                }


            }

            //monster move
            int turn_monster = MonsterQueue.size();
            for(int k = 0; k < turn_monster; k++) {
                MonsterTeam monster = MonsterQueue.pop();
                MonsterQueue.add(monster);



                HerosTeam sameLaneHero = null;

                for (int i = 0; i < HeroQueue.size(); i++) {
                    if (HeroQueue.get(i).getLane().equals(monster.getLane())) {
                        sameLaneHero = HeroQueue.get(i);
                    }
                }

                gameMap.move_Monster(monster, sameLaneHero);

                gameMap.printMap();
                Thread.sleep(1000);

                // GAME OVER
                if(monster.getTeamPos_i() == gameMap.getWidth() - 1){
                    colorOut.redOut(" ### DEFEAT ### ");
//                    System.exit(0);
                    return false;
                }


                // start battle
                if(sameLaneHero != null) {
                    if (checkRange.checkRange(sameLaneHero, monster)) {
                        colorOut.redOut("Battle Start");
                        Battle battle = new Battle<>(monster, sameLaneHero);
                        String judge = battle.start();
                        if (judge.equals("WIN")) {
                            // monster die
                            gameMap.board[monster.getTeamPos_i()][monster.getTeamPos_j()].setSymbol(gameMap.board[monster.getTeamPos_i()][monster.getTeamPos_j()].getStatus());
                            MonsterQueue.remove(monster);
                            gameMap.printMap();
                        } else {
//                          // hero die
                            gameMap.board[sameLaneHero.getTeamPos_i()][sameLaneHero.getTeamPos_j()].setSymbol(gameMap.board[sameLaneHero.getTeamPos_i()][sameLaneHero.getTeamPos_j()].getStatus());
                            sameLaneHero.setTeamPos_i(sameLaneHero.getInit_i());
                            sameLaneHero.setTeamPos_j(sameLaneHero.getInit_j());
                            sameLaneHero.setLane(sameLaneHero.getInitialLane());
                            sameLaneHero.getOnly().setHp();
                            colorOut.redOut("Hero died, resurrect in Nexus");
                            gameMap.printMap();
                        }
                    }
                }
            }
            roundNum++;
        }
    }
}
