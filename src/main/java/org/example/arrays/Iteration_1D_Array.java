package org.example.arrays;

public class Iteration_1D_Array {

    public static void main(String[] args) {
        int[] numValues = {12, 34, 56, 78};
        int n = numValues.length;
        // index based for loop
        for(int index = 0 ; index < n; index++){
            System.out.println(index+":"+numValues[index]);
        }
        // for item based approach
        System.out.println("for item based: ");
        for(int item: numValues){
            System.out.println(item);
        }

        // while indexed approach
        System.out.println("while index based: ");
        int index = 0;
        while(index < n){
            int value = numValues[index];
            System.out.println(index +":"+value);
            index = index + 1;
        }

        // do while indexed
    }
}
