package org.example.threading;

public class ThreadWithExtendingThread {
    public static void main(String[] args) {
        Runnable worker = new Worker();
        worker.run();

        Thread th1 = new Worker();
        th1.run();

        th1.start();

        Thread th2 = new Thread(th1, "MyThread-1");
        th2.start();

        Thread th3 = new Thread(worker, "MyThread3");
        th3.start();
    }

    private static class Worker extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread());
            super.run();
        }
    }
}
