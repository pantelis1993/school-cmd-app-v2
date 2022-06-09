/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author plogothetis
 */
public class AssignmentPerStudentPerCourse {
    
    private static List<Assignment> assgnmntStudCourse;
    private Course course;
    private Student student;

    public AssignmentPerStudentPerCourse() {
       assgnmntStudCourse = new ArrayList<>();
    }

    public AssignmentPerStudentPerCourse(List<Assignment> assgnmntStudCourse, Course course, Student student) {
        this.assgnmntStudCourse = assgnmntStudCourse;
        this.course = course;
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Assignment> getAssgnmntStudCourse() {
        return assgnmntStudCourse;
    }

    public void setAssgnmntStudCourse(List<Assignment> assgnmntStudCourse) {
        this.assgnmntStudCourse = assgnmntStudCourse;
    }
    

}
