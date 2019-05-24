/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daycareproject;

/**
 *
 * @author dingt
 */
public class Rule {
    private String ruleId;
    private int groupSize;
    private int startAge;
    private int endAge;
    private int groupRoom;

    public Rule(String ruleId, int groupSize, int startAge, int endAge, int groupRoom) {
        this.ruleId=ruleId;
        this.groupSize = groupSize;
        this.startAge = startAge;
        this.endAge = endAge;
        this.groupRoom = groupRoom;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }
    
    

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public int getStartAge() {
        return startAge;
    }

    public void setStartAge(int startAge) {
        this.startAge = startAge;
    }

    public int getEndAge() {
        return endAge;
    }

    public void setEndAge(int endAge) {
        this.endAge = endAge;
    }

    public int getGroupRoom() {
        return groupRoom;
    }

    public void setGroupRoom(int groupRoom) {
        this.groupRoom = groupRoom;
    }
    
    @Override
    public String toString() {
        return  ruleId ;
    }
}
