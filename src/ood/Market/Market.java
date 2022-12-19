package ood.Market;

import ood.Items.ItemGetter;
import ood.Items.Items;
import ood.Role.Hero;
import ood.Utils.ColorfulOutput;
import ood.Utils.InputCheck;

import java.util.Random;
/**
* The class for building a market contains a ood.Inventory.
* */
public class Market {
    Inventory shelves = new Inventory();

    Random rand = new Random();

    ItemGetter getter = new ItemGetter();

    ColorfulOutput color = new ColorfulOutput();
    InputCheck inputCheck = new InputCheck();


    public Market() {
        for(int i = 0; i < (rand.nextInt(5) + 5); i++){

            switch (rand.nextInt(6) + 1) {

                case 1:
                    shelves.addItem(getter.getArmor());
                    break;

                case 2:
                    shelves.addItem(getter.getWeapon());
                    break;

                case 3:
                    shelves.addItem(getter.getPotions());
                    break;

                case 4:
                    shelves.addItem(getter.getFireSpell());
                    break;

                case 5 :
                    shelves.addItem(getter.getIceSpell());
                    break;

                case 6:
                    shelves.addItem(getter.getLightningSpell());
                    break;

            }

        }
    }

    public void showInventory(){
        shelves.printAllItem();
    }

    public void buy(Hero hero){
        int serial = 0;
        Boolean serialChecker = false;
        color.yellowOut("Here's this market's stuffs");
        this.showInventory();

        color.cyanOut("You have : " + hero.getGold());
        while (!serialChecker) {
            color.blueOut("which would you wanna buy? (input the serial, 0 means quit trade)");

            serial = inputCheck.getInt(inputCheck.getInput());
            serialChecker = inputCheck.checkInt(serial, 0, shelves.backpack.size());
        }
        if (serial != 0){
            Items item = shelves.getItem(serial);
            if (hero.getGold() < item.getCost()){
                color.redOut("You are too poor to buy this!");
            }else {
                if (hero.getLevel() < item.getRequired_level()){
                    color.redOut("Your level is not high enough to buy this.");
                }else {
                    hero.addItem(item);
                    hero.setGold(hero.getGold() - item.getCost());
                    shelves.removeItem(item.getName());
                    color.redOut("Good, you got " + item.getName());
                }
            }
        }else {
            color.purpleOut("See ya next time");
        }

    }

    public void sell(Hero hero){
        int serial = 0;
        Boolean serialChecker = false;

        while (!serialChecker) {
            if (hero.backpack.backpack.size() == 0){
                color.redOut("Buy something first!");
                break;
            }
            color.yellowOut("Here's your stuffs");
            hero.backpack.printAllItem();
            color.blueOut("which would you wanna sell? (input the serial, 0 means quit trade)");

            serial = inputCheck.getInt(inputCheck.getInput());
            serialChecker = inputCheck.checkInt(serial, 0, hero.backpack.backpack.size());
        }
        if (serial != 0){
            Items item = hero.backpack.getItem(serial);
            shelves.addItem(item);
            hero.setGold(hero.getGold() + item.getCost()/2);
            hero.backpack.removeItem(item.getName());
            color.cyanOut("Now you have : " + hero.getGold());
        }else {
            color.purpleOut("See ya next time");
        }

    }

}
