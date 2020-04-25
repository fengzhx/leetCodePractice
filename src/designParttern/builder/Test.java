package designParttern.builder;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.buildA("全家桶");
        System.out.println(worker.getProduct().toString());
    }
}
