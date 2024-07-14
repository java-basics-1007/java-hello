package org.example.inheritance;

public class Example12 {

    public static void main(String[] args) {

        Area rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.breadth = 20;

        System.out.println(rectangle.calculate()); // 200


        rectangle = new Rectangle();
        rectangle.length = 4;
        rectangle.breadth = 2;

        System.out.println(rectangle.calculate()); // 8


        Area square = new Square();
        square.length = 10;
        System.out.println(square.calculate()); // 100

    }

    private static class Area {
        public int length;
        public int breadth;

        public int calculate(){
            return 0;
        }
    }

    private static class Rectangle extends Area{
        @Override
        public int calculate() {
            return length * breadth;
        }
    }

    private static class Square extends Area{
        @Override
        public int calculate() {
            return length * length;
        }
    }


}
