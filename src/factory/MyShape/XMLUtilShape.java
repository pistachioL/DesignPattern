package factory.MyShape;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;


public class XMLUtilShape {
    public static String getShapeName(){
        String shapeName = null;
        try{
            //读取配置文件
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("ShapeFactoryConfig.xml"));

            //获取文本节点
            NodeList nodeList = doc.getElementsByTagName("shapeName");
            Node classNode = nodeList.item(0).getFirstChild();
            shapeName = classNode.getNodeValue().trim();
            return shapeName;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return shapeName;
    }
}

