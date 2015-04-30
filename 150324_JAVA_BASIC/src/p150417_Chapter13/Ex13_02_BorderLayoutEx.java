package p150417_Chapter13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Ex13_02_BorderLayoutEx {
	public static void main(String[] args) {
		Frame f= new Frame("BorderLayout 연습");
		f.setLayout(new BorderLayout(10,5)); // 가로 갭 : 10, 세로 갭 : 5
		Button north = new Button("north");
		Button south = new Button("south");
		Button east = new Button("east");
		Button west = new Button("west");
		Button center = new Button("center");
		f.add(north,"North");		// "North"로 위치 지정
		f.add("South",south);
		f.add(east,"East");
		f.add(west,"West");
		f.add(center);	// 위치 기본값은 "Center"
		f.setSize(300,300);
		f.setVisible(true);
	}
}
