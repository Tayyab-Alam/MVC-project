/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Student;
import model.StudentsManager;
import view.StudentView;
import view.StudentsView;

import java.util.List;

public class StudentsController {
    private StudentsManager manager;
    private StudentsView studentsView;
    private StudentView studentView;

    public StudentsController(StudentsManager manager, StudentsView studentsView, StudentView studentView) {
        this.manager = manager;
        this.studentsView = studentsView;
        this.studentView = studentView;
    }

    public void addStudents(int numOfStudents) {
        manager.addStudents(numOfStudents);
    }

    public void displayAllStudents() {
        List<Student> students = manager.getAllStudents();
        studentsView.displayAllStudents(students);
    }

    public void displayHighestCgpa() {
        Student highest = manager.getHighestCgpaStudent();
        studentsView.displayHighestCgpa(highest);
    }

    public void displayLowestCgpa() {
        Student lowest = manager.getLowestCgpaStudent();
        studentsView.displayLowestCgpa(lowest);
    }

    public void displayAverageCgpa() {
        double average = manager.calculateAverageCgpa();
        studentsView.displayAverageCgpa(average);
    }
}

