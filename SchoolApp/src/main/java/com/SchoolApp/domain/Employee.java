package com.SchoolApp.domain;

/**
 * Created by Armin Wentzel on 2016-03-23.
 */
public class Employee extends Person{

    private String sarsNr;
    private double salary;
    private String empNr;

    public Employee(String name, String middlename, String lastName, String dob, String gender, String address, String cell) {
       super(name, middlename, lastName, dob, gender, address, cell);

    }


    public String getSarsNr() {
        return sarsNr;
    }

    public void setSarsNr(String sarsNr) {
        this.sarsNr = sarsNr;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmpNr() {
        return empNr;
    }

    public void setEmpNr(String empNr) {
        this.empNr = empNr;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                ", Middlename: " + getMiddlename()+
                ", Surname: " + getLastName() +
                ", Date of Birth: " + getDob() +
                ", Gender: " + getGender() +
                ", Address: " + getAddress() +
                ", Cellphone Nr: " + getCell() +
                ", SarsNr: " + sarsNr +
                ", Salary: " + salary +
                ", Employee Nr: " + empNr;
    }
}
