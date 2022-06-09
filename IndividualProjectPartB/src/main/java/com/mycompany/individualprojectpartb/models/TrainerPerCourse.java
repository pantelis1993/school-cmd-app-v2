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
public class TrainerPerCourse {
    
    private  List<Trainer> trnPerCourse;
    private Course course;

    public TrainerPerCourse() {
        trnPerCourse = new ArrayList<>();
    }

    public TrainerPerCourse(List<Trainer> trnPerCourse, Course course) {
        this.trnPerCourse = trnPerCourse;
        this.course = course;
    }

    public  List<Trainer> getTrnPerCourse() {
        return trnPerCourse;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Trainers per course: ").append(this.getTrnPerCourse()).toString();
    }
    
    
    
    
    
}
