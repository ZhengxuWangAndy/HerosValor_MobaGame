package ood.Team;

import ood.Utils.ColorfulOutput;
import ood.Utils.InputCheck;
import ood.Role.Role;

import java.util.HashMap;
import java.util.Map;
/**
 * the general class for team, using the generic type to build the role's map.
 * */
public class Team <T extends Role>{

    private int teamPos_i = 0;
    private int teamPos_j = 0;

    private int level = 0;

    private String lane;

    public String getInitialLane() {
        return initialLane;
    }

    public void setInitialLane(String initialLane) {
        this.initialLane = initialLane;
    }

    private String initialLane;

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public Map<String, T> roleMap = new HashMap<>();

    ColorfulOutput color = new ColorfulOutput();

    public int getLevel() {
        int sumLevel = 0;
        for (Map.Entry<String, T> entry: roleMap.entrySet()){
            sumLevel += entry.getValue().getLevel();
            }
        return (int) (sumLevel/roleMap.size());
    }


    public int getTeamPos_i() {
        return teamPos_i;
    }

    public void setTeamPos_i(int teamPos_i) {
        this.teamPos_i = teamPos_i;
    }

    public int getTeamPos_j() {
        return teamPos_j;
    }

    public void setTeamPos_j(int teamPos_j) {
        this.teamPos_j = teamPos_j;
    }


    public void addRole(T role){
        roleMap.put(role.getName(), role);
    }

    public T getRole(int serial){
        int i = 1;
        for (Map.Entry<String, T> entry: roleMap.entrySet()){
            if(i == serial){
                return entry.getValue();
            }
            i++;
        }
        return null;
    }

    public T getOnly(){
        return this.getRole(1);
    }

    public T getRole_prompt(){
        InputCheck inputCheck = new InputCheck();
        Boolean serialChecker = false;
        int serial = 0;
        while (!serialChecker) {
            serial = inputCheck.getInt(inputCheck.getInput());
            serialChecker = inputCheck.checkInt(serial, 1, roleMap.size());
            if (serialChecker == false){
                color.redOut("Not a valid number");
            }
            if (serialChecker == true && this.getRole(serial).getHp() <= 0){
                serialChecker = false;
                color.redOut("This is a dead hero");
            }
        }
        return this.getRole(serial);
    }

    public void printAllMembers(){
        int i = 1;

        for (Map.Entry<String, T> entry : roleMap.entrySet()) {
            System.out.printf(color.purpleBG(Integer.toString(i)) + "\t");
            entry.getValue().printRoleProperties();
            i++;
        }
    }

    public int countLeft(){
        int i = 0;
        for (Map.Entry<String, T> entry : roleMap.entrySet()) {
            if (entry.getValue().getHp() > 0){
                i++;
            }
        }
        return i;
    }
}
