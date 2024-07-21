package org.example.arrays;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] arr = new int[3]; // i have 3 elements each of them int type

        // 0, 1, 2
        arr[0] = 10;
        arr[1] = 20;

        System.out.println(Arrays.toString(arr));

        for(int index=0; index < arr.length; index++){
            System.out.println(arr[index]);
        }

    }
}
