public class ClientApp extends javax.swing.JFrame{
    public javax.swing.JLabel Titulo;
    public javax.swing.JButton Historial;
    public javax.swing.JButton NuevoPedido;
    public javax.swing.JLabel PedidosActivos;
    public javax.swing.JButton Exit;
    public javax.swing.JLabel PedidosActivos2;

    public ClientApp()
    {
        initComponents();
        setSize(600,500);
    }

    @SuppressWarnings("")
    private void initComponents()
    {

        Titulo = new javax.swing.JLabel();
        Historial = new javax.swing.JButton();
        NuevoPedido = new javax.swing.JButton();
        PedidosActivos = new javax.swing.JLabel();
        PedidosActivos2 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24));
        Titulo.setForeground(new java.awt.Color(0, 60, 255));
        Titulo.setText("Bienvenido");

        Historial.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12));
        Historial.setText("Historial de pedidos");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });

        NuevoPedido.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12));
        NuevoPedido.setText("Realizar pedidos");
        NuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoPedidoActionPerformed(evt);
            }
        });

        PedidosActivos.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12));
        PedidosActivos.setText("Pedidos en curso");

        PedidosActivos2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12));
        PedidosActivos2.setText("");

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
                                .addContainerGap()
                                .addComponent(Exit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Titulo)
                                .addGap(201, 201, 201))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(Historial)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(NuevoPedido))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(PedidosActivos)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                                .addComponent(PedidosActivos2)))
                                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Titulo)
                                        .addComponent(Exit))
                                .addGap(116, 116, 116)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Historial, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NuevoPedido))
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(PedidosActivos)
                                        .addComponent(PedidosActivos2))
                                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt)
    {
        Historial cliente = new Historial();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    private void NuevoPedidoActionPerformed(java.awt.event.ActionEvent evt)
    {
        Menu cliente = new Menu();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.setVisible(false);

    }
    private void ExitActionPerformed(java.awt.event.ActionEvent evt)
    {
        LoginCliente cliente = new LoginCliente();
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
            java.util.logging.Logger.getLogger(ClientApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientApp().setVisible(true);
            }
        });
    }
}
