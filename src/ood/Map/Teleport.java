package ood.Map;

import ood.Role.Hero;
import ood.Team.HerosTeam;
import ood.Team.MonsterTeam;
import ood.Utils.ColorfulOutput;
import ood.Utils.InputCheck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Teleport function for move to another hero's around on map.
 */
public class Teleport {
    ColorfulOutput color = new ColorfulOutput();
    InputCheck in = new InputCheck();
    public Teleport() {
    }

    public void teleport(LinkedList<HerosTeam> heroes, HerosTeam hero, GameMap map) {
        color.blueOut("Where do you want to go?");
        LinkedList<String> threeLane = new LinkedList<>();
        threeLane.add("Top");
        threeLane.add("Mid");
        threeLane.add("Bottom");
        threeLane.remove(hero.getLane());

        for(int i = 0; i < threeLane.size(); i++){
            color.yellowOut((i+1) + " " + threeLane.get(i));
        }

        int choice = -1;
        while (!in.checkInt(choice,1,2)) {
            System.out.printf("which lane you want to choose? (choose by number)\n");
            choice = in.getInt(in.getInput());
        }

        HerosTeam target = null;
        for (int i = 0; i < heroes.size(); i++){
            if(heroes.get(i).getLane().equals(threeLane.get(choice-1))){
                target = heroes.get(i);
                break;
            }
        }

        if(target != null) {
            int i_t = target.getTeamPos_i();
            int j_t = target.getTeamPos_j();

            LinkedList<ArrayList<Integer>> legal = new LinkedList<>();

            if (i_t-1 >= 0) {
                if (map.board[i_t - 1][j_t].getSymbol().equals("   ") || map.board[i_t - 1][j_t].getSymbol().equals(" B ") || map.board[i_t - 1][j_t].getSymbol().equals(" C ") || map.board[i_t - 1][j_t].getSymbol().equals(" K ")) {
                    ArrayList tmp = new ArrayList<>();
                    tmp.add(i_t - 1);
                    tmp.add(j_t);
                    legal.add(tmp);
                }
            }

            if (i_t+1 < map.getHeight()) {
                if (map.board[i_t + 1][j_t].getSymbol().equals("   ") || map.board[i_t + 1][j_t].getSymbol().equals(" B ") || map.board[i_t + 1][j_t].getSymbol().equals(" C ") || map.board[i_t + 1][j_t].getSymbol().equals(" K ")) {
                    ArrayList tmp = new ArrayList<>();
                    tmp.add(i_t + 1);
                    tmp.add(j_t);
                    legal.add(tmp);
                }
            }

            if (j_t + 1 < map.getWidth()) {
                if (map.board[i_t][j_t + 1].getSymbol().equals("   ") || map.board[i_t][j_t + 1].getSymbol().equals(" B ") || map.board[i_t][j_t + 1].getSymbol().equals(" C ") || map.board[i_t][j_t + 1].getSymbol().equals(" K ")) {
                    ArrayList tmp = new ArrayList<>();
                    tmp.add(i_t);
                    tmp.add(j_t + 1);
                    legal.add(tmp);
                }
            }

            if(j_t-1 >= 0) {
                if (map.board[i_t][j_t - 1].getSymbol().equals("   ") || map.board[i_t][j_t - 1].getSymbol().equals(" B ") || map.board[i_t][j_t - 1].getSymbol().equals(" C ") || map.board[i_t][j_t - 1].getSymbol().equals(" K ")) {
                    ArrayList tmp = new ArrayList<>();
                    tmp.add(i_t);
                    tmp.add(j_t - 1);
                    legal.add(tmp);
                }
            }

            for(int i = 0; i < legal.size(); i++){
                color.yellowOut("You can go to these spot");
                color.blueOut((i+1) + " " + legal.get(i).toString());
            }

            int choice_tp = -1;
            while (!in.checkInt(choice_tp,1,legal.size())) {
                System.out.printf("which spot you want to choose? (choose by number)\n");
                choice_tp = in.getInt(in.getInput());
            }
            map.board[hero.getTeamPos_i()][hero.getTeamPos_j()].setSymbol(map.board[hero.getTeamPos_i()][hero.getTeamPos_j()].getStatus());
            hero.setTeamPos_i(legal.get(choice_tp-1).get(0));
            hero.setTeamPos_j(legal.get(choice_tp-1).get(1));
            hero.setLane(target.getLane());
            map.board[hero.getTeamPos_i()][hero.getTeamPos_j()].setSymbol(color.yellowBG(" H "));

        }else{
            // no hero found in target lane
            color.redOut("bad tp.");
        }



    }
}
