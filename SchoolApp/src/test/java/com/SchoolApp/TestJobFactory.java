package com.SchoolApp;

import com.SchoolApp.factories.JobFactory;
import org.testng.annotations.Test;

/**
 * Created by Armin on 2016-04-06.
 */
public class TestJobFactory
{
        @Test
        public void testJobFactory()
        {
            String job = JobFactory.getJob("TEA123123");
            System.out.println("Your job is :" + job);
        }

}
