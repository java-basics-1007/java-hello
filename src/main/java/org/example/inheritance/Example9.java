package org.example.inheritance;

import org.example.inheritance.model1.Alpha;
import org.example.inheritance.model2.Beta;

// A: A extends Object
// Beta: Beta extends Alpha
// Alpha: Alpha extends Object

// hashCode() method defined in which class ? java.lang.Object
// hashCode() is a native method. It is implementation internal to java, may be in c or cpp
// hashCode() gets inherited to every sub-class
public class Example9 {
    public static void main(String[] args) {

        Alpha alpha1 = new Beta();
        Alpha alpha2 = new Beta();
        System.out.println(alpha1.hashCode());
        System.out.println(alpha2.hashCode());

    }
}
