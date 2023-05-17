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
    static final int SEG1 = 6;
    static final int SEG2 = 7;
    static final int SEG3 = 8;
    static final int SEG4 = 9;
    static final int SEG5 = 10;
    static final int SEG6 = 11;
    static final int SEG7 = 12;
    static final int SEG8 = 13;

    static Pin led75;
    static Pin led50;
    static Pin led25;
    static Pin activeBuzzer;
    static Pin seg1;
    static Pin seg2;
    static Pin seg3;
    static Pin seg4;
    static Pin seg5;
    static Pin seg6;
    static Pin seg7;
    static Pin seg8;

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

                seg1 = arduino.getPin(SEG1);
                seg1.setMode(Pin.Mode.OUTPUT);

                seg2 = arduino.getPin(SEG2);
                seg2.setMode(Pin.Mode.OUTPUT);

                seg3 = arduino.getPin(SEG3);
                seg3.setMode(Pin.Mode.OUTPUT);

                seg4 = arduino.getPin(SEG4);
                seg4.setMode(Pin.Mode.OUTPUT);

                seg5 = arduino.getPin(SEG5);
                seg5.setMode(Pin.Mode.OUTPUT);

                seg6 = arduino.getPin(SEG6);
                seg6.setMode(Pin.Mode.OUTPUT);

                seg7 = arduino.getPin(SEG7);
                seg7.setMode(Pin.Mode.OUTPUT);

                seg8 = arduino.getPin(SEG8);
                seg8.setMode(Pin.Mode.OUTPUT);



                /**
                 * Loop que registra cuando se presionan los
                 * botones de direccion y seleccion. Al presionar
                 * los botones de direccion se cambia el tamaño
                 * del boton donde se encuentra el controli y
                 * controlj para visualizar donde se va a
                 * seleccionar.
                 */
                while (controllerFuncionando) {
                    if (ServerApp.cantPedidos > 0) {;
                        if (ServerApp.counterPedidoActual == 0) {
                            led25.setValue(0);
                            led50.setValue(0);
                            led75.setValue(0);
                            Thread.sleep(200);
                        }
                        else if (ServerApp.counterPedidoActual == (int) (ServerApp.getTiempoPedidoActual() * 0.75)) {
                            led25.setValue(1);
                            seg1.setValue(1);
                            seg2.setValue(1);
                            seg3.setValue(1);
                            Thread.sleep(200);
                        }
                        else if (ServerApp.counterPedidoActual == (int) (ServerApp.getTiempoPedidoActual() * 0.50)) {
                            led50.setValue(1);
                            Thread.sleep(200);
                        }
                        else if (ServerApp.counterPedidoActual == (int) (ServerApp.getTiempoPedidoActual() * 0.25)) {
                            led75.setValue(1);
                            Thread.sleep(200);
                        }
                    }
                    else {
                        led25.setValue(0);
                        led50.setValue(0);
                        led75.setValue(0);
                        Thread.sleep(200);
                    }
                }

                led25.setValue(0);
                led50.setValue(0);
                led75.setValue(0);

                arduino.stop();

            } catch (Exception except) {
                System.out.println("Controller not connected or incorrect port");
                System.out.println(except);
            }
        }
    }
}
