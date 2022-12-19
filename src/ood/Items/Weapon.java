package ood.Items;

/**
 * the class for ood.Items.Weapon, extends from ood.Equipment
 * */
public class Weapon extends Equipment implements ItemMethods {

    private int required_hands;

    public Weapon(String filePath) {
        super(filePath);
    }

    @Override
    public void choose(int serial){
        super.choose(serial);

        setDamage(Integer.parseInt(this.getPropertiesList(3)));
        this.propertiesMap.put("damage",getDamage());

        setRequired_hands(Integer.parseInt(this.getPropertiesList(4)));
        this.propertiesMap.put("required_hands",getRequired_hands());

        this.propertiesMap.put("category","Weapon");

    }



    public int getRequired_hands() {
        return required_hands;
    }

    public void setRequired_hands(int required_hands) {
        this.required_hands = required_hands;
    }
}
