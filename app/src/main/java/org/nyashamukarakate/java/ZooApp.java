package org.nyashamukarakate.java;

public class ZooApp {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Buddy");
        animals[1] = new Cat("Whiskers");

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: ");
            animal.makeSound();
        }
    }
}
