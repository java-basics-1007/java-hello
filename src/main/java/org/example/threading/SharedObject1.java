package org.example.threading;

public class SharedObject1 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable w1 = new Worker(counter);
        Runnable w2 = new Worker(counter);

        Thread th1 = new Thread(w1, "W1");
        Thread th2 = new Thread(w2, "W2");
        th1.start();
        th2.start();
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
            synchronized (counter){
               System.out.println(Thread.currentThread().getName()+":synchronized");
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
