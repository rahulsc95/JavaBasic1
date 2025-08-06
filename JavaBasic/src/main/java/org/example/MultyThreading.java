package org.example;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}
public class MultyThreading {
    public static void main(String[] args) {
        MyThread t = new MyThread(); // Create a thread instance
        t.start();                   // Start the thread (invokes run() in a new thread)
    }
}

