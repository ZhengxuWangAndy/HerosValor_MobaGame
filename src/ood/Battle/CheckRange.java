/**
* Check hero and monster's distance and check attack range
* */
package ood.Battle;

import ood.Team.HerosTeam;
import ood.Team.MonsterTeam;

public class CheckRange {
    public CheckRange() {
    }
    private int range = 1;
    public boolean checkRange(HerosTeam hero, MonsterTeam monster){
        if(Math.abs(monster.getTeamPos_i() - hero.getTeamPos_i()) <= range && Math.abs(monster.getTeamPos_j() - hero.getTeamPos_j()) <= range){
            return true;
        }else {
            return false;
        }
    }
}
