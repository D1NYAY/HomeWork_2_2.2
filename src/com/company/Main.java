package com.company;


public class Main {

    public static void main(String[] args) {
        com.company.Printable[] printables = {(com.company.Printable) createObject("oneObject"), (com.company.Printable) createObject("twoObject"), (com.company.Printable) createObject("treeObject"), createObject("fourObject")};
        for (com.company.Printable printable:printables) {
            printable.print();

        }

        }



    private static Printable createObject(String className) {
    switch (className){
        case "oneObject " :
            Dog dog = new Dog("Alex ", 7, "кусать");
            return dog;
        case "twoObject " :
            Rabbit rabbit = new Rabbit("Steve ", 5, "прыгать");
            return rabbit;
        case "treeObject " :
            Cat cat = new Cat("Рыжик ", 8, "царапать");
            return cat;
        case "fourObject " :
            
    }
        return null;
    }}
