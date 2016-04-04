package com.SchoolApp.domain;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Armin on 2016-04-04.
 */
public class SportsHandler
{
    private Sport sp;
    private ArrayList<Sport> list = new ArrayList<Sport>();
    private Scanner keyb;

    public  void sportMenu()
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
                    addSport();
                    break;
                case 2:
                    removeSport();
                    break;
                case 3:
                    viewSports();
                    break;
            }
            menu();
            option = keyb.nextInt();
        }

    }
    public void menu()
    {
        System.out.println("---------------------------Sport Information------------------------------");
        System.out.println("1. add an Sport");
        System.out.println("2. Remove an Sport");
        System.out.println("3. View all Sports");
        System.out.print("Option:");
    }
    public void  addSport()
    {
        keyb = new Scanner(System.in);
        String type, coach, age, prac;
        System.out.println("----------------------------Add an Student------------------------------");
        System.out.print("Enter Sport type:");
        type = keyb.next();
        System.out.print("Please Sport coach Name:");
        coach = keyb.next();
        System.out.print("Please Enter team:");
        age = keyb.next();
        System.out.print("Please Enter Practise times:");
        prac = keyb.next();

        sp = new Sport(type, coach, age, prac);
        list.add(sp);
    }
    public void removeSport()
    {
        System.out.println("Enter Employee Nr you want to remove:");
        keyb = new Scanner(System.in);
        String type = keyb.next();
        int interator = 0;
        int index = 0;
        for(Sport item : list)
        {
            if(item.getType().equals(type))
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
    public void viewSports()
    {
        int index = 0;
        for(Sport item : list)
        {
            System.out.println(list.get(index).toString());
            index++;
        }
    }
}
