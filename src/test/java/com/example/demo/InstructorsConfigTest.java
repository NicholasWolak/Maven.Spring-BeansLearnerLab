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
public class InstructorsConfigTest {

    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;

    @Test
    public void tcUsaInstructors() {
        //given
        String expected = "Stewart";
        //when
        String actual = tcUsaInstructors.findById(1L).getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tcUkInstructors() {
        //given
        String expected = "Hermione";
        //when
        String actual = tcUkInstructors.findById(3L).getName();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void zipCodeInstructors() {
        //given
        String expected = "Leon";
        //when
        String actual = instructors.findById(1L).getName();
        //then
        Assert.assertEquals(expected, actual);
    }
}
