import java.awt.BorderLayout;

import javax.swing.*;


public class LoginCliente 
{

    JFrame frame;




    public LoginCliente()
    {
        //Se crea la pantalla a mostrar
        frame = new JFrame();
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setSize(700,700);
        frame.revalidate();
        frame.setLocationRelativeTo(null);
        
    }
}
