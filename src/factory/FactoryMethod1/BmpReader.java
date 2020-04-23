package factory.FactoryMethod1;

public class BmpReader implements ImageReader{
    public ImageReader readImage(){
        System.out.println("BmpReader:我能读取Bmp格式的图片");
        return new BmpReader();
    }
}
