package factory.FactoryMethod2;

public class DatabaseLogger implements Logger {
    public void writeLog(){
        System.out.println("我是数据库日志，能记录数据库日志");
    }
}
