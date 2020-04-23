package decoratePattern.Coffee;

import decoratePattern.Coffee.decoratorImpl.Chocolate;
import decoratePattern.Coffee.decoratorImpl.Milk;

public class Client {
    public static void main(String[] args) {
        //2份巧克力＋１份牛奶的Longback

        //1.现有Longback
        Beverage order = new LongBlack();
        System.out.println("费用" + order.getPrice());
        System.out.println("描述"+order.getDes());

        //2.加入牛奶
        order = new Milk(order);
        System.out.println("加入一份牛奶的费用："+order.cost());
        System.out.println("加入一份牛奶的描述："+order.getDes());

        order = new Chocolate(order);
        System.out.println("加入一份巧克力的费用："+order.cost());
        System.out.println("加入一份巧克力的描述："+order.getDes());

        order = new Chocolate(order);
        System.out.println("加入2份巧克力的费用："+order.cost());
        System.out.println("加入2份巧克力的描述："+order.getDes());


    }
}
