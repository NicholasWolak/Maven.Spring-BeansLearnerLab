package com.example.demo.config;

import com.example.demo.Classroom;
import com.example.demo.Instructors;
import com.example.demo.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {


    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students) {
        return new Classroom(instructors, students);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previous_students"})
    public Classroom previousCohort(Instructors instructors, @Qualifier("previous_students") Students students) {
        return new Classroom(instructors, students);
    }
}