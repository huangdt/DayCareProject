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
public class Immunization {

    
    private String immunizationName;
    private String duration;
    


    public Immunization(String immunizationName, String duration) {
        this.immunizationName = immunizationName;
        this.duration = duration;
    }


    public String getImmunizationName() {
        return immunizationName;
    }

    public void setImmunizationName(String immunizationName) {
        this.immunizationName = immunizationName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return immunizationName ;
    }


    
    
}
