package org.example.threading;

public class SharedObject2 {

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

    /**
     * T1 T2 T1 T2 T1
     */
    private static class Worker implements Runnable{
        private Counter counter;

        public Worker(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+":run");
            synchronized (counter){ // only one thread can get the lock on the counter object
               System.out.println(Thread.currentThread().getName()+":synchronized");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                while(true) {
                   if(this.counter.getCount() == 10){
                       break;
                   }
                   this.counter.increment();
                   System.out.println(Thread.currentThread().getName() + ":" + this.counter.getCount());
               }
           }
        }
    }

    private static class Counter{
        private int count;

        public void increment(){
            this.count = this.count + 1;
        }

        public int getCount() {
            return count;
        }
    }
}
