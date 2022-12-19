package ood.Utils;

import ood.Utils.ColorfulOutput;
import ood.Utils.InputCheck;

import java.util.ArrayList;

/**
 * the class for deal with the input when user want's to move on map.
 * */
public class Controller {
    private ArrayList<String> validKey = new ArrayList<String>();
    InputCheck checker = new InputCheck();
    ColorfulOutput color = new ColorfulOutput();

    public Controller() {
        this.validKey.add("w");
        this.validKey.add("a");
        this.validKey.add("s");
        this.validKey.add("d");
        this.validKey.add("i");
        this.validKey.add("t");
        this.validKey.add("r");
    }

    public String move(){
        String move = null;
        Boolean valid = false;
        while (!valid) {
            color.blueOut("Where do you wanna go?(only w,a,s,d is valid to move, i for information, t for tp, r for recall)");
            move = checker.getInput();
            valid = checker.checkString(validKey, move);
        }
        return move;
    }

}
