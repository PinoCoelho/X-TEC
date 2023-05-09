public class EditAdmin extends javax.swing.JFrame 
{

    public javax.swing.JLabel editAdminLabel;
    public javax.swing.JLabel nuevaContraLabel;
    public javax.swing.JTextField nuevaContraTextField;
    public javax.swing.JComboBox<String> seleccionarAdminComboBox;
    public javax.swing.JLabel selecciondminLabel;
    public javax.swing.JButton volverEditAdminButton;

    /**
     * El metodo EditAdmin inicializara los componentes de la ventana
     */
    public EditAdmin() 
    {
        initComponents();
    }

    @SuppressWarnings("")                          
    private void initComponents() 
    {

        editAdminLabel = new javax.swing.JLabel();
        selecciondminLabel = new javax.swing.JLabel();
        seleccionarAdminComboBox = new javax.swing.JComboBox<>();
        nuevaContraLabel = new javax.swing.JLabel();
        nuevaContraTextField = new javax.swing.JTextField();
        volverEditAdminButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editAdminLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        editAdminLabel.setForeground(new java.awt.Color(255, 0, 0));
        editAdminLabel.setText("Editar Administrador");

        selecciondminLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        selecciondminLabel.setText("Seleccione el administrador que sea editar");

        seleccionarAdminComboBox.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        seleccionarAdminComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        seleccionarAdminComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarAdminComboBoxActionPerformed(evt);
            }
        });

        nuevaContraLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        nuevaContraLabel.setText("Ingrese su nueva contraseña");

        volverEditAdminButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        volverEditAdminButton.setText("Volver");
        volverEditAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverEditAdminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volverEditAdminButton)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(editAdminLabel)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nuevaContraTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seleccionarAdminComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(selecciondminLabel)))
                        .addGap(144, 144, 144))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nuevaContraLabel)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editAdminLabel)
                    .addComponent(volverEditAdminButton))
                .addGap(147, 147, 147)
                .addComponent(selecciondminLabel)
                .addGap(18, 18, 18)
                .addComponent(seleccionarAdminComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nuevaContraLabel)
                .addGap(18, 18, 18)
                .addComponent(nuevaContraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * El metodo volverEditAdminButtonActionPerformed direccionara a la ventana de AddAdmin
     * @param evt
     */
    private void volverEditAdminButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                      
        AddAdmin add = new AddAdmin();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    /**
     * El metodo seleccionarAdminComboBoxActionPerformed facilitara la seleccion de un administrador para modificarle su contrseña
     * @param evt
     */
    private void seleccionarAdminComboBoxActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                         
        
    }
    /**
     *  El metodo main correra los componentes de la ventana
     * @param args
     */
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
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            /**
             * El metodo run hara visibles los componentes de la ventana
             */
            public void run() {
                new EditAdmin().setVisible(true);
            }
        });
    }                    
                     
}
