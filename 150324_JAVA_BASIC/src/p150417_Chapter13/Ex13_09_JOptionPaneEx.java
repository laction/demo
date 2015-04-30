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
// JOptionPane ����
public class Ex13_09_JOptionPaneEx extends JFrame implements ActionListener{
	
	public static void main(String[] args) {
		new Ex13_09_JOptionPaneEx();
	}
	
	JButton msg, input, option;
	Icon icon;
	Font font;
	public Ex13_09_JOptionPaneEx() {
		super("JOptionPane ����");
		msg = new JButton("�޽��� ���̾�α�");
		msg.addActionListener(this);
		input = new JButton("�Է� ���̾�α�");
		input.addActionListener(this);
		option = new JButton("�ɼ� ���̾�α�");
		option.addActionListener(this);
		icon = new ImageIcon("a.gif");
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				/* �ܺ�Ŭ������ �����ϱ� ����, (Ŭ������).this �� ���
				 * showConfirmDialog : ������ ������ Dialog
				 * JOptionPaneEx.this : Owner ����, JOptionPaneEx ��ü �ǹ�. 
				 * */
				int res = JOptionPane.showConfirmDialog(
						Ex13_09_JOptionPaneEx.this, "�����Ͻðڽ��ϱ�?");
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
			/* showMessageDialog : Ȯ�θ޽��� ����
			 *   this : ���� Frame�� ����Ǵ� Dialog ������
			 *   			Owner(����������)
			 *   "�޽������̾�α�" : ����
			 *   "�޽���" : Ÿ��Ʋ
			 *   JOptionPane.YES_NO_OPTION : ��ư ����
			 *   icon : ������ �׸� ����.
			 * */
			JOptionPane.showMessageDialog(
					this, "�޽������̾�α�", "�޽���",
					JOptionPane.YES_NO_OPTION,icon);
		}else if(e.getSource() == input){
			/* showInputDialog : �Է¹ޱ� ������ Dialog
			 *    this : Owner
			 *    "�ϳ��� �����ϼ���" : ����
			 *    "�Է�" : Ÿ��Ʋ
			 *    "JOptionPane.QUESTION_MESSAGE : ? ǥ��. 
			 *    icon : ������ �׷�
			 *    new Object[]{"���","����","����"} : ���
			 *    "���" : ó�� ���� 
			 * */
			Object res = JOptionPane.showInputDialog(
					this, "�ϳ��� �����ϼ���", "�Է�", JOptionPane.QUESTION_MESSAGE, icon,
					new Object[]{"���","����","����"}, "���");
			JOptionPane.showMessageDialog(
					this, "���ð� : " + res,"�Է°�� ",
					JOptionPane.INFORMATION_MESSAGE,icon);			
		} else {
			/* showOptionDialog : ������ ������ Dialog 
			 * */
			JOptionPane.showOptionDialog(
					this,"�ɼǴ��̾�α�","�ɼ�", JOptionPane.OK_CANCEL_OPTION,	
					JOptionPane.INFORMATION_MESSAGE, icon, new String[] {"one","two","three"}, "one");
		}
		
	}
}
