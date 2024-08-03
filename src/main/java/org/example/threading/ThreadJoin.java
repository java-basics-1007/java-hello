package org.example.threading;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Runnable w1 = new Worker();
        Runnable w2 = new Worker();
        Thread th1 = new Thread(w1, "W1");
        Thread th2 = new Thread(w2, "W2");

        th1.start();
        th1.join(); // main thread waits for th1 to finish
        th2.start();
        th2.join(); // main thread waits for th2 to finish

        System.out.println(Thread.currentThread());
        System.out.println(th1.getState());
        th1.start();
    }

    private static class Worker implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread());
        }
    }
}
