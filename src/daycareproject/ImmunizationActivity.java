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
public class ImmunizationActivity {
    private Immunization immunization;
    private String activityName;
    private String startTime;
    private String endTime;

    public ImmunizationActivity(Immunization immunization,String activityName, String startTime, String endTime) {
        this.immunization = immunization;
        this.activityName = activityName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Immunization getImmunization() {
        return immunization;
    }

    public void setImmunization(Immunization immunization) {
        this.immunization = immunization;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

     @Override
    public String toString() {
        return activityName ;
    }
    
}
