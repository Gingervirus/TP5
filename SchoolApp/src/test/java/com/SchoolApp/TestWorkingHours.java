package com.SchoolApp;

import com.SchoolApp.domain.WorkingHours;
import com.SchoolApp.factories.WorkingHoursFactory;
import org.testng.annotations.Test;

/**
 * Created by Armin on 2016-04-06.
 */
public class TestWorkingHours {
    @Test
    public void testSalaryFactory() throws Exception {

        String working = WorkingHoursFactory.getWorkingHours("Teacher");
        System.out.println("The Result is "+ working);

    }
}
