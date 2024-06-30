package org.example.model;

public class Student {

    // static block executes only once, one by one in the order of declaration
    static{
        System.out.println("sb1");
    }

    static{
        System.out.println("sb2");
    }

    public static int id;
    public static String name;

    public static int x = 10;
    public static int y = 20;
    static {
        // accessing static variables and methods
        System.out.println(x); // 10
        System.out.println(y); // 20
        m1(x+y); // m1(30)
//        System.out.println(z); // illegal forward reference  because when the static block executes he has not seen where is z
    }

    public static int z;


    public static void displayId(){
        System.out.println("value of id: "+id);
    }

    public static void displayName(){
        System.out.println("value of name: "+name);
    }


    public Student(){
        System.out.println("constructor");
    }

    public static void m1(int i){

        System.out.println(i); // 30
        System.out.println(x); // 10
    }

}
