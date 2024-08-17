package org.example.exceptions;


// exception hierarchy

/**
 * AIOE->RuntimeException->Exception->Throwable
 * AE->RuntimeException->Exception->Throwable
 *
 * multiple try catch blocks
 */
public class App7 {
    public static void main(String[] args) {

        // Parent p = new Child();
        // Exception e = new AIOE();
        try {
            int x = 10/ 0;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("AE occurred");
        }

        try {
            m1();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("AOIE occurred");
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
