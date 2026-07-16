package org.nyashamukarakate.java.oop.animals;

public class ZooApp {
    public static void run() {
        System.out.println("\n--- Zoo Demo (Polymorphism) ---");
        Animal[] animals = { new Dog("Buddy"), new Cat("Whiskers") };
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
