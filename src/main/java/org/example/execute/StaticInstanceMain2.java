package org.example.execute;

public class StaticInstanceMain2 {
    private static int id;
    private int age;

    public static void main(String[] args) {
        StaticInstanceMain2 o1 = new StaticInstanceMain2();
        o1.age = 10;

        StaticInstanceMain2 o2 = new StaticInstanceMain2();
        o2.age = 30;

        StaticInstanceMain2.id=20;

        System.out.println(o1.id);
        System.out.println(o2.id);

        System.out.println(++o1.age);
        System.out.println(--o2.age);

    }
}
