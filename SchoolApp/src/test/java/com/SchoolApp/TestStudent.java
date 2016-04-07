package com.SchoolApp;

import com.SchoolApp.domain.StudentData;
import com.SchoolApp.factories.DetentionFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Armin on 2016-04-07.
 */
public class TestStudent {
    @Test
    public void testStudent() throws Exception {

        StudentData person = new StudentData.Builder()
                .studNr("214296725")
                .name("Armin")
                .lastName("Wentzel")
                .gender("Male")
                .dob("21/06/1995")
                .marks("75#77#82#89#67#69#90")
                .detention(DetentionFactory.getDetention("YES"))
                .grade("3A")
                .cell("0764805005")
                .build();

        Assert.assertEquals(person.getDob(),"21/06/1995");
        Assert.assertEquals(person.getName(),"Armin");
        Assert.assertEquals(person.getGrade(),"3A");
        Assert.assertEquals(person.getLastName(),"Wentzel");
        Assert.assertEquals(person.getGender(),"Male");
        Assert.assertEquals(person.getStudNr(),"214296725");
        Assert.assertEquals(person.getMarks(),"75#77#82#89#67#69#90");
        Assert.assertEquals(person.getCell(),"0764805005");

        StudentData newPerson = new StudentData.Builder()
                .copy(person)
                .name("Twaha")
                .build();

        Assert.assertEquals(newPerson.getName(),"Twaha");
    }
}
