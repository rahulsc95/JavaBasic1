package org.example;

class MyPackageClass {
    public void display() {
        System.out.println("Hello from package");
    }
}

public class Packages {
    public static void main(String[] args) {
        MyPackageClass obj = new MyPackageClass();
        obj.display();
    }
}
