package chapter1.third;

public class Main {
    public static void main(String[] args) {

    }
}

class PrintA extends Thread{
    @Override
    public void run() {
        System.out.println("A");
    }
}

class PrintB extends Thread{
    @Override
    public void run() {
        System.out.println("B");
    }
}

class PrintC extends Thread{
    @Override
    public void run() {
        System.out.println("C");
    }
}