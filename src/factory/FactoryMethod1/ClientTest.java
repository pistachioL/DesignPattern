package factory.FactoryMethod1;


public class ClientTest {
    public static void main(String[] args){
        ImageReader imageReader;
        ImageReaderFactory factory;
        factory = (ImageReaderFactory) XMLUtil.getFactoryBean();
        imageReader = factory.readImage();
        imageReader.readImage();

    }
}


