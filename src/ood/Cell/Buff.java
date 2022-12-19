/*
* A interface for Cell to get hero a buff or remove buff
* */
package ood.Cell;

import ood.Team.HerosTeam;

public interface Buff {
    public void getBuff(HerosTeam hero);
    public void removeBuff(HerosTeam hero);
}
