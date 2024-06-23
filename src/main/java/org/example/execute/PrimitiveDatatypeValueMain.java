package org.example.execute;

public class PrimitiveDatatypeValueMain {
    public static void main(String[] args) {
        // size: 8. total 256 numbers
        // min -2^(8-1) = -2^7 = -128
        // max 2^(8-1) - 1 = 2^7 -1 = 128 - 1 127
        // [-128, 127]
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        byte b1 = 100; // [-128, 127]
        byte b2 = (byte) 2345; // [-128, 127] // 1001 doesnt come in interval, so 1001 is treated as int value. but int size is 16

        System.out.println(b1);
        System.out.println(b2);

        // only assign the data which is in its interval
        // bigger data can be assigned to smaller types with typecasting but it will have lossy conversion

        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        char c1 = 'a'; //
        System.out.println(c1);
        char c2 = 68; // can assign positive int values [0. 65536-1] to a character variable
        System.out.println(c2);
        char c3 = 65535;
        System.out.println(c3);

        // uppercase : [65 , 90]
        // lowercase: [97, 122]
        int index = 65;
        while(true){
            if(index == 128){
                break;
            }
            char c = (char)index;
            System.out.println(index+"="+c);
            index=index+1;
        }


        System.out.println(Short.MAX_VALUE); // 2^(16-1) - 1
        System.out.println(Short.MIN_VALUE); // -2^(16-1)
        // [-32768, 32767]
        short s1 = 32764;
        short s2 = -32764;
        short s3 = (short)324567; // loosy conversion from int to short
        // higher data assigned to lower type: down-casting
        System.out.println(s3);


        int i1 = 100;

        int i2 = s3; // assigning 16 bit data to 32 bit type, storage loss
        // lower data being assigned to higher type: up-casting
        /**
         * [-2147483648
         * 2147483647]
         */
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        long l1 = 123;
        long l2= 123456123456L;

        int i3 = (int)l2; // loosy conversion from long to int
        System.out.println(i3);

        /**
         * [-9223372036854775808,
         * 9223372036854775807]
         */
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        float f1= 23.4f;
        float f2= 43.5f; // down-casting
        float f3= (float)43.5; // downcasting

        System.out.println(f2);
        System.out.println(f3);

        float f4 = 34.5f;
        System.out.println(f4==34.5); // true or false

        /**
         * 1.4E-45
         * 3.4028235E38
         */
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        double d1 = 32.4;
        float f5 = (float)d1; // loosy conversion from double to float
        System.out.println(d1);
        System.out.println(f5);

        boolean bl1= true;
        boolean bl2= false;

        System.out.println(bl1);
        System.out.println(bl2);
    }
}
