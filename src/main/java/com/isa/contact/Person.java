package com.isa.contact;

public class Person {
    private String name;
    private Profession role;

    public Person(String name, Profession role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profession getRole() {
        return role;
    }

    public void setRole(Profession role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
