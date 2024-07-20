package org.example.constructors;

public class ComponentMain {
    public static void main(String[] args) {
        Component component1 = new Component();// hello, hi, class:hashCode
        System.out.println(component1.id);
        Component component2 = new Component(); // hi, class:hashCode
        System.out.println(component2.id);

        Component component3 = new Component(200); // param constructor
        System.out.println(component3.id);
    }
}
