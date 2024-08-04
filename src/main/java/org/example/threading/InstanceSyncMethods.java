package org.example.threading;

public class InstanceSyncMethods {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable w1 = new Worker(counter);
        Runnable w2 = new Worker(counter);

        Thread th1 = new Thread(w1, "W1");
        Thread th2 = new Thread(w2, "W2");

        th1.start();
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

        private Counter counter;

        public Worker(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
           counter.incrementOne();
        }
    }

    private static class Counter{

        private int count;

        private int increment(int step){
            this.count = count + step;
            return this.count;
        }

        public synchronized void incrementOne(){
            while(true) {
                if(this.count > 40) {
                    this.count = 0;
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                System.out.println(Thread.currentThread().getName()+":"+increment(1));
            }
        }
    }
}
