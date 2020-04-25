package designParttern.adapter;

public class Computer {
    public void net(NetToUsb netToUsb){
        netToUsb.netToUsb();
    }

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        Computer computer = new Computer();
        computer.net(adapter);
    }
}
