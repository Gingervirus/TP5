package com.SchoolApp;

import com.SchoolApp.domain.StudentData;
import com.SchoolApp.factories.DetentionFactory;
import com.SchoolApp.factories.MarkGradingFactory;
import com.SchoolApp.services.StudentServices;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Armin on 2016-04-07.
 */
public class TestGradingFactory {
    @Test
    public void testGrading()
    {
        StudentData person = new StudentData.Builder()
                .marks("75#77#82#89#67#69#90")
                .build();

        String marks[] = person.getMarks().split("#");
        String mark;
        for (int i = 0;i < 7; i++)
        {
            mark = MarkGradingFactory.getGrade(Integer.parseInt(marks[i]));
            System.out.println("Mark" + (i+1) + ": " + marks[i] + "You got an " + mark);
        }

    }

}
