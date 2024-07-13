package org.example.model;

public class Component {
    private int id;
    private String name;

    {
        System.out.println("NSB1: "+id);
        System.out.println("NSB1: "+name);

        displayId();
    }

    {
        System.out.println("NSB2: "+id);
        System.out.println("NSB2: "+name);

    }



    public Component(){
        System.out.println("constructor");
    }

    public void displayId(){
        System.out.println(id);
    }

    public void displayName(){
        System.out.println(name);
    }
}
