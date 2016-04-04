package com.SchoolApp.domain;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Armin on 2016-04-04.
 */
public class clothesShop
{
    private Scanner keyb;
    private Clothes shop;
    private ArrayList<Clothes> list = new ArrayList<Clothes>();
    public  void shopMenu()
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
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    viewAllItems();
                    break;
                case 4:
                    buy();
                    break;
            }
            menu();
            option = keyb.nextInt();
        }

    }

    public void clothesMenu()
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
                   addItem();
                    break;
                case 2:
                   removeItem();
                    break;
                case 3:
                   viewAllItems();
                    break;
                case 4:
                   buy();
                    break;
            }
            menu();
            option = keyb.nextInt();
        }
    }
    public void menu()
    {
        System.out.println("---------------------------Chlothes Shop------------------------------");
        System.out.println("1. add an Item");
        System.out.println("2. Remove an Item");
        System.out.println("3. View all Items an Item");
        System.out.println("4. Buy an Item");
        System.out.println("0. Exit");
        System.out.print("Option:");
    }
    public void  addItem()
    {
        keyb = new Scanner(System.in);
        String name, id;
        int quantity;
        double price;
        System.out.println("----------------------------Add an Student------------------------------");
        System.out.print("Enter Item nr:");
        id = keyb.next();
        System.out.print("Enter Item name:");
        name = keyb.next();
        System.out.print("Enter Item Quantity:");
        quantity = keyb.nextInt();
        System.out.print("Please Enter Price");
        price = keyb.nextDouble();

        shop = new Clothes(id, name, quantity, price);
        list.add(shop);
    }
    public void removeItem()
    {
        System.out.println("Enter Employee Nr you want to remove:");
        keyb = new Scanner(System.in);
        String id = keyb.next();
        int interator = 0;
        int index = 0;
        for(Clothes item : list)
        {
            if(item.getItemID().equals(id))
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
    public void viewAllItems()
    {
        int index = 0;
        for(Clothes item : list)
        {
            System.out.println(list.get(index).toString());
            index++;
        }
    }
    public void buy()
    {
        String buy;
        int q = 0;
        int quantity;
        double price;
        System.out.print("Enter Item name:");
        buy = keyb.next();
        System.out.print("Enter Quantity to buy:");
        quantity = keyb.nextInt();
        int interator = 0;
        int index = 0;
        for(Clothes item : list)
        {
            if(item.getItemID().equals(buy))
            {
                index = interator;
            }
            else
            {
                interator++;
            }
        }
        q = list.get(index).getQuantity();
        list.get(index).setQuantity(q - quantity);
        System.out.println("The price is :R" + list.get(index).getPrice() * quantity);
    }
}
