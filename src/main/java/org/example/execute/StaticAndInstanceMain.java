package org.example.execute;

public class StaticAndInstanceMain {
    static {
        display(); // 100
        id=10;
    }

    static {
        System.out.println("SB2");
        display();
        System.out.println("SB2");
    }

    private static int id =100;
    private static void display(){
        System.out.println("SM: "+id);
//        name="";
    }

    private String name;

    {
        System.out.println("ISB");
        displayName();
        name = "Alex";
        System.out.println("ISB");
    }

    private void displayName(){
        System.out.println(name);
       display();
    }

    public static void main(String[] args) {
        StaticAndInstanceMain.display(); // static
        System.out.println("*****************************************");
        StaticAndInstanceMain.display(); // SM
        System.out.println("----------------------------------------");
        new StaticAndInstanceMain(); // instance
        System.out.println("#########################################");
        new StaticAndInstanceMain(); // instance
    }
}
