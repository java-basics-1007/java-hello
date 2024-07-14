package org.example.inheritance;

import org.example.inheritance.model1.Alpha;
import org.example.inheritance.model2.Beta;

public class Example6 {
    public static void main(String[] args) {

        // searches m3 is overridden in Beta or not otherwise it calls from parent if exists

        Beta beta = new Beta();
        beta.m3();

    }
}
