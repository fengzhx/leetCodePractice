package self.practice6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//一个接一个打印
public class Main {
    public static void main(String[] args) {
        OneByOnePrint oneByOnePrint = new OneByOnePrint();
        new Thread(){
            @Override
            public void run() {
                oneByOnePrint.printA();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                oneByOnePrint.printB();
            }
        }.start();

    }
}


class OneByOnePrint{
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean flag = false;

    public void printA(){
        while (true){
            try{
                lock.lock();
                while(flag){
                    condition.await();
                }
                System.out.println("A");
                flag = true;
                condition.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }

    public void printB(){
        while (true){
            try{
                lock.lock();
                while(!flag){
                    condition.await();
                }
                flag = false;
                System.out.println("B");
                condition.signal();
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
}