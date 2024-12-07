/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsManager {
    private List<Student> students = new ArrayList<>();

    public void addStudents(int numOfStudents) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter CGPA of student " + (i + 1) + ": ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            students.add(new Student(name, cgpa));
        }
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getHighestCgpaStudent() {
        Student highest = students.get(0);
        for (Student student : students) {
            if (student.getCgpa() > highest.getCgpa()) {
                highest = student;
            }
        }
        return highest;
    }

    public Student getLowestCgpaStudent() {
        Student lowest = students.get(0);
        for (Student student : students) {
            if (student.getCgpa() < lowest.getCgpa()) {
                lowest = student;
            }
        }
        return lowest;
    }

    public double calculateAverageCgpa() {
        double total = 0;
        for (Student student : students) {
            total += student.getCgpa();
        }
        return total / students.size();
    }
}

