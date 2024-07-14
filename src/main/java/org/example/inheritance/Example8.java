package org.example.inheritance;

import org.example.inheritance.model1.Alpha;
import org.example.inheritance.model2.Beta;

public class Example8 {
    public static void main(String[] args) {

        /**
         * alpha is a reference variable of Alpha type.
         * alpha holds the refernce of an object which is Alpha type
         */

        // m2 is called using which object: look at the new operator: Alpha
        Alpha alpha = new Alpha();
        alpha.m2();

    }
}
