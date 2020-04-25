package designParttern.builder;

//建造者
public interface Builder {
    Builder buildA(String s); //汉堡
    Builder buildB(String s); //薯条
    Builder buildC(String s); //可乐
    Builder buildD(String s); //甜品

    Product getProduct();


}
