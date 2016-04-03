package com.SchoolApp.domain;

/**
 * Created by Armin Wentzel on 2016-03-23.
 */
public class Person
{
    private String name;
    private String middlename;
    private String lastName;
    private String dob;
    private String gender;
    private String address;
    private String cell;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }


    public Person(String name, String middlename, String lastName, String dob, String gender, String address, String cell) {
        this.name = name;
        this.middlename = middlename;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", middlename='" + middlename + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", cell='" + cell + '\'' +
                '}';
    }
}
