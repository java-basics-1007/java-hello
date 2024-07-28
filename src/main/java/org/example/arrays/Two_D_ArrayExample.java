package org.example.arrays;

import java.util.Arrays;

public class Two_D_ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 45, 67};

        int[][] arr1 = new int[][]{
                arr,
                arr,
                arr
        };

        int[][] arr11 = new int[4][];
        // can hold 3 elements, each element is of type 1d array, the default value for 1d array will be null
        arr11[0] = new int[]{1, 2, 3};
        arr11[1] = new int[]{1, 2, 3, 4, 5};
        arr11[2] = new int[]{1, 2};
        System.out.println(Arrays.deepToString(arr11));
        System.out.println(arr11.hashCode());
        System.out.println(arr11.getClass());
        System.out.println(arr11.toString()); // getClas@hexHashCode

        int[][] arr12 = new int[3][4];
        // can hold 3 elements, each element is of type 1d array, the 1d array can contain 4 int elements only, the default value of 1d array will be [0,0,0,0]
        arr12[0] = new int[]{1,2,3,4};
        arr12[2] = new int[]{1,2,3,4, 5};
        System.out.println(Arrays.deepToString(arr12));




        int[][][] arr2 = new int[][][]{
                arr1,
                arr1,
                arr1,
                arr1,
                arr1
        };
    }
}
