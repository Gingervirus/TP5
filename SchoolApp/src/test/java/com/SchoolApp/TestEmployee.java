package com.SchoolApp;

import com.SchoolApp.domain.EmployeeData;
import com.SchoolApp.factories.SalaryFactory;
import com.SchoolApp.factories.WorkingHoursFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * Created by Armin on 2016-04-06.
 */
public class TestEmployee {
    @Test
    public void testPerson() throws Exception {

        EmployeeData person = new EmployeeData.Builder()
                .empNr("TEA11111")
                .name("Armin")
                .lastName("Wentzel")
                .gender("Male")
                .salary(Double.parseDouble(SalaryFactory.getSalary("TEA11111")))
                .workingHours(WorkingHoursFactory.getWorkingHours("Teacher"))
                .sarsNr("2314565346")
                .cell("0764805005")
                .dob("21/06/1995")
                .build();

        Assert.assertEquals(person.getDob(),"21/06/1995");
        Assert.assertEquals(person.getName(),"Armin");
        Assert.assertEquals(person.getEmpNr(),"TEA11111");
        Assert.assertEquals(person.getLastName(),"Wentzel");
        Assert.assertEquals(person.getGender(),"Male");
        Assert.assertEquals(person.getSalary(),15000.00);
        Assert.assertEquals(person.getWorkingHours(),"08H00-13H00");
        Assert.assertEquals(person.getSarsNr(),"2314565346");
        Assert.assertEquals(person.getCell(),"0764805005");

        EmployeeData newPerson = new EmployeeData.Builder()
                .copy(person)
                .name("Lelize")
                .build();

        Assert.assertEquals(newPerson.getName(),"Lelize");
    }
}
