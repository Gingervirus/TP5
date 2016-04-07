package com.SchoolApp.domain;

/**
 * Created by Armin on 2016-04-06.
 */
public abstract class WorkingHours {
    WorkingHours nextWorkingHours;

    public void setNextWorkingHours( WorkingHours nextWorkingHours) {
        this.nextWorkingHours = nextWorkingHours;
    }
    public abstract String handleRequest(String request);
}
