/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author User
 */
public interface IEnrollable {
    
    void addStudent(Student student);
    void dropStudent(int studentId);
    void addFaculty(Faculty faculty);
    void dropFaculty();
    void printStudentList();
    
}

