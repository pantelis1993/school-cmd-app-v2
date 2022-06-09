/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author plogothetis
 */
public class DataUtils {
    
    private static final String username = "projectpartB";
    private static final String password = "individualprojectpartB";
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static Connection con = null;
    
    public static Connection getConnection() {
        if(con==null) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
        try {
            con = DriverManager.getConnection(url,username,password);
            System.out.println(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
      }
        return con;
   }
    
    public static void closeConnection() {
        if(con != null) {
            try {
                con.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
