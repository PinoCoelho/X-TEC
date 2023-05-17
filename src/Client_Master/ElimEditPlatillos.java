package Client_Master;

import javax.swing.*;
import java.io.IOException;

public class ElimEditPlatillos extends javax.swing.JFrame {

    /**
     * Se crea un nuevo jFrame form
     * para ElimEditPlatillos.
     */
    public ElimEditPlatillos() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        elimEditPlatillosLabel = new javax.swing.JLabel();
        seleccionPlatilloElimEditLabel = new javax.swing.JLabel();
        eliminarPlatilloButton = new javax.swing.JButton();
        editPlatilloButton = new javax.swing.JButton();
        volverElimEditPlatillosButton = new javax.swing.JButton();
        selectPlatilloTextField = new javax.swing.JTextField();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        elimEditPlatillosLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        elimEditPlatillosLabel.setForeground(new java.awt.Color(255, 0, 0));
        elimEditPlatillosLabel.setText("Eliminar y Editar Platillos");

        seleccionPlatilloElimEditLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        seleccionPlatilloElimEditLabel.setText("Ingrese el platillo que desea eliminar o editar");

        eliminarPlatilloButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        eliminarPlatilloButton.setText("Eliminar");
        eliminarPlatilloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    eliminarPlatilloButtonActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        editPlatilloButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        editPlatilloButton.setText("Editar");
        editPlatilloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPlatilloButtonActionPerformed(evt);
            }
        });

        volverElimEditPlatillosButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        volverElimEditPlatillosButton.setText("Volver");
        volverElimEditPlatillosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverElimEditPlatillosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(volverElimEditPlatillosButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                                .addComponent(elimEditPlatillosLabel)
                                                .addGap(137, 137, 137))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(seleccionPlatilloElimEditLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(selectPlatilloTextField))
                                                .addGap(114, 114, 114))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(eliminarPlatilloButton)
                                .addGap(101, 101, 101)
                                .addComponent(editPlatilloButton)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(elimEditPlatillosLabel)
                                        .addComponent(volverElimEditPlatillosButton))
                                .addGap(95, 95, 95)
                                .addComponent(seleccionPlatilloElimEditLabel)
                                .addGap(57, 57, 57)
                                .addComponent(selectPlatilloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(eliminarPlatilloButton)
                                        .addComponent(editPlatilloButton))
                                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>
    /**
     * Funcionalidad del boton para eliminar
     * platillos, se envia un output al
     * server para que elimine el platillo
     * que esta en el textfield.
     * @param evt
     * @throws IOException
     */
    private void eliminarPlatilloButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        Sockets.out.println("deletePlatillo");
        Sockets.out.println(selectPlatilloTextField.getText());
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), Sockets.in.readLine(), "", JOptionPane.ERROR_MESSAGE);
        selectPlatilloTextField.setText("");
    }

    /**
     * Funcionalidad de boton para
     * abir la ventana en la que se
     * editan los platillos.
     * @param evt se presiona el boton
     */
    private void editPlatilloButtonActionPerformed(java.awt.event.ActionEvent evt) {
        EditPlatillo add = new EditPlatillo();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * Funcionalidad del boton
     * que envia al usuario a la
     * ventana anterior
     * @param evt
     */
    private void volverElimEditPlatillosButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MasterApp add = new MasterApp();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(ElimEditPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElimEditPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElimEditPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElimEditPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            /**
             * Metodo que visibiliza la ventana
             */
            public void run() {
                new ElimEditPlatillos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    public javax.swing.JButton editPlatilloButton;
    public javax.swing.JLabel elimEditPlatillosLabel;
    public javax.swing.JButton eliminarPlatilloButton;
    private javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel seleccionPlatilloElimEditLabel;
    public javax.swing.JTextField selectPlatilloTextField;
    public javax.swing.JButton volverElimEditPlatillosButton;
    // End of variables declaration
}