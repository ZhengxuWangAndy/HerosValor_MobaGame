package ood.Role;
/**
 * the class for ood.Exoskeletons to process its own specialty, extends from ood.Monster
 * */
public class Exoskeletons extends Monster implements RoleMethods{
    public Exoskeletons(String filePath) {
        super(filePath);
    }

    @Override
    public void choose(int serial) {
        super.choose(serial);
        setDefense((int) (getDefense() * 1.1));
        this.propertiesMap.put("defense",getDefense());
    }
}
