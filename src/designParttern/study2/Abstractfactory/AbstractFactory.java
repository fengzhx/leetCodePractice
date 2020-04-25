package designParttern.study2.Abstractfactory;

//抽象工厂模式（定义一套标准）
//提供一个创建一系列相关或互相依赖对象的接口，而无需指定他们具体地类
public class AbstractFactory {
    public static void main(String[] args) {
        DatabaseUtil databaseUtil = new MySQLDatabaseUtil();
        IConnection connection = databaseUtil.getConnection();
        connection.connect();
        IClose close = databaseUtil.getClose();
        close.close();

    }
}


interface IConnection{
    void connect();
}

interface IClose{
    void close();
}

interface DatabaseUtil{
    IConnection getConnection();
    IClose getClose();
}

class MySQLConnection implements IConnection{

    @Override
    public void connect() {
        System.out.println("mysql connect");
    }
}

class MySQLClose implements IClose{

    @Override
    public void close() {
        System.out.println("mysql close");
    }
}

class MySQLDatabaseUtil implements DatabaseUtil{

    @Override
    public IConnection getConnection() {
        return new MySQLConnection();
    }

    @Override
    public IClose getClose() {
        return new MySQLClose();
    }
}