package p150417_Chapter13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex13_08_JFrameEx extends JFrame{
	
	public static void main(String[] args) {
		new Ex13_08_JFrameEx();
	}
	
	JButton btn = new JButton("����");
	public Ex13_08_JFrameEx() {
	//	this.getContentPane().add(btn);	// 1.4���������� 
		add(btn);
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		setLocation(100,200);
		setSize(100,200);
					// x��ư�� �������� ����.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// swing���� ������ ����.
						// HIDE_ON_CLOSE : X��ư�� ���� �� �����츸 ���ְ� ���μ��� ������ ����
		setVisible(true);
	}
}
