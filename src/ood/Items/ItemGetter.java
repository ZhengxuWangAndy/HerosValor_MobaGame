package ood.Items;

import ood.Items.*;

import java.util.ArrayList;
import java.util.Random;
/**
 * the class for getting different kinds of items from the txt file.
 * */

public class ItemGetter{
    private final static String ArmoryFilePath = "./data/Armory.txt";
    private final static String FireSpellsFilePath = "./data/FireSpells.txt";
    private final static String IceSpellsFilePath = "./data/IceSpells.txt";
    private final static String LightningSpellsFilePath = "./data/LightningSpells.txt";
    private final static String PotionsFilePath = "./data/Potions.txt";
    private final static String WeaponryFilePath = "./data/Weaponry.txt";


    Random rand = new Random();


    public Armor getArmor(){
        Armor armor = new Armor(ArmoryFilePath);
        armor.choose(rand.nextInt(armor.getChioceCount()) + 1);
        return armor;
    }
//
//    public Armor getAll_Armor(int serial){
//        ArrayList<Armor> all = new ArrayList<>();
//        Armor armor = new Armor(ArmoryFilePath);
//        armor.getChioceCount();
////        armor.choose(rand.nextInt(1,armor.getChioceCount() + 1));
//        armor.choose(serial);
//        return armor;
//    }

    public Weapon getWeapon(){
        Weapon weapon = new Weapon(WeaponryFilePath);
        weapon.choose(rand.nextInt(weapon.getChioceCount()) + 1);
        return weapon;
    }

    public Potions getPotions(){
        Potions potions = new Potions(PotionsFilePath);
        potions.choose(rand.nextInt(potions.getChioceCount() + 1) + 1);
        return potions;
    }

    public FireSpell getFireSpell(){
        FireSpell fireSpell = new FireSpell(FireSpellsFilePath);
        fireSpell.choose(rand.nextInt(fireSpell.getChioceCount()) + 1);
        return fireSpell;
    }

    public IceSpell getIceSpell(){
        IceSpell iceSpell = new IceSpell(IceSpellsFilePath);
        iceSpell.choose(rand.nextInt(iceSpell.getChioceCount()) + 1);
        return iceSpell;
    }

    public LightningSpell getLightningSpell(){
        LightningSpell lightningSpell = new LightningSpell(LightningSpellsFilePath);
        lightningSpell.choose(rand.nextInt(lightningSpell.getChioceCount()) + 1);
        return lightningSpell;
    }

}
