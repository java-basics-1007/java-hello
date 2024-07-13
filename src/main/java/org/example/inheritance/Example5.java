package org.example.inheritance;

import org.example.inheritance.model1.Alpha;
import org.example.inheritance.model1.U;
import org.example.inheritance.model2.Beta;
import org.example.inheritance.model2.V;

public class Example5 {
    public static void main(String[] args) {
        Beta beta = new Beta();
        beta.m1();
        beta.m2();

        Alpha alpha = new Beta();
        alpha.m1();

        Alpha alpha1 = new Alpha();
        alpha1.m2();


    }
}
