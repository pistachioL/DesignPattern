package factory.MyShape;

public class ShapeFactory{
    public static Shape createShape(String name) throws Exception{
        if(name.equalsIgnoreCase("Circle")){
            System.out.println("图形工厂创建圆形");
            return new Circle();
        }
        else if(name.equalsIgnoreCase("Triangle")){
            System.out.println("图形工厂创建三角形");
            return new Triangle();
        }
        else if(name.equalsIgnoreCase("Square")){
            System.out.println("图形工厂创建方形");
            return new Square();
        }
        else{
            throw new Exception("不能创建该图形！");
        }
    }
}