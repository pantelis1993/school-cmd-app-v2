/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.DAO;

import com.mycompany.individualprojectpartb.models.Trainer;
import com.mycompany.individualprojectpartb.models.TrainerPerCourse;
import com.mycompany.individualprojectpartb.utilities.DataUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author plogothetis
 */
public class TrainerPerCourseDao {
    
    public static void insertTrainerCourse(TrainerPerCourse trainerPerCourse) {
        Connection con = null;
        PreparedStatement pstmt = null;
        String sql = "Insert into course_trainer(course_id,trainer_id) values (?,?)";
        try {
            con = DataUtils.getConnection();
            pstmt = con.prepareStatement(sql);
            for(Trainer trainer:trainerPerCourse.getTrnPerCourse()) {
                pstmt.setInt(1,trainerPerCourse.getCourse().getCourse_ID());
                pstmt.setInt(2,trainer.getTrainer_ID());
                pstmt.executeQuery();
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        
    }
}
