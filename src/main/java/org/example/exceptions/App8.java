package org.example.exceptions;


// exception hierarchy

/**
 * AIOE->RuntimeException->Exception->Throwable
 * AE->RuntimeException->Exception->Throwable
 *
 * how to use instanceOf operator while handling exception
 */
public class App8 {
    public static void main(String[] args) {

        // Parent p = new Child();
        // Exception e = new AIOE();

        int key = 0; // 0 or 2
        try {
            if(key == 0){
                int x = 10 / key;
            }
            if(key == 2){
                m1(key);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            if(e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("AIOE error occurred");
            }
            if(e instanceof ArithmeticException){
                System.out.println("AE error occurred");
            }

        }
        System.out.println("Hello World");
    }

    private static void m1(int key) {
        System.out.println("Exception Method");
        int[] arr = {10, 12};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[key]); // error
        System.out.println("Exception Method Complete");

    }
}
