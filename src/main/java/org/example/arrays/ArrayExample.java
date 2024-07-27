package org.example.arrays;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] arr = new int[3]; // i have 3 elements each of them int type
        /**
         * what is the data type of array?
         * int
         *
         * with what default value the elements of array gets initialized?
         * depends on datatype: default value of datatype
         * default value of int is zero
         */

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // 0, 1, 2
        arr[0] = 10;
        arr[1] = 20;

        System.out.println(Arrays.toString(arr)); // 10, 20 , 0

        System.out.println("length: "+arr.length);

        for(int index=0; index < arr.length; index++){
            System.out.println(index+":"+arr[index]);
        }


        boolean[] boolValues = new boolean[4];
        /**
         *
         * booleanValues is a reference variable and is of type boolean array
         *
         * what is the data type of array?
         * boolean
         *
         * with what default value the elements of array gets initialized?
         * depends on datatype: default value of datatype
         * default value of boolean is : false
         */

        String x ;
        /**
         *         String is primitive type or reference type?
         *         A: reference type
         *
         *         Default value of any reference type?
         *         A: null
          */
        String[] names = new String[3]; // indexes: (0, 1, 2) // declare + initialize (default)
        /**
         * how many elements above array can hold?
         * A: 3 elements. i.e at 0th , 1st , 2nd index
         *
         * What is the type of array?
         * String
         *
         * What is the default value of each element in the array
         * A: null
         *
         * names is a reference type variable, whose type is String[]
         */

        System.out.println(Arrays.toString(names));

        int[] marks; // declare
        /**
         * what is the datatype of marks: int[].
         * anything other than primitive type is reference type.
         * so int[] is also reference type.
         * as no values assigned to marks, so marks will have the default value of reference type: null
         */

        marks = new int[]{23, 45, 67, 56}; // initialize custom values
        System.out.println(Arrays.toString(marks));
        marks = new int[3];  // initialize with default values
        marks[0] = 12;
        marks[2] = 14;
        System.out.println(Arrays.toString(marks));
        // marks has each element of type int primitive

        Integer[] ages = new Integer[3];
        // age has each element of type Integer reference type
        System.out.println(Arrays.toString(ages));

    }
}
