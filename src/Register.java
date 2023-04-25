public class Register extends javax.swing.JFrame 
{

    public javax.swing.JButton aceptarRegisterButton;
    public javax.swing.JPasswordField contraRegisterField;
    public javax.swing.JLabel contraRegisterLabel;
    public javax.swing.JLabel registerLabel;
    public javax.swing.JLabel usernameRegisterLabel;
    public javax.swing.JTextField usernameRegisterTextField;
    public javax.swing.JButton volverRegisterButton;
    
    public Register() 
    {
        initComponents();
    }

    
    @SuppressWarnings("")                         
    private void initComponents() 
    {

        usernameRegisterLabel = new javax.swing.JLabel();
        usernameRegisterTextField = new javax.swing.JTextField();
        registerLabel = new javax.swing.JLabel();
        contraRegisterLabel = new javax.swing.JLabel();
        contraRegisterField = new javax.swing.JPasswordField();
        aceptarRegisterButton = new javax.swing.JButton();
        volverRegisterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameRegisterLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        usernameRegisterLabel.setText("Introduzca su nuevo User Name");

        registerLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        registerLabel.setForeground(new java.awt.Color(255, 0, 0));
        registerLabel.setText("Register");

        contraRegisterLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12));
        contraRegisterLabel.setText("Introduzca su nueva contraseña");

        aceptarRegisterButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        aceptarRegisterButton.setText("Registrarse");
        aceptarRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarRegisterButtonActionPerformed(evt);
            }
        });

        volverRegisterButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        volverRegisterButton.setText("Volver");
        volverRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverRegisterButtonActionPerformed(evt);
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
                        .addComponent(volverRegisterButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(registerLabel)
                                    .addGap(225, 225, 225))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(contraRegisterLabel)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(usernameRegisterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(usernameRegisterTextField)))
                                    .addGap(157, 157, 157)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(aceptarRegisterButton)
                        .addGap(217, 217, 217))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerLabel)
                    .addComponent(volverRegisterButton))
                .addGap(84, 84, 84)
                .addComponent(usernameRegisterLabel)
                .addGap(36, 36, 36)
                .addComponent(usernameRegisterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(contraRegisterLabel)
                .addGap(34, 34, 34)
                .addComponent(contraRegisterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(aceptarRegisterButton)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void volverRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                     
        if (evt.getSource() == volverRegisterButton)
        {
            LoginCliente cliente = new LoginCliente();
            cliente.setVisible(true);
            cliente.setLocationRelativeTo(null);
            this.setVisible(false);
        } 
    }                                                   

    private void aceptarRegisterButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                      
        
    }                                                     

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
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
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }                                    
}
