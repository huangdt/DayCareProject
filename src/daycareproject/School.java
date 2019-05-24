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
public class School {
    private String schoolName;
    private String address;
    private Date ruleTime;
    private Date lastPrepare;
    private ArrayList<Course> courselist;
    private ArrayList<Classroom> classroomlist;
    private ArrayList<Person> studentlist;
    private ArrayList<Person> teacherlist;
    private ArrayList<Immunization> immunizationlist;
    private ArrayList<ImmunizationActivity> immunizationActivitylist;
    private ArrayList<Rule> rulelist;
    
    public School(){
        courselist = new ArrayList<Course>();
        classroomlist = new ArrayList<Classroom>();
        studentlist = new ArrayList<Person>();
        teacherlist = new ArrayList<Person>();
        immunizationlist=new ArrayList<Immunization>();
        immunizationActivitylist=new ArrayList<ImmunizationActivity>();
        rulelist=new ArrayList<Rule>();
    }

    public School(String schoolName, String address) {
        this.schoolName = schoolName;
        this.address = address;
        courselist = new ArrayList<Course>();
        classroomlist = new ArrayList<Classroom>();
        studentlist = new ArrayList<Person>();
        teacherlist = new ArrayList<Person>();
        immunizationlist=new ArrayList<Immunization>();
        immunizationActivitylist=new ArrayList<ImmunizationActivity>();
        rulelist=new ArrayList<Rule>();
    }

    public Date getRuleTime() {
        return ruleTime;
    }

    public void setRuleTime(Date ruleTime) {
        this.ruleTime = ruleTime;
    }

    public Date getLastPrepare() {
        return lastPrepare;
    }

    public void setLastPrepare(Date lastPrepare) {
        this.lastPrepare = lastPrepare;
    }

    
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    public Course addCourse(String courseName, double credits, Rule r){
        Course c=new Course(courseName,credits,r);
        courselist.add(c);
        return c;
    }
    
    public void removeCourse(String courseName){
        for(Course c: courselist)
            if(c.getCourseName().equals(courseName)){
        courselist.remove(c);
        break;
            }
    }
    
    public Course searchCourse(String keyword){
        for(Course p: courselist){
            if(keyword.equals(p.getCourseName())){
               return p; 
            }
        }
        return null;
    }
    
    public Classroom addClassroom(String roomNumber,int capacity){
        Classroom c=new Classroom(roomNumber,capacity);
        classroomlist.add(c);
        return c;
    }
    
    public void removeClassroom(String  roomNumber){
        for(Classroom c: classroomlist )
            if(c.getRoomNumber().equals(roomNumber)){
        classroomlist.remove(c);
        break;
            }
    }
    
    public Classroom searchClassroom(String keyword){
        for(Classroom p: classroomlist){
            if(keyword.equals(p.getRoomNumber())){
               return p; 
            }
        }
        return null;
    }

    public ArrayList<Course> getCourselist() {
        return courselist;
    }

    public void setCourselist(ArrayList<Course> courselist) {
        this.courselist = courselist;
    }

    public ArrayList<Classroom> getClassroomlist() {
        return classroomlist;
    }

    public void setClassroomlist(ArrayList<Classroom> classroomlist) {
        this.classroomlist = classroomlist;
    }

    public ArrayList<Person> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<Person> studentlist) {
        this.studentlist = studentlist;
    }

    public ArrayList<Person> getTeacherlist() {
        return teacherlist;
    }

    public void setTeacherlist(ArrayList<Person> teacherlist) {
        this.teacherlist = teacherlist;
    }

    public ArrayList<Immunization> getImmunizationlist() {
        return immunizationlist;
    }

    public void setImmunizationlist(ArrayList<Immunization> immunizationlist) {
        this.immunizationlist = immunizationlist;
    }

    public ArrayList<ImmunizationActivity> getImmunizationActivitylist() {
        return immunizationActivitylist;
    }

    public void setImmunizationActivitylist(ArrayList<ImmunizationActivity> immunizationActivitylist) {
        this.immunizationActivitylist = immunizationActivitylist;
    }

    public ArrayList<Rule> getRulelist() {
        return rulelist;
    }

    public void setRulelist(ArrayList<Rule> rulelist) {
        this.rulelist = rulelist;
    }
    
    public Person addStudent(String fatherName, String motherName, String registrationDate, String studentId, double gpa, String birthday, int vaccination, String id, int age, String firstName, String lastName){
        Person s=Student.getInstance(fatherName, motherName, registrationDate, studentId, gpa, birthday, vaccination, id, age, firstName, lastName);
        studentlist.add(s);
        return s;
    }
    
    public void removeStudent(String firstName){
        for(Person s: studentlist )
            if(s.getFirstName().equals(firstName)){
        studentlist.remove(s);
        break;
            }
    }
    
    public Person searchStudent(String keyword){
        for(Person p: studentlist){
            if(keyword.equals(p.getFirstName())){
               return p; 
            }
        }
        return null;
    }
    
    public Person addTeacher(double wage, String id, int age, String firstName, String lastName){
        Person t=Teacher.getInstance(wage, id, age, firstName, lastName);
        teacherlist.add(t);
        return t;
    }
    
    public void removeTeacher(String firstName){
        for(Person s: teacherlist )
            if(s.getFirstName().equals(firstName)){
        teacherlist.remove(s);
        break;
            }
    }
    
    public Person searchTeacher(String keyword){
        for(Person p: teacherlist){
            if(keyword.equals(p.getFirstName())){
               return p; 
            }
        }
        return null;
    }
    
    public Immunization addImmunization(String immunizationName, String time){
        Immunization i=new Immunization(immunizationName,time);
        immunizationlist.add(i);
        return i;
    }
    
    public void removeImmunization(String immunizationName){
        for(Immunization s: immunizationlist )
            if(s.getImmunizationName().equals(immunizationName)){
        immunizationlist.remove(s);
        break;
            }
    }
    
    public Immunization searchImmunization(String keyword){
        for(Immunization i: immunizationlist){
            if(keyword.equals(i.getImmunizationName())){
               return i; 
            }
        }
        return null;
    }
    
    public ImmunizationActivity addImmunizationActivity(String im,String ImmunizationActivityId, String startTime, String endTime){
        
        ImmunizationActivity i=new ImmunizationActivity(searchImmunization(im),ImmunizationActivityId,startTime,endTime);
        immunizationActivitylist.add(i);
        return i;
    }
    
    public void removeImmunizationActivity(String immunizationActivityId){
        for(ImmunizationActivity s: immunizationActivitylist )
            if(s.getActivityName().equals(immunizationActivityId)){
        immunizationActivitylist.remove(s);
        break;
            }
    }
    
    public ImmunizationActivity searchImmunizationActivity(String keyword){
        for(ImmunizationActivity i: immunizationActivitylist){
            if(keyword.equals(i.getActivityName())){
               return i; 
            }
        }
        return null;
    }
    
    public Rule addRule(String ruleId, int groupSize, int startAge, int endAge, int groupRoom){
        Rule i=new Rule(ruleId, groupSize, startAge, endAge, groupRoom);
        rulelist.add(i);
        return i;
    }
    
    public void removeRule(String ruleId){
        for(Rule s: rulelist )
            if(ruleId.equals(s.getRuleId())){
        rulelist.remove(s);
        break;
            }
    }
    
    public Rule searchRule(String keyword){
        for(Rule i: rulelist){
            if(keyword.equals(i.getRuleId())){
               return i; 
            }
        }
        return null;
    }
}
