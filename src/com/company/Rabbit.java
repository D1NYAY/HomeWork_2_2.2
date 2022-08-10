package com.company;

public class Rabbit extends Animal{
    public Rabbit(String name, int age, String damage) {
        super(name, age);
        this.damage = damage;
    }

    private String damage;




    @Override
    public void print() {
        System.out.println(getInfo()  + damage);

    }
}
