package org.example.execute;

import org.example.model.Employee;


/**
 * for a class Employee how to create object.
 *
 * using new operator
 *
 * Employee e1 = new Employee();
 */
public class BlueprintMain {

    // int x; // x is a variable and its datatype is int
    public static void main(String[] args) {
        Employee e1=new Employee(); // e1 is a variable and its datatype is Employee
        System.out.println(e1.id);
        System.out.println(e1.name);

        e1.id = 11;
        e1.name="Avnish"; // initialization

        System.out.println(e1.id);
        System.out.println(e1.name);

        System.out.println("---------------------------");


        Employee e2=new Employee(); // e1 is a variable and its datatype is Employee

        System.out.println(e2.id);
        System.out.println(e2.name);

        e2.id=23;
        e2.name="rabindra";


        System.out.println(e2.id);
        System.out.println(e2.name);

        e2.id=240;

        System.out.println("--------------------------");

        System.out.println(e1.id); // 11
        System.out.println(e2.id); // 240


    }
}
