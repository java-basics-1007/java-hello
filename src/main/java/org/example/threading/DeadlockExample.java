package org.example.threading;

public class DeadlockExample {

    public static void main(String[] args) throws InterruptedException {
        Object object1 = new Object();
        Object object2 = new Object();

        Runnable w1 = new Worker(object1, object2); // it will get lock on object1 first -> object2
        Runnable w2 = new Worker(object2, object1); // it will get lock on object2 first -> object1

        Thread th1 = new Thread(w1,"W1");
        Thread th2 = new Thread(w2, "W2");

        th1.start();
        Thread.sleep(500);
        th2.start();

        int index = 0;
        while(index < 10){
            index = index + 1;
            System.out.println(th1.getName()+":"+th1.getState());
            System.out.println(th2.getName()+":"+th2.getState());
            Thread.sleep(500);
        }
    }

    private static class Worker implements Runnable{

        private Object p1;
        private Object p2;

        public Worker(Object p1, Object p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        @Override
        public void run() {
            synchronized (p1){ // object1
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (p2){ // object2
                    while(true){

                    }
                }
            }
        }
    }
}
