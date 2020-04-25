package designParttern.factory.SimpleFactory;

public class Service {
    public static void main(String[] args) {
        Car car = CarFactory.getCar(1);
        car.getName();
    }
}
