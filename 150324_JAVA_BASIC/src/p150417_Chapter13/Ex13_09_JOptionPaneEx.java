package p150417_Chapter13;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
// JOptionPane 예제
public class Ex13_09_JOptionPaneEx extends JFrame implements ActionListener{
	
	public static void main(String[] args) {
		new Ex13_09_JOptionPaneEx();
	}
	
	JButton msg, input, option;
	Icon icon;
	Font font;
	public Ex13_09_JOptionPaneEx() {
		super("JOptionPane 연습");
		msg = new JButton("메시지 다이얼로그");
		msg.addActionListener(this);
		input = new JButton("입력 다이얼로그");
		input.addActionListener(this);
		option = new JButton("옵션 다이얼로그");
		option.addActionListener(this);
		icon = new ImageIcon("a.gif");
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				/* 외부클래스에 접근하기 위해, (클래스명).this 를 사용
				 * showConfirmDialog : 선택이 가능한 Dialog
				 * JOptionPaneEx.this : Owner 설정, JOptionPaneEx 객체 의미. 
				 * */
				int res = JOptionPane.showConfirmDialog(
						Ex13_09_JOptionPaneEx.this, "종료하시겠습니까?");
				if(res == JOptionPane.YES_OPTION)  System.exit(0);
			}
		});
		JPanel panel = new JPanel();
		panel.add(msg);	panel.add(input);
		panel.add(option);
		add(panel);
		setSize(250,200);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == msg){
			/* showMessageDialog : 확인메시지 보기
			 *   this : 현재 Frame과 연결되는 Dialog 페이지
			 *   			Owner(소유페이지)
			 *   "메시지다이얼로그" : 내용
			 *   "메시지" : 타이틀
			 *   JOptionPane.YES_NO_OPTION : 버튼 종류
			 *   icon : 아이콘 그림 설정.
			 * */
			JOptionPane.showMessageDialog(
					this, "메시지다이얼로그", "메시지",
					JOptionPane.YES_NO_OPTION,icon);
		}else if(e.getSource() == input){
			/* showInputDialog : 입력받기 가능한 Dialog
			 *    this : Owner
			 *    "하나를 선택하세요" : 내용
			 *    "입력" : 타이틀
			 *    "JOptionPane.QUESTION_MESSAGE : ? 표시. 
			 *    icon : 아이콘 그램
			 *    new Object[]{"사과","딸기","포도"} : 목록
			 *    "사과" : 처음 선택 
			 * */
			Object res = JOptionPane.showInputDialog(
					this, "하나를 선택하세요", "입력", JOptionPane.QUESTION_MESSAGE, icon,
					new Object[]{"사과","딸기","포도"}, "사과");
			JOptionPane.showMessageDialog(
					this, "선택값 : " + res,"입력결과 ",
					JOptionPane.INFORMATION_MESSAGE,icon);			
		} else {
			/* showOptionDialog : 선택이 가능한 Dialog 
			 * */
			JOptionPane.showOptionDialog(
					this,"옵션다이얼로그","옵션", JOptionPane.OK_CANCEL_OPTION,	
					JOptionPane.INFORMATION_MESSAGE, icon, new String[] {"one","two","three"}, "one");
		}
		
	}
}
