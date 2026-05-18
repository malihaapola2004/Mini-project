/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author User
 */
public class Student  {
     private int studentId;
   private String studentName;
   private double CGPA;
   
   public Student(int studentID, String studentName, double CGPA){
         this.studentId = studentId;
          this.studentName = studentName;
           this.CGPA = CGPA;
   }
     public int getStudentId(){      
         return studentId;      
}
     public String tostring(){
         return "ID :" + studentId + "Name :" + studentName + "CGPA" + CGPA;
     }
}


