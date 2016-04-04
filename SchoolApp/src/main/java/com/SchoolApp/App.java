package com.SchoolApp;

import com.SchoolApp.domain.*;

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
        System.out.println("4. Sport");
        System.out.println("5. Stores");
        System.out.println("0. Exit");
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
                    StudentHandler stud = new StudentHandler();
                    stud.studentMenu();
                    break;
                case 4:
                    SportsHandler sport = new SportsHandler();
                    sport.sportMenu();
                    break;
                case 5:
                    clothesShop clothes = new clothesShop();
                    clothes.clothesMenu();
                    break;
                case 6:
                    break;

            }
            menu();
            option = keyb.nextInt();
        }
    }
}
