package ood.Map;

import ood.Cell.*;
import ood.Team.HerosTeam;
import ood.Utils.ColorfulOutput;
import ood.Team.Team;
import java.util.ArrayList;
import java.util.Collections;

/**
* The game's map extends from ood.Board and contains cell.
* */
public class GameMap <T extends Team> extends Board{


    ArrayList<String> arrange = new ArrayList<>();
    ColorfulOutput color = new ColorfulOutput();

    public GameMap(int width, int height) {
        super(width, height);

        for(int i = 0; i < width*height; i++){
            if(i <= Math.ceil(width*height*0.2)){
                arrange.add(" X ");
            } else if (i > Math.ceil(width*height*0.2) && i <= Math.ceil(width*height*0.5)) {
                arrange.add(" M ");
            }else {
                arrange.add("   ");
            }
        }
    }

    public void Moba(){
        arrange.clear();
        //make a list use for shuffle
        for(int i = 0; i < 36; i++){
            if (i<15) {
                arrange.add("p");
            }else if(i>=15 && i < 22){
                arrange.add("b");
            } else if (i>=22&& i <=29) {
                arrange.add("c");
            } else if (i>29) {
                arrange.add("k");
            }
        }
        Collections.shuffle(arrange);

        for(int i = 0; i < this.getHeight(); i++){
            for(int j = 0; j < this.getWidth(); j++){
                // set monster nexus
                if(i == 0 && (j+1)%3 != 0){
                    Cell_Nexus_M cell = new Cell_Nexus_M();
                    cell.setPos(i,j);
                    this.board[i][j] = cell;
                }
                // set hero nexus
                else if(i == this.getHeight() - 1 && (j+1)%3 != 0){
                    Cell_Nexus_H cell = new Cell_Nexus_H();
                    cell.setPos(i,j);
                    this.board[i][j] = cell;
                }

                //set inaccessible
                else if((j+1)%3 == 0){
                    Cell_Inaccessible cell = new Cell_Inaccessible();
                    cell.setPos(i,j);
                    this.board[i][j] = cell;
                }

                // set 36 of others, 15 plain, 7 bush 7 cave 7 koulou
                else{
                    String flag = arrange.get(0);
                    arrange.remove(0);
                    switch (flag){
                        case "p":
                            Cell_Plain cell = new Cell_Plain();
                            cell.setPos(i,j);
                            this.board[i][j] = cell;
                            break;

                        case "b":
                            Cell_Bush cellB = new Cell_Bush();
                            cellB.setPos(i,j);
                            this.board[i][j] = cellB;
                            break;

                        case "k":
                            Cell_Koulou cellK = new Cell_Koulou();
                            cellK.setPos(i,j);
                            this.board[i][j] = cellK;
                            break;

                        case "c":
                            Cell_Cave cellC = new Cell_Cave();
                            cellC.setPos(i,j);
                            this.board[i][j] = cellC;
                            break;
                    }

                }

            }
        }
    }
    public void shuffleMap(){
        Collections.shuffle(arrange);

        for(int i = 0; i < this.getHeight(); i++){
            for(int j = 0; j < this.getWidth(); j++){
                HeroLegendCell cell = new HeroLegendCell();
                if (i == 0 && j == 0) {
                    cell.setPos(i,j);
                    cell.setSymbol(color.yellowBG(" H "));
                    cell.setStatus("   ");
                    this.board[i][j] = cell;

                } else if(arrange.get(i*getWidth() + j).equals(" X ")){
                    cell.setPos(i,j);
                    cell.setSymbol(color.redBG(arrange.get(i*getWidth() + j)));
                    cell.setStatus(" X ");
                    this.board[i][j] = cell;

                } else if (arrange.get(i*getWidth() + j).equals(" M ")) {
                    cell.setPos(i,j);
                    cell.setSymbol(color.purpleBG(arrange.get(i*getWidth() + j)));
                    cell.setStatus(" M ");
                    this.board[i][j] = cell;

                }else {
                    cell.setPos(i, j);
                    cell.setSymbol(arrange.get(i * getWidth() + j));
                    cell.setStatus("   ");
                    this.board[i][j] = cell;
                }
            }
        }
    }

    public void printMap(){

        for(int i = 0; i < 2*getHeight()+1; i++){
            for(int j = 0; j < 2*getWidth()+1; j++){
                if(i%2 == 0){
                    if (j != 0) {
                        System.out.printf("--");
                    }else {
                        System.out.printf("-");
                    }
                }
                else if(j%2 == 0){
                    System.out.printf("|");
                }
                else {
                    System.out.printf(board[Math.floorDiv(i,2)][Math.floorDiv(j,2)].getSymbol());
                }
            }
            System.out.println("");
        }
    }

