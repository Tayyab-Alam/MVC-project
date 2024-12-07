/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Student;
import java.util.List;

public class StudentsView {
    public void displayAllStudents(List<Student> students) {
        System.out.println("Student CGPA Details:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", CGPA: " + student.getCgpa());
        }
    }

    public void displayHighestCgpa(Student student) {
        System.out.println("Highest CGPA: " + student.getName() + " with CGPA: " + student.getCgpa());
    }

    public void displayLowestCgpa(Student student) {
        System.out.println("Lowest CGPA: " + student.getName() + " with CGPA: " + student.getCgpa());
    }

    public void displayAverageCgpa(double average) {
        System.out.println("Average CGPA: " + average);
    }
}

