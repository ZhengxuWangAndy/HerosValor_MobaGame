package ood.Items;

import ood.Utils.FileReader;
import java.util.Arrays;
import java.util.LinkedHashMap;

/**
* the abstract class of items, include the common things of all items.
* */
public abstract class Items implements ood.Items.ItemMethods {
    LinkedHashMap<Integer, String> itemMap = new LinkedHashMap<>();
    public LinkedHashMap<String, Object> propertiesMap = new LinkedHashMap<>();

    private int required_level;
    public int getRequired_level() {
        return required_level;
    }

    public void setRequired_level(int required_level) {
        this.required_level = required_level;
    }
    private String name;
    private int cost;

    private String category;

    public String getPropertiesList(int i) {
        return propertiesList[i];
    }

    private String[] propertiesList;

    public void choose(int serial){
        String properties = "";
        properties = itemMap.get(serial);
        propertiesList = properties.split(" ");
        propertiesList = Arrays.stream(propertiesList).filter(s -> !"".equals(s)).toArray(String[]::new);

        setName(propertiesList[0].replace("\t", ""));
        this.propertiesMap.put("name",getName());

        setCost(Integer.parseInt(propertiesList[1]));
        this.propertiesMap.put("cost",getCost());

        setRequired_level(Integer.parseInt(propertiesList[2]));
        this.propertiesMap.put("required_level",getRequired_level());

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Items(String filePath) {
        FileReader file = new FileReader();
        itemMap = file.readFile(filePath);
    }

    public void printItems(){
        itemMap.forEach((key, value)->{
            System.out.println(key + "\t" + value);
        });
    }

    public void printItemProperties(){
        this.propertiesMap.forEach((key, value)->{
            System.out.printf(key + " : " + value.toString() + "\t\t");
        });
        System.out.printf("\n");
    }

    public int getChioceCount(){
        return itemMap.size();
    }

}
