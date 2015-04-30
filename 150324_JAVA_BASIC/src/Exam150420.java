import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Exam150420 extends JFrame implements ActionListener{
	public static void main(String[] args) {		
		new Exam150420();		
	}
	
	public Exam150420() {
		super("绊按颇老阑 积己");
		setLayout(new GridLayout(3,2));
		
		addWindowListener(new WindowAdapter(){
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
		setSize(250,250);
		setVisible(true);
	}
		
	TextField account,name,balance;
	JButton enter,done,read;
	
			
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
	}
	
	
}
