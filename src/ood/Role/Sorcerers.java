package ood.Role;

/**
 * The ood.Sorcerers class defined the attributes and methods of ood.Sorcerers extends from ood.Hero.
 * */
public class Sorcerers extends Hero implements RoleMethods{
    public Sorcerers(String filePath){
        super(filePath);
    }

    @Override
    public void choose(int serial) {
        super.choose(serial);
        setAgility((int) (getAgility() * 1.1));
        this.propertiesMap.put("agility",getAgility());
        setDexterity((int) (getDexterity() * 1.1));
        this.propertiesMap.put("dexterity",getDexterity());
    }

}
