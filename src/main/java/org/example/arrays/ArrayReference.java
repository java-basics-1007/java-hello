package org.example.arrays;

import org.example.inheritance.model1.Student;

import java.util.Arrays;

public class ArrayReference {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b); // 20, 10
        System.out.println(a+":"+b); // 10, 20


        int[] a1 = {10, 20};
        int[] b1 = {23, 24};
        swap(a1, b1);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(b1));



        int[] nums = {10, 20};
        swap(nums);
        System.out.println(Arrays.toString(nums));

        Student s = new Student();
        s.setId(1);
        changeStudent(s);
        System.out.println(s.getId());
    }


    // pass by copy or pass by value does not retain the changes
    private static void swap(int x, int y){
        int t = x;
        x= y;
        y = t;

        x = x+1;
        System.out.println(x+":"+y);
    }

    private static void swap(int[] x, int[] y) {
        int[] t = x;
        x = y;
        y = t;
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }


    // changing the reference through parametere wont impact.
    // but changing the structure inside the reference will impact to outside
    private static void swap(int[] arr){
        int t = arr[0];
        arr[0]= arr[1];
        arr[1] = t;

        arr = null;
    }

    private static void changeStudent(Student student){
        student.setId(100);
        student= null;
    }
}
