package ood.Role;

/**
 * The class for build a ood.Spirits ood.Monster, extends from ood.Monster, contains its own specialty.
 * */
public class Spirits extends Monster implements RoleMethods{
    public Spirits(String filePath) {
        super(filePath);
    }

    @Override
    public void choose(int serial) {
        super.choose(serial);
        setDoge_chance((int) (getDoge_chance() * 1.1));
        this.propertiesMap.put("doge_chance",getDoge_chance());
    }
}
