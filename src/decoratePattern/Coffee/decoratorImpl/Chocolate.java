package decoratePattern.Coffee.decoratorImpl;

import decoratePattern.Coffee.Beverage;
import decoratePattern.Coffee.Decorator;
//具体的装饰者（调味品）
public class Chocolate extends Decorator {
    public Chocolate(Beverage obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
