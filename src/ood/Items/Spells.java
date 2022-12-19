package ood.Items;

/**
* The general abstract class of ood.Spells, extends from consumable items.
* */
public abstract class Spells extends Consumable implements ItemMethods {

    private int damage;
    private int mana_cost;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMana_cost() {
        return mana_cost;
    }

    public void setMana_cost(int mana_cost) {
        this.mana_cost = mana_cost;
    }

    public Spells(String filePath) {
        super(filePath);
    }

    @Override
    public void choose(int serial){
        super.choose(serial);

        setDamage(Integer.parseInt(this.getPropertiesList(3)));
        this.propertiesMap.put("damage",getDamage());

        setMana_cost(Integer.parseInt(this.getPropertiesList(4)));
        this.propertiesMap.put("mana_cost",getMana_cost());

        setCategory("spell");

    }

}
