package com.company;

/**
 * @author Amela Karasalihovic
 */
public class Dog {

    public String name;
    public String breed;
    public int age;
    public String color;

    public Dog() {
    }

    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String bark() {
        return "Bark, bark";
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void eat() {
        System.out.println("Dog is eating");
    }
}
