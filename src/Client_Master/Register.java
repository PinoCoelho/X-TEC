package Client_Master;

import javax.swing.*;
import java.io.IOException;

public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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
        botonRegister = new javax.swing.JButton();
        contraField = new javax.swing.JPasswordField();
        labelLogin = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelContra.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelContra.setText("Introduzca su nueva contraseña");

        botonRegister.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        botonRegister.setText("Register");
        botonRegister.setToolTipText("");
        botonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    botonRegisterActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
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
        labelLogin.setText("REGISTER");
        labelLogin.setAlignmentY(0.0F);
        labelLogin.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        labelError.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 51, 51));
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelError.setText("");

        labelUserName.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelUserName.setText("Introduzca su nuevo user name");

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
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(botonVolver))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(194, 194, 194)
                                                .addComponent(labelUserName))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(154, 154, 154)
                                                .addComponent(labelContra, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(155, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(labelLogin)
                                                .addGap(231, 231, 231))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(botonRegister)
                                                .addGap(251, 251, 251))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(0, 186, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(contraField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(188, 188, 188))
                                                .addComponent(labelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(3, 3, 3)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botonVolver)
                                .addGap(54, 54, 54)
                                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(labelUserName)
                                .addGap(64, 64, 64)
                                .addComponent(labelContra)
                                .addGap(71, 71, 71)
                                .addComponent(botonRegister)
                                .addContainerGap(220, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(206, 206, 206)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(contraField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(159, 159, 159)
                                        .addComponent(labelError)
                                        .addContainerGap(101, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>

    /**
     * Funcionalidad de boton para registrarse
     * como un nuevo usuario, se le envia un
     * output al servidor para que llame a un
     * metodo que agrega usuarios al sistema
     * y se le muestra la informacion al usuario
     * @param evt se presiona el boton
     * @throws IOException en caso de que el socket de error
     */
    private void botonRegisterActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        Sockets.out.println("registrarUser");
        Sockets.out.println(usernameField.getText());
        Sockets.out.println(contraField.getText());
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), Sockets.in.readLine(), "", JOptionPane.ERROR_MESSAGE);
        usernameField.setText("");
        contraField.setText("");
    }

    /**
     * Metodo que recibe la contraseña
     * @param evt
     */
    private void contraFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * Funcionalidad de boton para
     * volver a la ventana anterior
     * @param evt se presiona el boton
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            /**
             * Metodo que visibiliza la ventana
             */
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton botonRegister;
    private javax.swing.JButton botonVolver;
    private javax.swing.JPasswordField contraField;
    private javax.swing.JLabel labelContra;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JTextField usernameField;
    // End of variables declaration
}
