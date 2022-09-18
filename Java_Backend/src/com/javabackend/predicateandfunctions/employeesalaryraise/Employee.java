package com.javabackend.predicateandfunctions.employeesalaryraise;

public class Employee {
    String name;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
