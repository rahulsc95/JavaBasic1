package org.example;

import java.util.*;

public class ListFrame {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        // Print the list
        System.out.println("List contents:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}

