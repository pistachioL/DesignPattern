package Prototype1.shadow;

public class ClientTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Customer cus = new Customer();
        Customer copyCus = (Customer) cus.clone();
        System.out.println("copyCus == cus");
        System.out.println(copyCus == cus);
        System.out.println("copyCus.getAddress() == cus.getAddress()?");
        System.out.println(copyCus.getAddress() == cus.getAddress());

    }
}
