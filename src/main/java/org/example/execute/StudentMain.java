package org.example.execute;

import org.example.model.Student;

public class StudentMain {

    public static void main(String[] args) {
        // static block execuites for once when class loaded into jvm
        Student s1 = new Student(); // static, constructor
        Student s2 = new Student(); // constructor
        Student s3 = new Student(); // constructor
    }
}
