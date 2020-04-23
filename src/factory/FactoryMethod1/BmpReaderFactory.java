package factory.FactoryMethod1;


public class BmpReaderFactory implements ImageReaderFactory {
    public ImageReader readImage() {
        System.out.println("Bmp工厂：我能读取Bmp图片的格式");
        return new BmpReader();
    }
}