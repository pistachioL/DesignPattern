package factory.FactoryMethod2;

public class DatabaseLoggerFactory implements LoggerFactory {
    public Logger createLogger(){
        System.out.println("我是数据库日志工厂，能创建数据库日志");
        return new DatabaseLogger();
    }
}
