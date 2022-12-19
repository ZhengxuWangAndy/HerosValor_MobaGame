/*
 * the class for this game's special ood.Cell, contains  extends from the general cell class.
 * */
package ood.Cell;
import ood.Team.HerosTeam;
import ood.Utils.ColorfulOutput;
import ood.Market.Market;

public class HeroLegendCell extends Cell implements Buff{

    private String status;

    private Market content;

    private int x;
    private int y;

    ColorfulOutput color = new ColorfulOutput();

    public void setPos(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Market getContent() {
        return content;
    }

    public void setContent(Market content) {
        this.content = content;
    }

    public void getBuff(HerosTeam hero){}

    public void removeBuff(HerosTeam hero){}
}
