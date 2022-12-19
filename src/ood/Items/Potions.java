package ood.Items;

/**
 * The class of ood.Potions, extends from consumable items, use for produce these kinds of potions.
 * */
public class Potions extends Consumable implements ItemMethods {

    private int attribute_increase;
    private String attribute_affected;

    public int getAttribute_increase() {
        return attribute_increase;
    }

    public void setAttribute_increase(int attribute_increase) {
        this.attribute_increase = attribute_increase;
    }

    public String getAttribute_affected() {
        return attribute_affected;
    }

    public void setAttribute_affected(String attribute_affected) {
        this.attribute_affected = attribute_affected;
    }

    public Potions(String filePath) {
        super(filePath);
    }


    @Override
    public void choose(int serial){
        super.choose(serial);
        this.propertiesMap.put("category","Potions");

        setAttribute_increase(Integer.parseInt(this.getPropertiesList(3)));
        this.propertiesMap.put("attribute_increase",getAttribute_increase());

        setAttribute_affected(this.getPropertiesList(4));
        this.propertiesMap.put("attribute_affected",getAttribute_affected());

        setCategory("potion");

    }
}
