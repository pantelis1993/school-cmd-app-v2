/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.utilities;

import java.util.Scanner;

/**
 *
 * @author plogothetis
 */
public class UserInput {
    
    static Scanner scanner = new Scanner(System.in);
    static String input;
    
    //Check user's choice
    public static String YesOrNo() {
        
        input = scanner.next();
        while(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
            System.out.println("Type 'y' or 'n' only.");
            input = scanner.next();
        }
        return input;
    }
    
    
}
