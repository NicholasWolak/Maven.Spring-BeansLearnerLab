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

    @Configuration
    public class StudentConfig {


        @Bean(name = "students")
        public Students currentStudents() {
            return new Students(
                    new Student(1L, "Jen"),
                    new Student(2L, "Jeremy"),
                    new Student(3L, "Char")
            );
        }

        @Bean(name = "previous_students")
        public Students previousStudents() {
            return new Students(
                    new Student(1L, "Chris"),
                    new Student(2L, "Earl"),
                    new Student(3L, "Jack")
            );
        }
    }
}
