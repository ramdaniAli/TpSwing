package Question1;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameOne extends JFrame{

/**
	 * 
	 */
	private static final long serialVersionUID = -6111157653321500607L;
	


	





public void question1 () {
	
	JButton bouton = new JButton ()	;
	JPanel panel = new JPanel() ; 

	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Question1");
	this.setResizable(false);
	this.setAlwaysOnTop(true);
	//this.setLayout(new BorderLayout());
	
	bouton.setText("coucou");
	panel.add(bouton);
	this.setContentPane(panel);
	//this.getContentPane().add(bouton, BorderLayout.NORTH);
	
	this.pack();
	//this.setSize(300, 200);
	this.setLocation(10,40);
	this.setVisible(true);
}

public void question2 () {
	JPanel panel = new JPanel() ; 
	JButton bouton = new JButton ()	;
	JButton bouton2 = new JButton ()	;
			
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Question2");
	this.setResizable(false);
	this.setAlwaysOnTop(true);
	/**this.setLayout(new BorderLayout());
	this.setLayout(new FlowLayout());
	this.setLayout(new GridLayout());
	*/
	bouton.setText("test1");
	bouton2.setText("test2");
	
	
	panel.add(bouton );
	panel.add(bouton2);
	this.setContentPane(panel);
	
	//this.getContentPane().add(bouton, BorderLayout.setPrefredSize() );
	
	this.pack();
	///this.setSize(300, 200);
	this.setLocation(10,40);
	this.setVisible(true);
	
}


public void question3 () throws IOException {
	
	

	JButton haut = new JButton ();
	JButton bas = new JButton()	;
	JButton guauche = new JButton();
	JButton droite = new JButton()	;
	
	
	Image souris = ImageIO.read(getClass().getResource("souris.png"));
	Image mouton = ImageIO.read(getClass().getResource("mouton.png"));
	Image fleur = ImageIO.read(getClass().getResource("fleur.png"));
	Image poulet = ImageIO.read(getClass().getResource("poulet.png"));

	haut.setIcon(new ImageIcon(poulet));
	bas.setIcon(new ImageIcon(mouton));
	guauche.setIcon(new ImageIcon(souris));
	droite.setIcon(new ImageIcon(fleur));

	

	
	
	JPanel h = new JPanel();
    h.setLayout(new BoxLayout(h, BoxLayout.LINE_AXIS));
    h.add(haut);
    
    
    JPanel b = new JPanel();
    b.setLayout(new BoxLayout(b, BoxLayout.LINE_AXIS));
    b.add(bas);
    

    
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
    panel.add(h);
    panel.add(b);
    
    
  
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("Question3");
	this.setResizable(false);
	this.setAlwaysOnTop(true);

	
	this.getContentPane().add(guauche, BorderLayout.WEST);
	this.getContentPane().add(droite, BorderLayout.EAST);
	this.getContentPane().add(panel);
	
	
	this.setLocationRelativeTo(null);
	this.setSize(500, 300);
	this.setVisible(true);
	
}



}//Frame One
