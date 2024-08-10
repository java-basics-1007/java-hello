package org.example.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// publish 10 messages
// consumer to consume 3 messages then notify
// producer produces 10 messages and notify
public class ProducerConsumerMain1 {
    public static void main(String[] args) {
        List<String> messages = new ArrayList<>();
        Worker producer = new Worker(messages,  10);
        Worker consumer = new Worker(messages,  3);

        Thread producerThread = new Thread(producer, "producer");
        Thread consumerThread = new Thread(consumer, "consumer");

        consumerThread.start();
        producerThread.start();
    }

    // producer
    // consumer
    // 10
    private static class Worker implements Runnable{
        private List<String> queue;
        private String name;
        private int capacity;

        public Worker(List<String> messages, int capacity) {
            this.queue = messages;
            this.capacity = capacity;
        }

        private void waitMs(){
            try {
                queue.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        private void sleepMs(long ms){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        @Override
        public void run() {
            this.name = Thread.currentThread().getName();
            System.out.println(this.name);
            int tempCapacity = capacity;

            while(true) {
                synchronized (queue) {
                    if (this.name.equals("producer")) {
                        // produce

                        String message = UUID.randomUUID().toString();
                        queue.add(message);// publish
                        System.out.println(this.name+":"+message);
                        sleepMs(500);
                        if(capacity == queue.size()){
                            queue.notify();// notify
                            waitMs();// wait
                        }
                    } else {
                        // consume

                        if(queue.size() == 0){
                            waitMs();
                        }

                        String read = queue.remove(0);// read
                        System.out.println(this.name+":"+read);
                        tempCapacity = tempCapacity - 1;
                        sleepMs(500);
                        if(tempCapacity == 0){
                            tempCapacity = capacity;
                            queue.notify();// notify
                            waitMs(); // wait
                        }
                    }
                }
            }
        }
    }
}
