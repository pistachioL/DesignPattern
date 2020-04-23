package decoratePattern.Coffee.decoratorImpl;

import decoratePattern.Coffee.Beverage;
import decoratePattern.Coffee.Decorator;

public class Soy extends Decorator {

    public Soy(Beverage obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
