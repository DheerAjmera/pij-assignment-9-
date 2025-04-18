//Student.java

// Student class to represent individual student records
public class Student {
    // Private fields for student details
    private String name, branch, batch;
    private int prn;
    private float cgpa;
    // Constructor to initialize a student object with all attributes
    public Student(String name, int prn, String branch, String batch, float cgpa) {
        this.name = name;
        this.prn = prn;
        this.branch = branch;
        this.batch = batch;
        this.cgpa = cgpa;
    }
