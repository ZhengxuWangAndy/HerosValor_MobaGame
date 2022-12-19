/*
 * the class for this game's special Cell, contains different symbol and methods extends from the general cell class and hero legends cell class.
 * */
package ood.Cell;

public class Cell_Inaccessible extends HeroLegendCell {
    public Cell_Inaccessible() {
        this.setSymbol(color.redBG(" X "));
        this.setStatus(" X ");
    }
}