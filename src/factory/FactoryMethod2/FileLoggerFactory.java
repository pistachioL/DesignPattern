package factory.FactoryMethod2;

public class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        System.out.println("我是文件日志工厂，创建文件日志");
        return new FileLogger();
    }

}
