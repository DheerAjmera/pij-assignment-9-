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
