package Prototype1.deep;

import Prototype1.Address;

public class Customer implements Cloneable{
    public Address address;
    public Customer(Address address){
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Customer cus = (Customer)super.clone();
   //     cus.address = (Address)address.clone();
        cus.address = new Address("广州市天河区");
        return cus;
    }
}
