package org.example.threading;

public class ThreadLifeCycle {

    public static void main(String[] args) throws InterruptedException {
        String myName = "John";

        Object object = new Object();
        Worker worker1 = new Worker(object, 1000);
        Worker worker2 = new Worker(object, 0);

        Thread th1 = new Thread(worker1, "W1");
        Thread th2 = new Thread(worker2, "W2");

        System.out.println(th1.getState());
        System.out.println(th2.getState());

        th1.start();
        Thread.sleep(1000);
        th2.start();

        int count = 0;
        while(true) {
            if(count == 10){
                break;
            }
            count++;
            System.out.println(Thread.currentThread());
            Thread.sleep(500); // 1000 ms  = 1 second
            printThreadInfo(th1.getName() + ":" + th1.getState());
            printThreadInfo(th2.getName() + ":" + th2.getState());
        }
    }

    private static void printThreadInfo(String printInfo) {
        System.out.println(printInfo);
    }

    private static class Worker implements Runnable{

        private Object name;
        private long sleepTimeMs;

        public Worker(Object name, long sleepTimeMs) {
            this.name = name;
            this.sleepTimeMs = sleepTimeMs;
        }

        @Override
        public void run() {
            printThreadInfo(Thread.currentThread() + ":" + Thread.currentThread().getState());
            try {
                Thread.sleep(sleepTimeMs);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
