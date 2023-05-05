import javax.xml.transform.TransformerException;

public class Main {
<<<<<<< HEAD
    public static void main(String args[])
    {//Prueba
=======
    public static void main(String args[]) throws Exception {

        ServerApp.iniciarXML();
        ServerApp.iniciarJson();
        System.out.println(ServerApp.arbolPlatillos.getPrecio(ServerApp.root, 71));
        ServerApp.editarPlatillo("Burrito", null, null, "200");
        System.out.println(ServerApp.arbolPlatillos.getPrecio(ServerApp.root, 71));

>>>>>>> 76196cfded387e79775cf0cc9444ca70a5798e53
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
