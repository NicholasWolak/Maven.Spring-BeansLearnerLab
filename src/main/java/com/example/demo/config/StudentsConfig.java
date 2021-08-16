package com.example.demo.config;


import com.example.demo.Classroom;
import com.example.demo.Student;
import com.example.demo.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentsConfig {

    //need to implement previousStudents()

    @Autowired
    private Classroom classroom;

    public StudentsConfig() {
    }

    public StudentsConfig(Classroom classroom) {
        this.classroom = classroom;
    }

    @Bean(name = "students")
    public Students currentStudents() {
        return classroom.getStudents();
    }

    @Bean
    public Students previousStudents() {
        return null;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
