package com.SchoolApp.factories;

import com.SchoolApp.domain.*;

/**
 * Created by Armin on 2016-04-06.
 */
public class SalaryFactory {
    public static String getSalary(String employeeID)
    {
        String jobID = employeeID.substring(0,3);
        System.out.println(jobID);
        Salary chain = setUpChain();
        return chain.handleRequest(jobID);
    }

    public static Salary setUpChain()
    {
        Salary c = new SalaryCleaner();
        Salary s= new SalarySecretary();
        Salary t = new SalaryTeacher();
        Salary p = new SalaryPrincipal();
        c.setNextSalary(s);
        s.setNextSalary(t);
        t.setNextSalary(p);
        return c;
    }
}
