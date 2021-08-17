package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration
public class StudentConfigTest {

    @Autowired
    @Qualifier("students")
    Students currentStudents;

    @Autowired
    @Qualifier("previous_students")
    Students previousStudents;


    @Test
    public void testCurrentStudents() {
        //given
        String expected = "Jen";
        //when
        String actual = currentStudents.findById(1L).getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStudents() {
        //given
        String expected = "Earl";
        //when
        String actual = previousStudents.findById(2L).getName();
        //then
        Assert.assertEquals(expected, actual);
    }
}
