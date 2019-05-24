/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daycareproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dingt
 */
public class SchoolController {
    private School model;
    private SchoolView view;
    
    public SchoolController(School model, SchoolView view){
      this.model = model;
      this.view = view;
   }
    
    public String getSchoolName() {
        return model.getSchoolName();
    }

    public void setSchoolName(String schoolName) {
        model.setSchoolName(schoolName);
    }

    public String getAddress() {
        return model.getAddress();
    }
    
    public void setAddress(String address) {
        model.setAddress(address);
    }
    
    public Course addCourse(String courseName, double credits,Rule r){
        return model.addCourse(courseName, credits,r);
    }
    
    public void removeCourse(String courseName){
        model.removeCourse(courseName);
    }
    
    public Course searchCourse(String keyword){
        return model.searchCourse(keyword);
    }
    
    public Classroom addClassroom(String roomNumber,int capacity){
       return model.addClassroom(roomNumber, capacity);
    }
    
    public void removeClassroom(String  roomNumber){
         model.removeClassroom(roomNumber);
    }
    
    public Classroom searchClassroom(String keyword){
        return model.searchClassroom(keyword);
    }
    
    public Person addStudent(String fatherName, String motherName, String registrationDate, String studentId, double gpa, String birthday, int vaccination, String id, int age, String firstName, String lastName){
        return model.addStudent(fatherName, motherName, registrationDate, studentId, gpa, birthday, vaccination, id, age, firstName, lastName);
    }
    
    public void removeStudent(String s){
        model.removeStudent(s);
    }
    
    public Person searchStudent(String keyword){
        return model.searchStudent(keyword);
    }
    
    public Person addTeacher(double wage, String id, int age, String firstName, String lastName){
        return model.addTeacher(wage, id, age, firstName, lastName);
    }
    
    public void removeTeacher(String t){
        model.removeTeacher(t);
    }
    
    public Person searchTeacher(String keyword){
        return model.searchTeacher(keyword);
    }
    
    public Immunization addImmunization(String immunizationName, String time){
        return model.addImmunization(immunizationName, time);
    }
    
    public void removeImmunization(String s){
        model.removeImmunization(s);
    }
    
    public Immunization searchImmunization(String keyword){
        return model.searchImmunization(keyword);
    }
    
    public ImmunizationActivity addImmunizationActivity(String ImmunizationActivityId, String startTime, String endTime, String time){
        return model.addImmunizationActivity(ImmunizationActivityId,startTime,endTime,time);
    }
    
    public void removeImmunizationActivity(String s){
        model.removeImmunization(s);
    }
    
    public Immunization searchImmunizationActivity(String keyword){
        return model.searchImmunization(keyword);
    }
    
    public Rule addRule(String ruleId, int groupSize, int startAge, int endAge, int groupRoom){
        return model.addRule(ruleId, groupSize, startAge, endAge, groupRoom);
    }
    
    public void removeRule(String s){
        model.removeRule(s);
    }
    
    public Rule searchRule(String keyword){
        return model.searchRule(keyword);
    }

    public School getModel() {
        return model;
    }

    public void setModel(School model) {
        this.model = model;
    }
    public ArrayList<Immunization> readImmunizationCSV(){
    File f= new File("data/immunizations.txt");
    try  {

        BufferedReader inLine = new BufferedReader(new FileReader(f));
	String inputLine = null;	// read one line from file at a time
	while ((inputLine = inLine.readLine()) != null) {
		// Parse line converting each string token into a Student object field
                
		String[] fields = inputLine.split(",");
                 if(!fields[0].equals("immunizationName")){
		String immunizationName= fields[0];
		String duration= fields[1];

                Immunization p=new Immunization(immunizationName, duration);
		// instantiate Student object from line in file and add to list
		this.model.addImmunization(immunizationName, duration);
                 }
	}
        return this.model.getImmunizationlist();
    } catch (IOException e) {
	// catch IOException (and implicitly FileNotFoundException)
	e.printStackTrace();
    }
     return null;
    }
    public   ArrayList<ImmunizationActivity> readImmunizationActivityCSV(){
    File f= new File("data/immunizationActivity.txt");
    try  {

        BufferedReader inLine = new BufferedReader(new FileReader(f));
	String inputLine = null;	// read one line from file at a time
	while ((inputLine = inLine.readLine()) != null) {
		// Parse line converting each string token into a Student object field
                
		String[] fields = inputLine.split(",");
                 if(!fields[0].equals("ImmunizationActivityId")){
		String name= fields[1];
                
		String startTime= fields[2];
                String endTime= fields[3];
                String immunization= fields[0];
               ImmunizationActivity p=new ImmunizationActivity(this.model.getImmunizationlist().get(Integer.parseInt(immunization)-1),name, startTime, endTime);
                        this.model.getImmunizationActivitylist().add(p);
		// instantiate Student object from line in file and add to list
                 }
	}
        return this.model.getImmunizationActivitylist();
    } catch (IOException e) {
	// catch IOException (and implicitly FileNotFoundException)
	e.printStackTrace();
    }
     return null;
    }
    public   ArrayList<Person> readTeacherCSV(){
    File f= new File("data/teachers.txt");
    try  {

      BufferedReader inLine = new BufferedReader(new FileReader(f));
	String inputLine = null;	// read one line from file at a time
	while ((inputLine = inLine.readLine()) != null) {
		// Parse line converting each string token into a Student object field
                
		String[] fields = inputLine.split(",");
                if(!fields[0].equals("wage")){
		Double wage = new Double(fields[0]);
		String id = fields[1];
		int age = new Integer(fields[2]);
                String firstName = fields[3];
                String lastName = fields[4];
		// instantiate Student object from line in file and add to list
		this.model.addTeacher(wage,  id, age, firstName, lastName);
                }
	}
        return this.model.getTeacherlist();
    } catch (IOException e) {
	// catch IOException (and implicitly FileNotFoundException)
	e.printStackTrace();
    }
     return null;
    }
    public  ArrayList<Person> readStudentCSV(){
    File f= new File("data/students.txt");
    try  {

      BufferedReader inLine = new BufferedReader(new FileReader(f));
	String inputLine = null;	// read one line from file at a time
	while ((inputLine = inLine.readLine()) != null) {
		// Parse line converting each string token into a Student object field
                
		String[] fields = inputLine.split(",");
                if(!fields[0].equals("fatherName")){
		String fatherName = fields[0];
		String motherName = fields[1];
		String registrationDate = fields[2];
                String studentId = fields[3];
		Double gpa = new Double(fields[4]);
                String birthday = fields[5];
                int vaccination =new Integer(fields[6]);
		String id = fields[7];
		int age = new Integer(fields[8]);
                String firstName = fields[9];
                String lastName = fields[10];
                Person p=Student.getInstance();
		// instantiate Student object from line in file and add to list
		Student ss=(Student)this.model.addStudent(fatherName, motherName, registrationDate, studentId, gpa, birthday, vaccination,id, age, firstName, lastName);
                for(int i=0;i<6;i++){
                ImmunizationStudent is=new ImmunizationStudent(model.getImmunizationActivitylist().get(i), model.getImmunizationActivitylist().get(i).getStartTime());
                ss.getActivity().add(is);
                        }
                }
	}
        return this.model.getStudentlist();
    } catch (IOException e) {
	// catch IOException (and implicitly FileNotFoundException)
	e.printStackTrace();
    }
     return null;
    }
    
