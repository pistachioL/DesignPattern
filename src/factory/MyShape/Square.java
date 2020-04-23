package factory.MyShape;

public class Square implements Shape {
    public void draw(){
        System.out.println("能画方形！");
    }
    public void erase(){
        System.out.println("能把方形擦掉！");
    }

}
