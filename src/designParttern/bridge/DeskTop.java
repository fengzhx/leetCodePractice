package designParttern.bridge;

public class DeskTop implements Computer{

    private Brand brand;

    DeskTop(Brand brand){
        this.brand = brand;
    }

    @Override
    public void sayInfo() {
        brand.info();
        System.out.println("台式机");
    }
}
