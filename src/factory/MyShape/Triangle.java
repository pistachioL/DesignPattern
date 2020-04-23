package factory.MyShape;

public class Triangle implements Shape {
    public void draw(){
        System.out.println("能画三角形！");
    }
    public void erase(){
        System.out.println("能把三角形擦掉！");
    }

}
