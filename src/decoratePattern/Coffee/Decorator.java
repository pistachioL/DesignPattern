package decoratePattern.Coffee;

public class Decorator extends Beverage {
    private Beverage obj;

    public Decorator(Beverage obj) { //体现组合关系
        this.obj = obj;
    }

    @Override
    public float cost() {  //统计累加起来的总花费
        return super.getPrice() + obj.cost(); // 调料价格+单品咖啡
    }

    @Override
    public String getDes() { //this 指的是父类的对象
        return this.des + " " + this.getPrice() + "&&" + obj.getDes();  //装饰者（调料）的描述＋装饰着的价格+被装饰着的描述
    }
}
