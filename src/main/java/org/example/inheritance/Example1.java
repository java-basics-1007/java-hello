package org.example.inheritance;

public class Example1 {

    public static void main(String[] args) {

    }


    // father has TV & CAR & WALLET (private)

    // son: CAR(son , outside world, public), TV ( protected )
    private static class A {

        // members : fields and methods
        // inherit: public is visble outisde world, protected visible only to subclass, private visible only to currentc lass
        public static void display(){

        }

        public static void displayCar(){

        }

        protected static void displayTv(){

        }

        private static void displayWallet(){

        }
    }

    private static class B extends  A {

        public static void show(){
            display();
            displayCar();
            displayTv();
        }
    }
}
