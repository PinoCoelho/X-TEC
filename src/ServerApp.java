import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import javax.xml.xpath.*;

public class ServerApp {

    static BSTree.BinarySearchTree arbolAdmin = new BSTree.BinarySearchTree();
    static BSTree.BinarySearchTree arbolUser = new BSTree.BinarySearchTree();

    public static class Info {
        public int id;
        public String user;
        public String contra;

        public Info(int id, String user, String contra) {
            this.id = id;
            this.user = user;
            this.contra = contra;
        }
    }

    static DocumentBuilderFactory factory;
    static DocumentBuilder builder;
    static Document docAdmin;
    static Document docUser;

    public static void iniciarXML() {
        factory = DocumentBuilderFactory.newInstance();
        try {

            builder = factory.newDocumentBuilder();

            // Obtener documento
            docAdmin = builder.parse(new File("Administradores.xml"));
            docUser = builder.parse(new File("Clientes.xml"));

            // Normalizar la estructura de XML
            docAdmin.getDocumentElement().normalize();
            docUser.getDocumentElement().normalize();

            NodeList Admins = docAdmin.getElementsByTagName("Admin");
            NodeList Users = docUser.getElementsByTagName("Cliente");

            int tempid = 0;
            String tempuser = null;
            String tempcontra = null;

            for (int i=0; i<Admins.getLength(); i++) {
                Node Admin = Admins.item(i);

                if (Admin.getNodeType() == Node.ELEMENT_NODE) {

                    Element AdminElement = (Element) Admin;

                    NodeList AdminInfo = Admin.getChildNodes();
                    for (int j=0; j<AdminInfo.getLength(); j++) {
                        Node Info = AdminInfo.item(j);
                        if (Info.getNodeType() == Node.ELEMENT_NODE) {
                            // Aqui se añade la informacion al arbol
                            Element InfoElement = (Element) Info;
                            if (j == 1) {
                                tempid = Integer.parseInt(InfoElement.getTextContent());
                            }
                            else if (j == 3) {
                                tempuser = InfoElement.getTextContent();
                            }
                            else if (j == 5) {
                                tempcontra = InfoElement.getTextContent();
                            }
                        }

                    }
                    arbolAdmin.insert(new Info(tempid, tempuser, tempcontra));

                }

            }

            for (int i=0; i<Users.getLength(); i++) {
                Node User = Users.item(i);

                if (User.getNodeType() == Node.ELEMENT_NODE) {

                    Element UserElement = (Element) User;

                    NodeList UserInfo = User.getChildNodes();
                    for (int j=0; j<UserInfo.getLength(); j++) {
                        Node Info = UserInfo.item(j);
                        if (Info.getNodeType() == Node.ELEMENT_NODE) {
                            // Aqui se añade la informacion al arbol
                            Element InfoElement = (Element) Info;
                            if (j == 1) {
                                tempid = Integer.parseInt(InfoElement.getTextContent());
                            }
                            else if (j == 3) {
                                tempuser = InfoElement.getTextContent();
                            }
                            else if (j == 5) {
                                tempcontra = InfoElement.getTextContent();
                            }
                        }

                    }
                    arbolUser.insert(new Info(tempid, tempuser, tempcontra));

                }

            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
    }

    public static int generateID(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            n = n + (int)ch - (int)'a' + 1;
        }
        return Math.abs(n);
    }

    public static void registrarAdmin(String user, String contra) throws Exception {
        int id = generateID(user);
        if (!arbolAdmin.contains(id)) {
            arbolAdmin.insert(new Info(id, user, contra));
            Element documentElement = docAdmin.getDocumentElement();

            Element textNode = docAdmin.createElement("id");
            textNode.setTextContent(Integer.toString(id));

            Element textNode1 = docAdmin.createElement("Usuario");
            textNode1.setTextContent(user);

            Element textNode2 = docAdmin.createElement("Contra");
            textNode2.setTextContent(contra);

            Element nodeElement = docAdmin.createElement("Admin");

            nodeElement.appendChild(textNode);
            nodeElement.appendChild(textNode1);
            nodeElement.appendChild(textNode2);
            documentElement.appendChild(nodeElement);

            docAdmin.replaceChild(documentElement, documentElement);
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            Source source = new DOMSource(docAdmin);
            Result result = new StreamResult("Administradores.xml");
            transformer.transform(source, result);

            formatXMLFile("Administradores.xml");
        }
        else {
            System.out.println("El admin ya estaba registrado, recordarme quitar estos prints");
        }
    }

    public static void registrarUser(String user, String contra) throws Exception {
        int id = generateID(user);
        if (!arbolAdmin.contains(id)) {
            if (!arbolUser.contains(id)) {
                arbolUser.insert(new Info(id, user, contra));
                Element documentElement = docUser.getDocumentElement();

                Element textNode = docUser.createElement("id");
                textNode.setTextContent(Integer.toString(id));

                Element textNode1 = docUser.createElement("Usuario");
                textNode1.setTextContent(user);

                Element textNode2 = docUser.createElement("Contra");
                textNode2.setTextContent(contra);

                Element nodeElement = docUser.createElement("Cliente");

                nodeElement.appendChild(textNode);
                nodeElement.appendChild(textNode1);
                nodeElement.appendChild(textNode2);
                documentElement.appendChild(nodeElement);

                docUser.replaceChild(documentElement, documentElement);
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.setOutputProperty(OutputKeys.METHOD, "xml");
                Source source = new DOMSource(docUser);
                Result result = new StreamResult("Clientes.xml");
                transformer.transform(source, result);

                formatXMLFile("Clientes.xml");
            }
            else {
                System.out.println("El usuario ya estaba registrado, recordarme quitar estos prints");
            }
        }
        else {
            System.out.println("La persona que se intenta registrar ya es admin, recordarme quitar estos prints");
        }
    }

    public static void deleteAdmin(String user) throws Exception {
        int id = generateID(user);
        if (arbolAdmin.contains(id)) {
            arbolAdmin.delete(id);

            deleteXMLAdmin(Integer.toString(id), "Administradores.xml");
            formatXMLFile("Administradores.xml");

        }
    }

    public static void deleteUser(String user) throws Exception {
        int id = generateID(user);
        if (arbolUser.contains(id)) {
            arbolUser.delete(id);

            deleteXMLUser(Integer.toString(id), "Clientes.xml");
            formatXMLFile("Clientes.xml");

        }
    }

    private static void formatXMLFile(String file) throws Exception{
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new InputStreamReader(new FileInputStream(file))));

        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        removeEmptyTextXML(document);
        Source source = new DOMSource(document);
        Result result = new StreamResult(new File(file));
        transformer.transform(source, result);
    }

    private static void removeEmptyTextXML(Document doc) throws XPathExpressionException {
        XPath xp = XPathFactory.newInstance().newXPath();
        NodeList nl = (NodeList) xp.evaluate("//text()[normalize-space(.)='']", doc, XPathConstants.NODESET);

        for (int i=0; i < nl.getLength(); ++i) {
            Node node = nl.item(i);
            node.getParentNode().removeChild(node);
        }
    }

    private static void deleteXMLAdmin(String id, String file) throws Exception {
        Element element = docAdmin.getDocumentElement();
        NodeList Admins = element.getElementsByTagName("Admin");
        for (int i=0; i<Admins.getLength(); i++) {
            Node Admin = Admins.item(i);
            if (Admin.getNodeType() == Node.ELEMENT_NODE) {

                Element AdminElement = (Element) Admin;

                NodeList AdminInfo = Admin.getChildNodes();
                for (int j = 0; j < AdminInfo.getLength(); j++) {
                    Node Info = AdminInfo.item(j);
                    if (Info.getNodeType() == Node.ELEMENT_NODE) {
                        // Aqui se añade la informacion al arbol
                        Element InfoElement = (Element) Info;
                        if (InfoElement.getTextContent().equals(id)) {
                            element.removeChild(Admin);
                        }
                    }
                }
            }
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource domsource = new DOMSource(docAdmin);
        StreamResult result = new StreamResult(new File(file));
        transformer.transform(domsource, result);
    }

    private static void deleteXMLUser(String id, String file) throws Exception {
        Element element = docUser.getDocumentElement();
        NodeList Users = element.getElementsByTagName("Cliente");
        for (int i=0; i<Users.getLength(); i++) {
            Node User = Users.item(i);
            if (User.getNodeType() == Node.ELEMENT_NODE) {

                Element UserElement = (Element) User;

                NodeList UserInfo = User.getChildNodes();
                for (int j = 0; j < UserInfo.getLength(); j++) {
                    Node Info = UserInfo.item(j);
                    if (Info.getNodeType() == Node.ELEMENT_NODE) {
                        // Aqui se añade la informacion al arbol
                        Element InfoElement = (Element) Info;
                        if (InfoElement.getTextContent().equals(id)) {
                            element.removeChild(User);
                        }
                    }
                }
            }
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource domsource = new DOMSource(docUser);
        StreamResult result = new StreamResult(new File(file));
        transformer.transform(domsource, result);
    }

    public static boolean validarUser(String user, String contra) {
        int tempid = generateID(user);
        if (arbolUser.contains(tempid)) {
            if (arbolUser.getUser(tempid).equals(user) && arbolUser.getPassword(tempid).equals(contra)) {
                return true;
            }
            else {
                System.out.println("La contraseña o usuario es incorrecta, recordarme quitar estos prints");
                return false;
            }
        }
        else {
            System.out.println("El usuario no esta registrado, recordarme quitar estos prints");
            return false;
        }
    }

    public static boolean validarAdmin(String user, String contra) {
        int tempid = generateID(user);
        if (arbolAdmin.contains(tempid)) {
            if (arbolAdmin.getUser(tempid).equals(user) && arbolAdmin.getPassword(tempid).equals(contra)) {
                return true;
            }
            else {
                System.out.println("La contraseña es incorrecta, recordarme quitar estos prints");
                return false;
            }
        }
        else {
            System.out.println("El admin no esta registrado, recordarme quitar estos prints");
            return false;
        }
    }

}
