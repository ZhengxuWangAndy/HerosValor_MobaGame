package ood.Role;
/**
 * The ood.Warriors class defined the attributes and methods of ood.Warriors extends from ood.Hero.
 * */
public class Warriors extends Hero implements RoleMethods{

    public Warriors(String filePath) {
        super(filePath);
    }

    @Override
    public void choose(int serial) {
        super.choose(serial);
        setStrength((int) (getStrength() * 1.1));
        this.propertiesMap.put("strength",getStrength());
        setAgility((int) (getAgility() * 1.1));
        this.propertiesMap.put("agility",getAgility());

    }

}
