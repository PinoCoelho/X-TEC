public class LoginAdmin extends javax.swing.JFrame 
{

    public javax.swing.JButton aceptarAdminButton;
    public javax.swing.JButton volverAdminButton;
    public javax.swing.JPasswordField contraAdminField;
    public javax.swing.JLabel contraAdminLabel;
    public javax.swing.JLabel loginAdminLabel;
    public javax.swing.JLabel usernameAdminLabel;
    public javax.swing.JTextField usernameAdminTextField;

    public LoginAdmin() {
        initComponents();
    }

    
    @SuppressWarnings("")                        
    private void initComponents() {

        usernameAdminLabel = new javax.swing.JLabel();
        loginAdminLabel = new javax.swing.JLabel();
        usernameAdminTextField = new javax.swing.JTextField();
        contraAdminLabel = new javax.swing.JLabel();
        contraAdminField = new javax.swing.JPasswordField();
        aceptarAdminButton = new javax.swing.JButton();
        volverAdminButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameAdminLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        usernameAdminLabel.setText("Introduzca su User Name");

        loginAdminLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        loginAdminLabel.setForeground(new java.awt.Color(255, 0, 0));
        loginAdminLabel.setText("Login Admin");

        contraAdminLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        contraAdminLabel.setText("Introduzca su contraseña");

        contraAdminField.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 

        aceptarAdminButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        aceptarAdminButton.setText("Login");

        volverAdminButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        volverAdminButton.setText("Volver");
        volverAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAdminButtonActionPerformed(evt);
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
                        .addComponent(volverAdminButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(loginAdminLabel)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contraAdminLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(usernameAdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(usernameAdminTextField))
                                    .addComponent(contraAdminField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(189, 189, 189))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(aceptarAdminButton)
                                .addGap(241, 241, 241))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginAdminLabel)
                    .addComponent(volverAdminButton))
                .addGap(101, 101, 101)
                .addComponent(usernameAdminLabel)
                .addGap(18, 18, 18)
                .addComponent(usernameAdminTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contraAdminLabel)
                .addGap(18, 18, 18)
                .addComponent(contraAdminField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(aceptarAdminButton)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        pack();
    }                       

    private void volverAdminButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                 
        if (evt.getSource() == volverAdminButton){
            LoginCliente cliente = new LoginCliente();
            cliente.setVisible(true);
            cliente.setLocationRelativeTo(null);
            this.setVisible(false);
        }
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
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginAdmin().setVisible(true);
            }
        });
    }                
}