/**
 * the class for battle, using generics type to deal with different kind of hero and monsters
 * */

package ood.Battle;

import ood.Items.Equipment;
import ood.Items.Items;
import ood.Items.Potions;
import ood.Items.Spells;
import ood.Role.Hero;
import ood.Role.Monster;
import ood.Role.Role;
import ood.Team.*;
import ood.Utils.ColorfulOutput;
import ood.Utils.InputCheck;

import java.util.Random;



public class Battle <T extends Role> {

    MonsterTeam monsterTeam;
    HerosTeam herosTeam;

    ColorfulOutput color = new ColorfulOutput();

    InputCheck inputCheck = new InputCheck();
    Random rand = new Random();


    public Battle(MonsterTeam monsterTeam, HerosTeam herosTeam) {
        this.monsterTeam = monsterTeam;
        this.herosTeam = herosTeam;
    }

    // true means successes to doge or sth
    public Boolean possibility(Double possible) {
        int number = rand.nextInt(100);
        Double poss = possible * 100;
        // the possible of doge
        if (number < poss) {
            return true;
        } else {
            return false;
        }
    }


    //false mean beaten is died, true means no one die
    public Boolean heroAttack(Hero attacker, Monster beaten) {

        color.blueOut(attacker.getName() + " attack " + beaten.getName());
        int damage = (int) ((attacker.getStrength() + attacker.getEquipDamage()) * 0.2);
        if (this.possibility(beaten.getDoge_chance() * 0.002)) {
            color.redOut("It's been dodged");
        } else {
            if (beaten.getHp() - damage < 0) {
                color.redOut(beaten.getName() + " is been killed.");
                beaten.changeHp(beaten.getHp() - damage);
                return false;
            } else {
                color.redOut("You success to cause " + damage + " damage to " + beaten.getName());
                beaten.changeHp(beaten.getHp() - damage);
            }
        }
        return true;
    }

    public void useItem(Hero hero) {
        int serial = 0;
        Boolean serialChecker = false;

        while (!serialChecker) {
            if (hero.backpack.backpack.size() == 0) {
                color.redOut("Buy something first!");
                break;
            }
            color.yellowOut("Here's your stuffs");
            hero.backpack.printAllItem();
            color.blueOut("which would you wanna use? (input the serial)");

            serial = inputCheck.getInt(inputCheck.getInput());
            serialChecker = inputCheck.checkInt(serial, 1, hero.backpack.backpack.size());
        }
        if (serial != 0) {
            Items item = hero.backpack.getItem(serial);
            if (item.getCategory().equals("equip")) {
                hero.changeEquip((Equipment) item);
                color.blueOut("You equipped " + item.getName());

            } else if (item.getCategory().equals("spell")) {
                // use other
                //spell choose enemy
                color.purpleOut("Using spell!");
                Monster monster = (Monster) monsterTeam.getOnly();
                if (hero.getMp() < 100) {
                    color.redOut("Not enough MP");
                } else {
                    hero.setMp(hero.getMp() - monster.spellDamage((Spells) item));
                    hero.backpack.removeItem(item.getName());

                }
            } else if (item.getCategory().equals("potion")) {
                //potions to himself
                hero.usePotion((Potions) item);
                color.cyanOut("Used successful!");
                hero.printRoleProperties();
                hero.backpack.removeItem(item.getName());
            }

        }

        color.purpleOut("Your round is over");

    }

    //false mean beaten is died, true means no one die
    public Boolean monsterAttack(Monster attacker, Hero beaten) {

        color.blueOut(attacker.getName() + " attack " + beaten.getName());
        int damage = (int) (attacker.getDamage() * 0.3);
        if (this.possibility(beaten.getAgility() * 0.0002)) {
            color.redOut("It's been dodged");
        } else {
            if (beaten.getHp() - damage < 0) {
                color.redOut(beaten.getName() + " is been killed.");
                beaten.changeHp(beaten.getHp() - damage);
                return false;
            } else {
                color.redOut(attacker.getName() + " success to cause " + damage + " damage to " + beaten.getName());
                beaten.changeHp(beaten.getHp() - damage);
            }
        }
        return true;
    }

    public String start() {
        ColorfulOutput color = new ColorfulOutput();
        InputCheck in = new InputCheck();

        System.out.println(color.redBG("###  BATTLE START  ###"));
        while (!(herosTeam.countLeft() == 0 || monsterTeam.countLeft() == 0)) {

            System.out.println(color.purpleBG(" Hero's turn "));
            //heroes turn
            for (int i = 0; i < herosTeam.roleMap.size(); i++) {
                color.blueOut("Here's your Info.");
                herosTeam.printAllMembers();

                color.purpleOut("Here's your enemy");
                monsterTeam.printAllMembers();

                color.yellowOut("It's your No." + (i + 1) + " turn.");
//                color.blueOut("Which hero you want to use?");
                Hero hero = (Hero) herosTeam.getOnly();

                if (hero.equip.backpack.size() != 0) {
                    color.yellowOut("Equip Info:");
                    hero.equip.printAllItem();
                }
                int action = -1;
                while (!in.checkInt(action, 1, 2)) {
                    color.blueOut("What you gonna do? (1)Attack (2)Use Item ");
                    action = in.getInt(in.getInput());
                }


                if (action == 1) {
                    // attack
//                    color.purpleOut("Who's your target?");
                    Monster monster = (Monster) monsterTeam.getOnly();
                    this.heroAttack(hero, monster);

                } else if (action == 2) {
                    //use item
                    this.useItem(hero);
                }

                if (monsterTeam.countLeft() == 0) {
                    break;
                }
            }
            if (monsterTeam.countLeft() == 0) {
                System.out.println(color.redBG("!!! NICE MONSTER DIED !!!"));
                break;
            }
            //monsters turn
            System.out.println(color.redBG(" Monster's turn "));
            for (int i = 1; i <= monsterTeam.roleMap.size(); i++) {
                Monster monster = (Monster) monsterTeam.getRole(i);
                if (monster.getHp() <= 0) {
                    continue;
                } else {
                    color.purpleOut("Monster " + monster.getName() + " turn.");

                    // randomly choose a hero to attack
                    int serial = rand.nextInt(herosTeam.roleMap.size()) + 1;
                    while (herosTeam.getRole(serial).getHp() <= 0) {
                        serial = rand.nextInt(herosTeam.roleMap.size()) + 1;
                    }
                    Hero hero = (Hero) herosTeam.getRole(serial);
                    this.monsterAttack(monster, hero);
                    if (herosTeam.countLeft() == 0) {
                        System.out.println(color.redBG(" HEROE DIED "));
//                        System.out.println(color.purpleBG("GAME OVER"));
                        return "LOSE";  //hero lose
                    }
                }
            }

        }

        for (int i = 1; i <= herosTeam.roleMap.size(); i++) {
            Hero hero = (Hero) herosTeam.getRole(i);
            if (hero.getHp() > 0) {
                hero.setGold(hero.getGold() + (monsterTeam.getLevel() * 100));
            }
            hero.setLevel(hero.getLevel() + 1);
            hero.setMp((int) (hero.getMp() * 1.1));
//            hero.setHp();
        }

        herosTeam.printAllMembers();
        return "WIN";   //hero win
    }

}
