public class ElimEditPlatillos extends javax.swing.JFrame {

    public javax.swing.JButton editPlatilloButton;
    public javax.swing.JLabel elimEditPlatillosLabel;
    public javax.swing.JButton eliminarPlatilloButton;
    public javax.swing.JComboBox<String> seleccionEditElimComboBox;
    public javax.swing.JLabel seleccionPlatilloElimEditLabel;
    public javax.swing.JButton volverElimEditPlatillosButton;

    public ElimEditPlatillos() 
    {
        initComponents();
    }

    @SuppressWarnings("")                         
    private void initComponents() 
    {

        elimEditPlatillosLabel = new javax.swing.JLabel();
        seleccionPlatilloElimEditLabel = new javax.swing.JLabel();
        seleccionEditElimComboBox = new javax.swing.JComboBox<>();
        eliminarPlatilloButton = new javax.swing.JButton();
        editPlatilloButton = new javax.swing.JButton();
        volverElimEditPlatillosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        elimEditPlatillosLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        elimEditPlatillosLabel.setForeground(new java.awt.Color(255, 0, 0));
        elimEditPlatillosLabel.setText("Eliminar y Editar Platillos");

        seleccionPlatilloElimEditLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        seleccionPlatilloElimEditLabel.setText("Seleccione el platillo que desea eliminar o editar");

        seleccionEditElimComboBox.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        seleccionEditElimComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        seleccionEditElimComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionEditElimComboBoxActionPerformed(evt);
            }
        });

        eliminarPlatilloButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        eliminarPlatilloButton.setText("Eliminar");
        eliminarPlatilloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPlatilloButtonActionPerformed(evt);
            }
        });

        editPlatilloButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        editPlatilloButton.setText("Editar");
        editPlatilloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPlatilloButtonActionPerformed(evt);
            }
        });

        volverElimEditPlatillosButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(seleccionPlatilloElimEditLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seleccionEditElimComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(51, 51, 51)
                .addComponent(seleccionEditElimComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarPlatilloButton)
                    .addComponent(editPlatilloButton))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }                   

    private void eliminarPlatilloButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                       
        
    }                                                      

    private void editPlatilloButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                   
        
    }                                                  

    private void volverElimEditPlatillosButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                              
            MasterApp master = new MasterApp();
            master.setVisible(true);
            master.setLocationRelativeTo(null);
            this.setVisible(false);
    }                                                             

    private void seleccionEditElimComboBoxActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                          
        
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
            java.util.logging.Logger.getLogger(ElimEditPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElimEditPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElimEditPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElimEditPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new ElimEditPlatillos().setVisible(true);
            }
        });
    }                  
                       
}