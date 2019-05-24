/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daycareproject;

import java.util.ArrayList;

/**
 *
 * @author dingt
 */
public class Person {
    
    private String id;
    private int age;
    private String firstName;
    private String lastName;
    private ArrayList<Immunization> immunizationlist;
    
    protected Person(String id, int age, String firstName, String lastName) {
            super();
            this.id = id;
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
            immunizationlist=new ArrayList<Immunization>();
    }
    protected Person(){
        
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return   firstName+ " " + lastName ;
    }
        
    
        
}
