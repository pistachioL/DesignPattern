package factory.MyShape;

public class ClientTest {
    public static void main(String[] args) throws Exception {
        Shape shape;
        String name = XMLUtilShape.getShapeName();
        shape = ShapeFactory.createShape(name);
        shape.draw();
        shape.erase();
    }
}
