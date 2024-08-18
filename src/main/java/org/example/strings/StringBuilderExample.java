package org.example.strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(); // mutable , not thread safe
        System.out.println(builder.hashCode());
        builder.append("John");
        System.out.println(builder);
        builder.append("Doe").append("30");
        System.out.println(builder);
        System.out.println(builder.toString());
        System.out.println(builder.hashCode());
    }
}
