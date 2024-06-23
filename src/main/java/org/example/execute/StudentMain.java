package org.example.execute;

import org.example.model.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        // create object for Student using new operator with calling the default constructor
        // assign the reference of created object to s1 where s1 is of Student type.
        s1.id=20;
        System.out.println(s1.id);
    }
}
