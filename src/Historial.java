import javax.swing.*;

public class Historial extends javax.swing.JFrame{
    public javax.swing.JLabel Titulo;
    public javax.swing.JButton Exit;
    public javax.swing.JLabel TituloPlatillo;
    public javax.swing.JComboBox<String> Eleccion;
    public javax.swing.JButton PedidoHecho;
    public Historial()
    {
        initComponents();
        setSize(600,500);
    }

    @SuppressWarnings("")
    private void initComponents()
    {

        Titulo = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24));
        Titulo.setForeground(new java.awt.Color(0, 60, 255));
        Titulo.setText("Pedidos Realizados");

        Exit.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12));
        Exit.setText("Salir");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(150, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(146, 146, 146))))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(Exit)
                                                .addGap(80, 80, 80)
                                                .addComponent(Titulo)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Titulo)
                                        .addComponent(Exit))
                                .addGap(91, 91, 91)
                                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }
    private void ExitActionPerformed(java.awt.event.ActionEvent evt)
    {
        ClientApp cliente = new ClientApp();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.setVisible(false);
    }
    public static void main(String args[])
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
            }
        });
    }
}
