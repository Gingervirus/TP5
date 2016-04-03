package com.SchoolApp.domain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Armin on 2016-04-03.
 */
public class StudentHandler
{
    private Student stud;
    private Scanner keyb;
    private ArrayList<Student> list = new ArrayList<Student>();

    public StudentHandler() {
    }

    public  void employeeMenu()
    {
        int option = 0;
        menu();

        Scanner keyb = new Scanner(System.in);
        option = keyb.nextInt();
        while(option != 0)
        {
            switch (option)
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    viewStudents();
                    break;
                case 4:
                    viewReport();
                    break;
                case 5:
                    enterMarks();
                    break;
                case 6:
                    studentMarks();
                    break;
                default:
                    break;
            }
            menu();
            option = keyb.nextInt();
        }

    }

    public void menu()
    {
        System.out.println("-------------------------Student Information----------------------------");
        System.out.println("1. add an student");
        System.out.println("2. Remove an student");
        System.out.println("3. View all students in a grade");
        System.out.println("4. View all Students in a grade");
        System.out.println("5. Enter Students marks");
        System.out.println("6. View a Student's marks");
        System.out.print("Option:");
    }

    public void addStudent()
    {
        keyb = new Scanner(System.in);
        String name, middlename, lastName, dob, gender, address, cell, studentNr;
        System.out.println("----------------------------Add an Student------------------------------");
        System.out.print("Enter Student Nr:");
        studentNr = keyb.next();
        System.out.print("Please Enter Student name:");
        name = keyb.next();
        System.out.print("Please Enter Student middle name:");
        middlename = keyb.next();
        System.out.print("Please Enter Student surname:");
        lastName = keyb.next();
        System.out.print("Please Enter Student Date of birth:");
        dob = keyb.next();
        System.out.print("Please Enter Student gender");
        gender = keyb.next();
        System.out.print("Please Enter Student address:");
        keyb.nextLine();
        address = keyb.nextLine();
        System.out.print("Please Enter Student Selfphone Nr:");
        cell = keyb.next();
        stud = new Student(name, middlename, lastName, dob, gender, address, cell);

        list.add(stud);
        StudentFileHandler filehandler = new StudentFileHandler();
        filehandler.setValues(stud);
        try {
            filehandler.write();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void removeStudent()
    {

    }

    public void viewStudents()
    {

    }
    public void viewReport()
    {

    }
    public void enterMarks()
    {

    }
    public void studentMarks()
    {

    }

}
