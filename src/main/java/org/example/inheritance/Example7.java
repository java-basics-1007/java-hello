package org.example.inheritance;

import org.example.inheritance.model1.Alpha;
import org.example.inheritance.model2.Beta;

public class Example7 {
    public static void main(String[] args) {

        /**
         * alpha is a reference variable of Alpha type.
         * alpha holds the refernce of an object which is Beta type
         */

        // m2 is called using which object: look at the new operator: Beta
        Alpha alpha = new Beta();
        alpha.m2();

    }
}
