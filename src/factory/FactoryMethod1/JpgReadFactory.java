package factory.FactoryMethod1;

public class JpgReadFactory implements ImageReaderFactory {
    public ImageReader readImage() {
        System.out.println("Jpg工厂：我能读取.jpg格式的图片");
        return new JpgReader();
    }
}
