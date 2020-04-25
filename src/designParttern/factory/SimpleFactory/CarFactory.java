package designParttern.factory.SimpleFactory;

public class CarFactory {
    public static Car getCar(Integer type) {
        switch (type) {
            case 1:
                return new Wuling();
            default:
                return null;
        }
    }
}
