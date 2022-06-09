/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.DAO;

import com.mycompany.individualprojectpartb.models.Student;
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
public class StudentDao {
    
    public static void insertStudent(Student student) {
        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = "Insert into student(student_firstName,student_lastName,student_tuitionFees,student_dateOfBirth)"
                   + "values (?,?,?,?)";
                try {
                    con = DataUtils.getConnection();
                    pstmt = con.prepareStatement(sql);
                    pstmt.setString(1,student.getStudent_firstName());
                    pstmt.setString(2,student.getStudent_lastName());
                    pstmt.setDouble(3,student.getTuitionFees());
                    pstmt.setDate(4,Date.valueOf(student.getdOfB().toString()));
                    pstmt.executeUpdate();
                    
                }catch(SQLException e) {
                    e.printStackTrace();
                }
    }
    
    public static List<Student> getAllStudents() {
        List<Student> result = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
    
        try {
            con = DataUtils.getConnection();
            String sql = "Select student_firstName,student_lastName,student_tuitionFees,student_dateOfBirth FROM student";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
         
            while(rs.next()) {
                 Date birthdate = rs.getDate("student_dateOfBirth");
                 LocalDate bD = birthdate.toLocalDate();
                 Student student = new Student(rs.getString(1),rs.getString(2),rs.getDouble(3),bD);
                 result.add(student);
                
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        System.out.println(result);
        return result;
        
    }
}
