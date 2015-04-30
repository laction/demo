package p150417_Chapter13;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

// FlowLayout 예제
public class Ex13_01_FlowLayoutEx {
	public static void main(String[] args) {
		Frame f = new Frame("FlowLayout 연습");
		Button b1 = new Button("Button 1");	
		Button b2 = new Button("Button 2");
		Button b3 = new Button("Button 3");
		Button b4 = new Button("Button 4");
		Button b5 = new Button("Button 5");
		//f.setLayout(new FlowLayout());		// setLayout : 배치관리자 변경
		f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
		f.setSize(300,300);		// 크기
		f.setLocation(200,200);	// 위치
		f.setVisible(true);
	}
}
