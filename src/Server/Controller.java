package Server;

import org.firmata4j.firmata.*;
import org.firmata4j.IODevice;
import org.firmata4j.Pin;
import java.io.IOException;

/**
 * Clase para conectar el codigo con
 * el control de arduino.
 * @author Jose Pablo Umaña Vega
 */
public class Controller {

    static boolean controllerFuncionando = false; // boolean para saber si el control esta en uso

    static final String USBPORT = "COM3"; // puerto USB en el que se conecta el arduino

    static final int LED1 = 2; // pin donde se encuentra el LED
    static final int LED2 = 3;
    static final int LED3 = 4;
    static final int Buzzer = 5;

    static Pin led75;
    static Pin led50;
    static Pin led25;
    static Pin activeBuzzer;

    /**
     * Se inicia la conexion con el arduino
     * mediante firmata. Una vez conectado se
     * tiene un ciclo while que debe correr
     * en un Thread para leer los inputs del
     * control. Los botones de direccion modifican
     * las variables controli y controlj
     * al presionar el boton para seleccionar se
     * revela el espacio en la cuadricula donde se
     * encuentran los indices controli y controlj.
     *
     * @throws IOException
     * @throws InterruptedException
     */
    public static void startController() throws IOException, InterruptedException {
        IODevice arduino = new FirmataDevice(USBPORT); // se crea el objeto arduino con el puerto en el que esta conectado

        try {

            arduino.start(); // se inicializa la conexion con el arduino
            arduino.ensureInitializationIsDone(); // se asegura que la conexion se haya completado
            System.out.println("El arduino se ha conectado"); // se hace un print para saber cuando esta listo para usar
            controllerFuncionando = true; // se cambia la variable a true para saber que el control esta en uso

        } catch (IOException ioexception) { // en caso de que falle la condicion con el arduino
            System.out.println("Trouble connecting to board"); // se hace un print para saber que fallo la conexion
        } finally { // aqui se pone el codigo que se quiere ejecutar

            try {
                led75 = arduino.getPin(LED1); // se le asigna el pin del arduino donde se encuentra el LED a una variable
                led75.setMode(Pin.Mode.OUTPUT); // se le asigna el modo output al LED

                led50 = arduino.getPin(LED2);
                led50.setMode(Pin.Mode.OUTPUT);

                led25 = arduino.getPin(LED3);
                led25.setMode(Pin.Mode.OUTPUT);

                activeBuzzer = arduino.getPin(Buzzer);
                activeBuzzer.setMode(Pin.Mode.OUTPUT);


                /**
                 * Loop que registra cuando se presionan los
                 * botones de direccion y seleccion. Al presionar
                 * los botones de direccion se cambia el tamaño
                 * del boton donde se encuentra el controli y
                 * controlj para visualizar donde se va a
                 * seleccionar.
                 */
                while (controllerFuncionando == true) {
                    if (ServerApp.cantPedidos > 0) {
                        if (ServerApp.counterPedidoActual == 0) {
                            led25.setValue(0);
                            led50.setValue(0);
                            led75.setValue(0);
                            Thread.sleep(1000);
                        }
                        else if (ServerApp.counterPedidoActual == (int) ServerApp.getTiempoPedidoActual() * 0.75) {
                            led25.setValue(1);
                            Thread.sleep(1000);
                        }
                        else if (ServerApp.counterPedidoActual == (int) ServerApp.getTiempoPedidoActual() * 0.50) {
                            led50.setValue(1);
                            Thread.sleep(1000);
                        }
                        else if (ServerApp.counterPedidoActual == (int) ServerApp.getTiempoPedidoActual() * 0.25) {
                            led75.setValue(1);
                            Thread.sleep(1000);
                        }
                    }
                    else {
                        led25.setValue(0);
                        led50.setValue(0);
                        led75.setValue(0);
                        Thread.sleep(1000);
                    }
                }

                arduino.stop();
                controllerFuncionando = false;

            } catch (Exception except) {
                System.out.println("Controller not connected or incorrect port");
                System.out.println(except);
            }
        }
    }
}
