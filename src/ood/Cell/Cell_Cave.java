/*
 * the class for this game's special Cell, contains different symbol and methods extends from the general cell class and hero legends cell class.
 * */
package ood.Cell;

import ood.Team.HerosTeam;

public class Cell_Cave extends HeroLegendCell implements Buff{
    public Cell_Cave() {
        this.setSymbol(" C ");
        this.setStatus(" C ");
    }

    public void getBuff(HerosTeam hero){
        hero.getOnly().setAgility(hero.getOnly().getAgility() + 50);
    }

    public void removeBuff(HerosTeam hero){
        hero.getOnly().setAgility(hero.getOnly().getAgility() - 50);
    }
}
