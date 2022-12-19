package ood.Map;

import ood.Team.HerosTeam;
import ood.Team.MonsterTeam;

import java.util.LinkedList;

/**
 * The recall function to get back to nexus on map,
 */
public class Recall {
    public Recall() {
    }

    public void recall(HerosTeam hero, GameMap map) {
        map.board[hero.getTeamPos_i()][hero.getTeamPos_j()].setSymbol(map.board[hero.getTeamPos_i()][hero.getTeamPos_j()].getStatus());
        hero.setLane(hero.getInitialLane());
        hero.setTeamPos_i(hero.getInit_i());
        hero.setTeamPos_j(hero.getInit_j());

    }
}
