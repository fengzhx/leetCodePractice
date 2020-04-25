package designParttern.adapter;

public class Adapter implements NetToUsb{
    private Adaptee adaptee;
    Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void netToUsb() {
        adaptee.net();
    }
}
