package Client_Master;

public class MasterApp extends javax.swing.JFrame
{

    public javax.swing.JLabel administraciónLabel;
    public javax.swing.JButton agregarAdminButton;
    public javax.swing.JButton agregarPlatilloButton;
    public javax.swing.JButton editarPlatillosButton;
    public javax.swing.JButton salirAdminButton;
    public javax.swing.JButton visualizarPedidosButton;

    public MasterApp() 
    {
        initComponents();
    }

    @SuppressWarnings("")                          
    private void initComponents() 
    {

        administraciónLabel = new javax.swing.JLabel();
        agregarAdminButton = new javax.swing.JButton();
        agregarPlatilloButton = new javax.swing.JButton();
        editarPlatillosButton = new javax.swing.JButton();
        visualizarPedidosButton = new javax.swing.JButton();
        salirAdminButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        administraciónLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        administraciónLabel.setForeground(new java.awt.Color(255, 0, 0));
        administraciónLabel.setText("Administración");//hcehciebvuebv

        agregarAdminButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        agregarAdminButton.setText("Agregar administrador");
        agregarAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAdminButtonActionPerformed(evt);
            }
        });

        agregarPlatilloButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        agregarPlatilloButton.setText("Agregar platillos");
        agregarPlatilloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPlatilloButtonActionPerformed(evt);
            }
        });

        editarPlatillosButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        editarPlatillosButton.setText("Eliminar y editar platillos");
        editarPlatillosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPlatillosButtonActionPerformed(evt);
            }
        });

        visualizarPedidosButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        visualizarPedidosButton.setText("Visualizar pedidos");
        visualizarPedidosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarPedidosButtonActionPerformed(evt);
            }
        });

        salirAdminButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        salirAdminButton.setText("Salir");
        salirAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirAdminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salirAdminButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(administraciónLabel)
                .addGap(201, 201, 201))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarAdminButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregarPlatilloButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editarPlatillosButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(visualizarPedidosButton)))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(administraciónLabel)
                    .addComponent(salirAdminButton))
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarPlatilloButton))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarPlatillosButton)
                    .addComponent(visualizarPedidosButton))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void agregarAdminButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                   
        AddAdmin add = new AddAdmin();
        add.setVisible(true);
        add.setLocationRelativeTo(null);
        this.setVisible(false);
    }                                                  

    private void agregarPlatilloButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                      
        AddPlatillo addPlatillo = new AddPlatillo();
        addPlatillo.setVisible(true);
        addPlatillo.setLocationRelativeTo(null);
        this.setVisible(false);
    }                                                     

    private void editarPlatillosButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                      
            ElimEditPlatillos elimEdit = new ElimEditPlatillos();
            elimEdit.setVisible(true);
            elimEdit.setLocationRelativeTo(null);
            this.setVisible(false);
    }                                                     

    private void visualizarPedidosButtonActionPerformed(java.awt.event.ActionEvent evt) {
        PedidosActivos pedidos = new PedidosActivos();
        pedidos.setVisible(true);
        pedidos.setLocationRelativeTo(null);
        this.setVisible(false);
    }                                                       

    private void salirAdminButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                 
        LoginCliente cliente = new LoginCliente();
        cliente.setVisible(true);
        cliente.setLocationRelativeTo(null);
        this.setVisible(false);  
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
            java.util.logging.Logger.getLogger(MasterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterApp().setVisible(true);
            }
        });
    }                 
                     
}