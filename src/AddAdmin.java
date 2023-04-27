public class AddAdmin extends javax.swing.JFrame {

    public javax.swing.JLabel añadirAdminLabel;
    public javax.swing.JButton añadirButton;
    public javax.swing.JLabel añadirUserLabel;
    public javax.swing.JButton editarButton;
    public javax.swing.JLabel eliminarAñadirLabel;
    public javax.swing.JButton eliminarButton;
    public javax.swing.JComboBox<String> eliminarEditarComboBox;
    public javax.swing.JComboBox<String> userañdirComboBox;
    public javax.swing.JButton volverAddButton;

    
    public AddAdmin() {
        initComponents();
    }

    @SuppressWarnings("")                         
    private void initComponents() 
    {

        añadirAdminLabel = new javax.swing.JLabel();
        añadirUserLabel = new javax.swing.JLabel();
        userañdirComboBox = new javax.swing.JComboBox<>();
        eliminarAñadirLabel = new javax.swing.JLabel();
        añadirButton = new javax.swing.JButton();
        eliminarEditarComboBox = new javax.swing.JComboBox<>();
        eliminarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        volverAddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        añadirAdminLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        añadirAdminLabel.setForeground(new java.awt.Color(255, 0, 0));
        añadirAdminLabel.setText("Añadir Administrador");

        añadirUserLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        añadirUserLabel.setText("User Name de la persona que desea añadir");

        userañdirComboBox.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        userañdirComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        userañdirComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userañdirComboBoxActionPerformed(evt);
            }
        });

        eliminarAñadirLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        eliminarAñadirLabel.setText("¿Desea eliminar o editar el usuario?");
        eliminarAñadirLabel.setToolTipText("");

        añadirButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        añadirButton.setText("Añadir");
        añadirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirButtonActionPerformed(evt);
            }
        });

        eliminarEditarComboBox.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        eliminarEditarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        eliminarEditarComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEditarComboBoxActionPerformed(evt);
            }
        });

        eliminarButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        editarButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        volverAddButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        volverAddButton.setText("Volver");
        volverAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(añadirButton)
                        .addGap(251, 251, 251))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eliminarEditarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(añadirUserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userañdirComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(eliminarAñadirLabel)
                                    .addGap(19, 19, 19))))
                        .addGap(146, 146, 146))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverAddButton)
                        .addGap(80, 80, 80)
                        .addComponent(añadirAdminLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(eliminarButton)
                        .addGap(65, 65, 65)
                        .addComponent(editarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(añadirAdminLabel)
                    .addComponent(volverAddButton))
                .addGap(91, 91, 91)
                .addComponent(añadirUserLabel)
                .addGap(39, 39, 39)
                .addComponent(userañdirComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(añadirButton)
                .addGap(29, 29, 29)
                .addComponent(eliminarAñadirLabel)
                .addGap(32, 32, 32)
                .addComponent(eliminarEditarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarButton)
                    .addComponent(editarButton))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void eliminarEditarComboBoxActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                       
        
    }                                                      

    private void userañdirComboBoxActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                  
        
    }                                                 

    private void añadirButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
        
    }                                            

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                               
        
    }                                              

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
        
    }                                            

    private void volverAddButtonActionPerformed(java.awt.event.ActionEvent evt) 
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
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new AddAdmin().setVisible(true);
            }
        });
    }                     
                      
}