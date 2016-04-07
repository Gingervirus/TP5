package com.SchoolApp.domain;

import java.io.Serializable;

/**
 * Created by Armin on 2016-04-07.
 */
public class StudentData implements Serializable {
        private String studNr;
        private String name;
        private String lastName;
        private String dob;
         private String grade;
        private String gender;
        private String cell;
        private String marks;
        private boolean detention;

        public StudentData(){}

        public  StudentData(Builder builder)
        {
            this.studNr = builder.studNr;
            this.name = builder.name;
            this.lastName = builder.lastName;
            this.dob = builder.dob;
            this.grade = builder.grade;
            this.gender = builder.gender;
            this.cell = builder.cell;
            this.marks = builder.marks;
            this.detention = builder.detention;

        }

        public static class Builder
        {
            private String studNr;
            private String name;
            private String lastName;
            private String dob;
            private String grade;
            private String gender;
            private String cell;
            private String marks;
            private boolean detention;

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

            public Builder grade(String grade)
            {
                this.grade = grade;
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

            public Builder marks(String marks)
            {
                this.marks = marks;
                return this;
            }

            public Builder studNr(String studNr)
            {
                this.studNr = studNr;
                return this;
            }

            public Builder detention(Boolean Detention)
            {
                this.detention = detention;
                return this;
            }

            public Builder copy(StudentData value){
                this.studNr = value.studNr;
                this.name = value.name;
                this.lastName = value.lastName;
                this.dob = value.dob;
                this.grade = value.grade;
                this.gender = value.gender;
                this.cell = value.cell;
                this.marks = value.marks;
                this.detention = value.detention;
                return this;
            }

            public StudentData build()
            {
                return new StudentData(this);
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

        public boolean getdetention() {
            return detention;
        }

    public String getGrade() {
        return grade;
    }

    public String getMarks() {
        return marks;
    }

    public boolean isDetention() {
        return detention;
    }

    public String getGender() {
            return gender;
        }

        public String getCell() {
            return cell;
        }


        public String getStudNr() {
            return studNr;
        }

        @Override
        public String toString() {
            return "EmployeeData{" +
                    "studNr='" + studNr + '\'' +
                    ", name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", dob='" + dob + '\'' +
                    ", gender='" + gender + '\'' +
                    ", cell='" + cell + '\'' +
                    ", marks='" + marks + '\'' +
                    ", detention='" + detention + '\'' +
                    '}';
        }
}

