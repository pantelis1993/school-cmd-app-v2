/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.DAO;

import com.mycompany.individualprojectpartb.models.Course;
import com.mycompany.individualprojectpartb.models.Student;
import com.mycompany.individualprojectpartb.models.StudentPerCourse;
import com.mycompany.individualprojectpartb.utilities.DataUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author plogothetis
 */
public class StudentPerCourseDao {
    
    public static void insertStudentInCourse(StudentPerCourse studentPerCourse) {
        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = "Insert into course_student(course_id,student_id) values (?,?)";
        try {
            con = DataUtils.getConnection();
            pstmt = con.prepareStatement(sql);
            for(Student student:studentPerCourse.getStdPerCourse()) {
                pstmt.setInt(2,student.getStudent_ID());
                pstmt.setInt(1,studentPerCourse.getCourse().getCourse_ID());
                pstmt.executeUpdate();
            }
               
             }catch(SQLException e) {
                    e.printStackTrace();
          }
   }
    
   public static List<StudentPerCourse> getAllStdPerCourse(){
  
        List<StudentPerCourse> result = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select course_title,student_firstName,student_lastName" +
                     "from student JOIN course_student ON" +
                     "student.student_ID = course_student.student_id" +
                     "JOIN course on course.course_ID = course_student.course_id;";
        try {
            con = DataUtils.getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()) {
              
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
   
} 

