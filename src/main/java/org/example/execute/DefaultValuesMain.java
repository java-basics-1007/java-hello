package org.example.execute;

public class DefaultValuesMain {
    public static int x; // primitive types
    public static boolean b; // primitive types
    public static char c; // primitive types
    public static short s; // primitive types
    public static byte by; // primitive types
    public static long ln; // primitive types
    public static float fl; // primitive types
    public static double db; // primitive types
    public static Integer y; // reference types
    public static Boolean bl; // reference types here Boolean comes from java.lang package
    public static Employee e; // reference types

    /**
     * byte, char, short,  int , long, float, double, boolean: primitive types
     * anything other than primitive types called as reference types
     * The default value for reference types is null.
     * But primitive types always have some default value
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);
        System.out.println(b); // false
        System.out.println(c);
        System.out.println(s);
        System.out.println(by);
        System.out.println(ln);
        System.out.println(fl);
        System.out.println(db);
        System.out.println(bl); // null

    }

    public static class Employee{

        int id;
        String name;

    }
}
