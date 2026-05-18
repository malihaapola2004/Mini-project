/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.university;

/**
 *
 * @author User
 */import java.util.Scanner;
public class University {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Course ID: ");
        String courseid = sc.nextLine();

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Credit: ");
        double credit = sc.nextDouble();
        sc.nextLine();

        Course c = new Course(courseid, title, credit);

        
        System.out.print("Faculty ID: ");
        int fid = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String fname = sc.nextLine();

        System.out.print("Position: ");
        String fpos = sc.nextLine();

        c.addFaculty(new Faculty(fid, fname, fpos));

        
        System.out.print("Number of Students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();

            c.addStudent(new Student(id, name, cgpa));
        }

        
        System.out.println("\nCourse Info:");
        c.printCourseInformation();

        System.out.println("\nStudents:");
        c.printStudentList();

        sc.close();
    }
}



