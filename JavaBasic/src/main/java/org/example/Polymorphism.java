package org.example;

public class Polymorphism {
    public static void main(String[] args) {

        class Shape {
            void draw() {
                System.out.println("Drawing...");
            }
        }
        class Circle extends Shape {
            void draw() {
                System.out.println("Drawing Circle");
            }
        }

        Shape s = new Shape();
        s.draw();  // Output: Drawing...

        Circle c = new Circle();
        c.draw();  // Output: Drawing Circle

        Shape sc = new Circle();
        sc.draw(); // Output: Drawing Circle (dynamic dispatch)
    }
}

