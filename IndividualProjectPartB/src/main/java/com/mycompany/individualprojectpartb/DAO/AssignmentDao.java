/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.DAO;

import com.mycompany.individualprojectpartb.models.Assignment;
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
public class AssignmentDao {
    
     public static void insertAssignment(Assignment asgnmnt) {
        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = "INSERT into assignment(asgnmnt_title,asgnmnt_desc,asgnmnt_subDate,asgnmnt_oralMark,asgnmnt_totalMark) values (?,?,?,?,?)";
        
        try {
            con = DataUtils.getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,asgnmnt.getAsgnmnt_title());
            pstmt.setString(2,asgnmnt.getAsgnmnt_desc());
            pstmt.setDate(3,Date.valueOf(asgnmnt.getAsgnmnt_subDate().toString()));
            pstmt.setInt(4,asgnmnt.getAsgnmnt_oralMark());
            pstmt.setInt(5,asgnmnt.getAsgnmnt_totalMark());
            pstmt.executeUpdate();
            
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
     
     public static List<Assignment> getAllAssignments() {
         List<Assignment> result = new ArrayList<>();
         PreparedStatement pstmt = null;
         Connection con = null;
         ResultSet rs = null;
        
        try {
            con = DataUtils.getConnection();
            String sql = "SELECT asgnmnt_title,asgnmnt_desc,asgnmnt_subDate,asgnmnt_oralMark,asgnmnt_totalMark FROM assignment"; 
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                
                Date subDate = rs.getDate("asgnmnt_subDate");
                LocalDate subDateL = subDate.toLocalDate();
                Assignment assignment = new Assignment(rs.getString(1),rs.getString(2),subDateL,rs.getInt(4),rs.getInt(5));
                result.add(assignment);
                
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        System.out.println(result);
        return  result;
        
     }
}
