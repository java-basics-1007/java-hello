package org.example.inheritance;

import org.example.inheritance.model1.Alpha;
import org.example.inheritance.model2.Beta;

// A: A extends Object
// Beta: Beta extends Alpha
// Alpha: Alpha extends Object

// hashCode() method defined in which class ? java.lang.Object
// hashCode() is a native method. It is implementation internal to java, may be in c or cpp
// hashCode() gets inherited to every sub-class
public class Example10 {
    public static void main(String[] args) {

        Alpha alpha = new Beta();
        System.out.println(alpha.getClass());
        System.out.println(alpha.hashCode());
        alpha.metadata();

    }
}
