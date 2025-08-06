package org.example;

interface Animal2 {
    void eat();  // Interface method (implicitly public and abstract)
}
class Cow implements Animal2 {
    public void eat() {
        System.out.println("Eating grass");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.eat();  // Output: Eating grass

        Animal2 a = new Cow();
        a.eat();  // Output: Eating grass (polymorphism)
    }
}

