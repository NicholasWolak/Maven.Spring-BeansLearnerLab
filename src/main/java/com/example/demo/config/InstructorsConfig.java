package com.example.demo.config;


import com.example.demo.Classroom;
import com.example.demo.Instructor;
import com.example.demo.Instructors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Autowired
    private Classroom classroom;

    public InstructorsConfig() {
    }

    public InstructorsConfig(Classroom classroom) {
        this.classroom = classroom;
    }

    @Bean
    public Instructors tcUsaInstructors() {
        return classroom.getInstructors();
    }

    @Bean
    public Instructors tcUkInstructors() {
        return classroom.getInstructors();
    }

    @Bean
    @Primary
    public Instructors instructors() {
        return classroom.getInstructors();
    }
}
