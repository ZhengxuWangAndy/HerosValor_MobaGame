package ood.Market;


/**
 * Specific MobaMarket extends from genral Market
 */
public class MobaMarket extends Market{
    public MobaMarket() {
        for(int i = 0; i < rand.nextInt(15) + 10; i++){

            switch (rand.nextInt(6) + 1) {

                case 1:
                    shelves.addItem(getter.getArmor());
                    break;

                case 2:
                    shelves.addItem(getter.getWeapon());
                    break;

                case 3:
                    shelves.addItem(getter.getPotions());
                    break;

                case 4:
                    shelves.addItem(getter.getFireSpell());
                    break;

                case 5 :
                    shelves.addItem(getter.getIceSpell());
                    break;

                case 6:
                    shelves.addItem(getter.getLightningSpell());
                    break;

            }

        }
    }
}
