package ood.Team;

import ood.Utils.ColorfulOutput;
import ood.Utils.InputCheck;
import ood.Role.Paladins;
import ood.Role.Sorcerers;
import ood.Role.Warriors;
/**
 * the class for Heroes team, extends from the general team class.
 * */
public class HerosTeam extends Team {

    private final static String warriorFilePath = "./data/Warriors.txt";
    private final static String sorcererFilePath = "./data/Sorcerers.txt";
    private final static String paladinFilePath = "./data/Paladins.txt";

    InputCheck inputCheck = new InputCheck();

    ColorfulOutput colorOut = new ColorfulOutput();

    private int init_i;
    private int init_j;

    public int getInit_i() {
        return init_i;
    }

    public void setInit_i(int init_i) {
        this.init_i = init_i;
    }

    public int getInit_j() {
        return init_j;
    }

    public void setInit_j(int init_j) {
        this.init_j = init_j;
    }

    public HerosTeam() {
    }

    public void chooseHero(){
//        while (!inputCheck.checkInt(teamMemberCount,1,3)) {
//            colorOut.cyanOut("How many team members do you want? (1-3)");
//            teamMemberCount = inputCheck.getInt(inputCheck.getInput());
//        }


        colorOut.yellowOut("We have 3 kinds of hero");
        colorOut.blueOut("1) Warriors\t 2) Sorcerers\t 3) Paladins\t");
        int choice = -1;
        while (!inputCheck.checkInt(choice,1,3)) {
            System.out.printf("What is the hero do you want to choose? (choose by number)\n");
            choice = inputCheck.getInt(inputCheck.getInput());
        }

        switch (choice){
            case 1:
                Warriors warrior = new Warriors(warriorFilePath);
                colorOut.blueOut("Here are all kinds of Warriors.");
                warrior.printProperties();
                int warrior_choice = -1;
                boolean duplicate = true;
                while (duplicate) {
                    while (!inputCheck.checkInt(warrior_choice, 1, warrior.getChoiceCount())) {
                        colorOut.purpleOut("Which Warrior do you want to use? (choose by number, all members can't duplicate)");
                        warrior_choice = inputCheck.getInt(inputCheck.getInput());
                    }
                    warrior.choose(warrior_choice);
                    if (!roleMap.keySet().contains(warrior.getName())) {
                        duplicate = false;
                    }
                    warrior_choice = -1;
                }
                this.addRole(warrior);
                break;


            case 2:
                Sorcerers sorcerer = new Sorcerers(sorcererFilePath);
                colorOut.blueOut("Here are all kinds of Sorcerers.");
                sorcerer.printProperties();
                int sorcerer_choice = -1;
                boolean duplicate2 = true;
                while (duplicate2) {
                    while (!inputCheck.checkInt(sorcerer_choice, 1, sorcerer.getChoiceCount())) {
                        colorOut.purpleOut("Which Sorcerer do you want to use? (choose by number, all members can't duplicate)");
                        sorcerer_choice = inputCheck.getInt(inputCheck.getInput());
                    }
                    sorcerer.choose(sorcerer_choice);
                    if (!roleMap.keySet().contains(sorcerer.getName())) {
                        duplicate2 = false;
                    }
                    sorcerer_choice = -1;
                }
                this.addRole(sorcerer);
                break;


            case 3:
                Paladins paladin = new Paladins(paladinFilePath);
                colorOut.blueOut("Here are all kinds of Paladins.");
                paladin.printProperties();
                int paladin_choice = -1;
                boolean duplicate3 = true;
                while (duplicate3) {
                    while (!inputCheck.checkInt(paladin_choice,1,paladin.getChoiceCount())) {
                        colorOut.purpleOut("Which paladin do you want to use? (choose by number, all members can't duplicate)");
                        paladin_choice = inputCheck.getInt(inputCheck.getInput());
                    }
                    paladin.choose(paladin_choice);
                    if (!roleMap.keySet().contains(paladin.getName())) {
                        duplicate3 = false;
                    }
                    paladin_choice = -1;
                }
                this.addRole(paladin);
                break;

        }



    }


    public int selectMember(){
        int teamMemberCount = 0;
        while (!inputCheck.checkInt(teamMemberCount,1,3)) {
            colorOut.cyanOut("How many team members do you want? (1-3)");
            teamMemberCount = inputCheck.getInt(inputCheck.getInput());
        }


        for(int i = 0; i < teamMemberCount; i++){
            colorOut.yellowOut("We have 3 kinds of hero");
            colorOut.blueOut("1) Warriors\t 2) Sorcerers\t 3) Paladins\t");
            int choice = -1;
            while (!inputCheck.checkInt(choice,1,3)) {
                System.out.printf("What is the No.%d hero do you want to choose? (choose by number)\n", i+1);
                choice = inputCheck.getInt(inputCheck.getInput());
            }

            switch (choice){
                case 1:
                    Warriors warrior = new Warriors(warriorFilePath);
                    colorOut.blueOut("Here are all kinds of Warriors.");
                    warrior.printProperties();
                    int warrior_choice = -1;
                    boolean duplicate = true;
                    while (duplicate) {
                        while (!inputCheck.checkInt(warrior_choice, 1, warrior.getChoiceCount())) {
                            colorOut.purpleOut("Which Warrior do you want to use? (choose by number, all members can't duplicate)");
                            warrior_choice = inputCheck.getInt(inputCheck.getInput());
                        }
                        warrior.choose(warrior_choice);
                        if (!roleMap.keySet().contains(warrior.getName())) {
                            duplicate = false;
                        }
                        warrior_choice = -1;
                    }
                    this.addRole(warrior);
                    break;


                case 2:
                    Sorcerers sorcerer = new Sorcerers(sorcererFilePath);
                    colorOut.blueOut("Here are all kinds of Sorcerers.");
                    sorcerer.printProperties();
                    int sorcerer_choice = -1;
                    boolean duplicate2 = true;
                    while (duplicate2) {
                        while (!inputCheck.checkInt(sorcerer_choice, 1, sorcerer.getChoiceCount())) {
                            colorOut.purpleOut("Which Sorcerer do you want to use? (choose by number, all members can't duplicate)");
                            sorcerer_choice = inputCheck.getInt(inputCheck.getInput());
                        }
                        sorcerer.choose(sorcerer_choice);
                        if (!roleMap.keySet().contains(sorcerer.getName())) {
                            duplicate2 = false;
                        }
                        sorcerer_choice = -1;
                    }
                    this.addRole(sorcerer);
                    break;


                case 3:
                    Paladins paladin = new Paladins(paladinFilePath);
                    colorOut.blueOut("Here are all kinds of Paladins.");
                    paladin.printProperties();
                    int paladin_choice = -1;
                    boolean duplicate3 = true;
                    while (duplicate3) {
                        while (!inputCheck.checkInt(paladin_choice,1,paladin.getChoiceCount())) {
                            colorOut.purpleOut("Which paladin do you want to use? (choose by number, all members can't duplicate)");
                            paladin_choice = inputCheck.getInt(inputCheck.getInput());
                        }
                        paladin.choose(paladin_choice);
                        if (!roleMap.keySet().contains(paladin.getName())) {
                            duplicate3 = false;
                        }
                        paladin_choice = -1;
                    }
                    this.addRole(paladin);
                    break;

            }

        }

        return teamMemberCount;
    }




}
