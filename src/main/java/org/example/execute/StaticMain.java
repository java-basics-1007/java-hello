package org.example.execute;

import org.example.model.Student;

public class StaticMain {

    public static void main(String[] args) {
        Student.displayId();// accessing a static resource so that the Student class gets loaded and static block execution starts

        m1();
        StaticMain.m1();
    }

    public static void m1(){
        System.out.println("My M1");
    }
}
