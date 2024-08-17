package org.example.exceptions;


// exception hierarchy

/**
 nested try / catch finally
 */
public class App15 {
    public static void main(String[] args) {


        int key = 0;
        try {
            System.out.println("try-1-start");
            int x = 10 / key;
            System.out.println("try-1-end");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ex-1-start");
            int[] arr ={10};

            // nested try / catch  finally

            // try finally or try / catch finally
            try {
                System.out.println("try-2-start");
                System.out.println(arr[key+1]);
                System.out.println("try-2-end");
            } catch (Exception ex) {
                System.out.println("ex-2-start");
            } finally {
                System.out.println("finally-2-start");
            }

            System.out.println("ex-1-end");

        } finally {
            System.out.println("finally-1-start");
        }


        System.out.println("main complete");

    }
}