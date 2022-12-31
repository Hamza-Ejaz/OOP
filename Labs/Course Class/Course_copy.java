import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saj
 */
public class Course_copy {
    private String courseName;
    private int noOfStudents;
    private String teacher;
    public static int instances = 0;

    public static void main(String[] args) {
        //Getters
    public String getCourseName(){
        return this.courseName;
    }
    public int getNoOfStudents(){
        return this.noOfStudents;
    }
    public String getTeacher(){
        return this.teacher;
    }

    //Setters
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setNoOfStudents(int noOfStudents){
        this.noOfStudents = noOfStudents;
    }
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }

    /**
     * Default constructor. Populates course name, number of students with defaults
     */
    public Course(){
        instances++;
        this.noOfStudents = 0;
        this.courseName = "Not Set";
        this.teacher = "Not Set";
    }

    /** 
     * Constructor with parameters 
     * @param noOfStudents integer
     * @param courseName String with the Course name
     * @param teacher String with the teacher
    */
    public Course(int noOfStudents, String courseName, String teacher){
        this.noOfStudents = noOfStudents;
        this.courseName = courseName;
        this.teacher = teacher;
    
    }

}