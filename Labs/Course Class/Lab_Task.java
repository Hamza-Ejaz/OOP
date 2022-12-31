public class Lab_Task {
 
    public static void main(String[] args) {
        
        //Create Course Objects
         Course course1 = new Course("OOP");
         Course course2 = new Course("DLD");
        
         // Add Students In OOP Course
         course1.addStudent("Amir Atta");
         course1.addStudent("M Ahmed");
         
        // Add Students In DLD Course
         course2.addStudent("Aliyan Najeeb");
         course2.addStudent("Rafi Abbasi");
         course2.addStudent("Gul Ali");
         
        //Print Elements of OOP course
         System.out.println("Number of students in OOP Course: " + course1.getNumberOfStudents());
        
         String[] studCourse1 = course1.getStudents();
         for (int i = 0; i < course1.getNumberOfStudents(); i++) {
             System.out.println("\t" + (i+1) + ". " + studCourse1[i]);
        }
        System.out.println();
         
        //Print Elements of DLD Course
        System.out.println("Number of students in DLD Course: " + course2.getNumberOfStudents());
        
        String[] studCourse2 = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.println("\t" + (i+1) + ". " + studCourse2[i]);
        }
    }
 
}
class Course {
     private String name;
     private String[] students = new String[100];
     private int numberOfStudents = 0;
    
     public Course(String name) {
         this.name = name;
     }
    
     public String getName() {
         return name;
     }
     
     public void addStudent(String student) {
     students[numberOfStudents] = student;
        numberOfStudents++;
     }
    
     public String[] getStudents() {
         return students;
     }
    
     public int getNumberOfStudents() {
         return numberOfStudents;
     }
    
}