package org.example.exceptions;


// exception hierarchy

/**
 try / catch finally
 */
public class App14 {
    public static void main(String[] args) {

        // Parent p = new Child();
        // Exception e = new AIOE();

        int key = 100; // 0 or 2
        try {
            if(key == 0){
                int x = 10 / key; // AE
            }
            if(key == 2){
                m1(key); // AIOE
            }

            if(key == -1){
                throw new IllegalArgumentException("Invalid key provided");
            }

            if(key == 5){ // throw exception object
                throw new UnsupportedOperationException("operation not allowed");
            }

            System.out.println("exception not occurred");
        }

        catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println("IAE occurred");
        }
        catch (ArithmeticException e){
            System.out.println("AE occurred");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("AIOE occurred");
        }
        catch (RuntimeException e){
            System.out.println("UOE occurred");
        }
        finally {
         // it executes at the end (exception or without exception)
            System.out.println("finally block");
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
