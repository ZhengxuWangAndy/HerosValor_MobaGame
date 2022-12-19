package ood.Items;
/**
 * Use for new a Lightning spell item with it's own category. Extends from ood.Items.Spells.
 * */

public class LightningSpell extends Spells implements ItemMethods {
    public LightningSpell(String filePath) {
        super(filePath);
    }

    @Override
    public void choose(int serial) {
        super.choose(serial);
        this.propertiesMap.put("category","LightningSpell");
    }

}