    public   ArrayList<Rule> readRuleCSV(){
    File f= new File("data/rules.txt");
    try  {

        BufferedReader inLine = new BufferedReader(new FileReader(f));
	String inputLine = null;	// read one line from file at a time
	while ((inputLine = inLine.readLine()) != null) {
		// Parse line converting each string token into a Student object field
                
		String[] fields = inputLine.split(",");
                if(!fields[0].equals("ruleId")){
		String ruleId= fields[0];
		int groupSize= new Integer(fields[1]);
                int startAge= new Integer(fields[2]);
                int endAge= new Integer(fields[3]);
                int groupRoom= new Integer(fields[4]);
		// instantiate Student object from line in file and add to list
		model.addRule(ruleId, groupSize, startAge, endAge, groupRoom);
                }
	}
        return model.getRulelist();
    } catch (IOException e) {
	// catch IOException (and implicitly FileNotFoundException)
	e.printStackTrace();
    }
     return null;
    }
    public   ArrayList<Classroom> readClassroomCSV(){
    File f= new File("data/classrooms.txt");
    try  {

      BufferedReader inLine = new BufferedReader(new FileReader(f));
	String inputLine = null;	// read one line from file at a time
	while ((inputLine = inLine.readLine()) != null) {
		// Parse line converting each string token into a Student object field
                
		String[] fields = inputLine.split(",");
                if(!fields[0].equals("roomNumber")){
		String roomNumber= fields[0];
		int capacity= new Integer(fields[1]);
		model.addClassroom(roomNumber, capacity);
                }
	}
        return model.getClassroomlist();
    } catch (IOException e) {
	// catch IOException (and implicitly FileNotFoundException)
	e.printStackTrace();
    }
     return null;
    }
    public  ArrayList<Course> readCourseCSV(){
    File f= new File("data/courses.txt");
    try  {

      BufferedReader inLine = new BufferedReader(new FileReader(f));
	String inputLine = null;	// read one line from file at a time
            int ii=0;
	while ((inputLine = inLine.readLine()) != null) {
		// Parse line converting each string token into a Student object field
            
		String[] fields = inputLine.split(",");
                 if(!fields[0].equals("courseName")){
		String courseName= fields[0];
		int roomnum= new Integer(fields[1])-1;
                Double credit= new Double(fields[2]) ;
		int sid= new Integer(fields[3])-1;
		int rid= new Integer(fields[5])-1;
   
                Course c=model.searchCourse(courseName);
                if(c==null){
               c =model.addCourse(courseName, credit, model.getRulelist().get(rid));
               c.setTeacher((Teacher)model.getTeacherlist().get(ii));
                Classroom cll=model.getClassroomlist().get(roomnum);
                c.setClassroom(cll);
                cll.getCourselist().add(c);
                 ii=ii+1;
                }
                
              
                c.getStudentlist().add(model.getStudentlist().get(sid));
                
                 }
	}
        return model.getCourselist();
    } catch (IOException e) {
	// catch IOException (and implicitly FileNotFoundException)
	e.printStackTrace();
    }
     return null;
    }
    public void initial() throws ParseException{
     
            try {
         readTeacherCSV();
        readImmunizationCSV();
        readImmunizationActivityCSV();
         readStudentCSV();
         readRuleCSV();
        String dateString = "2018-02-23"; 
       Date date= new SimpleDateFormat("yyyy-MM-d").parse(dateString);
        model.setLastPrepare(date);
        model.setRuleTime(new Date());
        readClassroomCSV();
         readCourseCSV();

       
} catch (ParseException e) {
         e.printStackTrace();
}
      
    }

}
