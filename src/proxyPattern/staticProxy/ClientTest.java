package proxyPattern.staticProxy;

public class ClientTest {
    public static void main(String[] args) {
        BusinessClass businessObj = new BusinessClass();

        LoggerProxy proxy = new LoggerProxy(businessObj);
        proxy.method();
    }
}
