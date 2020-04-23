package factory.FactoryMethod1;

public class GifReader implements ImageReader {
    public ImageReader readImage(){
        System.out.println("GifReader：我是gif读取器");
        return new GifReader();
    }
}
