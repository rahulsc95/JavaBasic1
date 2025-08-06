package org.example;

import java.util.*;
import java.util.stream.*;

public class StreamApi {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alex", "Brian", "Charles");
        names.stream()
                .filter(n -> n.startsWith("A"))
                .forEach(System.out::println);
    }
}

