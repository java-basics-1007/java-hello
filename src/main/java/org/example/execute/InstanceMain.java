package org.example.execute;

import org.example.model.Component;

public class InstanceMain {

    /**
     * static blocks can customize your class
     * instance blocks can customize your objects
     * @param args
     */
    public static void main(String[] args) {
        Component component1 = new Component();
        System.out.println("---------------------------------------");
        Component component2 = new Component();
        component2.displayId();
    }
}
