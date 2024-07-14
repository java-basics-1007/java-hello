package org.example.inheritance;

import org.example.inheritance.model1.Student;

public class Example11 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(100);
        System.out.println(s.getId());

        Student s1 = new Student();
        s1.setId(200);

        System.out.println(s.getClass());
        System.out.println(s.hashCode());
        System.out.println(s.toString()); // getClass@hex(hashCode())
        System.out.println(s);

        System.out.println(s1);

        // because toString() is comming from Object class due to inheritance.
        // Student class internally, by default extends Object class
    }
}
