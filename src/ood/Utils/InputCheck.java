package ood.Utils;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * the class for input check, check is it a valid number or string, and it's range.
 * */
public class InputCheck {

    public ArrayList<String> quitSymbol = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);

    public InputCheck() {
        quitSymbol.add("q");
        quitSymbol.add("Q");
    }

    public Boolean checkString(ArrayList<String> validInput, String userInput){
        if (validInput.contains(userInput)){
            return true;
        }
        else {
            return false;
        }
    }

    public int getInt(String userInput){
        try{
            return Integer.parseInt(userInput);
        }catch (Exception e){
            return -1;
        }
    }


    public String getInput(){
        String userInput = scanner.nextLine();
        if (quitSymbol.contains(userInput)){
            System.exit(0);
        }
        return userInput;
    }

    public Boolean checkInt(int userInput, int from, int to){
        if(userInput >= from && userInput <= to){
            return true;
        }
        else {
            return false;
        }
    }


}
