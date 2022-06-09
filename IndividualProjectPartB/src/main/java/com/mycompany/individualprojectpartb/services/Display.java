/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.services;

import com.mycompany.individualprojectpartb.utilities.Input;
import com.mycompany.individualprojectpartb.utilities.UserInput;
import java.util.Scanner;

/**
 *
 * @author plogothetis
 */
public class Display {
    
    
    
    
    public static void displayData() {
        System.out.println("Welcome!Choose an option from the menu below.\n");
        menu();
    }
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            
            System.out.println("Press #1 to create new course.");
            System.out.println("Press #2 to create new trainer.");
            System.out.println("Press #3 to create new student.");
            System.out.println("Press #4 to create new assignment.");
            System.out.println("Press #5 to print all the courses from database.");
            System.out.println("Press #6 to print all trainers from database.");
            System.out.println("Press #7 to print all students from database.");
            System.out.println("Press #8 to print all assignment's from database.");
            System.out.println("Press #0 to exit.");
            
            choice = scanner.nextInt();
            PrintData.menuOption(choice);
        } while(choice != 0);
        System.out.println("Exiting...");
        System.exit(0);
    }
}
