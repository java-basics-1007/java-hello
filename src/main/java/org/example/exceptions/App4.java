package org.example.exceptions;


// exception hierarchy

/**
 * AIOE->RuntimeException->Exception->Throwable
 * AE->RuntimeException->Exception->Throwable
 */
public class App4 {
    public static void main(String[] args) {

        // Parent p = new Child();
        // Exception e = new AIOE();
        try {
            int x = 10/ 0;
            m1(); // error
        } catch (Exception e) {
            e.printStackTrace();
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
