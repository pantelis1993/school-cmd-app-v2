/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.models;

import java.time.LocalDate;

/**
 *
 * @author plogothetis
 */
public class Student {
    
    private int student_ID;
    private String student_firstName;
    private String student_lastName;
    private double tuitionFees;
    private LocalDate dOfB;
    private static int count;
    
    private AssignmentPerStudentPerCourse assgnmntStudCourse;
    
    public Student() {
        
       assgnmntStudCourse = new AssignmentPerStudentPerCourse();
    }

    public Student(int student_ID, String student_firstName, String student_lastName, double tuitionFees, LocalDate dOfB) {
        this.student_ID = student_ID;
        this.student_firstName = student_firstName;
        this.student_lastName = student_lastName;
        this.tuitionFees = tuitionFees;
        this.dOfB = dOfB;
        
        assgnmntStudCourse = new AssignmentPerStudentPerCourse();
    }

    public Student(String student_firstName, String student_lastName, double tuitionFees, LocalDate dOfB) {
        this.student_firstName = student_firstName;
        this.student_lastName = student_lastName;
        this.tuitionFees = tuitionFees;
        this.dOfB = dOfB;
        
        assgnmntStudCourse = new AssignmentPerStudentPerCourse();
    }

    public AssignmentPerStudentPerCourse getAssgnmntStudCourse() {
        return assgnmntStudCourse;
    }

    public void setAssgnmntStudCourse(AssignmentPerStudentPerCourse assgnmntStudCourse) {
        this.assgnmntStudCourse = assgnmntStudCourse;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public String getStudent_firstName() {
        return student_firstName;
    }

    public void setStudent_firstName(String student_firstName) {
        this.student_firstName = student_firstName;
    }

    public String getStudent_lastName() {
        return student_lastName;
    }

    public void setStudent_lastName(String student_lastName) {
        this.student_lastName = student_lastName;
    }

    public double getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(double tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public LocalDate getdOfB() {
        return dOfB;
    }

    public void setdOfB(LocalDate dOfB) {
        this.dOfB = dOfB;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.student_ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return this.student_ID == other.student_ID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(++count).append("-");
        sb.append("Student firstName is: ").append(student_firstName);
        sb.append(", student lastName is: ").append(student_lastName);
        sb.append(", tuitionFees are: ").append(tuitionFees);
        sb.append(", date of birth: ").append(dOfB).append("\n");
       
        return sb.toString();
    }
    
    
}
