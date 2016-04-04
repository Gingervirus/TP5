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

    public  void studentMenu()
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
                    viewAllStudents();
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
        System.out.println("3. View a students");
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
        stud.setStudentNr(studentNr);
        list.add(stud);
        /*
        StudentFileHandler filehandler = new StudentFileHandler();
        filehandler.setValues(stud);
        try {
            filehandler.write();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }*/
    }

    public void removeStudent()
    {
        System.out.println("Enter Employee Nr you want to remove:");
        keyb = new Scanner(System.in);
        String studentNr = keyb.next();
        int interator = 0;
        int index = 0;
        for(Student item : list)
        {
            if(item.getStudentNr().equals(studentNr))
            {
                index = interator;
            }
            else
            {
                interator++;
            }
        }
        list.remove(index);
    }

    public void viewStudents()
    {
        System.out.println("Enter Student Nr you want to view:");
        keyb = new Scanner(System.in);
        String studentNr = keyb.next();
        int interator = 0;
        int index = 0;
        for(Student item : list)
        {
            if(item.getStudentNr().equals(studentNr))
            {
                index = interator;
            }
            else
            {
                interator++;
            }
        }
        System.out.println(list.get(index).toString());
    }

   public void viewAllStudents()
   {
       int index = 0;
       for(Student item : list)
       {
           System.out.println(list.get(index).toString());
           index++;
       }

   }


}
