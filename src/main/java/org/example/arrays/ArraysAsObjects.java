package org.example.arrays;

import java.util.Arrays;

public class ArraysAsObjects {

    public static void main(String[] args) {
        String[] names = new String[3];
        String[] names1 = new String[3];

        System.out.println(names.hashCode());
        System.out.println(names.getClass());
        System.out.println(names.toString());
        System.out.println(names.equals(names1));

        names[0] = "John";
        names[1] = "Alex";
        names[2] = "Joe";

        System.out.println(Arrays.toString(names));

        for(int index=0; index < names.length; index++){
            String value = names[index];
            System.out.println(index+":"+value);
        }

    }
}
