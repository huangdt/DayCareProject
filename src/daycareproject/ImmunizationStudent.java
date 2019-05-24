/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daycareproject;

/**
 *
 * @author wangy
 */
public class ImmunizationStudent {
   private ImmunizationActivity activity;
   private String time;
    public ImmunizationStudent(ImmunizationActivity activity,String time) {
        this.activity = activity;
        this.time = time;
    }

    public ImmunizationActivity getActivity() {
        return activity;
    }

    public void setActivity(ImmunizationActivity activity) {
        this.activity = activity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

     @Override
    public String toString() {
        return activity.getActivityName() ;
    }
    
}
