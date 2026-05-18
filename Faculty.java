/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university;

/**
 *
 * @author User
 */
public class Faculty  {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;
    
    public Faculty() {}
    
    public Faculty(int facultyId, String facultyName, String facultyPosition){
       
      this.facultyId = facultyId;
      this.facultyName = facultyName;
       this.facultyPosition = facultyPosition;
    }
    public String toString() {
        return "Faculty ID:" + facultyId + "Faculty name : " +facultyName+ "Faculty position : " + facultyPosition;}
}
    
           



