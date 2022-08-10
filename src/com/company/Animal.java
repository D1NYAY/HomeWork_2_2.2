package com.company;

public abstract class Animal implements Printable{
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }




    public int getAge() {
        return age;
    }




    public String getInfo() {
        return getAge() + getName();


    }}

