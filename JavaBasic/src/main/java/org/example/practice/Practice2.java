package org.example.practice;

import java.util.Scanner;

//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate circumference and area
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Print the results
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        scanner.close();
    }
}
