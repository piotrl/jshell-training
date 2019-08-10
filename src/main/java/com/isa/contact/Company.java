package com.isa.contact;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Person> people = new ArrayList<>();

    public void init() {
        people.add(new Person("Adam", Profession.OWNER));
        people.add(new Person("Dorota", Profession.PROGRAMMER));
        people.add(new Person("Adrian", Profession.TESTER));
        people.add(new Person("Magda", Profession.BUSSINESS));
        people.add(new Person("Magda", Profession.PROGRAMMER));

        System.out.println("Added 3 people");
    }

    public List<Person> getPeople() {
        return people;
    }
}
