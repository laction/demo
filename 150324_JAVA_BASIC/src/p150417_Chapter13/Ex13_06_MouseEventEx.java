package p150417_Chapter13;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/* ���콺 �̺�Ʈ ����
 * MouseEvent �����ִ� ������
 * MouseListener : ���콺 ��ư Ŭ��, ����Ŭ�� �� ����
 * MouseMotionListener : ���콺�� �������� ����
 * 
 * MouseAdapter : ���콺 ���� �̺�Ʈ�� �⺻������ �����س���.
 * */
public class Ex13_06_MouseEventEx extends Frame implements ActionListener{
	Label move = new Label("���콺 ���� �ٴϱ�", Label.CENTER);
	Button exit = new Button("����");
	
	public Ex13_06_MouseEventEx() {
		super("���콺 Motion �׽�Ʈ");
		setLayout(null);
			// setBounds : setLocation + setSize ���
			// 100,50 : ��ġ����
			// 150,20 : ����ũ�� 150, ����ũ�� 20
		move.setBounds(100,50,150,20);
		exit.setBounds(250,500,50,30);
		move.setBackground(Color.red);
		add(move);
		add(exit);
		setBounds(300,100,500,600);
		setVisible(true);
		exit.addActionListener(this);
		addMouseMotionListener( new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				Point p = e.getPoint();
				move.setLocation(p);
			}
		});
	}

	public static void main(String[] args) {
		new Ex13_06_MouseEventEx();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
