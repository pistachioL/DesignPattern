package factory.FactoryMethod1;

public class GifReaderFactory implements ImageReaderFactory {
    public ImageReader readImage(){
        System.out.println("Gif工厂：我能读取.giｆ格式的图片");
        return new GifReader();
    }

}
