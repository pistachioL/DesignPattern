package Prototype1.deep;

import Prototype1.Address;

public class ClientTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("广州市天河区");
        Customer customer = new Customer(addr);
        Customer copyCustomer = (Customer)customer.clone();
        System.out.println("customer.address == copyCustomer.address?");
        System.out.println(customer.address == copyCustomer.address);


    }
}
