/*
* Extends from Game class and serve for Hero Valor game.
* */
package ood.Game;

import ood.Utils.ColorfulOutput;
import ood.Utils.InputCheck;

import java.util.ArrayList;

public class HeroValorGame extends Game {
    public HeroValorGame(String type) {
        super();
        this.type = type;
        System.out.println(type);
    }

    public void start() throws InterruptedException {
        ColorfulOutput color = new ColorfulOutput();
        InputCheck check = new InputCheck();


        String input = "y";
        while (input.equals("y")){
            ValorProcessor p2 = new ValorProcessor();
            Boolean result = p2.ValorProcessor();

            if(result){
                color.cyanOut("Congratulation!!");
                Boolean checker = false;
                while (!checker) {
                    color.blueOut("Do you wanna play again?(y/n)");
                    ArrayList<String> valid = new ArrayList<>();
                    valid.add("y");
                    valid.add("n");
                    input = check.getInput();
                    checker = check.checkString(valid, input);
                }
            }else{
                color.cyanOut("Don't be upset!!");
                Boolean checker = false;
                while (!checker) {
                    color.blueOut("Do you wanna play again?(y/n)");
                    ArrayList<String> valid = new ArrayList<>();
                    valid.add("y");
                    valid.add("n");
                    input = check.getInput();
                    checker = check.checkString(valid, input);
                }
            }

        }
        color.redOut("Bye, see ya!");
    }
}
