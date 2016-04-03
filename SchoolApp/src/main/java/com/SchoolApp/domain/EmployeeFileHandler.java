package com.SchoolApp.domain;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Armin on 2016-03-31.
 */
public class EmployeeFileHandler implements FileHandler
{
    private String name, middlename, lastName, dob, gender, address, cell, sarsNr, empNr;
    private double salary;
    private String line;
    private FileWriter fw;
    private BufferedWriter bw;
    private BufferedReader br;
    private File file;

    public EmployeeFileHandler() {
    }

    public void setValues(Employee e)
    {
        this.name = e.getName();
        this.middlename = e.getMiddlename();
        this.lastName = e.getLastName();
        this.dob = e.getDob();
        this.gender = e.getGender();
        this.address = e.getAddress();
        this.cell = e.getCell();
        this.sarsNr = e.getSarsNr();
        this.empNr = e.getEmpNr();
        this.salary = e.getSalary();
    }

    public String getName() {
        return name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getCell() {
        return cell;
    }

    public String getSarsNr() {
        return sarsNr;
    }

    public String getEmpNr() {
        return empNr;
    }

    public double getSalary() {
        return salary;
    }

    public void write() throws IOException {
        file = new File("Employees.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        fw = new FileWriter(file,true);
        bw = new BufferedWriter(fw);
        bw.write(name + "#" + middlename+  "#" +lastName+  "#" + dob+  "#" + gender+  "#" +address+  "#" +cell+  "#" +sarsNr+  "#" + empNr + "#" + sarsNr + "#" + empNr + "#" + salary);
        bw.newLine();
        bw.close();
    }

    public void overWriteFile() throws IOException {
        file = new File("Employees.txt");
        if(file.exists())
        {
            file.delete();
        }else
        {
            file.createNewFile();
        }
        fw = new FileWriter(file,true);
        bw = new BufferedWriter(fw);
        bw.write(name + "#" + middlename+  "#" +lastName+  "#" + dob+  "#" + gender+  "#" +address+  "#" +cell+  "#" +sarsNr+  "#" + empNr + "#" + sarsNr + "#" + empNr + "#" + salary);
        bw.newLine();
        bw.close();
    }

    public boolean exists()
    {
        boolean ex = false;
        file = new File("Employees.txt");
        if (!file.exists()) {
            ex = true;
        }

        return ex;
    }
    public void read()
    {
        try {

            br = new BufferedReader(new FileReader("Employees.txt"));
            line = br.readLine();
            Scanner del = new Scanner(line).useDelimiter("#");
            name = del.nextLine();
            middlename = del.nextLine();
            lastName = del.nextLine();
            dob = del.nextLine();
            gender = del.nextLine();
            address = del.nextLine();
            cell = del.nextLine();
            sarsNr = del.nextLine();
            empNr = del.nextLine();
            salary = del.nextDouble();
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
