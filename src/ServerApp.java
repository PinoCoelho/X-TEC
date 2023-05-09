import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
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
import java.util.List;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import javax.xml.xpath.*;


public class ServerApp {

    static BSTree.BinarySearchTree arbolAdmin = new BSTree.BinarySearchTree();
    static BSTree.BinarySearchTree arbolUser = new BSTree.BinarySearchTree();
    static AVLTree.AVLtree arbolPlatillos = new AVLTree.AVLtree();
    static AVLTree.AVLNode root = arbolPlatillos.root;
    static ListaEnlazada listaPlatillos = new ListaEnlazada();
    static Queue colaPedidos = new Queue();
    static int cantPedidos = 0;

    /**
     * La clase Info establece la informacion que se manejara
     */
    public static class Info {
        public int id;
        public String user;
        public String contra;

        /**
         * El metodo Info obtiene el valor de la informacion establecida
         * @param id
         * @param user
         * @param contra
         */
        public Info(int id, String user, String contra) {
            this.id = id;
            this.user = user;
            this.contra = contra;
        }
    }

    /**
     * La clase Platillo establece la informacion de los platillos
     */
    public static class Platillo {
        public int id;
        public String nombre;
        public String calorias;
        public String tiempo;
        public String precio;

        /**
         * El metodd Platillo obtiene el valor de la informacion establecida
         * @param id
         * @param nombre
         * @param calorias
         * @param tiempo
         * @param precio
         */
        public Platillo(int id, String nombre, String calorias, String tiempo, String precio) {
            this.id = id;
            this.nombre = nombre;
            this.calorias = calorias;
            this.tiempo = tiempo;
            this.precio = precio;
        }
    }

    static DocumentBuilderFactory factory;
    static DocumentBuilder builder;
    static Document docAdmin;
    static Document docUser;

    /**
     * El metodo iniciarXML inicializa y direcciona la informacion de los platillos al XML
     */
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

