package ood.Role;

import ood.Market.Inventory;
import ood.Items.Equipment;
import ood.Items.Potions;

import java.util.Arrays;
/**
 * The ood.Hero class defined the common things of heroes.
 * */

public abstract class Hero extends Role implements RoleMethods{
    private int experience;
    private int mp;
    private int strength;
    private int dexterity;
    private int gold;
    private int inventory;

    private int equipDamage = 0;

    private int equipDefense = 0;

    // equipment
    public Inventory equip = new Inventory();


    public <T extends Equipment> void changeEquip(T item){
        if(this.equip.backpack.size() == 0){
            equip.addItem(item);
        }else {

            equip.backpack.clear();
            equip.addItem(item);
        }
        this.setEquipDamage(item.getDamage());
        this.setEquipDefense(item.getDamage_reduction());
    }

    public void usePotion(Potions potion){

        String attribute = potion.getAttribute_affected();
        int increase = potion.getAttribute_increase();
        switch (attribute){
            case "Health":
                this.changeHp(this.getHp() + increase);
                break;

            case "Strength":
                this.setStrength(this.getStrength() + increase);
                break;

            case "Mana":
                this.setMp(this.getMp() + increase);
                break;

            case "Agility":
                this.setAgility(this.getAgility() + increase);
                break;

            case "Health/Mana/Strength/Agility":
                this.changeHp(this.getHp() + increase);
                this.setStrength(this.getStrength() + increase);
                this.setMp(this.getMp() + increase);
                this.setAgility(this.getAgility() + increase);
                break;

            case "All":
                this.changeHp(this.getHp() + increase);
                this.setStrength(this.getStrength() + increase);
                this.setMp(this.getMp() + increase);
                this.setAgility(this.getAgility() + increase);
                this.setDexterity(this.getDexterity() + increase);
                this.setEquipDefense(this.getEquipDefense() + increase);

                break;


        }

    }



    public Hero(String filePath) {
        super(filePath);
    }

    public void choose(int serial){

        String properties = "";
        properties = (String) rolesMap.get(serial);
        String[] propertiesList = properties.split(" ");
        propertiesList = Arrays.stream(propertiesList).filter(s -> !"".equals(s)).toArray(String[]::new);

        setName(propertiesList[0].replace("\t", ""));
        this.propertiesMap.put("name",getName());

        setMp(Integer.parseInt(propertiesList[1]));
        this.propertiesMap.put("mp",getMp());

        setStrength(Integer.parseInt(propertiesList[2]));
        this.propertiesMap.put("strength",getStrength());

        setAgility(Integer.parseInt(propertiesList[3]));
        this.propertiesMap.put("agility",getAgility());

        setDexterity(Integer.parseInt(propertiesList[4]));
        this.propertiesMap.put("dexterity",getDexterity());

        setGold(Integer.parseInt(propertiesList[5]));
        this.propertiesMap.put("gold",getGold());

//        setLevel(Integer.parseInt(propertiesList[6]));
//        this.propertiesMap.put("level",getLevel());

        setLevel(1);
        this.propertiesMap.put("level",getLevel());

        setHp();
        this.propertiesMap.put("hp",getHp());

    }

    public void setExperience(int experience) {
        this.experience = experience;
        propertiesMap.put("experience",experience);

    }

    public void setMp(int mp) {
        this.mp = mp;
        propertiesMap.put("mp",mp);

    }

    public void setStrength(int strength) {
        this.strength = strength;
        propertiesMap.put("strength",strength);

    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
        propertiesMap.put("dexterity",dexterity);

    }

    public void setGold(int gold) {
        this.gold = gold;
        propertiesMap.put("gold",gold);

    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getExperience() {
        return experience;
    }

    public int getMp() {
        return mp;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getGold() {
        return gold;
    }

    public int getInventory() {
        return inventory;
    }
    public int getEquipDamage() {
        return equipDamage;
    }

    public void setEquipDamage(int equipDamage) {
        this.equipDamage = equipDamage;
    }

    public int getEquipDefense() {
        return equipDefense;
    }

    public void setEquipDefense(int equipDefense) {
        this.equipDefense = equipDefense;
    }
}
