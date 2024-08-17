package org.example.exceptions;

/**
 * we see ArrayIndexOutOfBoundException
 */
public class App1 {
    public static void main(String[] args) {

        m1(); // error
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
