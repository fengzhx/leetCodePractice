package designParttern.builder;

public class Worker implements Builder {
    private Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    public Builder buildA(String s) {
        product.setBuildA(s);
        return this;
    }

    @Override
    public Builder buildB(String s) {
        product.setBuildB(s);
        return this;
    }

    @Override
    public Builder buildC(String s) {
        product.setBuildC(s);
        return this;
    }

    @Override
    public Builder buildD(String s) {
        product.setBuildD(s);
        return this;
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
