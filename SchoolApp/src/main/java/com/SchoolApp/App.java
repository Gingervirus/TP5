package com.SchoolApp;

import com.SchoolApp.domain.Emplyeehandler;
import com.SchoolApp.domain.SchoolHandler;

import java.io.File;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void menu()
    {
        System.out.println("-----------------------School Management System--------------------------");
        System.out.println("1. School Information");
        System.out.println("2. Employee Information");
        System.out.println("3. Student Information");
        System.out.println("4. Academics");
        System.out.println("5. Sport");
        System.out.println("6. Extra-mural Inofrmation");
        System.out.println("7. Stores");
        System.out.print("Option: ");
    }
    public static void main( String[] args )
    {

        int option = 0;
        menu();
        Scanner keyb = new Scanner(System.in);
        option = keyb.nextInt();

        while(option != 0) {
            switch (option) {
                case 1:
                    SchoolHandler s = new SchoolHandler();
                    s.schoolMenu();
                    break;
                case 2:
                    Emplyeehandler m = new Emplyeehandler();
                    m.employeeMenu();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;

            }
            menu();
            option = keyb.nextInt();
        }
    }
}
