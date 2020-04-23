package factory.FactoryMethod2;

public class FileLogger implements Logger{
    public void writeLog(){
        System.out.println("我是文件日志，我能记录文件的日志");
    }
}
