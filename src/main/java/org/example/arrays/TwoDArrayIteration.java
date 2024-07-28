package org.example.arrays;

import java.util.Arrays;

public class TwoDArrayIteration {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {1, 2, 3},
                {1, 2, 3, 4, 5, 6},
        };

        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
            int[] current = arr[i];
            System.out.println(Arrays.toString(current));
        }

        System.out.println("--------------------------------");

        for(int i = 0; i < arr.length; i++){
            int[] current = arr[i];
            for(int position = 0; position < current.length; position++){
                System.out.print(current[position]+",");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        for(int i = 0; i < arr.length; i++){
            int[] current = arr[i];
            for(int position = 0; position < current.length; position++){
                System.out.print(arr[i][position]+",");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        for(int row = 0; row < arr.length; row++){
            int[] current = arr[row];
            for(int column = 0; column < current.length; column++){
                System.out.print(arr[row][column]+",");
            }
            System.out.println();
        }

        // for each
        System.out.println("----------------------------------");
        for(int[] element: arr){
            for(int index = 0; index < element.length; index++){
                System.out.print(element[index]+",");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");
        for(int[] element: arr){
            for(int value: element){
                System.out.print(value+",");
            }
            System.out.println();
        }
    }
}
