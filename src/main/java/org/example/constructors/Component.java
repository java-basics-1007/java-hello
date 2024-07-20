package org.example.constructors;

public class Component {

    static {
        System.out.println("hello");
    }

    {
        System.out.println("hi");
    }
    public int id;
    public Component(){
        id = 100;
        System.out.println(getClass()+":"+hashCode());
    }

    // by default the default constructor not gets added when we define a param constructor
    public Component(int id){
        this.id = id;
    }
}
