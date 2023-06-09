package Client_Master;
import java.io.*;
import java.net.*;

public class Sockets {
    public static Socket socket;
    public static BufferedReader in;
    public static PrintWriter out;

    /**
     * Metodo para que se de el
     * inicio del socket cliente,
     * este intenta encontrar al un
     * servidor, en caso de no hacerlo
     * da un error. Este paso es
     * crucial para el programa.
     */
    public static void iniciarSocket() {
        try {
            // Create a socket and connect to the server on port 5000
            socket = new Socket("localhost", 2525);

            // Create input and output streams for the socket
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

        } catch (IOException e) {
            System.out.println("Exception caught when trying to connect to the server or when creating the streams");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Metodo que cierra los sockets
     * cuando se cierra el programa
     * @throws IOException en caso de que no hayan sockets que cerrar en primer lugar
     */
    public static void cerrarSocket() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}
