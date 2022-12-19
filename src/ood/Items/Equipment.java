package ood.Items;

import ood.Items.ItemMethods;
import ood.Items.Items;

/**
 * the class for Equipments to process its own methods and attributes, extends from ood.Itemstems
 */
public abstract class Equipment extends Items implements ItemMethods {

    private int damage_reduction = 0;

    private int damage = 0;

    public Equipment(String filePath) {
        super(filePath);
        this.setCategory("equip");
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    public int getDamage_reduction() {
        return damage_reduction;
    }

    public void setDamage_reduction(int damage_reduction) {
        this.damage_reduction = damage_reduction;
    }

}
