import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class e150424_Chat extends JFrame {
	public static void main(String[] args) {
		new e150424_Chat();
	}

	JButton bConvertIP;
	Label tfDomainInput_label;
	JTextField tfDomainInput;
	JTextArea taListIP;

	e150424_Chat() {
		initForm();		
		bConvertIP.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					InetAddress[] ipArr = InetAddress.getAllByName(tfDomainInput.getText());
					System.out.println(tfDomainInput);					
					taListIP.setText("");					
					for(InetAddress s : ipArr)		taListIP.append(s+"\n");					
				} catch (UnknownHostException e1) {		e1.printStackTrace();		}
			}
		});		
	}
	
	
	
	
	
	
	
	

	private void initForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(new GridLayout());

		this.setLayout(null);

		int px = 0, py = 0;
		int w = 0, h = 0;

		w = 100;
		h = 30;
		tfDomainInput_label = new Label("도메인 : ");
		tfDomainInput_label.setSize(w, h);
		tfDomainInput_label.setLocation(px, py);
		getContentPane().add(tfDomainInput_label);
		px += w;

		w = 170;
		h = 30;
		tfDomainInput = new JTextField();
		tfDomainInput.setSize(w, h);
		tfDomainInput.setLocation(px, py);
		getContentPane().add(tfDomainInput);
		px += w;

		w = 130;
		h = 30;
		bConvertIP = new JButton("아이피변환");
		bConvertIP.setSize(w, h);
		bConvertIP.setLocation(px, py);
		getContentPane().add(bConvertIP);
		px += w;

		px = 0;
		py = 30;

		w = 400;
		h = 270;
		taListIP = new JTextArea();
		taListIP.setSize(w, h);
		taListIP.setLocation(px, py);
		getContentPane().add(taListIP);
		px += w;

		setSize(400, 300);
		setVisible(true);
	}
}
