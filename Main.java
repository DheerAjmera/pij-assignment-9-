//Main.java

//Name: Dheer Ajmera
//PRN: 23070126035
//Dept: SY-AIML-A2

// Importing required classes
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Scanner for user input
        StudentOperations operations = new StudentOperations();  // Object to perform operations on students
        int choice;

        // Display menu repeatedly until the user chooses to exit
        do {
            // Displaying the menu
            System.out.println("\nMenu:\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Update Student\n5. Delete Student\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();  // Reading user's choice
            scan.nextLine();  // Consuming leftover newline

            // Handling user choice using switch-case
            switch (choice) {
                case 1 -> {
                    // Adding a new student
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter PRN: ");
                    int prn = scan.nextInt();
                    scan.nextLine();  // Consume newline
                    System.out.print("Enter Branch: ");
                    String branch = scan.nextLine();
                    System.out.print("Enter Batch: ");
                    String batch = scan.nextLine();
                    System.out.print("Enter CGPA: ");
                    float cgpa = scan.nextFloat();

                    // Add student to database
                    operations.addStudent(new Student(name, prn, branch, batch, cgpa));
                }

                case 2 -> 
                    // Display all students
                    operations.displayStudents();

                case 3 -> {
                    // Search for a student by PRN
                    System.out.print("Enter PRN: ");
                    int prn = scan.nextInt();
                    Student s = operations.searchByPRN(prn);
                    if (s != null)
                        s.display();  // If found, display student info
                    else
                        System.out.println("Student not found.");
                }
                case 4 -> {
                    // Update an existing student's details
                    System.out.print("Enter PRN of student to update: ");
                    int prn = scan.nextInt(); 
                    scan.nextLine();
                    System.out.print("Enter New Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter New Branch: ");
                    String branch = scan.nextLine();
                    System.out.print("Enter New Batch: ");
                    String batch = scan.nextLine();
                    System.out.print("Enter New CGPA: ");
                    float cgpa = scan.nextFloat();

                    // Attempt to update student
                    boolean updated = operations.updateStudent(new Student(name, prn, branch, batch, cgpa));
                    System.out.println(updated ? "Updated successfully." : "Student not found.");
                }
                case 5 -> {
                    // Delete a student by PRN
                    System.out.print("Enter PRN to delete: ");
                    int prn = scan.nextInt();
                    System.out.println(operations.deleteStudent(prn) ? "Deleted successfully." : "Student not found.");
                }

                case 6 -> 
                    // Exit the program
                    System.out.println("Exiting...");

                default -> 
                    // Handle invalid choice
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);  // Continue until user chooses to exit
    }
}
