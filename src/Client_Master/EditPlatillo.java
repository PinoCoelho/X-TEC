package Client_Master;

import javax.swing.*;
import java.io.IOException;

public class EditPlatillo extends javax.swing.JFrame {

    /**
     * Se crea un nuevo jFrame form
     * para EditPlatillo.
     */
    public EditPlatillo() {
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

        labelEditPlatillo = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();
        labelNombe = new javax.swing.JLabel();
        labelCalorias = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelTiempo = new javax.swing.JLabel();
        botonEdit = new javax.swing.JButton();
        caloriasField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        timeField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelEditPlatillo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        labelEditPlatillo.setForeground(new java.awt.Color(255, 51, 51));
        labelEditPlatillo.setText("Editar Platillo");

        botonVolver.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        labelNombe.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelNombe.setText("Escriba el platillo que desea editar");

        labelCalorias.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelCalorias.setText("Escriba las nuevas calorias");

        labelPrecio.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelPrecio.setText("Escriba el nuevo precio");

        labelTiempo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        labelTiempo.setText("Escriba el nuevo tiempo de preparacion");

        botonEdit.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        botonEdit.setText("Editar");
        botonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    botonEditActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        caloriasField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        timeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        priceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(botonVolver)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(169, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(labelEditPlatillo)
                                                        .addGap(178, 178, 178))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(labelCalorias)
                                                        .addGap(187, 187, 187))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(labelPrecio)
                                                        .addGap(195, 195, 195))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(botonEdit)
                                                        .addGap(232, 232, 232))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(labelTiempo)
                                                        .addGap(141, 141, 141))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(labelNombe)
                                                        .addGap(158, 158, 158)))
                                        .addComponent(caloriasField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(botonVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelEditPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(labelNombe)
                                .addGap(23, 23, 23)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelCalorias)
                                .addGap(18, 18, 18)
                                .addComponent(caloriasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(labelTiempo)
                                .addGap(18, 18, 18)
                                .addComponent(timeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPrecio)
                                .addGap(18, 18, 18)
                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(botonEdit)
                                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>

    /**
     * Funcionalidad del boton para
     * volver a la ventana anterior.
     * @param evt se presiona el boton
     */
    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {
        ElimEditPlatillos add = new ElimEditPlatillos();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * Funcionalidad del boton para editar
     * informacion del platillo. Se le manda
     * un output al servidor para que llame
     * al metodo para editar el platillo con
     * la informacion de los textfields.
     * @param evt
     * @throws IOException
     */
    private void botonEditActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        Sockets.out.println("editarPlatillo");
        Sockets.out.println(nameField.getText());
        Sockets.out.println(caloriasField.getText());
        Sockets.out.println(timeField.getText());
        Sockets.out.println(priceField.getText());
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), Sockets.in.readLine(), "", JOptionPane.ERROR_MESSAGE);
        nameField.setText("");
        caloriasField.setText("");
        timeField.setText("");
        priceField.setText("");
    }


    /**
     * @param args argumentos de lineas de comando
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
            java.util.logging.Logger.getLogger(EditPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            /**
             * Metodo que visibiliza la ventana
             */
            public void run() {
                new EditPlatillo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton botonEdit;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField caloriasField;
    private javax.swing.JLabel labelCalorias;
    private javax.swing.JLabel labelEditPlatillo;
    private javax.swing.JLabel labelNombe;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField timeField;
    // End of variables declaration
}