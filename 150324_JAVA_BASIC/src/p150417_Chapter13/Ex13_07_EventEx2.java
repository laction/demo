package p150417_Chapter13;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/* ActionListener Adapter 클래스가 필요없다.
 * ActionEvent : 
 * 		1. 버튼이 눌렸을 때
 * 		2. TextField 또는 TextArea에 엔터키 입력시
 * 		3. List에서 더블클릭시
 * 		4. Menu가 선택되었을 때.
 * */

public class Ex13_07_EventEx2 extends Frame  {
	
	public static void main(String[] args) {
		new Ex13_07_EventEx2();
	}	
	Button b1;
	TextField tf;
	TextArea ta;
	
	FocusListener f1 ;
	ActionListener a1;
	public Ex13_07_EventEx2() {
		f1 = new FocusListener() {
			@Override	public void focusLost(FocusEvent e) {}			
			@Override	public void focusGained(FocusEvent e) {		tf.requestFocus();		}
		};
		a1 = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");
				tf.setText("");
				if(e.getSource() == b1) System.exit(0);				
			}
		};		

		initTf();
		initTa();
		initB1();
		
		setLocation(100,100);
		setSize(300,300);
		setVisible(true);
		tf.requestFocus();
	}
	private void initTa() {
		ta = new TextArea(2,20);		
		add("Center",ta);
		ta.addFocusListener(f1);
	}
	
	private void initB1() {
		b1 = new Button("Close");
		add("South", b1);
		b1.addActionListener(a1);
	}
	private void initTf() {
		tf = new TextField(20);
		add("North",tf);
		addWindowListener(new WindowAdapter() {
			public void windowsClosing(WindowEvent e) {
				System.out.println(tf.getText());
				System.exit(0);
			}
		});
		tf.addFocusListener(f1);
		tf.addActionListener(a1);
	}
	
		
}
