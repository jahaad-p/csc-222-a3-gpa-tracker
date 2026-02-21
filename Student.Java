import java.util.Scanner;

public class Student {
    // Private attributes
    private String firstName;
    private String lastName;
    private double gpa;

    /* Constructor to initialize student object
    this is a parameterized constructor that takes in the first name, last name, and GPA of the student
    this value comes from the user input and is used to initialize the student object
    */
    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }


    /* Getter method
    this is a public method that returns the value of the private field
    this supports encapsulation by allowing access to the private fields without directly modifying them
    */
    public string getFirstName() {
        return firstName;
    }
    public string getLastName() {
        return lastName;
    }
    public double getGPA() {
        return gpa;
    }

    // Setter method with validation
    
    // first name setter
    // validations will:
        // check if the input is not empty
        // check if all characters are letters
        // 



    // toString method to return student information


    // Main method to interact with user and manage students


        // Ask user for number of students


        // Create an array of Student objects

        // Gather student data


        // Display student information and calculate average GPA


        // Display average GPA


        // Close scanner
        scanner.close();
}