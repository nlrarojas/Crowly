package view;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class PrincipalWindow extends JFrame{
	private JDesktopPane DesktopPane;
	private ContentWindow Content;
	
	public PrincipalWindow(){
		init();
	}
	
	private void init(){
		this.setLayout(null);
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		this.DesktopPane = new JDesktopPane();
		
		Content = new ContentWindow();
		DesktopPane.add(Content).setBounds(0, 0, 800, 600);
		
		this.getContentPane().add(DesktopPane).setBounds(0, 0, 800, 600);
		repaint();
	}
}
