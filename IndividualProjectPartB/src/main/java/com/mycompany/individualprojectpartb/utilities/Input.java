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
public class Input {
    
    private static Scanner scanner;
    
    private Input(){}
    
    public static Scanner getInstance() {
        if(scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
