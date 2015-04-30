package p150417_Chapter13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex13_08_JFrameEx extends JFrame{
	
	public static void main(String[] args) {
		new Ex13_08_JFrameEx();
	}
	
	JButton btn = new JButton("연습");
	public Ex13_08_JFrameEx() {
	//	this.getContentPane().add(btn);	// 1.4버젼까지는 
		add(btn);
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		setLocation(100,200);
		setSize(100,200);
					// x버튼이 눌려지면 종료.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// swing에서 가지고 있음.
						// HIDE_ON_CLOSE : X버튼을 누를 때 윈도우만 없애고 프로세스 여전히 동작
		setVisible(true);
	}
}
