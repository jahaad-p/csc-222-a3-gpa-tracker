# Programming Assignment 3: Student GPA Tracker in Java

**Course:** CSC 222  
**Instructor:** Dan OBrien  
**Due Date:** 2/22/2026  

---

## Objectives
By the end of this lab assignment, you should be able to:

- Understand and implement Java classes based on a UML diagram
- Use constructors to initialize object states
- Use getter and setter methods to access and update object states
- Utilize arrays to manage multiple instances of a class
- Calculate the average of numerical data and format the output

---

## Pre-requisites
- Basic knowledge of Java syntax
- Familiarity with Object-Oriented Programming concepts
- Sample code and output are provided at the end of this document

---

## Problem Statement
You are tasked with developing a Java program that manages a list of students along with their grade point averages (GPAs). Specifically, the program should:

- Ask the user to input the number of students to track.
- For each student, require input for the first name, last name, and GPA.
- For entered GPA values **< 0**, change the values to **0** with your program.
- Store this information in the `Student` class.
- Calculate and display the average GPA for all students in the list.
  - The average GPA should be displayed with **two decimal places**.

---

## Academic Honesty Statement
All work should be your own. No AI or pre-coded, similar work should be consulted. Collaboration with fellow students must be limited to high-level discussions only (e.g., how do getter and setter methods work in a general sense). When in doubt, ask Mr. OBrien. You are encouraged to work with the tutor, Andrew Warner.

---

## UML Diagram

```text
--------------------------
|        Student
--------------------------
| - firstName: String
| - lastName: String
| - gpa: double
--------------------------
| + Student(firstName:
|   String, lastName:
|   String, gpa: double)
| + getFirstName(): String
| + getLastName(): String
| + getGPA(): double
| + setGPA(gpa: double): void
| + toString(): String
--------------------------
```

---

## Requirements
- Use Java to implement the program
- Use comments to explain several sections of code
- Follow the UML diagram for the class structure
- Use encapsulation principles: keep class variables private and use public methods to access them
- Display the average GPA rounded to **two decimal places**

---

## Deliverables
- The Java source file (`Student.java`) uploaded to the zyBook assignment

---

## Grading Rubric
- Correct implementation of Student class based on UML: **40%**
- Correct GPA calculation and output formatting: **20%**
- Code quality, readability, and comments: **15%**

---

## Submission Guidelines
- Do your coding in the IDE that you prefer
- Submit the code via Canvas to the zyBooks assignment for Lab 3

---

## Sample Run

User input in **bold red**.

```text
Enter number of students: 3
Enter first name of student #1: Steve
Enter last name of student #1: Yoder
Enter GPA for student #1: -2.9
Enter first name of student #2: Bridget
Enter last name of student #2: Bailey
Enter GPA for student #2: 4.01
Enter first name of student #3: Sally
Enter last name of student #3: Ride
Enter GPA for student #3: 3.57
Steve Yoder GPA: 0.0
Bridget Bailey GPA: 4.0
Sally Ride GPA: 3.57

AVERAGE GPA: 2.52
```

---

## Starter Code

```java
import java.util.Scanner;

public class Student {
    // Private attributes


    // Constructor to initialize student object


    // Getter methods


    // Setter method with validation


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
}
```