    /**
     * El metodo generateID crea un ID aleatorio
     * @param s
     * @return
     */
    public static int generateID(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            n = n + (int)ch - (int)'a' + 1;
        }
        return Math.abs(n);
    }

    /**
     * El metodo registrarAdmin registra la informacion de los administradores
     * @param user
     * @param contra
     * @throws Exception
     */
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

    /**
     * El metodo registrarUser registra la informacion de los clientes
     * @param user
     * @param contra
     * @throws Exception
     */
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

    /**
     * El metodo deleteAdmin Borra la informacion del administrador seleccionado
     * @param user
     * @throws Exception
     */
    public static void deleteAdmin(String user) throws Exception {
        int id = generateID(user);
        if (arbolAdmin.contains(id)) {
            arbolAdmin.delete(id);

            deleteXMLAdmin(Integer.toString(id), "Administradores.xml");
            formatXMLFile("Administradores.xml");

        }
    }

    /**
     * El metodo deleteUser borra la informacion del cliente seleccionado
     * @param user
     * @throws Exception
     */
    public static void deleteUser(String user) throws Exception {
        int id = generateID(user);
        if (arbolUser.contains(id)) {
            arbolUser.delete(id);

            deleteXMLUser(Integer.toString(id), "Clientes.xml");
            formatXMLFile("Clientes.xml");

        }
    }

    /**
     * El metodo editarAdmin modifica la informacion del administrador seleccionado
     * @param usuarioAdminEditar
     * @param newNombre
     * @param newContra
     * @throws Exception
     */
    public static void editarAdmin(String usuarioAdminEditar, String newNombre, String newContra) throws Exception {
        if (arbolAdmin.contains(generateID(usuarioAdminEditar))) {
            deleteAdmin(usuarioAdminEditar);
            if (newNombre == null && newContra != null) {
                registrarAdmin(usuarioAdminEditar, newContra);
                arbolAdmin.editPassword(generateID(usuarioAdminEditar), newContra);
            }
            else if (newNombre != null && newContra != null){
                registrarAdmin(newNombre, newContra);
                arbolAdmin.editPassword(generateID(usuarioAdminEditar), newContra);
                arbolAdmin.editUser(generateID(usuarioAdminEditar), generateID(newNombre), newNombre);
            }
            else {
                System.out.println("Se debe poner al menos una nueva contraseña, el nuevo nombre puede dejarse null");
            }
        }
        else {
            System.out.println("El administrador no esta registrado, recordarme quitar estos prints");
        }
    }

    /**
     * El metodo formatXMLFile formatea el archivo XML
     * @param file
     * @throws Exception
     */
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

    /**
     * El metodo removeEmptyTextXML remueve el XML vacio
     * @param doc
     * @throws XPathExpressionException
     */
    private static void removeEmptyTextXML(Document doc) throws XPathExpressionException {
        XPath xp = XPathFactory.newInstance().newXPath();
        NodeList nl = (NodeList) xp.evaluate("//text()[normalize-space(.)='']", doc, XPathConstants.NODESET);

        for (int i=0; i < nl.getLength(); ++i) {
            Node node = nl.item(i);
            node.getParentNode().removeChild(node);
        }
    }

    /**
     * El metodo deleteXMLAdmin elimina el XML de administradores
     * @param id
     * @param file
     * @throws Exception
     */
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
    /**
     * El metodo deleteXMLUser elimina el XML de clientes
     * @param id
     * @param file
     * @throws Exception
     */
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

    /**
     * El metodo validarUser valida la informacion ingrasada por los clientes
     * @param user
     * @param contra
     * @return
     */
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
    /**
     * El metodo validarAdmin valida la informacion ingrasada por los administradores
     * @param user
     * @param contra
     * @return
     */
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

    /**
     * El metodo getJsonFromFile lee el JSON
     * @param filename
     * @return
     */
    private static String getJsonFromFile(String filename) {
        String jsonText = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line + "\n";
            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonText;
    }

    /**
     * El Metodo iniciarJson inicializa el Json
     * @throws ParseException
     */
    public static void iniciarJson() throws ParseException {
        String strJson = getJsonFromFile("Platillos.json");
        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJson);
            JSONObject mainJsonObject = (JSONObject) object;

            JSONArray jsonArrayPlatillos = (JSONArray) mainJsonObject.get("platillos");

            for (int i = 0; i < jsonArrayPlatillos.size(); i++) {

                JSONObject jsonPlatillo = (JSONObject) jsonArrayPlatillos.get(i);

                String id = (String) jsonPlatillo.get("id");
                String nombre = (String) jsonPlatillo.get("nombre");
                String calorias = (String) jsonPlatillo.get("calorias");
                String tiempo = (String) jsonPlatillo.get("tiempo");
                String precio = (String) jsonPlatillo.get("precio");

                root = arbolPlatillos.insert(root, new Platillo(Integer.parseInt(id), nombre, calorias, tiempo, precio));
            }
        }
        catch (Exception exception) {
            System.out.println("Ha fallado");
        }

    }

    /**
     * El metodo deletePlatillo borra el platillo del JSON
     * @param nombrePlatillo
     */
    public static void deletePlatillo(String nombrePlatillo) {
        if (arbolPlatillos.contains(root, generateID(nombrePlatillo))) {
            int idPlatillo = generateID(nombrePlatillo);
            String strJson = getJsonFromFile("Platillos.json");
            try {
                JSONParser parser = new JSONParser();
                Object object = parser.parse(strJson);
                JSONObject mainJsonObject = (JSONObject) object;

                JSONArray jsonArrayPlatillos = (JSONArray) mainJsonObject.get("platillos");

                for (int i = 0; i < jsonArrayPlatillos.size(); i++) {

                    JSONObject jsonPlatillo = (JSONObject) jsonArrayPlatillos.get(i);
                    String id = (String) jsonPlatillo.get("id");

                    if (Integer.parseInt(id) == idPlatillo) {
                        jsonArrayPlatillos.remove(i);
                    }

                }
                FileWriter fileWriter = new FileWriter("Platillos.json");
                fileWriter.write(mainJsonObject.toString());
                fileWriter.close();
            } catch (Exception exception) {
                System.out.println("Ha fallado");
            }
        }
        else {
            System.out.println("El platillo no existe en el menu, recordarme quitar estos prints");
        }
    }

    /**
     * El metodo agregarPlatillo agrega el platillo al JSON
     * @param nombre
     * @param calorias
     * @param tiempo
     * @param precio
     */
    public static void agregarPlatillo(String nombre, String calorias, String tiempo, String precio) {
        if (!arbolPlatillos.contains(root, generateID(nombre))) {
            String strJson = getJsonFromFile("Platillos.json");
            try {
                JSONParser parser = new JSONParser();
                Object object = parser.parse(strJson);
                JSONObject mainJsonObject = (JSONObject) object;

                JSONArray jsonArrayPlatillos = (JSONArray) mainJsonObject.get("platillos");

                JSONObject infoPlatillo = new JSONObject();
                infoPlatillo.put("id", Integer.toString(generateID(nombre)));
                infoPlatillo.put("nombre", nombre);
                infoPlatillo.put("calorias", calorias);
                infoPlatillo.put("tiempo", tiempo);
                infoPlatillo.put("precio", precio);

                jsonArrayPlatillos.add(infoPlatillo);
                root = arbolPlatillos.insert(root, new Platillo(generateID(nombre), nombre, calorias, tiempo, precio));

                FileWriter fileWriter = new FileWriter("Platillos.json");
                fileWriter.write(mainJsonObject.toString());
                fileWriter.close();
            } catch (Exception exception) {
                System.out.println("Ha fallado");
            }
        }
        else {
            System.out.println("El platillo ya existe en el menu, recordarme quitar estos prints");
        }
    }

    /**
     * El metodo editarPlatillo modifica la informacion del platillo en el JSON
     * @param nombrePlatilloAEditar
     * @param newCalorias
     * @param newTiempo
     * @param newPrecio
     */
    public static void editarPlatillo(String nombrePlatilloAEditar, String newCalorias, String newTiempo, String newPrecio) {
        if (arbolPlatillos.contains(root, generateID(nombrePlatilloAEditar))) {
            String strJson = getJsonFromFile("Platillos.json");
            try {
                JSONParser parser = new JSONParser();
                Object object = parser.parse(strJson);
                JSONObject mainJsonObject = (JSONObject) object;

                JSONArray jsonArrayPlatillos = (JSONArray) mainJsonObject.get("platillos");

                for (int i = 0; i < jsonArrayPlatillos.size(); i++) {

                    JSONObject jsonPlatillo = (JSONObject) jsonArrayPlatillos.get(i);

                    if (jsonPlatillo.get("id").equals(Integer.toString((generateID(nombrePlatilloAEditar))))) { // se puede decidir el momento de hacerlo cuando va por un indice especifico
                        if (newCalorias != null) {
                            jsonPlatillo.put("calorias", newCalorias);
                            arbolPlatillos.editCalorias(root, generateID(nombrePlatilloAEditar), newCalorias);
                        }
                        if (newTiempo != null) {
                            jsonPlatillo.put("tiempo", newTiempo);
                            arbolPlatillos.editTiempo(root, generateID(nombrePlatilloAEditar), newTiempo);
                        }
                        if (newPrecio != null) {
                            jsonPlatillo.put("precio", newPrecio);
                            arbolPlatillos.editPrecio(root, generateID(nombrePlatilloAEditar), newPrecio);
                        }
                    }

                }
                FileWriter fileWriter = new FileWriter("Platillos.json");
                fileWriter.write(mainJsonObject.toString());
                fileWriter.close();
            } catch (Exception exception) {
                System.out.println("Ha fallado");
            }
        }
        else {
            System.out.println("El platillo a editar no existe en el menu");
        }
    }

    /**
     * El metodo agregarPlatilloAPedido agrega el platillo al pedido en curso
     * @param nombrePlatillo
     * @return mensaje
     */
    public static String agregarPlatilloAPedido(String nombrePlatillo) {
        if (arbolPlatillos.contains(root, generateID(nombrePlatillo))) {
            listaPlatillos.insertFirst(arbolPlatillos.getPlatillo(root, generateID(nombrePlatillo)));
            return "Se ha agregado el platillo";
        }
        else {
            return "Ese platillo no se encuentra en el menu";
        }
    }

    /**
     * El metodo eliminarPedido elimina el pedido en curso
     * @return Mensaje
     */
    public static String eliminarPedido() {
        listaPlatillos.empty();
        listaPlatillos.resetSize();
        return "Se ha eliminado el pedido actual";
    }

    /**
     * El metodo realizarPedido concreta el pedido en curso
     * @return mensaje
     */
    public static String realizarPedido() {
        if (cantPedidos<9) {
            colaPedidos.enqueue(new ListaEnlazada().copy(listaPlatillos));
            cantPedidos++;
            listaPlatillos.empty();
            listaPlatillos.resetSize();
            return "Se ha realizado el pedido";
        }
        else {
            return "Se ha llegado a la cantidad maxima de pedidos";
        }
    }

    /**
     * El metodo getPlatillosEnPedido obtiene los platillo que fueron incluidos al pedido
     * @return str
     */
    public static String getPlatillosEnPedido() {
        int i = 0;
        String str = "Platillos en el pedido: \n\n";
        while (listaPlatillos.size() > i) {
            str = str + listaPlatillos.get(i).nombre;
            str = str + "\n";
            i++;
        }
        return str;
    }

    /**
     * El metodo getPlatillosEnColaPedidos obtiene los platillos en la cola de pedidos
     * @return str
     */
    public static String getPlatillosEnColaPedidos() {
        int i = 0;
        int j = 0;
        String str = "";
        while (colaPedidos.size() > i) {
            str = str + "Pedido " + Integer.toString(i+1) + "\n\n";
            while (colaPedidos.get(i).size() > j) {;
                str = str + "Platillo " + Integer.toString(j+1) + "\n";
                str = str + "Nombre: " + colaPedidos.get(i).get(j).nombre + "\n";
                str = str + "Calorias: " + colaPedidos.get(i).get(j).calorias + "\n";
                str = str + "Tiempo: " + colaPedidos.get(i).get(j).tiempo + "\n";
                str = str + "Precio: " + colaPedidos.get(i).get(j).precio + "\n";
                str = str + "\n";
                j++;
            }
            str = str + "\n";
            i++;
            j = 0;
        }
        return str;
    }

}
