package org.example;

class Employee {
    private int salary;  // private = restricted access

    public void setSalary(int s) {
        salary = s;
    }

    public int getSalary() {
        return salary;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(5000);
        System.out.println("Salary: " + emp.getSalary());
    }
}

