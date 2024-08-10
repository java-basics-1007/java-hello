package org.example.threading;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
// publish 10 messages
// consumer to consume 10 messages then notify
// producer produces 10 messages and notify
public class ProducerConsumerMain {
    public static void main(String[] args) {
        List<String> messages = new ArrayList<>();
        Worker producer = new Worker(messages,  10);
        Worker consumer = new Worker(messages,  10);

        Thread producerThread = new Thread(producer, "producer");
        Thread consumerThread = new Thread(consumer, "consumer");

        consumerThread.start();
        producerThread.start();
    }

    // producer
    // consumer
    // 10
    private static class Worker implements Runnable{
        private List<String> messages;
        private String name;
        private int capacity;

        public Worker(List<String> messages, int capacity) {
            this.messages = messages;
            this.capacity = capacity;
        }

        private void waitMs(){
            try {
                messages.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        @Override
        public void run() {
            this.name = Thread.currentThread().getName();
            System.out.println(this.name);
            while(true) {
                synchronized (messages) {
                    if (this.name.equals("producer")) {
                        // produce
                        if(capacity == 0){
                            messages.notify();
                            break;
                        }
                        String message = UUID.randomUUID().toString();
                        messages.add(message);// publish
                        System.out.println(this.name+":"+message);
                        capacity = capacity - 1;
                        messages.notify();// notify
                        waitMs();// wait
                    } else {
                        // consume
                        if(capacity == 0){
                            messages.notify();
                            break;
                        }

                        if(messages.size() == 0){
                            waitMs();
                        }

                        String read = messages.remove(0);// read
                        System.out.println(this.name+":"+read);
                        capacity = capacity - 1;
                        messages.notify();// notify
                        waitMs(); // wait
                    }
                }
            }
        }
    }
}
