package com.SchoolApp.domain;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Armin on 2016-03-31.
 */
public class School
{
    private String schoolName, slogan, principal, conctactNr, email, fax, address;
    private String line;
    private FileWriter fw;
    private BufferedWriter bw;
    private BufferedReader br;
    private File file;

    public School() {
    }

    public void write(String schoolName,String slogan, String principal, String conctactNr, String email, String fax, String address) throws IOException {
        file = new File("StartupInformation.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        fw = new FileWriter(file.getAbsoluteFile());
        bw = new BufferedWriter(fw);
        bw.write(schoolName + "#" + slogan + "#" + principal+ "#" + conctactNr + "#" + email + "#" + fax + "#" + address );
        bw.close();
    }

    public void read()
    {
        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader("StartupInformation.txt"));

           line = br.readLine();
            Scanner del = new Scanner(line).useDelimiter("#");
            schoolName = del.next();
            slogan  = del.next();
            principal  = del.next();
            conctactNr  = del.next();
            email  = del.next();
            fax  = del.next();
            address  = del.next();

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

    public String getSchoolName() {
        return schoolName;
    }

    public String getSlogan() {
        return slogan;
    }

    public String getPrincipal() {
        return principal;
    }

    public String getConctactNr() {
        return conctactNr;
    }

    public String getEmail() {
        return email;
    }

    public String getFax() {
        return fax;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return  "School Name: " + schoolName + "\n" +
                "Slogan: " + slogan + "\n" +
                "Principal: " + principal + "\n" +
                "ConctactNr: " + conctactNr + "\n" +
                "E-mail: " + email + "\n" +
                "Fax: " + fax + "\n" +
                "Address: " + address;
    }
}
