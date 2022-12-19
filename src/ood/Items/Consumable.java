package ood.Items;

/**
 * the class for ood.Consumable items, extend from ood.Itemstems
 */
public abstract class Consumable extends Items implements ItemMethods {

    public Consumable(String filePath) {
        super(filePath);
        this.setCategory("consume");
    }

}
