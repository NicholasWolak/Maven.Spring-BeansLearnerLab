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
class ClassroomConfigTest {

    @Autowired
    @Qualifier("currentCohort")
    Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    Classroom previousCohort;

    @Test
    public void currentCohort() {
        //given
        String studentExpected = "Char";
        String instructorExpected = "Leon";
        //when
        String actualStudent = currentCohort.getStudents().findById(3L).getName();
        String actualInstructor = currentCohort.getInstructors().findById(1L).getName();
        //then
        Assert.assertEquals(studentExpected, actualStudent);
        Assert.assertEquals(instructorExpected, actualInstructor);
    }

    @Test
    public void previousCohort() {
        //given
        String studentExpected = "Chris";
        String instructorExpected = "Dolio";
        //when
        String studentActual = previousCohort.getStudents().findById(1L).getName();
        String instructorActual = previousCohort.getInstructors().findById(2L).getName();
        //then
        Assert.assertEquals(studentExpected, studentActual);
        Assert.assertEquals(instructorExpected, instructorActual);
    }
}