package com.example.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People<E extends Person>implements Iterable<E>{

    List<E> personList;

    public People (List<E> personList) {
        this.personList = new ArrayList<>();
    }

    public People() {

    }

    public void add (E person) {
        personList.add(person);
    }

    public E findById (long id) {
        for (E person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public List<E> findAll() {
        return personList;
    }

    public Boolean containsPerson (E person) {
        return personList.contains(person);
    }

    public void removePerson (E person) {
        personList.remove(person);
    }

    public void removePerson (long id) {
        personList.remove(findById(id));
    }

    public void removeAll () {
        personList.removeAll(personList);
    }

    public Integer count () {
        return personList.size();
    }

    public Array[] toArray () {
        return (Array[]) personList.toArray();
    }

    public Iterator<E> iterator() {
        return (Iterator<E>) personList.iterator();
    }

}
