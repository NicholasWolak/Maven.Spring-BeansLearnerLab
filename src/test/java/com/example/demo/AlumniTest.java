package com.example.demo;

import com.example.demo.config.Alumni;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration
public class AlumniTest {

    @Autowired
    Alumni alumni;

    @Test
    public void testExecuteBootcampStudent1() {
        //given
        double expected = 1200;
        //when
        Student student1 = alumni.getStudents().findById(1L);
        double actual = student1.getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testExecuteBootcampStudent2() {
        //given
        double expected = 1200;
        //when
        Student student2 = alumni.getStudents().findById(2L);
        double actual = student2.getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testExecuteBootcampStudent3() {
        //given
        double expected = 1200;
        //when
        Student student3 = alumni.getStudents().findById(3L);
        double actual = student3.getTotalStudyTime();
        //then
        Assert.assertEquals(expected, actual, 0.01);
    }
}