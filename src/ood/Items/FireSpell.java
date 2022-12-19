package ood.Items;

import ood.Items.ItemMethods;
import ood.Items.Spells;
/**
 * Use for new a Fire spell item with it's own category. Extends from ood.Items.Spells.
 * */
public class FireSpell extends Spells implements ItemMethods {
    public FireSpell(String filePath) {
        super(filePath);
    }

    @Override
    public void choose(int serial) {
        super.choose(serial);
        this.propertiesMap.put("category","FireSpell");
    }
}
