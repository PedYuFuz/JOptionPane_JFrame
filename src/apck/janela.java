package apck;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class janela extends JFrame implements ActionListener{
	
	JButton b = new JButton("Aperte");
	JButton b2 = new JButton("Sair");
	JButton jb = new JButton("skdafjij");
	Font font = new Font("Arial", Font.BOLD, 21);
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			JOptionPane.showMessageDialog(null, "Oi");
		}
		if(e.getSource()==b2) {
			System.exit(0);
		}
	}
	
	public janela() {
		setTitle("Primeira janela");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		setVisible(true);
		setLocationRelativeTo(null);
		
		b.addActionListener(this);
		b2.addActionListener(this);
		
		b.setFont(font);
		b.setForeground(Color.white);
		b.setBackground(Color.black);
		
		//setLayout(new BorderLayout()); BorderLayout
		
		setLayout(new GridLayout(3,3));
		add(jb);
		//setLayout(new FlowLayout(FlowLayout.CENTER)); 
		add(b);
		add(b2);
		
		
		//b.setBounds(100, 100, 100, 100);
		//b2.setBounds(200, 500, 100, 100);
		
		//BorderLayout
		//add(BorderLayout.CENTER, b);
		//add(BorderLayout.NORTH, b2);
		//add(b2);
	}
	
	public static void main(String[] args) {
		new janela();
	}
	
}
