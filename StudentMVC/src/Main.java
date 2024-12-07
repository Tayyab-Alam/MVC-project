/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TAYYAB ALAM
 */

import controller.StudentsController;
import model.StudentsManager;
import view.StudentView;
import view.StudentsView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialize components of the MVC structure
        StudentsManager manager = new StudentsManager();
        StudentsView studentsView = new StudentsView();
        StudentView studentView = new StudentView();
        StudentsController controller = new StudentsController(manager, studentsView, studentView);

        Scanner scanner = new Scanner(System.in);

        // Collect and display student data
        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        controller.addStudents(numOfStudents);

        // Display all student data
        controller.displayAllStudents();

        // Display student with the highest CGPA
        controller.displayHighestCgpa();

        // Display student with the lowest CGPA
        controller.displayLowestCgpa();

        // Display the average CGPA
        controller.displayAverageCgpa();
    }
}

