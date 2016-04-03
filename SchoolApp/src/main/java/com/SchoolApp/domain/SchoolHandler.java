package com.SchoolApp.domain;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Armin on 2016-03-31.
 */
public class SchoolHandler
{
    public  void schoolMenu()
    {
        int option = 0;
        menu();
        Scanner keyb = new Scanner(System.in);
        option = keyb.nextInt();

        while(option != 0) {
            switch (option) {
                case 1:
                    view();
                    break;
                case 2:
                    update();
                    break;
            }
            menu();
            option = keyb.nextInt();
        }
    }

    public void view()
    {
        System.out.println("---------------------------------View------------------------------------");
        School st = new School();
        st.read();
        System.out.println(st.toString());
    }

    public void menu()
    {
        System.out.println("--------------------------School Information-----------------------------");
        System.out.println("1. View");
        System.out.println("2. Update School Information");
        System.out.println();
        System.out.print("Option:");
    }

    public void update()
    {
        String schoolName, slogan, principal, conctactNr, email, fax, address;
        Scanner keyb = new Scanner(System.in);
        System.out.println("--------------------------------Update-----------------------------------");
        System.out.print("Enter School Name:");
        schoolName = keyb.nextLine();
        System.out.print("Enter Slogan:");
        slogan = keyb.nextLine();
        System.out.print("Enter Principal Name:");
        principal = keyb.nextLine();
        System.out.print("Enter School Contact Nr:");
        conctactNr = keyb.next();
        System.out.print("Enter School email:");
        email = keyb.nextLine();
        System.out.print("Enter School fax:");
        fax = keyb.nextLine();
        System.out.print("Enter School address:");
        address = keyb.nextLine();

        School st = new School();
        try {
            st.write(schoolName, slogan, principal, conctactNr, email, fax, address);
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
