package decoratePattern.Coffee;

public class Coffee extends Beverage {  //囊括了多种单品咖啡

    @Override
    public float cost() {
        return super.getPrice();
    }
}
