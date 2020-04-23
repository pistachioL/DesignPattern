package proxyPattern.dynamicProxy;

public class ClientTest {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();
        System.out.println("生成了代理对象："+ proxyInstance);
        proxyInstance.teach();
    }
}
