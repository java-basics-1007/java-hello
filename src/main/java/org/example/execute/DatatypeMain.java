package org.example.execute;

public class DatatypeMain {

    public static void main(String[] args) {
        System.out.println(Byte.SIZE); // 8 bits , [-128, 0, 127]
        System.out.println(Character.SIZE); // 16 [0, 65535]

        System.out.println(Short.SIZE); // 16
        System.out.println(Integer.SIZE); // 32
        System.out.println(Long.SIZE); // 64

        // decimal values are used with float and double
        System.out.println(Float.SIZE); // 32
        System.out.println(Double.SIZE); // 64

        // boolean : 1bit
    }
}
