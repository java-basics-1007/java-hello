package org.example.threading;

public class ThreadWithFunctional {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        Runnable worker = new Worker();
        worker.run();

        Thread th1 = new Thread(worker, "MyThread");
        th1.start();

        Thread th2 = new Thread(functionalWorker, "FunctionalMyThread");
        th2.start();
    }

    private static class Worker implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread());
        }
    }

    private static Runnable functionalWorker = ()->{
        System.out.println(Thread.currentThread());
    };

}
