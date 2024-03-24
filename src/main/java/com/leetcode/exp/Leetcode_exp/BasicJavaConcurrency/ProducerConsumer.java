package com.leetcode.exp.Leetcode_exp.BasicJavaConcurrency;

public class ProducerConsumer {
    static int capacity = 10;
    static MyQueue myQueue;
    static int count = 0;
    public static void main(String[] args) {
        myQueue = new MyQueue(capacity);
        Thread producer1= new Thread(new Producer() , "Producer1");
        Thread producer2 = new Thread(new Producer() , "Producer2");
        Thread consumer = new Thread(new Consumer() , "Consumer");
        producer1.start();
        producer2.start();
        consumer.start();
    }

    
}
class Producer implements Runnable {
   
    public void run() {
            while (ProducerConsumer.capacity > 0) {
            boolean status = ProducerConsumer.myQueue.queAdd(100);
            System.out.println(Thread.currentThread().getName() + " : " + "push " + status  + " : " + ProducerConsumer.count++);
            ProducerConsumer.capacity --;

            }
        
    }

}

class  Consumer implements Runnable  {

    public void run() {
        while (ProducerConsumer.myQueue.capacity > 0) {
            int element = ProducerConsumer.myQueue.quePoll();
            System.out.println(Thread.currentThread().getName() + " : " + "poll " +  element + " :  " + ProducerConsumer.count++);
            ProducerConsumer.capacity++;
        }
    }
    
}
