package com.SchoolApp.domain;

import java.util.Arrays;

/**
 * Created by Armin Wentzel on 2016-03-23.
 */
public class Student extends Person
{
    private String studentNr;
    private String subjects[] = {"Afrkaans", "English", "Maths", "IT", "IGO", "Science", "LO"};
    private String marks[] = {"60", "70", "74", "66", "88", "90", "95"};

    public Student(String name, String middlename, String lastName, String dob, String gender, String address, String cell)
    {
        super(name, middlename, lastName, dob, gender, address, cell);
    }

    public String getStudentNr() {
        return studentNr;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public String[] getMarks() {
        return marks;
    }

    public void setStudentNr(String studentNr) {
        this.studentNr = studentNr;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public void setMarks(String[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                ", Middlename: " + getMiddlename()+
                ", Surname: " + getLastName() +
                ", Date of Birth: " + getDob() +
                ", Gender: " + getGender() +
                ", Address: " + getAddress() +
                ", Cellphone Nr: " + getCell()+
                ", StudentNr: " + studentNr +
                ", subjects: " + Arrays.toString(subjects) +
                ", marks: " + Arrays.toString(marks) +
                '}';
    }
}
