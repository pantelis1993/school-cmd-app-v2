/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.services;

import com.mycompany.individualprojectpartb.utilities.Input;
import java.util.Scanner;

/**
 *
 * @author plogothetis
 */
public class PrintData {
    
    
    
    public static void menuOption(int n) {
        
        switch(n) {
            case 1:
                DataBaseServices.createCourse();
                break;
            case 2:
                DataBaseServices.createTrainer();
                break;
            case 3:
                DataBaseServices.createStudent();
                break;
            case 4:
                DataBaseServices.createAssignment();
                break;
            case 5:
                DataBaseServices.getCourses();
                break;
            case 6:
                DataBaseServices.getTrainers();
                break;
            case 7:
                DataBaseServices.getStudents();
                break;
            case 8:
                DataBaseServices.getAssignments();
           
        }
    }
}
