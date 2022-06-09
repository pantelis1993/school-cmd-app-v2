/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.DAO;

import com.mycompany.individualprojectpartb.models.Course;
import com.mycompany.individualprojectpartb.utilities.DataUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author plogothetis
 */
public class CourseDao {
    
    public static void insertCourse(Course course) {
        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = "INSERT into course(course_title,course_startDate,course_endDate) values (?,?,?)";
        
        try {
            con = DataUtils.getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,course.getCourseTitle());
            pstmt.setDate(2,Date.valueOf(course.getStart_date().toString()));
            pstmt.setDate(3,Date.valueOf(course.getEnd_date().toString()));
            pstmt.executeUpdate();
            
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static List<Course> getAllCourses() {
        List<Course> result = new ArrayList<>();
        PreparedStatement pstmt = null;
        Connection con = null;
        ResultSet rs = null;
        
        try {
            con = DataUtils.getConnection();
            String sql = "SELECT * from course"; 
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                
                Date startDate = rs.getDate("course_startDate");
                Date endDate = rs.getDate("course_endDate");
                LocalDate startDateL = startDate.toLocalDate();
                LocalDate endDateL = endDate.toLocalDate();
                
                Course course = new Course(rs.getInt(1),rs.getString(2),startDateL,endDateL);
                result.add(course);
                System.out.println(result);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
        return  result;
    }
}
