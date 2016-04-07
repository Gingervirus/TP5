package com.SchoolApp.domain;

/**
 * Created by Armin on 2016-04-07.
 */
public abstract class Detention {
    Detention nextDetention;

    public void setNextJob( Detention nextDetention) {
        this.nextDetention = nextDetention;
    }
    public abstract boolean handleRequest(String request);
}
