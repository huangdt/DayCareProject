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
public class Course {
    
    private String courseName;
    private Classroom classroom;
    private double credits;
    private ArrayList<Person> studentlist;
    private Teacher teacher;
    private Rule rule;

    public Course(String courseName, double credits, Rule r) {
        this.courseName = courseName;
        this.credits = credits;
        studentlist=new ArrayList<Person>();
        this.rule=r;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public ArrayList<Person> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<Person> studentlist) {
        this.studentlist = studentlist;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }
    
    @Override
    public String toString() {
        return  courseName ;
    }
    
    
}
