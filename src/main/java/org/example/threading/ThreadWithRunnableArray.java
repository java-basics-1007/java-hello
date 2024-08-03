package org.example.threading;

public class ThreadWithRunnableArray {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        int count = 0;
        while(true) {
            if(count == 10){
                break;
            }
            Runnable worker = new Worker();
            worker.run();

            Thread th1 = new Thread(worker, "MyThread "+count);
            th1.start();
            count++;
        }
    }

    private static class Worker implements Runnable{
        @Override
        public void run() {
            System.out.println(Thread.currentThread());
        }
    }

    // functional programming
    private static Runnable worker = ()->{
        System.out.println(Thread.currentThread());
    };
}
