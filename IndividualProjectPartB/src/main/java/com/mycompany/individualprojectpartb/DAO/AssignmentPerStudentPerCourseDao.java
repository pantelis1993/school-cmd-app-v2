/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.DAO;

import com.mycompany.individualprojectpartb.models.Assignment;
import com.mycompany.individualprojectpartb.models.AssignmentPerStudentPerCourse;
import com.mycompany.individualprojectpartb.utilities.DataUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author plogothetis
 */
public class AssignmentPerStudentPerCourseDao {
    
    public static void insertAssgnmntStudCourse(AssignmentPerStudentPerCourse apspc) {
        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = "Insert into course_asgnmnt_student(course_id,asgnmnt_id,student_id) values (?,?,?)";
        
        try {
            con = DataUtils.getConnection();
            pstmt = con.prepareStatement(sql);
            for(Assignment assignment:apspc.getAssgnmntStudCourse()) {
                pstmt.setInt(1,apspc.getCourse().getCourse_ID());
                pstmt.setInt(2,assignment.getAsgnmnt_ID());
                pstmt.setInt(3,apspc.getStudent().getStudent_ID());
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
