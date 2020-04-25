package designParttern.bridge;

public class Test {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Laptop laptop = new Laptop(apple);
        laptop.sayInfo();
    }
}
