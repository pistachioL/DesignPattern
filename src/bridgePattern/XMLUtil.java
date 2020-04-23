package bridgePattern;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

public class XMLUtil {
    public static Object getBean(String applianceMaker) {
        Node classNode = null;
        String maker;
        Object obj = null;
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("ApplianceConfig.xml"));

            NodeList nodeList = doc.getElementsByTagName("ApplianceMaker");

            if(applianceMaker.equalsIgnoreCase("Hair")){
                classNode = (Node) nodeList.item(0).getChildNodes();
            }
            else if(applianceMaker.equalsIgnoreCase("TCL")){
                classNode = (Node) nodeList.item(1).getChildNodes();
            }
            else if(applianceMaker.equalsIgnoreCase("Hisense")){
                classNode = (Node) nodeList.item(2).getChildNodes();
            }
            maker = classNode.getNodeValue();
            Class c = Class.forName(maker);
            obj = c.newInstance();



        } catch (IOException | ParserConfigurationException | SAXException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
