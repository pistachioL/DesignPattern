package decoratePattern.phoneUpdate;

public class ClientTest {
    public static void main(String[] args) {
        Cellphone phone = null;
        System.out.println("------简单手机的功能------");
        Cellphone simple = new SimplePhone(phone);
        simple.receiveCall();

        System.out.println();
        System.out.println("------升级v1手机的功能------");
        Cellphone p2 = new JarPhone(simple);
        p2.receiveCall();

        System.out.println();
        System.out.println("------升级v2手机的功能------");
        Cellphone p3 = new ComplexPhone(p2);
        p3.receiveCall();


    }
}
