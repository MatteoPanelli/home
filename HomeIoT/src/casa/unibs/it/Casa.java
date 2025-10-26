package casa.unibs.it;

import javax.swing.*;
import java.awt.*;

public class Casa {
	
	
	private JFrame frame;
	private String IMM  = "imm.png";
	
	public Casa() {
		frame = new JFrame();
		frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);    //apre la finestra al centro dello schermo

        // Creazione del pannello con sfondo personalizzato
        JPanel p = new JPanel() {
            private Image sfondo = new ImageIcon(
                getClass().getResource(IMM) 
            ).getImage();

            //
            @Override
            protected void paintComponent(Graphics g) {   //metodo per disegnare lo sfondo
                super.paintComponent(g);					//chiama il metodo della superclasse
                g.drawImage(sfondo, 0, 0, getWidth(), getHeight(), this);
            }
        };

        p.setLayout(new BorderLayout());
        
        

       
        frame.setContentPane(p);
        
        frame.setVisible(true);
    }
    

    public static void main(String[] args) {
        Casa home = new Casa();


	}
	
}
