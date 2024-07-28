package org.example.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySorting {
    public static void main(String[] args) {
        Integer[] arr = {2, 4, 5, 3, 7, 8};

        Arrays.sort(arr); // increasing order

        Comparator<Integer> comparator = new ReverseSort();
        Arrays.sort(arr, comparator); // decreasing order

        System.out.println(Arrays.toString(arr));
    }

    // java.util.Comparator interface
    private static class ReverseSort implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return -Integer.compare(o1, o2);
        }
    }
}
