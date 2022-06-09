/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.models;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author plogothetis
 */
public class Course {
    
    private int course_ID;
    private String courseTitle;
    private LocalDate start_date;
    private LocalDate end_date;
    private String startDate;
    private String endDate;
    
    private static int count;
    
    private StudentPerCourse stdPerCourse;
    private TrainerPerCourse trnPerCourse;
    private AssignmentPerCourse asgnmntPerCourse;
    private AssignmentPerStudentPerCourse asgnmntStudCourse;
    
    public Course() {
      stdPerCourse = new StudentPerCourse();
      trnPerCourse = new TrainerPerCourse();
      asgnmntPerCourse = new AssignmentPerCourse();
      asgnmntStudCourse = new AssignmentPerStudentPerCourse();
    }

    public Course(int course_ID, String courseTitle,String startDate) {
        this.course_ID = course_ID;
        this.courseTitle = courseTitle;
        this.startDate = startDate;
        
      stdPerCourse = new StudentPerCourse();
      trnPerCourse = new TrainerPerCourse();
      asgnmntPerCourse = new AssignmentPerCourse();
      asgnmntStudCourse = new AssignmentPerStudentPerCourse();
    }

    
    public Course(int course_ID, String courseTitle, LocalDate start_date, LocalDate end_date) {
        this.course_ID = course_ID;
        this.courseTitle = courseTitle;
        this.start_date = start_date;
        this.end_date = end_date;
        
        stdPerCourse = new StudentPerCourse();
        trnPerCourse = new TrainerPerCourse();
        asgnmntPerCourse = new AssignmentPerCourse();
        asgnmntStudCourse = new AssignmentPerStudentPerCourse();
    }

    
    public Course(String courseTitle, LocalDate start_date, LocalDate end_date) {
        this.courseTitle = courseTitle;
        this.start_date = start_date;
        this.end_date = end_date;
        
        stdPerCourse = new StudentPerCourse();
        trnPerCourse = new TrainerPerCourse();
        asgnmntPerCourse = new AssignmentPerCourse();
        asgnmntStudCourse = new AssignmentPerStudentPerCourse();
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public StudentPerCourse getStdPerCourse() {
        return stdPerCourse;
    }

    public void setStdPerCourse(StudentPerCourse stdPerCourse) {
        this.stdPerCourse = stdPerCourse;
    }

    public TrainerPerCourse getTrnPerCourse() {
        return trnPerCourse;
    }

    public void setTrnPerCourse(TrainerPerCourse trnPerCourse) {
        this.trnPerCourse = trnPerCourse;
    }

    public AssignmentPerCourse getAsgnmntPerCourse() {
        return asgnmntPerCourse;
    }

    public void setAsgnmntPerCourse(AssignmentPerCourse asgnmntPerCourse) {
        this.asgnmntPerCourse = asgnmntPerCourse;
    }

    public int getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(int course_ID) {
        this.course_ID = course_ID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.courseTitle);
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
        final Course other = (Course) obj;
        return Objects.equals(this.courseTitle, other.courseTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(++count).append("-");
        
        sb.append("CourseTitle is: ").append(courseTitle);
        sb.append(", start_date is: ").append(start_date);
        sb.append(", course end date is: ").append(end_date).append("\n");
        return sb.toString();
    }
   
}
