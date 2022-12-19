package ood.Role;

import ood.Market.Inventory;
import ood.Items.Items;
import ood.Utils.FileReader;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 * The ood.Role class defined the common things of heroes and monsters.
 * */
public abstract class Role <T extends Items> implements RoleMethods{

    Map<Integer, String> rolesMap = new LinkedHashMap<>();

    LinkedHashMap<String, Object> propertiesMap = new LinkedHashMap<>();

    // backpack contains items
    public Inventory backpack = new Inventory<>();

    public void addItem(T item){
        backpack.addItem(item);
    }
    public Role(String filePath) {
        FileReader file = new FileReader();
        rolesMap = file.readFile(filePath);
    }


    public void printProperties(){
        rolesMap.forEach((key, value)->{
            System.out.println(key + "\t" + value);
        });
    }

    public void printRoleProperties(){
        this.propertiesMap.forEach((key, value)->{
            System.out.printf(key + " : " + value.toString() + "\t");
        });
        System.out.printf("\n");
    }

    public int getChoiceCount(){
        return rolesMap.size();
    }

    private String name;
    private int level;
    private int hp;
    private int agility;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getAgility() {
        return agility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
        propertiesMap.put("level",level);
    }

    public void setHp() {
        this.hp = this.level * 100;
        propertiesMap.put("hp",this.hp);
    }

    public void changeHp(int hp){
        this.hp = hp;
        propertiesMap.put("hp",hp);
    }

    public void setAgility(int agility) {
        this.agility = agility;
        propertiesMap.put("agility",agility);
    }


    public void choose(int serial) {
    }
}
