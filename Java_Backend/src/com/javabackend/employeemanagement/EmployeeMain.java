package com.javabackend.employeemanagement;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeMain {

    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList<Employee>();

        populate(emp);
        //System.out.println(emp);
       /* Employee e1 = new Employee("Vivek", "Software engineer", 50000.00, "Bangalore");
        Employee e2 = new Employee("Akshay", "Data engineer", 50000.00, "Delhi");
        Employee e3 = new Employee("Piyush", "Civil engineer", 50000.00, "Noida");
        Employee e4 = new Employee("Sunny", "Mech engineer", 50000.00, "Chennai");
        Employee e5 = new Employee("Durga", "EE engineer", 50000.00, "Hyd");
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);*/

        Predicate<Employee> p = empl -> empl.designation.equals("Manager");
        Predicate<Employee> p3 = empl -> empl.designation.equals("Software engineer");
        Predicate<Employee> p1 = empl -> empl.city.equals("Bangalore");

        Predicate<Employee> p2=empl->empl.salary<50000.00;
        System.out.println("manager");
        display(p, emp);
        System.out.println("belongs to blr");
        display(p1, emp);

        System.out.println("salary less than 50k");
        display(p2, emp);

        System.out.println("all managers from blr");
        display(p.and (p1),emp); // join
        System.out.println("Not Managers");
        display(p.negate(),emp);
        System.out.println("designation -> s/w engnr or manager");
        display(p.or(p3),emp);
    }

    public static void populate(ArrayList<Employee> list) {
        list.add(new Employee("Vivek", "Software engineer", 50000.00, "Bangalore"));
        list.add(new Employee("Akshay", "Data engineer", 50000.00, "Delhi"));
        list.add(new Employee("Piyush", "Manager", 45000.00, "Bangalore"));
        list.add(new Employee("Sunny", "Manager", 30000.00, "Chennai"));
        list.add(new Employee("Durga", "EE engineer", 50000.00, "Hyd"));

    }

    public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
        for (Employee e : list) {
            if (p.test(e)) {
                System.out.println(e.name);
            }

        }
        System.out.println("************");

    }
}
