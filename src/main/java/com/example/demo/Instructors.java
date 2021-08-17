package com.example.demo;

import java.util.Iterator;
import java.util.List;

public class Instructors extends People<Instructor>{
    public Instructors(List<Instructor> personList) {
        super(personList);
    }

    public Instructors(Instructor stewart, Instructor colin, Instructor tom) {
    }


    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }
}
