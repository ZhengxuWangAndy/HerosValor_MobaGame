package ood.Role;
/**
* the class for dragons to process its own specialty, extends from ood.Monster
* */
public class Dragons extends Monster implements RoleMethods{
    public Dragons(String filePath) {
        super(filePath);
    }

    @Override
    public void choose(int serial) {
        super.choose(serial);
        setDamage((int) (getDamage() * 1.1));
        this.propertiesMap.put("damage",getDamage());
    }
}
