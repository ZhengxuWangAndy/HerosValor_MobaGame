package ood.Items;

import ood.Items.Equipment;
import ood.Items.ItemMethods;

/**
 * the class for armory, extends from ood.Items.Equipment
 */
public class Armor extends Equipment implements ItemMethods {

    public Armor(String filePath) {
        super(filePath);
    }

    @Override
    public void choose(int serial){
        super.choose(serial);

        this.propertiesMap.put("category","Armory");

        setDamage_reduction(Integer.parseInt(this.getPropertiesList(3)));
        this.propertiesMap.put("damage_reduction",getDamage_reduction());

    }

}
