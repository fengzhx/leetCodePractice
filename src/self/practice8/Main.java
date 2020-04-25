package self.practice8;

//实现简单工厂模式
public class Main {
    public static void main(String[] args) {
        String slogan = new BENZ().getSlogan();
        System.out.println(slogan);
    }

}

enum ECarType {
    BWM,
    BENZ;
}

abstract class CCar{
    private String wheel;
    abstract CCar getCar();
}


class BMW extends CCar{
    private String Slogan = "BMW";

    public String getSlogan() {
        return Slogan;
    }

    public void setSlogan(String slogan) {
        Slogan = slogan;
    }

    @Override
    public CCar getCar() {
        return new BMW();
    }
}

class BENZ extends CCar{
    private String Slogan = "BENZ";

    public String getSlogan() {
        return Slogan;
    }

    public void setSlogan(String slogan) {
        Slogan = slogan;
    }

    @Override
    public CCar getCar() {
        return new BENZ();
    }
}
