package ood.Team;

import ood.Utils.ColorfulOutput;
import ood.Utils.InputCheck;
import ood.Role.Dragons;
import ood.Role.Exoskeletons;
import ood.Role.Spirits;

import java.util.Random;
/**
 * the class for ood.Monster team, extends from the general team class.
 * */
public class MonsterTeam extends Team {

    InputCheck inputCheck = new InputCheck();

    ColorfulOutput colorOut = new ColorfulOutput();

    Random rand = new Random();

    private final static String exoskeletonFilePath = "./data/Exoskeletons.txt";
    private final static String dragonFilePath = "./data/Dragons.txt";
    private final static String spiritFilePath = "./data/Spirits.txt";

    public MonsterTeam(int teamMemberCount) {

        for(int i = 0; i < teamMemberCount; i++) {
            int role = rand.nextInt(3) + 1;
            switch (role) {
                case 1:
                    Exoskeletons exoskeleton = new Exoskeletons(exoskeletonFilePath);
                    exoskeleton.choose(rand.nextInt(exoskeleton.getChoiceCount()) + 1);
                    this.addRole(exoskeleton);
                    break;

                case 2:
                    Dragons dragon = new Dragons(dragonFilePath);
                    dragon.choose(rand.nextInt(dragon.getChoiceCount()) + 1);
                    this.addRole(dragon);
                    break;

                case 3:
                    Spirits spirit = new Spirits(spiritFilePath);
                    spirit.choose(rand.nextInt(spirit.getChoiceCount()) + 1);
                    this.addRole(spirit);
                    break;
            }
        }



    }
}
