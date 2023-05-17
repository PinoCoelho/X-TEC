package Client_Master;

import javax.swing.*;
import java.io.IOException;

public class AddPlatillo extends javax.swing.JFrame {

    public javax.swing.JButton añadirPlatilloButton;
    public javax.swing.JLabel añadirPlatilloLabel;
    public javax.swing.JLabel caloriasPlatilloLabel;
    public javax.swing.JTextField caloriasPlatilloTextField;
    public javax.swing.JLabel nombrePlatilloLabel;
    public javax.swing.JTextField nombrePlatilloTextField;
    public javax.swing.JLabel precioPlatilloLabel;
    public javax.swing.JTextField precioPlatilloTextField;
    public javax.swing.JLabel tiempoPlatilloLabel;
    public javax.swing.JTextField tiempoPlatilloTextfield;
    public javax.swing.JButton volverPlatilloButton;

    public AddPlatillo() 
    {
        initComponents();
    }

    /**
     * Metodo creado por java swing para
     * crear una ventana y agregar sus
     * componentes. Este se crea automaticamente.
     */
    @SuppressWarnings("")                         
    private void initComponents() 
    {

        añadirPlatilloLabel = new javax.swing.JLabel();
        nombrePlatilloLabel = new javax.swing.JLabel();
        nombrePlatilloTextField = new javax.swing.JTextField();
        caloriasPlatilloLabel = new javax.swing.JLabel();
        caloriasPlatilloTextField = new javax.swing.JTextField();
        tiempoPlatilloLabel = new javax.swing.JLabel();
        tiempoPlatilloTextfield = new javax.swing.JTextField();
        precioPlatilloLabel = new javax.swing.JLabel();
        precioPlatilloTextField = new javax.swing.JTextField();
        añadirPlatilloButton = new javax.swing.JButton();
        volverPlatilloButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        añadirPlatilloLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        añadirPlatilloLabel.setForeground(new java.awt.Color(255, 0, 0));
        añadirPlatilloLabel.setText("Añadir Platillos");

        nombrePlatilloLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        nombrePlatilloLabel.setText("Nombre del platillo que desea añadir");

        caloriasPlatilloLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        caloriasPlatilloLabel.setText("Cantidad de calorias que contiene el platillo");

        tiempoPlatilloLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        tiempoPlatilloLabel.setText("Tiempo de preparación del platillo");

        precioPlatilloLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        precioPlatilloLabel.setText("Precio del platillo a añadir");

        añadirPlatilloButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        añadirPlatilloButton.setText("Añadir");
        añadirPlatilloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    añadirPlatilloButtonActionPerformed(evt);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        volverPlatilloButton.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); 
        volverPlatilloButton.setText("Volver");
        volverPlatilloButton.setToolTipText("");
        volverPlatilloButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverPlatilloButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(volverPlatilloButton)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(añadirPlatilloLabel)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombrePlatilloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombrePlatilloTextField))
                        .addContainerGap(153, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tiempoPlatilloTextfield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tiempoPlatilloLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioPlatilloTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(caloriasPlatilloTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(precioPlatilloLabel)
                        .addGap(182, 182, 182))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(caloriasPlatilloLabel)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(añadirPlatilloButton)
                        .addGap(244, 244, 244))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirPlatilloLabel)
                    .addComponent(volverPlatilloButton))
                .addGap(46, 46, 46)
                .addComponent(nombrePlatilloLabel)
                .addGap(18, 18, 18)
                .addComponent(nombrePlatilloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(caloriasPlatilloLabel)
                .addGap(18, 18, 18)
                .addComponent(caloriasPlatilloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tiempoPlatilloLabel)
                .addGap(18, 18, 18)
                .addComponent(tiempoPlatilloTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(precioPlatilloLabel)
                .addGap(18, 18, 18)
                .addComponent(precioPlatilloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(añadirPlatilloButton)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }

    /**
     * Funcionalidad de boton para
     * volver a la ventana anterior.
     * @param evt se presiona el boton
     */
    private void volverPlatilloButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        MasterApp master = new MasterApp();
        master.setVisible(true);
        master.setLocationRelativeTo(null);
        this.setVisible(false);

    }

    /**
     * Funcionalidad de boton para agregar
     * un platillo al menu, se hace uso del
     * socket para enviar un output al servidor
     * con la informacion en los textfields,
     * luego se muestra un mensaje con el resultado
     * del metodo.
     * @param evt se presiona el boton
     * @throws IOException en caso de que el socket falle
     */
    private void añadirPlatilloButtonActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        Sockets.out.println("agregarPlatillo");
        Sockets.out.println(nombrePlatilloTextField.getText());
        Sockets.out.println(caloriasPlatilloTextField.getText());
        Sockets.out.println(tiempoPlatilloTextfield.getText());
        Sockets.out.println(precioPlatilloTextField.getText());
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), Sockets.in.readLine(), "", JOptionPane.ERROR_MESSAGE);
        nombrePlatilloTextField.setText("");
        caloriasPlatilloTextField.setText("");
        tiempoPlatilloTextfield.setText("");
        precioPlatilloTextField.setText("");
    }

    /**
     * Funcion main en caso de que
     * se quiera acceder a la ventana
     * directamente.
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
            java.util.logging.Logger.getLogger(AddPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPlatillo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            /**
             * Metodo que visibiliza la ventana
             */
            public void run() {
                new AddPlatillo().setVisible(true);
            }
        });
    }                   
                      
}
