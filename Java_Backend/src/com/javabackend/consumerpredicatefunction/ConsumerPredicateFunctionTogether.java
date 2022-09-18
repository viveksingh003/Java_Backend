package com.javabackend.consumerpredicatefunction;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerPredicateFunctionTogether {
    public static void main(String[] args) {

        ArrayList<Student> stud = new ArrayList<>();
        populate(stud);
        Predicate<Student> s=studs->studs.marks>=60;
        Function<Student,String> f=func->{
            if(func.marks>=80){

               return "A";
            }
            else if(func.marks>=70){
                return "B";
            }
            else {
                return  "Nah ho paega";
            }
        };

        Consumer<Student> stu=studss-> System.out.println(studss.name+" "+studss.marks+" "+f.apply(studss));//nyc concpt

        for(Student s1:stud){
            if(s.test(s1)){
                f.apply(s1);
                stu.accept(s1);
            }

        }


    }

    public static void populate(ArrayList<Student> stud){
        stud.add(new Student("vivek",60));
        stud.add(new Student("Abhi",70));
        stud.add(new Student("Akku",80));

    }

}
