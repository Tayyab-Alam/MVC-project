/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Student;

public class StudentView {
    public void displayStudent(Student student) {
        System.out.println("Name: " + student.getName() + ", CGPA: " + student.getCgpa());
    }
}

