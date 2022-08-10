package com.company;

public class Cat extends Animal{
    public Cat(String name, int age, String damage) {
        super(name, age);
        this.damage = damage;
    }

    public String damage;



    @Override
    public void print() {
        System.out.println(getInfo() + damage);

    }
}
