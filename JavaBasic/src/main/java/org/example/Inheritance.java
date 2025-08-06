package org.example;

class Animal1 {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal1 {
    void sound() {
        System.out.println("Bark");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.sound();  // Output: Animal sound

        Dog d = new Dog();
        d.sound();  // Output: Bark

        Animal1 ad = new Dog();
        ad.sound(); // Output: Bark (due to method overriding at runtime)
    }
}




