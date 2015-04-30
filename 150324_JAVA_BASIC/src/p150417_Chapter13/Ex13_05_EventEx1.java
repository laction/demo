package p150417_Chapter13;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
// �̺�Ʈ ���� 1
/* �̺�Ʈ �ҽ� : �̺�Ʈ�� ���
 *  �̺�Ʈ ������ : �̺�Ʈ ����
 *  					ActionEvent : ActionListener
 *  					KeyEvent : KeyListener
 *  					WindowEvent : WindowListener
 *  						....
 *  					(Event) : (Listener)   ������ ��Ͻ�, �ش�Ǵ� �������̽��� ����ؾߵȴ�.
 *  �̺�Ʈ �ڵ鷯 : �������̽� ������ �߻�޼���� �̸��� �������ִ�. 
 *  
 *  �̺�Ʈ ó�� ���
 *  1. �̺�Ʈ �ҽ� ����
 *  2. ������ ��� : addXXXListener(XXXListener)
 *  3. XXXListener �������̽��� �ڵ鷯�� ����.
 * */
public class Ex13_05_EventEx1 extends Frame implements ActionListener,WindowListener{
	public static void main(String[] args) {
		new Ex13_05_EventEx1();
	}
	public Ex13_05_EventEx1() {
		Button b = new Button("����");
		// ActionListener : ��ϵ� �̺�Ʈ�� �����Ѵ�.
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
				System.out.println("�ý��� ����");		
				System.exit(0);
			}
		};		
//		this.addWindowListener(this);	// �����ʸ� ���� ���� ���� ���, 8���� �߻�޼��带 ���� �����ؾ� �Ѵ�. 
		this.addWindowListener(w1);	// ����͸� �����μ� �ʿ��� ��ü�� �����ϰ� ����ϸ� �ȴ�.
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�ý��� ����");		
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
