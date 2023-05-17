package Client_Master;

import javax.swing.*;
import java.io.IOException;

public class AddAdmin extends javax.swing.JFrame {

    /**
     * Se crea un nuevo jFrame form
     * llamado AddAdmin
     */
    public AddAdmin() {
        initComponents();
    }

    /**
     * Metodo creado automaticamente
     * por el form de swing
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        labelAddAdmin = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        labelUser = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        botonAddAdmin = new javax.swing.JButton();
        botonEliminarAdmin = new javax.swing.JButton();
        labelEditAdmin = new javax.swing.JLabel();
        botonEditAdmin = new javax.swing.JButton();
        labelContra = new javax.swing.JLabel();
        contraField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAddAdmin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        labelAddAdmin.setForeground(new java.awt.Color(255, 51, 51));
        labelAddAdmin.setText("Añadir administrador");
        labelAddAdmin.setAlignmentY(0.0F);
        labelAddAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        botonVolver.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.setToolTipText("");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        labelUser.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelUser.setText("Introduzca el usuario");

        nameField.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botonAddAdmin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        botonAddAdmin.setText("Añadir");
        botonAddAdmin.setToolTipText("");
        botonAddAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    botonAddAdminActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        botonEliminarAdmin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        botonEliminarAdmin.setText("Eliminar");
        botonEliminarAdmin.setToolTipText("");
        botonEliminarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    botonEliminarAdminActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        labelEditAdmin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelEditAdmin.setText("Desea editar el usuario?");

        botonEditAdmin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        botonEditAdmin.setText("Editar");
        botonEditAdmin.setToolTipText("");
        botonEditAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditAdminActionPerformed(evt);
            }
        });

        labelContra.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelContra.setText("Introduzca la contraseña");

        contraField.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        contraField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botonVolver)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(128, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelAddAdmin)
                                                .addGap(128, 128, 128))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(labelUser)
                                                                .addGap(83, 83, 83))
                                                        .addComponent(contraField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(118, 118, 118))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelContra)
                                                .addGap(186, 186, 186))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(botonEditAdmin)
                                                                .addGap(84, 84, 84))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(labelEditAdmin)
                                                                .addGap(40, 40, 40))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(botonEliminarAdmin)
                                                                .addGap(80, 80, 80)
                                                                .addComponent(botonAddAdmin)))
                                                .addGap(151, 151, 151))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botonVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelAddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(labelUser)
                                .addGap(18, 18, 18)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelContra)
                                .addGap(18, 18, 18)
                                .addComponent(contraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botonAddAdmin)
                                        .addComponent(botonEliminarAdmin))
                                .addGap(37, 37, 37)
                                .addComponent(labelEditAdmin)
                                .addGap(26, 26, 26)
                                .addComponent(botonEditAdmin)
                                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    /**
     * Funcionalidad del boton volver.
     * Este hace que se abra la ventana
     * anterior.
     * @param evt
     */
    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {
        MasterApp add = new MasterApp();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * Funcionalidad de boton para agregar un
     * administrador. Se envia un output al
     * servidor para que llame a un metodo
     * que agrega al administrador que se
     * encuentra en los textfield de la ventana.
     * @param evt presionar el boton
     * @throws IOException en caso de que fallen los sockets
     */
    private void botonAddAdminActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        Sockets.out.println("registrarAdmin");
        Sockets.out.println(nameField.getText());
        Sockets.out.println(contraField.getText());
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), Sockets.in.readLine(), "", JOptionPane.ERROR_MESSAGE);
        nameField.setText("");
        contraField.setText("");
    }

    /**
     * Funcionalidad de boton para eliminar un
     * administrador. Se envia un output al
     * servidor para que llame a un metodo
     * que elimina al administrador que se
     * encuentra en los textfield de la ventana.
     * @param evt presionar el boton
     * @throws IOException en caso de que fallen los sockets
     */
    private void botonEliminarAdminActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        Sockets.out.println("deleteAdmin");
        Sockets.out.println(nameField.getText());
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), Sockets.in.readLine(), "", JOptionPane.ERROR_MESSAGE);
        nameField.setText("");
        contraField.setText("");
    }

    /**
     * Funcionalidad de boton para abrir
     * la ventana en la que se edita
     * la informacion de los administradores
     * @param evt se presiona el boton
     */
    private void botonEditAdminActionPerformed(java.awt.event.ActionEvent evt) {
        EditAdmin add = new EditAdmin();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * Funcion main en caso de que se
     * quiera acceder a la ventana directamente.
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
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            /**
             * Metodo que visibiliza la ventana
             */
            public void run() {
                new AddAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton botonAddAdmin;
    private javax.swing.JButton botonEditAdmin;
    private javax.swing.JButton botonEliminarAdmin;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField contraField;
    private javax.swing.JLabel labelAddAdmin;
    private javax.swing.JLabel labelContra;
    private javax.swing.JLabel labelEditAdmin;
    private javax.swing.JLabel labelUser;
    private javax.swing.JTextField nameField;
    // End of variables declaration                   
}
