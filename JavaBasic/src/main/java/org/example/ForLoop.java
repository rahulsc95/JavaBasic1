package org.example;

public class ForLoop {
    public static void main(String[] args) {
        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For loop i = " + i);
        }

        // While loop
        int j = 1;
        while (j <= 3) {
            System.out.println("While loop j = " + j);
            j++;
        }

        // Do-while loop
        int k = 1;
        do {
            System.out.println("Do-while k = " + k);
            k++;
        } while (k <= 2);
    }
}
