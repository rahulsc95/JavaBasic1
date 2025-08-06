package org.example;

class Car {
    String color = "Red"; // field or property

    void drive() {
        System.out.println("Car is driving");
    }
}

public class OppClassAndObject {
    public static void main(String[] args) {
        Car myCar = new Car(); // object creation
        myCar.drive(); // calling method
        System.out.println("Color: " + myCar.color);
    }
}
