package decoratePattern.Coffee;

public abstract class Beverage { //饮料
    public String des;
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    //由子类实现
    public abstract float cost();

}
