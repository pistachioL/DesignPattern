package factory.MyShape;

public class Circle implements Shape {
    public void draw(){
        System.out.println("能画圆形！");
    }
    public void erase(){
        System.out.println("能把圆形擦掉！");
    }

}
