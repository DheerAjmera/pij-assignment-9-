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
    // Getter methods for name, PRN, branch, batch, CGPA
    public String getName() { return name; }
    public int getPRN() { return prn; }
    public String getBranch() { return branch; }
    public String getBatch() { return batch; }
    public float getCGPA() { return cgpa; }

    // Setter methods for name, branch, batch, CGPA
    public void setName(String name) { this.name = name; }
    public void setBranch(String branch) { this.branch = branch; }
    public void setBatch(String batch) { this.batch = batch; }
    public void setCGPA(float cgpa) { this.cgpa = cgpa; }
