/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.individualprojectpartb.services;

import com.mycompany.individualprojectpartb.DAO.AssignmentDao;
import com.mycompany.individualprojectpartb.DAO.CourseDao;
import com.mycompany.individualprojectpartb.DAO.StudentDao;
import com.mycompany.individualprojectpartb.DAO.TrainerDao;
import com.mycompany.individualprojectpartb.models.Assignment;
import com.mycompany.individualprojectpartb.models.Course;
import com.mycompany.individualprojectpartb.models.Student;
import com.mycompany.individualprojectpartb.models.Trainer;
import com.mycompany.individualprojectpartb.utilities.Input;
import com.mycompany.individualprojectpartb.utilities.UserInput;
import com.mycompany.individualprojectpartb.utilities.Validation;
import java.util.Scanner;

/**
 *
 * @author plogothetis
 */
public class DataBaseServices {
    
    static Scanner scanner = new Scanner(System.in);
    static String input;
    static int number;
    static String date;
    
    
    // Course creation and insertion to the database
    public static void createCourse() {
        
        Course course = new Course();
        System.out.println("Enter the title of the course: ");
        input = Validation.checkString(scanner.nextLine());
        course.setCourseTitle(input);
        
        System.out.println("Enter starting date: ");
        date = scanner.nextLine();
        date = Validation.checkDate(date);
        course.setStart_date(Validation.convertToLocalDate(date));
        
        System.out.println("Enter end date: ");
        date = scanner.nextLine();
        date = Validation.checkDate(date);
        course.setEnd_date(Validation.convertToLocalDate(date));
        
        System.out.print("Add course to database?Press y (yes) or (n) no: ");
        String answer = UserInput.YesOrNo();
        if(answer.equalsIgnoreCase("y")) {
            CourseDao.insertCourse(course);
            System.out.println("Course has been added!");
        }
        else {
            Display.menu();
        }
    }
   
    //Create new trainer to add to database
    public static void createTrainer() {
        
        Trainer trainer = new Trainer();
        System.out.println("Enter trainer's first name: ");
        input = Validation.checkString(scanner.nextLine());
        trainer.setTrainer_firstName(input);
        System.out.println("Enter trainer's last name: ");
        input =Validation.checkString(scanner.nextLine()) ;
        trainer.setTrainer_lastName(input);
        System.out.println("Enter trainer's subject: ");
        input =Validation.checkString(scanner.nextLine()) ;
        System.out.println("Add trainer to database?Press y (yes) or (n) no: ");
        String answer = UserInput.YesOrNo();
        if(answer.equalsIgnoreCase("y")) {
            TrainerDao.insertTrainer(trainer);
             System.out.println("Trainer has been added!");
        }
        else {
            Display.menu();
        }
    }
    
    public static void createStudent() {
        Student student = new Student();
        System.out.println("Enter student's firt name: ");
        input =Validation.checkString(scanner.nextLine()) ;
        student.setStudent_firstName(input);
        System.out.println("Enter student's last name: ");
        input = Validation.checkString(scanner.nextLine());
        student.setStudent_lastName(input);
        System.out.println("Enter student's tuition fees: ");
        number =Validation.tuitionCheck(scanner.nextInt()) ;
        student.setTuitionFees(number);
        System.out.println("Enter student's date of birth: ");
        date = scanner.nextLine();
        date = Validation.checkDate(date);
        student.setdOfB(Validation.convertToLocalDate(date));
        System.out.println("Add student to database ? Press y (yes) or (n) no: ");
        String answer = UserInput.YesOrNo();
        if(answer.equalsIgnoreCase("y")) {
            StudentDao.insertStudent(student);
             System.out.println("Student has been added!");
        } else {
            Display.menu();
        }
    }
    
    public static void createAssignment() {
        Assignment assignment = new Assignment();
        System.out.println("Enter assignment's title: ");
        input = Validation.checkString(scanner.nextLine());
        assignment.setAsgnmnt_title(input);
        System.out.println("Enter assignment's description: ");
        input = Validation.checkString(scanner.nextLine());
        assignment.setAsgnmnt_desc(input);
        System.out.println("Enter assignment's submission date: ");
        date = scanner.nextLine();
        date = Validation.checkDate(date);
        assignment.setAsgnmnt_subDate(Validation.convertToLocalDate(date));
        System.out.println("Enter oral mark: ");
        number =Validation.oralMarkCheck(scanner.nextInt()) ;
        assignment.setAsgnmnt_oralMark(number);
        System.out.println("Enter total mark: ");
        number =Validation.totalMarkCheck(scanner.nextInt()) ;
        assignment.setAsgnmnt_totalMark(number);
        System.out.println("Add assignment to database?Press y (yes) or (n) no: ");
        String answer = UserInput.YesOrNo();
        if(answer.equalsIgnoreCase("y")) {
            AssignmentDao.insertAssignment(assignment);
             System.out.println("Assignment has been added!");
        } else {
            Display.menu();
        }
    }
    
    //------------Get data from database------------------------
    
    public static void getCourses() {
        CourseDao.getAllCourses();
    }
    
    public static void getTrainers() {
        TrainerDao.getAllTrainers();
    }
    
    public static void getStudents() {
        StudentDao.getAllStudents();
    }
    
    public static void getAssignments() {
        AssignmentDao.getAllAssignments();
    }
}
