package org.example.inheritance.model2;

import org.example.inheritance.model1.U;

public class V extends U {
    public int j=100;
    public void m2(){
        m1(); // 300
        System.out.println(i+j); // 400
    }
}
