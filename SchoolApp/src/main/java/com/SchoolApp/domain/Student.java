package com.SchoolApp.domain;

/**
 * Created by Armin Wentzel on 2016-03-23.
 */
public class Student extends Person
{
    private String studentNr;
    private String subjects[] = new String[7];
    private String marks[] = new String[7];

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
}
