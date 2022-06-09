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
public class AssignmentPerCourse {
    
    private List<Assignment> asgnmntPerCourse;
    private Course course;

    public AssignmentPerCourse() {
        asgnmntPerCourse = new ArrayList<>();
    }

    public AssignmentPerCourse(List<Assignment> asgnmntPerCourse, Course course) {
        this.asgnmntPerCourse = asgnmntPerCourse;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Assignment> getAsgnmntPerCourse() {
        return asgnmntPerCourse;
    }

    @Override
    public String toString() {
        
        return new StringBuilder().append("Assignment's per course: ").append(this.getAsgnmntPerCourse()).toString();
    }
    
    
    
}
