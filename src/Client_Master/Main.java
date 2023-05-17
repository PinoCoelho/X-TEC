package Client_Master;

import org.json.simple.parser.ParseException;

public class Main {
    /**
     * Funcion main de la aplicacion cliente
     * inicializa la ventana para que el
     * usuario pueda iniciar sesion
     * @param args
     * @throws ParseException en caso de que falle al iniciar los sockets
     */
    public static void main(String args[]) throws ParseException {//Prueba
        /**
         * Funcion para iniciar los sockets
         * y conectarse a un servidor.
         * Sin un servidor el programa
         * no funciona.
         */
        Sockets.iniciarSocket();
        /**
         * Se inicializa la ventana.
         * Creado automaticamente
         * por swing.
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginCliente().setVisible(true);
            }
        });

    }
}