    public Boolean move(String move, T hero, T opponent){
        int i = hero.getTeamPos_i();
        int j = hero.getTeamPos_j();
        int new_i = i;
        int new_j = j;
        switch (move){
            case "a":
                if (j < 1){
                    return false;
                }else {
                    new_j = j - 1;
                }
                break;

            case "w":
                if (i < 1){
                    return false;
                }else {
                    new_i = i - 1;
                }
                break;


            case "d":
                if (j >= getHeight() - 1){
                    return false;
                }else {
                    new_j = j + 1;
                }
                break;

            case "s":
                if (i >= getWidth() - 1){
                    return false;
                }else {
                    new_i = i + 1;
                }
                break;

            case "i":
                hero.printAllMembers();
                return false;
        }

        if(opponent != null){
            if(opponent.getTeamPos_i() > new_i){
                color.redOut("You can't move forward than monster.");
                return false;
            }
        }

        if (board[new_i][new_j].getStatus().equals(" X ") || board[new_i][new_j].getSymbol().contains("H")){
            color.redOut("That is not a valid move.");
            return false;

        }else if(board[new_i][new_j].getStatus().equals(" N ")){
            //start market situation

            //move to new place, print map
            board[new_i][new_j].setSymbol(color.yellowBG(" H "));
            hero.setTeamPos_i(new_i);
            hero.setTeamPos_j(new_j);
            //change origin place
            board[i][j].setSymbol(board[i][j].getStatus());
        } else if (board[new_i][new_j].getStatus().equals("   ") || board[new_i][new_j].getStatus().equals(" B ") || board[new_i][new_j].getStatus().equals(" C ") || board[new_i][new_j].getStatus().equals(" K ")) {
            board[new_i][new_j].setSymbol(color.yellowBG(" H "));
            hero.setTeamPos_i(new_i);
            hero.setTeamPos_j(new_j);
            //change origin place
            board[i][j].setSymbol(board[i][j].getStatus());

            // get buff
            board[new_i][new_j].getBuff((HerosTeam) hero);
            if (board[new_i][new_j].getStatus().equals(" B ") || board[new_i][new_j].getStatus().equals(" C ") || board[new_i][new_j].getStatus().equals(" K ")) {
                color.yellowOut("GET BUFF");
                hero.printAllMembers();
            }
        }

        if(board[i][j].getStatus().equals(" B ") || board[i][j].getStatus().equals(" C ") || board[i][j].getStatus().equals(" K ")){
            board[i][j].removeBuff((HerosTeam) hero);
        }

        if(board[i][j].getStatus().equals(" N ")){
            //change origin place
            board[i][j].setSymbol(color.yellowBG(board[i][j].getStatus()));
        }

        return true;
    }

    public Boolean move_Monster(T hero, T opponent){
        int i = hero.getTeamPos_i();
        int j = hero.getTeamPos_j();
        int new_i = i;
        int new_j = j;

        if (i >= getWidth() - 1){
            return false;
        } else {
            new_i = i + 1;
        }


        if(opponent != null) {
            if(hero.getTeamPos_i() == opponent.getTeamPos_i()){
                new_i = i;
                new_j = opponent.getTeamPos_j();
            }
        }


        if (board[new_i][new_j].getStatus().equals(" X ")){
            return false;

        }else if(board[new_i][new_j].getStatus().equals(" N ")){
            //start market situation

            //move to new place, print map
            board[new_i][new_j].setSymbol(color.purpleBG(" M "));
            hero.setTeamPos_i(new_i);
            hero.setTeamPos_j(new_j);
            //change origin place
            board[i][j].setSymbol(board[i][j].getStatus());
        } else if (board[new_i][new_j].getStatus().equals("   ") || board[new_i][new_j].getStatus().equals(" B ") || board[new_i][new_j].getStatus().equals(" C ") || board[new_i][new_j].getStatus().equals(" K ")) {
            board[new_i][new_j].setSymbol(color.purpleBG(" M "));
            hero.setTeamPos_i(new_i);
            hero.setTeamPos_j(new_j);
            //change origin place
            board[i][j].setSymbol(board[i][j].getStatus());

        }

        if(board[i][j].getStatus().equals(" N ")){
            //change origin place
            board[i][j].setSymbol(color.purpleBG(board[i][j].getStatus()));
        }

        return true;
    }

    public String getCurrentPosStatus(int i, int j){
        return this.board[i][j].getStatus();
    }

}
