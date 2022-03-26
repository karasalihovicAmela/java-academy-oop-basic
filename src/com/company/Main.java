package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog1 = new Dog("Rex", "Pekinezer",
                3, "crna");
        System.out.println("Dogs name: " + dog1.name + "\nDogs breed: "
                + dog1.breed + "\nDogs age: " + dog1.age
                + "\nDogs color: " + dog1.color);
        System.out.println(dog1.bark());
        dog1.eat();
        dog1.sleep();

        Dog dog2 = new Dog();
        dog2.name = "Bobi";
        dog2.breed = "Pekinezer";
        dog2.age = 10;
        dog2.color = "Bijeli";
        System.out.println("Dogs name: " + dog2.name + "\nDogs breed: "
                + dog2.breed + "\nDogs age: " + dog2.age
                + "\nDogs color: " + dog2.color);
        dog2.sleep();
    }
}
