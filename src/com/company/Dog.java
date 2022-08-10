package com.company;
public class Dog extends Animal  {
    public Dog(String name, int age, String emoji) {
        super(name, age);
        this.damage = emoji;
    }

    public String getEmoji() {
        return damage;
    }

    private String damage;

    @Override
    public void print() {
        System.out.println(getInfo() + damage);

    }


    }



