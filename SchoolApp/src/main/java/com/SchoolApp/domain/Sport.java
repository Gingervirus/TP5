package com.SchoolApp.domain;

/**
 * Created by Armin on 2016-04-04.
 */
public class Sport {
    private String type;
    private String coach;
    private String age;
    private String practise;

    public Sport(String type, String coach, String age, String practise) {
        this.type = type;
        this.coach = coach;
        this.age = age;
        this.practise = practise;
    }

    public Sport() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPractise() {
        return practise;
    }

    public void setPractise(String practise) {
        this.practise = practise;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "type='" + type + '\'' +
                ", coach='" + coach + '\'' +
                ", age='" + age + '\'' +
                ", practise='" + practise + '\'' +
                '}';
    }
}
