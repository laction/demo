package p150417_Chapter13;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
// 이벤트 예제 1
/* 이벤트 소스 : 이벤트의 대상
 *  이벤트 리스너 : 이벤트 감시
 *  					ActionEvent : ActionListener
 *  					KeyEvent : KeyListener
 *  					WindowEvent : WindowListener
 *  						....
 *  					(Event) : (Listener)   리스너 등록시, 해당되는 인터페이스로 등록해야된다.
 *  이벤트 핸들러 : 인터페이스 내부의 추상메서드로 이름이 정해져있다. 
 *  
 *  이벤트 처리 방식
 *  1. 이벤트 소스 결정
 *  2. 리스너 등록 : addXXXListener(XXXListener)
 *  3. XXXListener 인터페이스의 핸들러를 구현.
 * */
public class Ex13_05_EventEx1 extends Frame implements ActionListener,WindowListener{
	public static void main(String[] args) {
		new Ex13_05_EventEx1();
	}
	public Ex13_05_EventEx1() {
		Button b = new Button("종료");
		// ActionListener : 등록된 이벤트를 감시한다.
		b.addActionListener(this);
		Panel p = new Panel();
		p.add(b);
		add(p,"South");
		this.setLocation(100,200);
		this.setSize(300,300);
		this.setVisible(true);
		
		WindowListener w1 = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("시스템 종료");		
				System.exit(0);
			}
		};		
//		this.addWindowListener(this);	// 리스너를 직접 집어 넣을 경우, 8개의 추상메서드를 직접 구현해야 한다. 
		this.addWindowListener(w1);	// 어댑터를 씀으로서 필요한 객체만 선언하고 사용하면 된다.
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("시스템 종료");		
		System.exit(0);
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}	
}
