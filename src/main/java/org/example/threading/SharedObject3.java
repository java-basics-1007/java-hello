package org.example.threading;


/**
 * T1, T2 are 2 threads trying to access synchronized block.
 * The synchronized block is guarded by shared object counter.
 *
 * T1:  Let say T1 enter into synch block, so it holds lock on counter object.
 *
 * T2: At this time T2 not able to enter synch block and stay in BLOCKED state.
 *
 * T1: increment, notify, wait.
 * Notify: This means the thread T2 who is in BLOCKED state will get notified that he can get the lock and enter synch block
 * Wait: T1 is not interested for further execution. T1 went into BLOCKED state
 *
 * T2: T2 gets the lock enter into synch block. increment, notify, wait
 * Notify: T2 notified that the thread T1 who is in BLOCKED state can get the lock and start execution again.
 * Wait: T2 is not interested for further execution. So it says counter.wait() and goes blocked state.
 *
 * When count value reaches 10, the thread should do a counter.notify() and then break.
 * We are doing a notify before break because other thread might stay in BLOCKED state due to counter.wait()
 *
 */
public class SharedObject3 {

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
            synchronized (counter){
               System.out.println(Thread.currentThread().getName()+":synchronized");
               while(true) {
                   if(this.counter.getCount() == 10){
                       this.counter.notify();
                       break;
                   }


                   // W1 - increment -  ( 1 - 2 ) - notify - release lock
                   // W2 - increment -  ( 2 - 3) - notify
                   System.out.println(Thread.currentThread().getName() + ":" + this.counter.getCount());
                   this.counter.increment();
                   this.counter.notify();
                   System.out.println(Thread.currentThread().getName()+ ":"+"notification given");
                   waitCounter(); // release lock

               }
           }
        }

        private void waitCounter()  {
            try {
                this.counter.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
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
