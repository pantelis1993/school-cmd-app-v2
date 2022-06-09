/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author plogothetis
 */
public class StudentPerCourse {
    
    
    private Course course;
    private List<Student> stdPerCourse;

    
    public StudentPerCourse() {
       stdPerCourse = new ArrayList<>();
    }

    public StudentPerCourse(Course course, List<Student> stdPerCourse) {
        this.course = course;
        this.stdPerCourse = stdPerCourse;
    }

    public List<Student> getStdPerCourse() {
        return stdPerCourse;
    }

    public Course getCourse() {
        return course;
    }

  
    public void setCourse(Course course) {
        this.course = course;
    }


      @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        final StudentPerCourse other = (StudentPerCourse) obj;
        if (!Objects.equals(this.getStdPerCourse() , other.getStdPerCourse())) {
            return false;
        }
        return  true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().append("Students per course: ").append(this.getStdPerCourse()).toString();
    }
}
