/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

import java.util.ArrayList;
public class Course implements IEnrollable {
    private String courseId;
    private String courseTitle;
    private double credit;

    private ArrayList<Student> studentList = new ArrayList<>();
    private Faculty faculty;

    public Course() {}

    public Course(String id, String title, double credit) {
        courseId = id;
        courseTitle = title;
        this.credit = credit;
    }

    public String toString() {
        return courseId + " " + courseTitle + " " + credit;
    }

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void dropStudent(int id) {
        for (Student s : studentList) {
            if (s.getStudentId() == id) {
                studentList.remove(s);
     
}
        }
    }
    public void addFaculty(Faculty f) {
        faculty = f;
    }

    public void dropFaculty() {
        faculty = null;
    }

    public void printStudentList() {
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
    public void printCourseInformation() {
    System.out.println(courseId + " " + courseTitle + " " + credit);

    if (faculty != null)
        System.out.println("Faculty: " + faculty);
    else
        System.out.println("Faculty: None");

    System.out.println("Students: " + studentList.size());
}
}