package org.example.methods;

/**
 * class , methods, object, datatypes
 */
public class MathOperations {

    public static int shared;
    public static void main(String[] args) {
//        int result = 10 + 20;
        int x =  10;
        int y = 20;
        int result = additionOperation(10, 20);
        int r1 = additionOperation(30, 40);
        int r2 = additionOperation(0   , 4);

        System.out.println(result);
        System.out.println(r1);
        System.out.println(r2);

        displaySquare(10);

        System.out.println(shared);
        shared = 10;
    }

    public static void displaySquare(int x){
        System.out.println(x*x);
        System.out.println(shared);
    }

    /**
     *
     * @param a
     * @param b
     * @return the result of a + b
     */
    public // access modifier
    static
    int // return type
    additionOperation(int a, int b){ // methodName and its parameters
        int z = a + b;
        return z;
    }
}
