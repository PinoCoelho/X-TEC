package Client_Master;

import javax.swing.JOptionPane;

public class LoginAdmin extends javax.swing.JFrame {

    /**
     * Creates new form LoginAdmin
     */
    public LoginAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        labelContra = new javax.swing.JLabel();
        botonAdminLogin = new javax.swing.JButton();
        contraField = new javax.swing.JPasswordField();
        labelLogin = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelContra.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelContra.setText("Introduzca su contraseña");

        botonAdminLogin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        botonAdminLogin.setText("Login");
        botonAdminLogin.setToolTipText("");
        botonAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAdminLoginActionPerformed(evt);
            }
        });

        contraField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contraField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraFieldActionPerformed(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 51, 51));
        labelLogin.setText("LOGIN ADMIN");
        labelLogin.setAlignmentY(0.0F);
        labelLogin.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        labelError.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 51, 51));
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelError.setText("");

        labelUserName.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelUserName.setText("Introduzca su user name");

        usernameField.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botonVolver.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.setToolTipText("");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(211, Short.MAX_VALUE)
                                .addComponent(labelLogin)
                                .addGap(205, 205, 205))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(botonVolver)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(0, 186, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(labelUserName)
                                                                        .addGap(55, 55, 55))
                                                                .addComponent(labelContra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(botonAdminLogin)
                                                                        .addGap(98, 98, 98))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(contraField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(30, 30, 30)))
                                                        .addGap(158, 158, 158))
                                                .addComponent(labelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(3, 3, 3)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(botonVolver)
                                .addGap(50, 50, 50)
                                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(452, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(174, 174, 174)
                                        .addComponent(labelUserName)
                                        .addGap(18, 18, 18)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelContra)
                                        .addGap(18, 18, 18)
                                        .addComponent(contraField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonAdminLogin)
                                        .addGap(116, 116, 116)
                                        .addComponent(labelError)
                                        .addContainerGap(101, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>

    /**
     * Funcionalidad de boton para
     * iniciar sesion de los administradores,
     * se envia un output al servidor para
     * verificar al admin con la informacion
     * que se encuentra en los textbox.
     * @param evt se presiona el boton
     */
    private void botonAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Sockets.out.println("validarAdmin");
            Sockets.out.println(usernameField.getText());
            Sockets.out.println(contraField.getText());
            String response = Sockets.in.readLine();
            if (response.equals("true")) {
                MasterApp master = new MasterApp();
                master.setVisible(true);
                master.setLocationRelativeTo(null);
                this.setVisible(false);
            } else {
                labelError.setText("El usuario o contraseña son incorrectos");
            }
        }
        catch (Exception e) {
            System.out.println("Server no conectado");
        }
    }

    /**
     * Metodo que recibe la contraseña
     * @param evt
     */

    private void contraFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * Funcionalidad de boton
     * para volver a la anterior ventana.
     * @param evt
     */
    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {
        LoginCliente cliente = new LoginCliente();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            /**
             * Metodo que visibiliza la ventana
             */
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton botonAdminLogin;
    private javax.swing.JButton botonVolver;
    private javax.swing.JPasswordField contraField;
    private javax.swing.JLabel labelContra;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JTextField usernameField;
    // End of variables declaration
}