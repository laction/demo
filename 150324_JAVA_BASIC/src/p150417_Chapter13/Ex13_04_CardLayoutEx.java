package p150417_Chapter13;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex13_04_CardLayoutEx {
	public static void main(String[] args) {
		Frame f= new Frame ("CardLayout ����");
		CardLayout c = new CardLayout();
		f.setLayout(c);
		Panel p1 = new Panel();
		p1.setBackground(Color.LIGHT_GRAY);
		p1.add(new Label("Card 1"));
		Panel p2 = new Panel();
		p2.setBackground(Color.orange);
		p2.add(new Label("Card 2"));
		Panel p3 = new Panel();
		p3.setBackground(Color.cyan);
		p3.add(new Label("Card 3"));
		f.add(p1,"1");f.add(p2,"2");f.add(p3,"3");
		class Handler extends MouseAdapter{
			public void mouseClicked(MouseEvent e){
				if(e.getModifiers() == e.BUTTON3_DOWN_MASK)	// ������ Ŭ���� ����
					c.previous(f);
				else 
					c.next(f);
			}
		}
		p1.addMouseListener(new Handler());		// �̺�Ʈ ���
		p2.addMouseListener(new Handler());
		p3.addMouseListener(new Handler());
		f.setSize(200,200);
		f.setLocation(200,200);
		f.setVisible(true);
		c.show(f, "3");		
	}
}
