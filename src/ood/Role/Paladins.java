package ood.Role;

/**
* The class for build a ood.Paladins hero, extends from ood.Hero, contains its own specialty.
* */
public class Paladins extends Hero implements RoleMethods{
    public Paladins(String filePath) {
        super(filePath);
    }

    @Override
    public void choose(int serial) {
        super.choose(serial);
        setStrength((int) (getStrength() * 1.1));
        this.propertiesMap.put("strength",getStrength());
        setDexterity((int) (getDexterity() * 1.1));
        this.propertiesMap.put("dexterity",getDexterity());
    }

}
