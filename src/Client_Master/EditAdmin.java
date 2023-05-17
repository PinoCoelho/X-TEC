package Client_Master;

import javax.swing.*;
import java.io.IOException;

public class EditAdmin extends javax.swing.JFrame {

    /**
     * Se crea un nuevo jFrame form
     * para EditAdmin.
     */
    public EditAdmin() {
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

        labelNewContra = new javax.swing.JLabel();
        botonEdit = new javax.swing.JButton();
        newContraField = new javax.swing.JPasswordField();
        labelLogin = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        labelNewUser = new javax.swing.JLabel();
        newNameField = new javax.swing.JPasswordField();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNewContra.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelNewContra.setText("Introduzca su nueva contraseña");

        botonEdit.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        botonEdit.setText("Editar");
        botonEdit.setToolTipText("");
        botonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    botonEditActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        newContraField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newContraField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newContraFieldActionPerformed(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(255, 51, 51));
        labelLogin.setText("Editar Usuario");
        labelLogin.setAlignmentY(0.0F);
        labelLogin.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        labelUserName.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelUserName.setText("Introduzca el usuario a editar");

        usernameField.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        usernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelNewUser.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelNewUser.setText("Introduzca su nuevo usuario");

        newNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNameFieldActionPerformed(evt);
            }
        });

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
                                                .addGap(183, 183, 183)
                                                .addComponent(labelUserName))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(248, 248, 248)
                                                .addComponent(botonEdit)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(175, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(newNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(185, 185, 185))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(newContraField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(2, 2, 2))
                                                                .addComponent(labelNewContra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(labelLogin)
                                                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(183, 183, 183))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(labelNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botonVolver)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botonVolver)
                                .addGap(47, 47, 47)
                                .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(labelUserName)
                                .addGap(18, 18, 18)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(labelNewUser)
                                .addGap(18, 18, 18)
                                .addComponent(newNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNewContra)
                                .addGap(18, 18, 18)
                                .addComponent(newContraField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(botonEdit)
                                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    /**
     * Funcionalidad de boton para editar
     * la informacion de los administradores
     * envia un output para que el server
     * llame al metodo para editar la informacion
     * del administrador.
     * @param evt
     * @throws IOException
     */
    private void botonEditActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        Sockets.out.println("editarAdmin");
        Sockets.out.println(usernameField.getText());
        Sockets.out.println(newNameField.getText());
        Sockets.out.println(newContraField.getText());
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), Sockets.in.readLine(), "", JOptionPane.ERROR_MESSAGE);
        newNameField.setText("");
        newContraField.setText("");
    }

    private void newContraFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void newNameFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * Funcionalidad del boton volver.
     * Lleva al usuario a la ventana
     * anterior.
     * @param evt se presiona el boton
     */
    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {
        AddAdmin add = new AddAdmin();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * Funcion main para acceder a la ventana directamente
     * @param args los argumentos de las lineas de comandos
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
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton botonEdit;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNewContra;
    private javax.swing.JLabel labelNewUser;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JPasswordField newContraField;
    private javax.swing.JPasswordField newNameField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration
}