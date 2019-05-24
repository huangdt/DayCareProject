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
public class SchoolView {
    public void printStudentsDetails(String fatherName, String motherName, String registrationDate, String studentId, double gpa, String birthday, int vaccination, String id, int age, String firstName, String lastName){
        System.out.println("Student{"+ firstName+ " " + lastName + "age="+ age + "fatherName=" + fatherName + ", motherName=" + motherName + ", registrationDate=" + registrationDate + ", studentId=" + studentId + ", gpa=" + gpa + ", birthday=" + birthday + '}');
    }
    
    public void printTeacherDetails(double wage, String id, int age, String firstName, String lastName){
        System.out.println("Teacher{" + firstName+ " " + lastName + "age="+ age +"wage=" + wage + '}');
    }
    
    public void printClassroomDetails(String roomNumber,int capacity){
        System.out.println("Classroom{" + "roomNumber="+ roomNumber +"capacity=" + capacity + '}');
    }
    
    public void printCourseDetails(String courseName, double credits){
        System.out.println("Course{" + "courseName="+ courseName +"credits=" + credits + '}');
    }
        
    public void printImmunizationDetails(String immunizationName, String duration){
        System.out.println("Immunization{" + "immunizationName="+ immunizationName +"duration=" + duration + '}');
    }
    
    public void printRuleDetails(String ruleId, int groupSize, int startAge, int endAge, int groupRoom){
        System.out.println("Rule{" + "ruleId="+ ruleId +"groupSize=" + groupSize+"startAge=" + startAge+"endAge=" + endAge+"groupRoom=" + groupRoom + '}');
    }
    
    public void printImmunizationActivityDetails(String activityName, String startTime, String endTime){
        System.out.println("Immunization{" + "activityName="+ activityName +"startTime=" + startTime+"endTime=" + endTime + '}');
    }
}
