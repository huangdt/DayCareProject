/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daycareproject;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dingt
 */
public class Student extends Person{
    
    private String fatherName;
    private String motherName;
    private String registrationDate;
    private String studentId;
    private double gpa;
    private String birthday;
    private int vaccination; 
    private ArrayList<ImmunizationStudent> activity;

    private Student(String fatherName, String motherName, String registrationDate, String studentId, double gpa, String birthday, int vaccination, String id, int age, String firstName, String lastName) {
        super(id, age, firstName, lastName);
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.registrationDate = registrationDate;
        this.studentId = studentId;
        this.gpa = gpa;
        this.birthday = birthday;
        this.vaccination=vaccination;
        activity=new ArrayList<ImmunizationStudent>();
    }
    
    private Student(){
        activity=new ArrayList<ImmunizationStudent>();
    }
    
    public  static synchronized Person getInstance() {
            return new Student();
    }

    public  static synchronized Person getInstance(String fatherName, String motherName, String registrationDate, String studentId, double gpa, String birthday, int vaccination, String id, int age, String firstName, String lastName) {

            return new Student(fatherName, motherName, registrationDate, studentId, gpa, birthday, vaccination, id, age, firstName, lastName);
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getVaccination() {
        return vaccination;
    }

    public void setVaccination(int vaccination) {
        this.vaccination = vaccination;
    }

    public ArrayList<ImmunizationStudent> getActivity() {
        return activity;
    }

    public void setActivity(ArrayList<ImmunizationStudent> activity) {
        this.activity = activity;
    }

    public void addActivity(ImmunizationStudent is){
        this.activity.add(is);
    }
    
    public void removeActivity(String ac){
       for(ImmunizationStudent is:activity)
       if(is.getActivity().getActivityName().equals(ac))
           activity.remove(is);
    }


  


    
    
}
