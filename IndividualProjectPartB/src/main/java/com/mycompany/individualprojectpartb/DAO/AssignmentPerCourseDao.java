/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.DAO;

import com.mycompany.individualprojectpartb.models.Assignment;
import com.mycompany.individualprojectpartb.models.AssignmentPerCourse;
import com.mycompany.individualprojectpartb.utilities.DataUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author plogothetis
 */
public class AssignmentPerCourseDao {
    
    public static void insertAssignmentCourse(AssignmentPerCourse asgnmntPerCourse) {
        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = "Insert into course_asgnmnt(course_id,asgnmnt_ID) values (?,?)";
        
        try {
            con = DataUtils.getConnection();
            pstmt = con.prepareStatement(sql);
            for(Assignment assignment:asgnmntPerCourse.getAsgnmntPerCourse()) {
                pstmt.setInt(1,asgnmntPerCourse.getCourse().getCourse_ID());
                pstmt.setInt(2,assignment.getAsgnmnt_ID());
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
