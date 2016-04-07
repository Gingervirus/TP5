package com.SchoolApp.domain;

/**
 * Created by Armin on 2016-04-06.
 */
public class SalaryPrincipal extends Salary {
    @Override
    public String handleRequest(String request) {
        if (request.equals("PRI")) {
            return "30000.00";
        } else {
            if (nextSalary != null) {
                return nextSalary.handleRequest(request);
            }
            return "Salary does not exist";
        }
    }
}