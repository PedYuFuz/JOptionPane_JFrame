package apck;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame implements ActionListener{
	
	JButton button = new JButton();
	
	public Window()
	{
		setTitle("Game");
		setSize(500,500);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		button.setLayout(new FlowLayout());
		add(button);
		button.addActionListener(this);	
	}
	
	public static void main(String[] args) {
		new Window();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			System.exit(0);
		}
	}
}
