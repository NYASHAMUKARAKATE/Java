package org.nyashamukarakate.java.oop.animals;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows");
    }
}
