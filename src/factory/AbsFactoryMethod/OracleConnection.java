package factory.AbsFactoryMethod;

public class OracleConnection extends Connection {
    public void getConnection(){
        System.out.println("负责连接Oracle数据库");
    }
}
