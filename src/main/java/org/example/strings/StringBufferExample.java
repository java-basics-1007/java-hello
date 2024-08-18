package org.example.strings;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // mutable, synchronized thread safe
        sb.append("John");
        sb.append("John").append("Doe");

        System.out.println(sb.toString());
    }
}
