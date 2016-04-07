package com.SchoolApp.domain;

import java.io.Serializable;

/**
 * Created by Armin on 2016-04-06.
 */
public class EmployeeData implements Serializable {
    private String empNr;
    private String name;
    private String lastName;
    private String dob;
    private String gender;
    private String cell;
    private String sarsNr;
    private double salary;
    private String workingHours;

    public EmployeeData(){}

    public  EmployeeData(Builder builder)
    {
        this.empNr = builder.empNr;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.dob = builder.dob;
        this.gender = builder.gender;
        this.cell = builder.cell;
        this.sarsNr = builder.sarsNr;
        this.salary = builder.salary;
        this.workingHours = builder.workingHours;

    }

    public static class Builder
    {
        private String empNr;
        private String name;
        private String lastName;
        private String dob;
        private String gender;
        private String cell;
        private String sarsNr;
        private double salary;
        private String workingHours;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }
        public Builder dob(String dob)
        {
            this.dob = dob;
            return this;
        }
        public Builder gender(String gender)
        {
            this.gender = gender;
            return this;
        }

        public Builder cell(String cell)
        {
            this.cell = cell;
            return this;
        }

        public Builder sarsNr(String sarsNr)
        {
            this.sarsNr = sarsNr;
            return this;
        }

        public Builder salary(double salary)
        {
            this.salary = salary;
            return this;
        }

        public Builder empNr(String empNr)
        {
            this.empNr = empNr;
            return this;
        }

        public Builder workingHours(String workingHours)
        {
            this.workingHours = workingHours;
            return this;
        }

        public Builder copy(EmployeeData value){
            this.empNr = value.empNr;
            this.name = value.name;
            this.lastName = value.lastName;
            this.dob = value.dob;
            this.gender = value.gender;
            this.cell = value.cell;
            this.sarsNr = value.sarsNr;
            this.salary = value.salary;
            this.workingHours = value.workingHours;
            return this;
        }

        public EmployeeData build()
        {
            return new EmployeeData(this);
        }

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }


    public String getDob() {
        return dob;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public String getGender() {
        return gender;
    }

    public String getCell() {
        return cell;
    }

    public String getSarsNr() {
        return sarsNr;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmpNr() {
        return empNr;
    }

    @Override
    public String toString() {
        return "EmployeeData{" +
                "empNr='" + empNr + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", cell='" + cell + '\'' +
                ", sarsNr='" + sarsNr + '\'' +
                ", salary=" + salary +
                ", workingHours='" + workingHours + '\'' +
                '}';
    }
}
