public class LoginCliente extends javax.swing.JFrame 
{

    public javax.swing.JLabel AdminLabel;
    public javax.swing.JButton aceptarButton;
    public javax.swing.JPasswordField contraField;
    public javax.swing.JLabel contraLabel;
    public javax.swing.JLabel loginLabel;
    public javax.swing.JButton loginRegisterButton;
    public javax.swing.JButton registerButton;
    public javax.swing.JLabel registerLabel;
    public javax.swing.JLabel usernameLabel;
    public javax.swing.JTextField usernameTextField;



    public LoginCliente() {
        initComponents();
    }

    
    @SuppressWarnings("")                          
    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        contraLabel = new javax.swing.JLabel();
        contraField = new javax.swing.JPasswordField();
        registerLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        AdminLabel = new javax.swing.JLabel();
        loginRegisterButton = new javax.swing.JButton();
        aceptarButton = new javax.swing.JButton();
        
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        loginLabel.setForeground(new java.awt.Color(255, 0, 0));
        loginLabel.setText("Login");

        usernameLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        usernameLabel.setText("Introduzca su User Name");

        usernameTextField.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 

        contraLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        contraLabel.setText("Introduzca su contraseña");

        contraField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraFieldActionPerformed(evt);
            }
        });

        registerLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        registerLabel.setText("¿No tienes una cuenta aún?");

        registerButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        registerButton.setText("Registrarse");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        AdminLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        AdminLabel.setText("¿Eres un administrador?");

        loginRegisterButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        loginRegisterButton.setText("Login");
        loginRegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginRegisterButtonActionPerformed(evt);
            }
        });

        aceptarButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        aceptarButton.setText("Login");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginClient(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contraLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contraField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(192, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(AdminLabel)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginRegisterButton)
                                .addGap(52, 52, 52))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registerButton)
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(aceptarButton)
                        .addGap(248, 248, 248))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginLabel)
                        .addGap(83, 83, 83)
                        .addComponent(usernameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(contraLabel)
                        .addGap(18, 18, 18)
                        .addComponent(contraField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(aceptarButton)
                        .addGap(32, 32, 32)
                        .addComponent(registerLabel)
                        .addGap(18, 18, 18)
                        .addComponent(registerButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AdminLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginRegisterButton)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }                       
    private void contraFieldActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    } 
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt)
    {                                                    
        if (evt.getSource() == registerButton)
        {
            Register register = new Register();
            register.setVisible(true);
            register.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }
    private void loginRegisterButtonActionPerformed(java.awt.event.ActionEvent evt)
    {                                                    
        if (evt.getSource() == loginRegisterButton)
        {
            LoginAdmin admin = new LoginAdmin();
            admin.setVisible(true);
            admin.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }
    private void LoginClient(java.awt.event.ActionEvent evt){
        if (evt.getSource() == aceptarButton){
            ClientApp client = new ClientApp();
            client.setVisible(true);
            client.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }
}