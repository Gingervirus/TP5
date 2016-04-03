package com.SchoolApp.domain;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Armin on 2016-04-03.
 */
public class StudentFileHandler {
    private String name, middlename, lastName, dob, gender, address, cell, studenNr;
    private String line;
    private FileWriter fw;
    private BufferedWriter bw;
    private BufferedReader br;
    private File file;

    public void setValues(Student e)
    {
        this.name = e.getName();
        this.middlename = e.getMiddlename();
        this.lastName = e.getLastName();
        this.dob = e.getDob();
        this.gender = e.getGender();
        this.address = e.getAddress();
        this.cell = e.getCell();
        this.studenNr = e.getStudentNr();
    }

    public void write() throws IOException {
        file = new File("Student.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        fw = new FileWriter(file,true);
        bw = new BufferedWriter(fw);
        bw.write(name + "#" + middlename+  "#" +lastName+  "#" + dob+  "#" + gender+  "#" +address+  "#" +cell);
        bw.newLine();
        bw.close();
    }

    public void overWriteFile() throws IOException {
        file = new File("Students.txt");
        if(file.exists())
        {
            file.delete();
        }else
        {
            file.createNewFile();
        }
        fw = new FileWriter(file,true);
        bw = new BufferedWriter(fw);
        bw.write(name + "#" + middlename+  "#" +lastName+  "#" + dob+  "#" + gender+  "#" +address+  "#" +cell);
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
