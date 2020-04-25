package self.practice5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//三个线程各自负责打印a/b/c，实现循环打印"a","b","c"100次
public class Main {
    public static void main(String[] args) {
        MyServer myServer = new MyServer();
        new Thread(()->{myServer.methodA();}).start();
        new Thread(()->{myServer.methodB();}).start();
        new Thread(()->{myServer.methodC();}).start();

    }

}


class MyServer{
    private Lock lock  = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private Condition conditionC = lock.newCondition();
    private int a = 1;
    public void methodA(){
        int n = 0;
        while(n<100){
            try {
                lock.lock();
                while(a != 1){
                    conditionA.await();
                }
                System.out.println("A");
                a = 2;
                conditionB.signal();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
            n++;
        }
    }

    public void methodB(){
        int n = 0;
        while(n<100){
            try {
                lock.lock();
                while(a != 2){
                    conditionB.await();
                }
                System.out.println("B");
                a = 3;
                conditionC.signal();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
            n++;
        }
    }

    public void methodC(){
        int n = 0;
        while(n<100){
            try {
                lock.lock();
                while(a != 3){
                    conditionC.await();
                }
                a = 1;
                System.out.println("C");
                conditionA.signal();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
            n++;
        }
    }
}