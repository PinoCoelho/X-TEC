import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;
//import javax.swing.event.AncestorListener;


public class MasterApp implements ActionListener, java.awt.event.ActionListener 
{
    JFrame frame;
    public MasterApp()
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}