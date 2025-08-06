package org.example;

interface Greet {
    void sayHello();
}

public class LambdaInterface {
    public static void main(String[] args) {
        Greet g = () -> System.out.println("Hello!");
        g.sayHello();
    }
}

