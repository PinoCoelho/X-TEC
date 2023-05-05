import javax.xml.transform.TransformerException;

public class Main {
    public static void main(String args[]) throws Exception {

        ServerApp.iniciarXML();
        ServerApp.iniciarJson();
        ServerApp.agregarPlatilloAPedido("Burrito");
        ServerApp.agregarPlatilloAPedido("Nachos");
        ServerApp.agregarPlatilloAPedido("Nachos");
        System.out.println(ServerApp.getPlatillosEnPedido());
        ServerApp.realizarPedido();
        ServerApp.agregarPlatilloAPedido("Nachos");
        ServerApp.agregarPlatilloAPedido("Burrito");
        ServerApp.agregarPlatilloAPedido("Burrito");
        System.out.println(ServerApp.getPlatillosEnPedido());
        ServerApp.realizarPedido();
        //System.out.println(ServerApp.getPlatillosEnColaPedidos());

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
