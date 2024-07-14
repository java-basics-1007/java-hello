package org.example.inheritance.model2;

import org.example.inheritance.model1.Alpha;

public class Beta extends Alpha {
    @Override
    public void m1() {
      super.m1();
    }

    @Override
    public void m3() {
        System.out.println(getClass());
        System.out.println("CM3");
    }

    @Override
    public void metadata() {
        System.out.println("CM");
        System.out.println(getClass());
        System.out.println(hashCode());

        super.metadata(); // why super is used?
    }

    /**
     * m1()
     * m1() -> 8
     * m1() -> 8
     * m1() -> 8
     */
}
