package ood.Role;
import ood.Utils.ColorfulOutput;
import ood.Items.Spells;

import java.util.Arrays;
/**
 * The ood.Monster class defined the common things of monsters.
 * */
public abstract class Monster extends Role implements RoleMethods{

    private int damage;
    private int defense;

    private int doge_chance;

    ColorfulOutput color = new ColorfulOutput();
    public Monster(String filePath) {
        super(filePath);
    }

    public void choose(int serial){

        String properties = "";
        properties = (String) rolesMap.get(serial);
        String[] propertiesList = properties.split(" ");
        propertiesList = Arrays.stream(propertiesList).filter(s -> !"".equals(s)).toArray(String[]::new);

        setName(propertiesList[0].replace("\t", ""));
        this.propertiesMap.put("name",getName());

        setLevel(Integer.parseInt(propertiesList[1]));
        this.propertiesMap.put("level",getLevel());

        setDamage(Integer.parseInt(propertiesList[2]));
        this.propertiesMap.put("damage",getDamage());

        setDefense(Integer.parseInt(propertiesList[3]));
        this.propertiesMap.put("defense",getDefense());

        setDoge_chance(Integer.parseInt(propertiesList[4]));
        this.propertiesMap.put("doge_chance",getDoge_chance());

        setHp();
        this.propertiesMap.put("hp",getHp());

    }

    public int spellDamage(Spells item){

        changeHp(this.getHp() - item.getDamage());
        if(item.propertiesMap.get("category").equals("FireSpell")){
            this.setDefense(this.getDefense() - 100);
            color.blueOut("Using FireSpell decrease defense value");

        } else if (item.propertiesMap.get("category").equals("IceSpell")) {
            this.setDamage(this.getDamage() - 100);
            color.blueOut("Using IceSpell decrease damage value");

        }else if (item.propertiesMap.get("category").equals("LightningSpell")){
            this.setDoge_chance(this.getDoge_chance() - 100);
            color.blueOut("Using LightningSpell decrease doge chance");

        }

        color.purpleOut("You caused damage: " + item.getDamage());
        this.printRoleProperties();
        return item.getMana_cost();
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
        propertiesMap.put("damage",damage);

    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
        propertiesMap.put("defense",defense);

    }

    public int getDoge_chance() {
        return doge_chance;
    }

    public void setDoge_chance(int doge_chance) {
        this.doge_chance = doge_chance;
        propertiesMap.put("doge_chance",doge_chance);
    }

}
