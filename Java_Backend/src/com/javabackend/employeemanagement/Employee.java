package com.javabackend.employeemanagement;

public class Employee {
    String name;
    String designation;
    double salary;
    String city;

    Employee(String name, String designation,double salary, String city ){
        this.city=city;
        this.name=name;
        this.designation=designation;
        this.salary=salary;


    }

    public String toString(){

        String s= String.format("(%s,%s,%.2f,%s)",name,designation,salary,city // %.2f
        );
        return s;
    }


}
