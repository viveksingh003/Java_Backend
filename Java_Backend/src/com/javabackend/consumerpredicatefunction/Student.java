package com.javabackend.consumerpredicatefunction;

public class Student {

    String name;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    int marks;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
