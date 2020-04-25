package self.practice7;

//实现一个抽象工厂模式
//简易的JDBC接口
public class Main {
    public static void main(String[] args) {
        IDataBaseUtil iDataBaseUtil = new MysqlUtil();
        iDataBaseUtil.getConnection().connection();
        iDataBaseUtil.getClose().close();
    }

}

interface IConnection{
    void connection();
}

interface IClose{
    void close();
}

interface IDataBaseUtil{
    IConnection getConnection();
    IClose getClose();
}

class MySqlConnection implements IConnection{

    @Override
    public void connection() {
        System.out.println("mysql连接上");
    }
}

class MySqlClose implements IClose{

    @Override
    public void close() {
        System.out.println("mysqlClose");
    }
}

class MysqlUtil implements IDataBaseUtil{

    @Override
    public IConnection getConnection() {
        return new MySqlConnection();
    }

    @Override
    public IClose getClose() {
        return new MySqlClose();
    }
}
