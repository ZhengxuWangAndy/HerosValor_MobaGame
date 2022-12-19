package ood.Map;

/**
 * the class for ood.Board, reuse the board class from the board game
 * */
import ood.Cell.HeroLegendCell;

public class Board <T extends HeroLegendCell>{
    private int width;
    private int height;

    public T[][] board;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Board(int width, int height) {
        this.board = (T[][]) new HeroLegendCell[height][width];
        this.width = width;
        this.height = height;
    }





}
