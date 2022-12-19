package ood.Team;

/**
 * Player class use for initial player
 */
public class Player {
    private String name = "";
    private int score = 0;
    //    String currentTeam = "";
    private String symbol = "";

    public void player(){}
    public void setScore(int score){ this.score = score;}

    public void setSymbol(String symbol){ this.symbol = symbol;}

    public String getSymbol(){ return this.symbol;}

    public void setName(String name){
        this.name = name;
    }

    public void addScore(){
        this.score += 1;
    }

    public String getName(){ return this.name;}

    public int getScore(){ return this.score;}
}
