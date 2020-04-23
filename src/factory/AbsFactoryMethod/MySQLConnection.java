package factory.AbsFactoryMethod;

public class MySQLConnection extends Connection {
    public void getConnection(){
        System.out.println("连接MySQL的数据库");
    }
}
