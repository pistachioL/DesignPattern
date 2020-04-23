package factory.FactoryMethod1;

public class JpgReader implements ImageReader{
    public ImageReader readImage(){
        System.out.println("JpgReader:我是.jpg读取器");
        return new JpgReader();
    }
}
