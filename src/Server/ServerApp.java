package Server;

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
import java.util.Timer;
import java.util.TimerTask;
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
    static int counterPedidoActual = 0;
    static int counterPedidoTotal = 0;
    static boolean pedidoEnProceso = false;
    static boolean timerIniciado = false;
    static boolean counterActualizado = false;

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

    public static class Platillo {
        public int id;
        public String nombre;
        public String calorias;
        public String tiempo;
        public String precio;

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

    public static void iniciarXML() {
        factory = DocumentBuilderFactory.newInstance();
        try {

            builder = factory.newDocumentBuilder();

            // Obtener documento
            docAdmin = builder.parse(new File("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Administradores.xml"));
            docUser = builder.parse(new File("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Clientes.xml"));

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

    public static String registrarAdmin(String user, String contra) throws Exception {
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
            Result result = new StreamResult("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Administradores.xml");
            transformer.transform(source, result);

            formatXMLFile("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Administradores.xml");
            return "El administrador ha sido registrado";
        }
        else {
            return "El administrador ya estaba registrado";
        }
    }

    public static String registrarUser(String user, String contra) throws Exception {
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
                Result result = new StreamResult("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Clientes.xml");
                transformer.transform(source, result);

                formatXMLFile("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Clientes.xml");
                return "El usuario ha sido registrado";
            }
            else {
                return "El usuario ya estaba registrado";
            }
        }
        else {
            return "La persona que se intenta registrar ya es admin";
        }
    }

    public static String deleteAdmin(String user) throws Exception {
        int id = generateID(user);
        if (arbolAdmin.size > 1) {
            if (arbolAdmin.contains(id)) {
                arbolAdmin.delete(id);

                deleteXMLAdmin(Integer.toString(id), "C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Administradores.xml");
                formatXMLFile("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Administradores.xml");

                return "El administrador " + user + " ha sido borrado";

            } else {
                return "El administrador no existe";
            }
        }
        else {
            return "Debe haber minimo 1 administrador";
        }
    }

    public static String deleteAdminEdit(String user) throws Exception {
        int id = generateID(user);
        if (arbolAdmin.contains(id)) {
            arbolAdmin.delete(id);

            deleteXMLAdmin(Integer.toString(id), "C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Administradores.xml");
            formatXMLFile("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Administradores.xml");

            return "El administrador " + user + " ha sido borrado";

        } else {
            return "El administrador no existe";
        }
    }

    public static String deleteUser(String user) throws Exception {
        int id = generateID(user);
        if (arbolUser.contains(id)) {
            arbolUser.delete(id);

            deleteXMLUser(Integer.toString(id), "C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Clientes.xml");
            formatXMLFile("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Clientes.xml");

            return "El usuario ha sido eliminado";

        }
        else {
            return "El usuario no existe";
        }
    }

    public static String editarAdmin(String usuarioAdminEditar, String newNombre, String newContra) throws Exception {
        if (arbolAdmin.contains(generateID(usuarioAdminEditar))) {
            if (newNombre.equals("") && !newContra.equals("")) {
                deleteAdminEdit(usuarioAdminEditar);
                registrarAdmin(usuarioAdminEditar, newContra);
                arbolAdmin.editPassword(generateID(usuarioAdminEditar), newContra);
                return "El administrador ha sido editado";
            }
            else if (!newNombre.equals("") && !newContra.equals("")){
                deleteAdminEdit(usuarioAdminEditar);
                registrarAdmin(newNombre, newContra);
                arbolAdmin.editPassword(generateID(usuarioAdminEditar), newContra);
                arbolAdmin.editUser(generateID(usuarioAdminEditar), generateID(newNombre), newNombre);
                return "El administrador ha sido editado";
            }
            else {
                return "Se debe una nueva contraseña";
            }
        }
        else {
            return "El administrador no esta registrado";
        }
    }

    public static String editarUser(String usuarioUserEditar, String newNombre, String newContra) throws Exception {
        if (arbolUser.contains(generateID(usuarioUserEditar))) {
            if (newNombre.equals("") && !newContra.equals("")) {
                deleteUser(usuarioUserEditar);
                registrarUser(usuarioUserEditar, newContra);
                arbolUser.editPassword(generateID(usuarioUserEditar), newContra);
                return "El usuario ha sido editado";
            }
            else if (!newNombre.equals("") && !newContra.equals("")){
                deleteUser(usuarioUserEditar);
                registrarUser(newNombre, newContra);
                arbolUser.editPassword(generateID(usuarioUserEditar), newContra);
                arbolUser.editUser(generateID(usuarioUserEditar), generateID(newNombre), newNombre);
                return "El usuario ha sido editado";
            }
            else {
                return "Se debe poner una nueva contraseña";
            }
        }
        else {
            return "El usuario no esta registrado";
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
                return false;
            }
        }
        else {
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

    public static void iniciarJson() throws ParseException {
        String strJson = getJsonFromFile("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Platillos.json");
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

    public static String deletePlatillo(String nombrePlatillo) {
        if (arbolPlatillos.contains(root, generateID(nombrePlatillo))) {
            int idPlatillo = generateID(nombrePlatillo);
            arbolPlatillos.delete(root, idPlatillo);
            String strJson = getJsonFromFile("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Platillos.json");
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
                FileWriter fileWriter = new FileWriter("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Platillos.json");
                fileWriter.write(mainJsonObject.toString());
                fileWriter.close();
                return "El platillo " + nombrePlatillo + " ha sido borrado del menu";
            } catch (Exception exception) {
                return "Ha fallado";
            }
        }
        else {
            return "El platillo no existe en el menu";
        }
    }

    public static String agregarPlatillo(String nombre, String calorias, String tiempo, String precio) {
        if (nombre.equals("") || calorias.equals("") || tiempo.equals("") || precio.equals("")) {
            return "Debe agregar toda la informacion del platillo";
        }
        if (!arbolPlatillos.contains(root, generateID(nombre))) {
            String strJson = getJsonFromFile("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Platillos.json");
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

                FileWriter fileWriter = new FileWriter("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Platillos.json");
                fileWriter.write(mainJsonObject.toString());
                fileWriter.close();
                return "El platillo " + nombre + " ha sido agregado";
            } catch (Exception exception) {
                return "Ha fallado";
            }
        }
        else {
            return "El platillo ya existe en el menu";
        }
    }

    public static String editarPlatillo(String nombrePlatilloAEditar, String newCalorias, String newTiempo, String newPrecio) {
        if (arbolPlatillos.contains(root, generateID(nombrePlatilloAEditar))) {
            String strJson = getJsonFromFile("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Platillos.json");
            try {
                JSONParser parser = new JSONParser();
                Object object = parser.parse(strJson);
                JSONObject mainJsonObject = (JSONObject) object;

                JSONArray jsonArrayPlatillos = (JSONArray) mainJsonObject.get("platillos");

                for (int i = 0; i < jsonArrayPlatillos.size(); i++) {

                    JSONObject jsonPlatillo = (JSONObject) jsonArrayPlatillos.get(i);

                    if (jsonPlatillo.get("id").equals(Integer.toString((generateID(nombrePlatilloAEditar))))) { // se puede decidir el momento de hacerlo cuando va por un indice especifico
                        if (!newCalorias.equals("")) {
                            jsonPlatillo.put("calorias", newCalorias);
                            arbolPlatillos.editCalorias(root, generateID(nombrePlatilloAEditar), newCalorias);
                        }
                        if (!newTiempo.equals("")) {
                            jsonPlatillo.put("tiempo", newTiempo);
                            arbolPlatillos.editTiempo(root, generateID(nombrePlatilloAEditar), newTiempo);
                        }
                        if (!newPrecio.equals("")) {
                            jsonPlatillo.put("precio", newPrecio);
                            arbolPlatillos.editPrecio(root, generateID(nombrePlatilloAEditar), newPrecio);
                        }
                    }

                }
                FileWriter fileWriter = new FileWriter("C:\\Users\\josep\\IdeaProjects\\X-TEC\\src\\Server\\Platillos.json");
                fileWriter.write(mainJsonObject.toString());
                fileWriter.close();
                return "El platillo " + nombrePlatilloAEditar + " ha sido editado";
            } catch (Exception exception) {
                return "Ha fallado";
            }
        }
        else {
            return "El platillo a editar no existe en el menu";
        }
    }

    public static String agregarPlatilloAPedido(String nombrePlatillo) {
        if (arbolPlatillos.contains(root, generateID(nombrePlatillo))) {
            listaPlatillos.insertFirst(arbolPlatillos.getPlatillo(root, generateID(nombrePlatillo)));
            return "Se ha agregado el platillo";
        }
        else {
            return "Ese platillo no se encuentra en el menu";
        }
    }

    public static String eliminarPedido() {
        listaPlatillos.empty();
        listaPlatillos.resetSize();
        return "Se ha eliminado el pedido actual";
    }

    public static String realizarPedido() {
        if (!listaPlatillos.isEmpty()) {
            if (cantPedidos < 9) {
                colaPedidos.enqueue(new ListaEnlazada().copy(listaPlatillos));
                cantPedidos++;
                listaPlatillos.empty();
                listaPlatillos.resetSize();
                counterActualizado = false;
                return "Se ha realizado el pedido";
            } else {
                return "Se ha llegado a la cantidad maxima de pedidos";
            }
        }
        else {
            return "Agregar platillos antes de realizar pedido";
        }
    }

    public static String getPlatillosEnPedido() {
        int i = 0;
        String str = "";
        while (listaPlatillos.size() > i) {
            str = str + listaPlatillos.get(i).nombre;
            str = str + "\n";
            i++;
        }
        return str;
    }

    public static String getPlatillosEnColaPedidos() {
        int i = 0;
        int j = 0;
        String str = "";
        while (colaPedidos.size() > i) {
            str = str + "PEDIDO " + Integer.toString(i+1) + "\n";
            while (colaPedidos.get(i).size() > j) {;
                str = str + "Platillo " + Integer.toString(j+1) + "\n";
                str = str + "Nombre: " + colaPedidos.get(i).get(j).nombre + "\n";
                str = str + "Calorias: " + colaPedidos.get(i).get(j).calorias + "\n";
                str = str + "Tiempo: " + colaPedidos.get(i).get(j).tiempo + "\n";
                str = str + "Precio: " + colaPedidos.get(i).get(j).precio + "\n";;
                j++;
            };
            i++;
            j = 0;
        }
        return str;
    }

    public static void iniciarTimer() {
        /**
         * Implementacion de un timer para llevar
         * la cuenta del tiempo desde que se empezo
         * el juego o el ultimo reinicio. El timer
         * llega solo hasta 59 minutos, 59 segundos.
         */
        // Implementacion de Timer
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            /**
             * Metodo de la herramienta TimerTask
             * que hace que cada segundo se actualiza el
             * label de cantidad de tiempo para representar
             * el tiempo que ha transcurrido
             */
            @Override
            public void run() {

                if (counterActualizado) {
                    if (!colaPedidos.isEmpty()) {
                        if (!pedidoEnProceso) {
                            counterPedidoActual = getTiempoPedidoActual();
                            pedidoEnProceso = true;
                        } else {
                            if (counterPedidoActual == 0) {
                                colaPedidos.dequeue();
                                cantPedidos--;
                                try {
                                    Controller.activeBuzzer.setValue(1);
                                    Thread.sleep(100);
                                    Controller.activeBuzzer.setValue(0);
                                    Thread.sleep(100);
                                    Controller.activeBuzzer.setValue(1);
                                    Thread.sleep(100);
                                    Controller.activeBuzzer.setValue(0);
                                } catch (IOException | InterruptedException e) {
                                    throw new RuntimeException(e);
                                }
                                pedidoEnProceso = false;
                            } else {
                                counterPedidoActual--;
                                counterPedidoTotal--;
                            }
                        }
                    }
                    else {
                        counterPedidoTotal = 0;
                        counterPedidoActual = 0;
                        counterActualizado = true;
                    }
                }
                else {
                    counterPedidoTotal = getTiempoPedidoTotal();
                    counterActualizado = true;
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000l); //hace que se corra el metodo run cada segundo sin delay
    }

    static int getTiempoPedidoActual() {
        int tiempo = 0;
        for (int i = 0; i < colaPedidos.getFirst().size(); i++) {
            tiempo = tiempo + Integer.parseInt(colaPedidos.getFirst().get(i).tiempo);
        }
        return tiempo;
    }

    static int getTiempoPedidoTotal() {
        int tiempo = 0;
        for (int i = 0; i < cantPedidos; i++) {
            for (int j = 0; j < colaPedidos.get(i).size(); j++) {
                tiempo = tiempo + Integer.parseInt(colaPedidos.get(i).get(j).tiempo);
            }
        }
        return tiempo;
    }

    static String getMenu() {
        String str = arbolPlatillos.getMenu(root);
        arbolPlatillos.resetStringMenu();
        return str;
    }

    static String cantPlatillosEnMenu() {
        String str = arbolPlatillos.getCantPlatillos(root);
        arbolPlatillos.resetCantPlatillos();
        return str;
    }

    static String convertirSegEnTimer(int totalSecs) {
        int hours = totalSecs / 3600;
        int minutes = (totalSecs % 3600) / 60;
        int seconds = totalSecs % 60;

        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        return timeString;
    }

}
