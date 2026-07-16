package org.nyashamukarakate.java.oop.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks");
    }
}
