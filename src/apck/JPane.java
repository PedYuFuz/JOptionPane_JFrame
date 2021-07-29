package apck;

import javax.swing.JOptionPane;

public class JPane{
	JOptionPane p = new JOptionPane();
	public JPane() {
		p.showMessageDialog(null, "Hello World");
	}
	
	public static void main(String[] args) {
		new JPane();
	}
}
