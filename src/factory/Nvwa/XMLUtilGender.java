package factory.Nvwa;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;

public class XMLUtilGender {
    public static String getGender(){
        String gender = null;
        try{
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("PersonFactoryConfig.xml"));

            NodeList nodeList = doc.getElementsByTagName("gender");
            Node classNode = nodeList.item(0).getFirstChild();
            gender = classNode.getNodeValue().trim();
            return gender;

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gender;
    }
}
