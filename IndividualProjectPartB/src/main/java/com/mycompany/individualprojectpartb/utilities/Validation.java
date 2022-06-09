/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author plogothetis
 */
public class Validation {
    
    private static final Scanner userInput = Input.getInstance();
    
    public static String checkString(String s) {
        while(s.isEmpty() || s.matches(".*\\d.*")) {
            System.out.println("Invalid input");
            s=userInput.nextLine();
        }
        return s;
    }
    
    public static int checkNumber(Scanner scan) {
        int result;
        while(true) {
            try {
                String input = scan.next();
                int num = Integer.parseInt(input);
                result = num;
                break;
            }catch(NumberFormatException e) {
                System.out.println("Provide only numbers.");
            }
        }
        return result;
    }
    
    public static int tuitionCheck(int n) {
        while((n < 0) || (n > 4000)) {
            System.out.println("Invalid input.Choose between 0--4000.");
            n = userInput.nextInt();
        }
        return n;
    }
     
    public static int oralMarkCheck(int n) {
        while((n < 0) || (n > 20)) {
            System.out.println("Invalid input.Choose between 0--20.");
            n = userInput.nextInt();
        }
        return n;
    }
         
    public static int totalMarkCheck(int n) {
        while((n < 0) || (n > 100)) {
            System.out.println("Invalid input.Choose between 0--100");
            n = userInput.nextInt();
        }
        return n;
    }
    
    public static LocalDate convertToLocalDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         LocalDate localDate = LocalDate.parse(date,formatter);
         return localDate;
    }
    
    public static boolean isDate(String date) {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
         try {
            LocalDate.parse(date , formatter);
        } catch (java.time.format.DateTimeParseException e) {
            return false;
        }
        return true;
    }
    
    public static String checkDate(String date) {
        if(isDate(date)){
            return date;
        }else {
            System.out.println("Invalid date format.Provide correct values.");
            return checkDate(userInput.next());
        }
    }
}
