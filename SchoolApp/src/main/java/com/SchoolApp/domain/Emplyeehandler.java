package com.SchoolApp.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Armin Wentzel on 2016-03-24.
 */
public class Emplyeehandler
{
    private String sarsNr;
    private double salary;
    private String empNr;
    private Employee emp;
    private Scanner keyb;
    private ArrayList<Employee>  list = new ArrayList<Employee>();

    public  void employeeMenu()
    {
        int option = 0;
        menu();
        generateList();


        Scanner keyb = new Scanner(System.in);
        option = keyb.nextInt();
        while(option != 0)
        {
            switch (option)
            {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    viewEmployees();
                    break;
                case 4:
                    salaryIncrease();
                    break;
                case 5:
                    break;
            }
            menu();
            option = keyb.nextInt();
        }

    }

    public void generateList()
    {
        boolean notNull = false;
        Scanner del = null;
        String name, middlename, lastName, dob, gender, address, cell, sars, empnr;
        double sal;
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Employees.txt"));
            System.out.println("Generate");

                while (notNull != true) {
                    line = reader.readLine();
                    if (line != null) {
                        System.out.println(line);
                        del = new Scanner(line).useDelimiter("#");
                        name = del.next();
                        middlename = del.next();
                        lastName = del.next();
                        dob = del.next();
                        gender = del.next();
                        address = del.next();
                        cell = del.next();
                        sars = del.next();
                        empnr = del.next();
                        sal = del.nextDouble();
                        System.out.println(sal);
                        emp = new Employee(name, middlename, lastName, dob, gender, address, cell);
                        emp.setEmpNr(empnr);
                        emp.setSalary(sal);
                        emp.setSarsNr(sars);
                        list.add(emp);
                    }
                    if (line == null) {
                        notNull = true;
                    }
                }
                reader.close();

            // Close the BufferedReader.

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Loop over lines in the file and print them.

    }

    public void addEmployee()
    {
        keyb = new Scanner(System.in);
        String name, middlename, lastName, dob, gender, address, cell;
        System.out.println("----------------------------Add an Employee------------------------------");
        System.out.print("Enter employee Nr:");
        empNr = keyb.next();
        System.out.print("Please Enter Emloyee name:");
        name = keyb.next();
        System.out.print("Please Enter Emloyee middle name:");
        middlename = keyb.next();
        System.out.print("Please Enter Emloyee surname:");
        lastName = keyb.next();
        System.out.print("Please Enter Emloyee Date of birth:");
        dob = keyb.next();
        System.out.print("Please Enter Emloyee gender");
        gender = keyb.next();
        System.out.print("Please Enter Emloyee address:");
        keyb.nextLine();
        address = keyb.nextLine();
        System.out.print("Please Enter Emloyee Selfphone Nr:");
        cell = keyb.next();
        emp = new Employee(name, middlename, lastName, dob, gender, address, cell);
        System.out.print("Enter employee Sars nr:");
        sarsNr = keyb.next();
        System.out.print("Enter employee Salary:");
        salary = keyb.nextDouble();
        emp.setEmpNr(empNr);
        emp.setSalary(salary);
        emp.setSarsNr(sarsNr);
        list.add(emp);
        EmployeeFileHandler filehandler = new EmployeeFileHandler();
        filehandler.setValues(emp);
        try {
            filehandler.write();
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void menu()
    {
        System.out.println("-------------------------Employee Information----------------------------");
        System.out.println("1. add an employee");
        System.out.println("2. Remove an employee");
        System.out.println("3. View all employees");
        System.out.println("4. Salary Increase");
        System.out.print("Option:");
    }

    public void removeEmployee()
    {

        System.out.println("Enter Employee Nr you want to remove:");
        keyb = new Scanner(System.in);
        empNr = keyb.next();
        int interator = 0;
        int index = 0;
        for(Employee item : list)
        {
            if(item.getEmpNr().equals(empNr))
            {
                index = interator;
            }
            else
            {
                interator++;
            }
        }
        if (list.size() > 0) {
        list.remove(index);
            EmployeeFileHandler e = new EmployeeFileHandler();
            for (int b = 0; b < list.size(); b++) {
                e.setValues(list.get(b));
                try {
                    e.overWriteFile();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }


    public void salaryIncrease()
    {
        double total = 0;
        double increase = 0;
        System.out.println("Enter annualy salary increase for all Employees:");
        keyb = new Scanner(System.in);
        increase = keyb.nextDouble();
        increase = (increase / 100) + 1;
        for(Employee e : list)
        {
            total = e.getSalary() * increase;
            e.setSalary(total);
        }

        if (list.size() > 0) {
            EmployeeFileHandler salI = new EmployeeFileHandler();
            for (int b = 0; b < list.size(); b++) {
                salI.setValues(list.get(b));
                try {
                    salI.overWriteFile();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public void viewEmployees()
    {
        System.out.println("----------------------------View Employees-------------------------------");
        for (int i = 0; i < list.size();i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
}
