/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.DAO;

import com.mycompany.individualprojectpartb.models.Course;
import com.mycompany.individualprojectpartb.models.Trainer;
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
public class TrainerDao {
    public static void insertTrainer(Trainer trainer) {
        
        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = "INSERT into trainer(trainer_firstName,trainer_lastName,trainer_subject) values (?,?,?)";
        
        try {
            con = DataUtils.getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,trainer.getTrainer_firstName());
            pstmt.setString(2,trainer.getTrainer_lastName());
            pstmt.setString(3,trainer.getTrainer_subject());
            pstmt.executeUpdate();
            
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static List<Trainer> getAllTrainers() {
        List<Trainer> result = new ArrayList<>();
        PreparedStatement pstmt = null;
        Connection con = null;
        ResultSet rs = null;
        
        try {
            con = DataUtils.getConnection();
            String sql = "SELECT trainer_firstName,trainer_lastName,trainer_subject FROM trainer"; 
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while(rs.next()) {

              Trainer trainer = new Trainer(rs.getString(1),rs.getString(2),rs.getString(3));
              result.add(trainer);
              
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
          System.out.println(result);
        return  result;
    }
}
 

