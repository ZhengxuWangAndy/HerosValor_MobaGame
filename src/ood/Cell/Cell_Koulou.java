/*
 * the class for this game's special Cell, contains different symbol and methods extends from the general cell class and hero legends cell class.
 * */
package ood.Cell;

import ood.Role.Hero;
import ood.Team.HerosTeam;

public class Cell_Koulou extends HeroLegendCell implements Buff{
    public Cell_Koulou() {
        this.setSymbol(" K ");
        this.setStatus(" K ");
    }

    public void getBuff(HerosTeam hero){
        Hero h = (Hero)hero.getOnly();
        h.setStrength(h.getStrength() + 50);
    }

    public void removeBuff(HerosTeam hero){
        Hero h = (Hero)hero.getOnly();
        h.setStrength(h.getStrength() - 50);
    }
}
