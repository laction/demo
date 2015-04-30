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

/* 마우스 이벤트 예제
 * MouseEvent 관련있는 리스너
 * MouseListener : 마우스 버튼 클릭, 더블클릭 등 관리
 * MouseMotionListener : 마우스의 움직임을 관리
 * 
 * MouseAdapter : 마우스 관련 이벤트를 기본적으로 구현해놓음.
 * */
public class Ex13_06_MouseEventEx extends Frame implements ActionListener{
	Label move = new Label("마우스 따라 다니기", Label.CENTER);
	Button exit = new Button("종료");
	
	public Ex13_06_MouseEventEx() {
		super("마우스 Motion 테스트");
		setLayout(null);
			// setBounds : setLocation + setSize 기능
			// 100,50 : 위치지정
			// 150,20 : 가로크기 150, 세로크기 20
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
