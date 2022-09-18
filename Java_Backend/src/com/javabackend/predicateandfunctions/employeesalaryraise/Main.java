package com.javabackend.predicateandfunctions.employeesalaryraise;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> emp= new ArrayList<>();
        populate(emp);
        Predicate<Employee> p=empl->empl.salary>=4500;
        Function<Employee,Employee> func=f->{
            f.salary=f.salary+400;
            return f;};

        ArrayList<Employee> e2=new ArrayList<>();
        for (Employee e:emp){
            if(p.test(e)){
                func.apply(e);
                e2.add(e);
            }
        }

        System.out.println(e2);

    }

    public static void populate(ArrayList<Employee> emp){
        emp.add(new Employee("Vivek", 4000));
        emp.add(new Employee("Piyush", 3300));
        emp.add(new Employee("Abhi", 4500));
        emp.add(new Employee("Akku", 5000));




    }
}
