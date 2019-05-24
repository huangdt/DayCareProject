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
public class Teacher extends Person{
    
    private double wage;
    private double credits;

    public Teacher(double wage, String id, int age, String firstName, String lastName) {
        super(id, age, firstName, lastName);
        this.wage = wage;
    }
    
    private Teacher(){
        
    }
    
    public  static synchronized Person getInstance() {
            return new Teacher();
    }

    public  static synchronized Person getInstance(double wage, String id, int age, String firstName, String lastName) {

            return new Teacher(wage, id, age, firstName, lastName);
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Teacher{" + "wage=" + wage + ", credits=" + credits + '}';
    }

    
    
    
    
}
