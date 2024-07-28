package org.example.arrays;

import java.util.Arrays;

public class ReplaceInIntArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 42, 43, 45, 50};
        // any number greater than 20 and less than 50 replace with -1
        for(int i = 0; i< arr.length; i++){
            int value = arr[i];
            if(arr[i] > 20 && arr[i] < 50){
                arr[i] = -1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
