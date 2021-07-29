package apck;

import javax.swing.JFrame;

public class HelloWorld extends JFrame{
	public HelloWorld() {
		setTitle("Hello World");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(600,600);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new HelloWorld();
	}
	
}
