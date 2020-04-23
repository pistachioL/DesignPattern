package factory.FactoryMethod2;

public class clientTest {
    public static void main(String[] args){
        Logger log;
        LoggerFactory factory;
        factory = (LoggerFactory) XMLUtil.getFactoryBean();
        log = factory.createLogger();
        log.writeLog();
    }
}
