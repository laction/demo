package p150417_Chapter13;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Ex13_03_GridLayoutEx {
	public static void main(String[] args) {
		Frame f = new Frame("GridLayout 연습");
		// GridLayout(3,2) : 3행2열로 배치, 더 추가 될 경우 행우선으로 늘어난다.
		f.setLayout(new GridLayout(3,2,10,10));
		f.add(new Button("1")); f.add(new Button("2"));
		f.add(new Button("3")); f.add(new Button("4"));
		f.add(new Button("5")); f.add(new Button("6"));
		f.add(new Button("7"));
		f.setSize(300,300);
		f.setVisible(true);
	}
}
