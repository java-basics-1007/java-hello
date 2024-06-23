package org.example.execute;

public class StringMain {

    public static void main(String[] args) {
        String s1 = "aBc";
        String s2 = "12.34";

        System.out.println(s1.length());
        System.out.println(s2.length());

        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
    }
}
