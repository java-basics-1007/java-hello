package org.example.inheritance;

import org.example.inheritance.model1.U;
import org.example.inheritance.model2.V;

public class Example4 {
    public static void main(String[] args) {
        // what members can be invoked depends on reference type variable but not on the object type
        // below uVar or uVar1 is reference can access on i and m1()
        U uVar = new U();
        uVar.m1();
        System.out.println(uVar.getClass());

        U uVar1 = new V();
        uVar1.m1();
        System.out.println(uVar1.getClass());

        V vVar1 = (V) uVar1;
        vVar1.m2();


    }
}
