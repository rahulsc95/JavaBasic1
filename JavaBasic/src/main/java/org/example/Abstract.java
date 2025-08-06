package org.example;

public class Abstract {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();  // Output: Meow

        Animal a = new Cat();
        a.makeSound();  // Output: Meow (polymorphism)
    }
}

// Abstract class must be outside main method
abstract class Animal {
    abstract void makeSound();
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}


