package org.example.strings;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        // 2 dfnt location of heap even they have same content
        String s1 = new String("Hello"); // heap
        String s2 = new String("Hello"); // heap

        System.out.println(s1 == s2); // false

        // same location in scp. scp dont have duplicate values
        String s3 = "Hello"; // string constant pool
        String s4 = "Hello"; // string constant pool

        System.out.println(s3 == s4); // true

        System.out.println(s1== s3); // false : heap & scp

        // when we do intern on a string it gives the reference of string from scp
        System.out.println(s1.intern()== s3); // true : scp & scp at same location

        String str = "hello world";
        String sub1 = str.substring(1);
        String sub2 = str.substring(2, 7); // last index excluded (2,3,4,5,6) indexes
        System.out.println(sub1);
        System.out.println(sub2);

        System.out.println(str.length());

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        for(char item: chars){
            System.out.println(item);
        }

        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(i+":"+ch);
        }

        int indexOfChar = str.indexOf('o');
        System.out.println(indexOfChar);

        int indexOfStr = str.indexOf("wor");
        System.out.println(indexOfStr);

        int lastIndexOfChar = str.lastIndexOf('o');
        System.out.println(lastIndexOfChar);

        String emptyVal ="";
        System.out.println(emptyVal.isEmpty());
        System.out.println(emptyVal.isBlank());

        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        str = new String(bytes);
        System.out.println(str);

        String firstName = "John";
        String lastName = "Doe";
        firstName.concat(lastName);
        System.out.println(firstName);
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);

        /// string is immutable, it cant be modified, it is thread safe

        String message = "hello how are you";
        String[] splits = message.split(" ");
        System.out.println(Arrays.toString(splits));
    }
}
