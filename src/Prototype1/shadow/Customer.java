package Prototype1.shadow;

import Prototype1.Address;
import org.w3c.dom.css.CSSUnknownRule;
import sun.util.resources.cldr.chr.CalendarData_chr_US;

public class Customer implements Cloneable{
    private Address address;
    public Customer(){
        this.address = new Address("广州市越秀区");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Customer cus = (Customer) super.clone();
        return cus;
    }
    public Address getAddress(){
        return address;
    }
}
