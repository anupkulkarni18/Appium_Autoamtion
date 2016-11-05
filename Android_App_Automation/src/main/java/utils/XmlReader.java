package utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by CHITTU on 29-Oct-16.
 */
public class XmlReader {

    public static void readXmlFile(String xmlfileName) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File(xmlfileName));

        NodeList nodeList = document.getElementsByTagName("element");
        System.out.println(">>>>>>>>>> " + nodeList.getLength());

        for (int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);

            System.out.println("get element val "+node.getNodeType());
            System.out.println("get element node "+ Node.ELEMENT_NODE);
//            for (node.getNodeType() == Node.ELEMENT_NODE){
//
////                Element ele =
//
//            }

        }
    }
    public static void main(String[] args) throws Exception {
        readXmlFile("D:\\SGBL_Android_Automation\\src\\objectrepo\\Login_Page.xml");
    }
}
