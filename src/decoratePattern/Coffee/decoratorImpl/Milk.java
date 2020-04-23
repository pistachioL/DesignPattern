package decoratePattern.Coffee.decoratorImpl;

import decoratePattern.Coffee.Beverage;
import decoratePattern.Coffee.Decorator;

public class Milk extends Decorator {
    public Milk(Beverage obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
