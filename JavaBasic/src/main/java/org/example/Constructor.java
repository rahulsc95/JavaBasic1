package org.example;

class Student {
    String name;
    Student(String n) {
        name = n;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s = new Student("Alex");
        System.out.println(s.name);
    }
}

