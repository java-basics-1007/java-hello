package org.example.inheritance.model1;

public class Alpha {

    public void m1(){
        System.out.println(getClass());
    }

    public void m2(){
        System.out.println(getClass());
        m3();
        m4();
    }

    public void m3(){
        System.out.println(getClass());
        System.out.println("PM3");
    }

    public void m4(){
        System.out.println(getClass());
        System.out.println("PM4");
    }

    public void metadata(){
        System.out.println("PM");
        System.out.println(getClass());
        System.out.println(hashCode());
    }
}
