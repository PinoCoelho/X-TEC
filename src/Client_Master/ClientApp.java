package Client_Master;

import java.io.IOException;

public class ClientApp extends javax.swing.JFrame {

    /**
     * Se crea un nuevo jFrame form
     * para ClientApp.
     */
    public ClientApp() {
        initComponents();
    }

    /**
     * Metodo creado por java swing para
     * crear una ventana y agregar sus
     * componentes. Este se crea automaticamente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        labelBienvenida = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonHistorial = new javax.swing.JButton();
        botonRealizarPedidos = new javax.swing.JButton();
        botonPedidosActivos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelBienvenida.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        labelBienvenida.setForeground(new java.awt.Color(255, 51, 51));
        labelBienvenida.setText("Bienvenido");
        labelBienvenida.setAlignmentY(0.0F);
        labelBienvenida.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        botonSalir.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.setToolTipText("");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonHistorial.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        botonHistorial.setText("Historial de pedidos");
        botonHistorial.setToolTipText("");
        botonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHistorialActionPerformed(evt);
            }
        });

        botonRealizarPedidos.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        botonRealizarPedidos.setText("Realizar pedidos");
        botonRealizarPedidos.setToolTipText("");
        botonRealizarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    botonRealizarPedidosActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        botonPedidosActivos.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        botonPedidosActivos.setText("Pedidos en curso");
        botonPedidosActivos.setToolTipText("");
        botonPedidosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPedidosActivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(181, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelBienvenida)
                                                .addGap(203, 203, 203))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(botonHistorial)
                                                .addGap(161, 161, 161))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(botonSalir)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botonRealizarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botonPedidosActivos))
                                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(botonSalir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(botonHistorial)
                                .addGap(65, 65, 65)
                                .addComponent(botonPedidosActivos)
                                .addGap(73, 73, 73)
                                .addComponent(botonRealizarPedidos)
                                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    /**
     * Boton para salir del client app,
     * se envia un output al servidor
     * para que se elimine el historial.
     * @param evt se presiona el boton
     */
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {
        Sockets.out.println("eliminarHistorial");
        LoginCliente login = new LoginCliente();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * Se abre la ventana
     * en la que se muestra
     * el historial
     * @param evt se presiona el boton
     */
    private void botonHistorialActionPerformed(java.awt.event.ActionEvent evt) {
        Historial historial = new Historial();
        historial.setVisible(true);
        historial.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * Se abre la ventana en la que
     * se realizan los pedidos
     * @param evt se presiona el boton
     * @throws IOException
     */
    private void botonRealizarPedidosActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        RealizarPedido pedido = new RealizarPedido();
        pedido.setVisible(true);
        pedido.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * Se abre la ventana en
     * donde se encuentran los
     * pedidos activos
     * @param evt se presiona el boton
     */
    private void botonPedidosActivosActionPerformed(java.awt.event.ActionEvent evt) {
        PedidosActivosUser pedido = new PedidosActivosUser();
        pedido.setVisible(true);
        pedido.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * Funcion main en caso de que se quiera
     * acceder directamente a la ventana
     * @param args los argumentos de las lineas de comando
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton botonHistorial;
    private javax.swing.JButton botonPedidosActivos;
    private javax.swing.JButton botonRealizarPedidos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel labelBienvenida;
    // End of variables declaration
}
