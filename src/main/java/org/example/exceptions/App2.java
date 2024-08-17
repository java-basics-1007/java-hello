package org.example.exceptions;

// try / catch block
public class App2 {
    public static void main(String[] args) {

        try {
            m1(); // error
        } catch (Exception e) {
            System.out.println("error occurred");
        }
        System.out.println("Hello World");
    }

    private static void m1() {
        System.out.println("Exception Method");
        int[] arr = {10, 12};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]); // error
        System.out.println("Exception Method Complete");

    }
}
