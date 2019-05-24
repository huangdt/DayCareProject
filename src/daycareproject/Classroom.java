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
public class Classroom {
    private String roomNumber;
    private int capacity;
    private ArrayList<Course> courselist;
    

    public Classroom(String roomNumber,int capacity) {
        this.roomNumber = roomNumber;
        this.capacity=capacity;
        courselist=new ArrayList<Course>();
    }
    
    public String getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public ArrayList<Course> getCourselist() {
        return courselist;
    }

    public void setCourselist(ArrayList<Course> courselist) {
        this.courselist = courselist;
    }

    public Course addCourse(Course c){
        
        courselist.add(c);
        return c;
    }
    
    public void removeCourse(String courseName){
        for(Course c: courselist)
            if(c.getCourseName().equals(courseName))
        courselist.remove(c);
    }
    
    public Course searchClassroom(String keyword){
        for(Course p: courselist){
            if(keyword.equals(p.getCourseName())){
               return p; 
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return  roomNumber ;
    }
    
    
    
    
}
