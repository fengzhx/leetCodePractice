package designParttern.bridge;

public class Laptop implements Computer{
    private Brand brand;

    Laptop(Brand brand){
        this.brand = brand;
    }

    @Override
    public void sayInfo() {
        brand.info();
        System.out.println("笔记本");
    }
}
