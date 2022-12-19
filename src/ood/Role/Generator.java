package ood.Role;

import ood.Team.HerosTeam;
import ood.Team.MonsterTeam;

import java.util.LinkedList;

/**
 * Generator class use for generate heroes and monsters.
 */
public class Generator {

    private int highestLevel = 1;
    public Generator() {
    }
    public LinkedList<HerosTeam> generateHero(int Height){
        // hero team
        HerosTeam Top = new HerosTeam();
        Top.chooseHero();
        Top.printAllMembers();
        Top.setTeamPos_i(Height - 1);
        Top.setTeamPos_j(0);
        Top.setInit_i(Height - 1);
        Top.setInit_j(0);
        Top.setLane("Top");
        Top.setInitialLane("Top");

        HerosTeam Mid = new HerosTeam();
        Mid.chooseHero();
        Mid.printAllMembers();
        Mid.setTeamPos_i(Height - 1);
        Mid.setInit_i(Height - 1);
        Mid.setTeamPos_j(3);
        Mid.setInit_j(3);
        Mid.setLane("Mid");
        Mid.setInitialLane("Mid");


        HerosTeam Bottom = new HerosTeam();
        Bottom.chooseHero();
        Bottom.printAllMembers();
        Bottom.setTeamPos_i(Height - 1);
        Bottom.setInit_i(Height - 1);
        Bottom.setTeamPos_j(6);
        Bottom.setInit_j(6);
        Bottom.setLane("Bottom");
        Bottom.setInitialLane("Bottom");


        //round control
        LinkedList<HerosTeam> HeroQueue = new LinkedList<>();
        HeroQueue.add(Top);
        HeroQueue.add(Mid);
        HeroQueue.add(Bottom);

        return HeroQueue;

    }

    public void updateLevel(LinkedList<HerosTeam> heroes){
        this.highestLevel = 1;
        for(int i = 0; i < heroes.size(); i++){
            this.highestLevel = Math.max(heroes.get(i).getLevel(),this.highestLevel);
        }
    }

    public LinkedList<MonsterTeam> generateMonster(){
        LinkedList<MonsterTeam> MonsterQueue = new LinkedList<>();

        MonsterTeam monsterTop = new MonsterTeam(1);
        monsterTop.getOnly().setLevel(this.highestLevel);
        monsterTop.getOnly().setHp();
        monsterTop.setTeamPos_i(0);
        monsterTop.setTeamPos_j(0);
        monsterTop.setLane("Top");

        MonsterTeam monsterMid = new MonsterTeam(1);
        monsterMid.getOnly().setLevel(this.highestLevel);
        monsterMid.getOnly().setHp();
        monsterMid.setTeamPos_i(0);
        monsterMid.setTeamPos_j(3);
        monsterMid.setLane("Mid");

        MonsterTeam monsterBottom = new MonsterTeam(1);
        monsterBottom.getOnly().setLevel(this.highestLevel);
        monsterBottom.getOnly().setHp();
        monsterBottom.setTeamPos_i(0);
        monsterBottom.setTeamPos_j(6);
        monsterBottom.setLane("Bottom");

        MonsterQueue.add(monsterTop);
        MonsterQueue.add(monsterMid);
        MonsterQueue.add(monsterBottom);

        return MonsterQueue;

    }
}
