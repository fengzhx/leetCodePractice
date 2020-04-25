package self.practice9;

import designParttern.builder.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        List<Integer> producePool = new ArrayList<>(5);
        new Thread(new Producer(producePool)).start();
        new Thread(new Consumer(producePool)).start();
        new Thread(new Producer(producePool)).start();
        new Thread(new Consumer(producePool)).start();
    }
}

class Producer extends Thread{
    private final List<Integer> producePool;
    Producer(List<Integer> producePool){
        this.producePool = producePool;
    }

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            synchronized (producePool){
                while(producePool.size() >= Main.MAX_SIZE){
                    try {
                        System.out.println("Producerd等待");
                        producePool.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("生产者" + Thread.currentThread().getId() + " 生产了第" + producePool.size() + "件产品");
                producePool.add(1);
                producePool.notifyAll();
            }
        }
    }
}

class Consumer extends Thread{
    private List<Integer> producePool;
    Consumer(List<Integer> producePool){
        this.producePool = producePool;
    }

    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            synchronized (producePool){
                while(producePool.size() <= 0){
                    try {
                        System.out.println("Consumer等待");
                        producePool.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费者 "+Thread.currentThread().getId() + " 消费了第" + producePool.size() + "件产品");
                producePool.remove(0);
                producePool.notifyAll();
            }
        }
    }
}
