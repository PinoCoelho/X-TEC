package Server;

import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String args[]) throws ParseException {
        ServerApp.iniciarXML();
        ServerApp.iniciarJson();
        ServerApp.iniciarTimer();
        new Thread(() -> {
            try {
                Controller.startController();
            }
            catch (IOException | InterruptedException ioexception) {
                System.out.println("Error conectando controller");
            }
        }).start();
        try {
            // Create a server socket on port 5000
            ServerSocket serverSocket = new ServerSocket(2525);

            // Wait for a client to connect
            Socket socket = serverSocket.accept();

            // Create input and output streams for the socket
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            boolean funcionando = true;

            // Read input from the client and send a response
            while (funcionando) {
                String inputLine = in.readLine();
                if (inputLine != null) {
                    if (inputLine.equals("validarUser")) {
                        if (ServerApp.validarUser(in.readLine(), in.readLine())) {
                            out.println("true");
                        }
                        else {
                            out.println("false");
                        }
                    }
                    else if (inputLine.equals("validarAdmin")) {
                        if (ServerApp.validarAdmin(in.readLine(), in.readLine())) {
                            out.println("true");
                        }
                        else {
                            out.println("false");
                        }
                    }
                    else if (inputLine.equals("registrarUser")) {
                        out.println(ServerApp.registrarUser(in.readLine(), in.readLine()));
                    }
                    else if (inputLine.equals("registrarAdmin")) {
                        out.println(ServerApp.registrarAdmin(in.readLine(), in.readLine()));
                    }
                    else if (inputLine.equals("deleteAdmin")) {
                        out.println(ServerApp.deleteAdmin(in.readLine()));
                    }
                    else if (inputLine.equals("agregarPlatillo")) {
                        out.println(ServerApp.agregarPlatillo(in.readLine(), in.readLine(), in.readLine(), in.readLine()));
                    }
                    else if (inputLine.equals("deletePlatillo")) {
                        out.println(ServerApp.deletePlatillo(in.readLine()));
                    }
                    else if (inputLine.equals("editarPlatillo")) {
                        out.println(ServerApp.editarPlatillo(in.readLine(), in.readLine(), in.readLine(), in.readLine()));
                    }
                    else if (inputLine.equals("editarAdmin")) {
                        out.println(ServerApp.editarAdmin(in.readLine(), in.readLine(), in.readLine()));
                    }
                    else if (inputLine.equals("deleteUser")) {
                        out.println(ServerApp.deleteUser(in.readLine()));
                    }
                    else if (inputLine.equals("editarUser")) {
                        out.println(ServerApp.editarUser(in.readLine(),in.readLine(),in.readLine()));
                    }
                    else if (inputLine.equals("getMenu")) {
                        out.println(ServerApp.cantPlatillosEnMenu());
                        out.println(ServerApp.getMenu());
                    }
                    else if (inputLine.equals("agregarPlatilloAPedido")) {
                        ServerApp.agregarPlatilloAPedido(in.readLine());
                        out.println(Integer.toString(ServerApp.listaPlatillos.size()));
                        out.println(ServerApp.getPlatillosEnPedido());
                    }
                    else if (inputLine.equals("realizarPedido")) {
                        out.println(ServerApp.realizarPedido());
                    }
                    else if (inputLine.equals("eliminarPedido")) {
                        out.println(ServerApp.eliminarPedido());
                    }
                    else if (inputLine.equals("getColaPedidos")) {
                        out.println(ServerApp.convertirSegEnTimer(ServerApp.counterPedidoActual));
                        out.println(ServerApp.convertirSegEnTimer(ServerApp.counterPedidoTotal));
                        out.println(ServerApp.getPlatillosEnColaPedidos());
                        out.println("END");
                    }
                    else if (inputLine.equals("getColaPedidosUser")) {
                        out.println(ServerApp.convertirSegEnTimer(ServerApp.counterPedidoActual));
                        out.println(ServerApp.getFirstPedidoEnCola());
                        out.println("END");
                    }
                    else if (inputLine.equals("TERMINATE")) {
                        in.close();
                        out.close();
                        serverSocket.close();
                        socket.close();
                        Controller.controllerFuncionando = false;
                        funcionando = false;
                    }
                    else if (inputLine.equals("eliminarHistorial")) {
                        ServerApp.eliminarHistorial();
                    }
                    else if (inputLine.equals("getHistorial")) {
                        out.println(ServerApp.getHistorial());
                        out.println("END");
                    }
                }
            }

        }
        catch (Exception e) {
            System.out.println("Exception caught when trying to listen on port or listening for a connection");
            System.out.println(e);
        }
    }
}
