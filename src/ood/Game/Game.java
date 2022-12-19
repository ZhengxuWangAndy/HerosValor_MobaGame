/*
* Abstract class of game with common
* */

package ood.Game;

public abstract class Game {
    String type;

    public Game() {
        System.out.println("Welcome");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}