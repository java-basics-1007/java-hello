package org.example.inheritance.model2;

import org.example.inheritance.model1.Alpha;

public class Beta extends Alpha {
    @Override
    public void m1() {
       super.m1();
    }


    /**
     * m1()
     * m1() -> 8
     * m1() -> 8
     * m1() -> 8
     */
}
