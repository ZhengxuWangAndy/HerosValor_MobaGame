package ood.Market;


import ood.Items.Items;
import ood.Utils.ColorfulOutput;

import java.util.LinkedHashMap;
import java.util.Map;
/**
 * for contains items, using to build market and hero's backpack.
 * */
public class Inventory <T extends Items>{

    public Map<String, T> backpack = new LinkedHashMap();
    ColorfulOutput color = new ColorfulOutput();

    public Inventory() {
    }

    public void addItem(T item){
        backpack.put(item.getName(),item);
    }

    public T getItem(int serial) {
        int i = 1;
        for (Map.Entry<String, T> entry : backpack.entrySet()) {
            if(serial == i){
                return entry.getValue();
            }
            i++;
        }
        return null;
    }

    public void printAllItem(){
        int i = 1;

        for (Map.Entry<String, T> entry : backpack.entrySet()) {
            System.out.printf(color.yellowBG(Integer.toString(i)) + "\t");
            entry.getValue().printItemProperties();
            i++;
        }
    }

    public void removeItem(String name){
        backpack.remove(name);
    }

    public T getOne(){
        for (Map.Entry<String, T> entry : backpack.entrySet()) {
            return entry.getValue();
        }
        return null;
    }


}
