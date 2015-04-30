import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Exercise13_7 extends Frame implements MouseListener {
	
	final int LINE_NUM = 9; // ������ �� ��
	final int LINE_WIDTH = 30; // ������ �� ����
	final int BOARD_SIZE = LINE_WIDTH * (LINE_NUM - 1); // �������� ũ��
	final int STONE_SIZE = (int) (LINE_WIDTH * 0.8); // ���� ũ��
	final int X0; // x ������ ������ġ ��ǥ
	final int Y0; // y ������ ������ġ ��ǥ
	final int FRAME_WIDTH; // Frame�� ��
	final int FRAME_HEIGHT; // Frame�� ����
	Image img = null;
	Graphics gImg = null;
	
	ArrayList<String> record = new ArrayList<String>();

	public Exercise13_7(String title) {
		super(title);
		// Event Handler . �� ����Ѵ�
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		setVisible(true); // Frame . �� ȭ�鿡 ���̰� �Ѵ�
		Insets insets = getInsets(); // Insets . ȭ�鿡 ���̱� ������ �� ���� ���� �� ����
		// (LEFT, TOP) X0, Y0 . ������ �׷��� ��ġ �� ��ǥ �� �����Ѵ�
		X0 = insets.left + LINE_WIDTH;
		Y0 = insets.top + LINE_WIDTH;
		// Frame . �� ũ�⸦ ����Ѵ�
		FRAME_WIDTH = BOARD_SIZE + LINE_WIDTH * 2 + insets.left + insets.right;
		FRAME_HEIGHT = BOARD_SIZE + LINE_WIDTH * 2 + insets.top + insets.bottom
				+20;
		
		setLayout(null);		
		Button btnReset = new Button("�ٽ��ϱ�");
		btnReset.setLocation(0,FRAME_HEIGHT-20);
		btnReset.setSize(FRAME_WIDTH/2,20);
		btnReset.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				gImg.setColor(Color.white);
				gImg.fillRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
				img = createImage(FRAME_WIDTH, FRAME_HEIGHT);
				gImg = img.getGraphics();
				drawBoard(gImg);
				repaint();
			}
		});		
		add("South",btnReset);
		
		Button btnPrevious = new Button("�ǵ�����");
		btnPrevious.setSize(FRAME_WIDTH/2,20);
		btnPrevious.setLocation(FRAME_WIDTH/2,FRAME_HEIGHT-20);
		add("South",btnPrevious);		
		
		// Frame (100,100) . �� ȭ���� �� ��ġ�� ���� ũ��� ���̰� �Ѵ�
				setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
				img = createImage(FRAME_WIDTH, FRAME_HEIGHT);
				gImg = img.getGraphics();
				setResizable(false); // Frame . �� ũ�⸦ �������� ���ϰ� �Ѵ�
				drawBoard(gImg);
	} // Exercise13_7(String title)

	public void drawBoard(Graphics g) {
		for (int i = 0; i < LINE_NUM; i++) {
			g.drawLine(X0, Y0 + i * LINE_WIDTH, X0 + BOARD_SIZE, Y0 + i
					* LINE_WIDTH);
			g.drawLine(X0 + i * LINE_WIDTH, Y0, X0 + i * LINE_WIDTH, Y0
					+ BOARD_SIZE);
		}
	}

	public void paint(Graphics g) {
		if (img == null)
			return;
		g.drawImage(img, 0, 0, this); // Frame ����ȭ�鿡 �׷��� �׸��� �� ����
	}

	public void mousePressed(MouseEvent e) { // MouseListener
		int x = e.getX(); // x ���콺 �������� ��ǥ
		int y = e.getY(); // y ���콺 �������� ��ǥ
		/*
		 * (1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 1. x y . �� �� ���� �������� ���� ��� ���̸� ���� �׸��� �ʴ´�
		 * 2. x y .( ) �� �� ���� Ŭ���� ������ ���� ����� ���������� �����Ѵ� �ݿø� 3. x y (STONE_SIZE)
		 * . �� �� ������ ���� ũ�� �� ������ ���� Ŭ���� ���� ���� �׷����� 4. , (x,y) ������ ��ư�� ���콺 ����
		 * ��ư�̸� �� ��ġ�� ���� ���� �׸��� ������ ��ư�� ���콺 ������ ��ư�̸� �� ��ġ�� �� ���� �׸��� , (x,y) . (
		 * .) �� ���� �׸� �� ���� �� �׵θ��� ���� �׸��� 5. repaint() . �� ȣ���Ѵ�
		 */
		// left < x   && x< right   && 	top < y && y < bottom 		then   draw it
		// 
		
			int 	bx = X0 - LINE_WIDTH/2, 	// ���������ǥ
					by = Y0 - LINE_WIDTH/2;		
			
			int dx = x-bx; 	// ���������ǥ������ ��ǥ. ( ������ǥ�� 0,0 �̶� ��)
			int dy = y-by;
			
			System.out.println(x+" "+y+"     "+dx+" "+dy);
			
			if(  	dx <= 0 || ( LINE_WIDTH*LINE_NUM ) <= dx ||
					dy <= 0 || ( LINE_WIDTH*LINE_NUM ) <= dy)
				return; 
			
			dx = dx - dx%LINE_WIDTH - LINE_WIDTH/2;	// ������ǥ�� -LINE_WIDTH/2 ��ŭ ����
			dy = dy - dy%LINE_WIDTH - LINE_WIDTH/2;
			
			x = bx + dx + LINE_WIDTH/2;		// ���� �׸��� ���� ��ġ�� 
			y = by + dy + LINE_WIDTH/2;
			
			if(e.getButton()==1){
				gImg.setColor(Color.black);
				gImg.fillOval(x,y, LINE_WIDTH, LINE_WIDTH);
				gImg.drawOval(x,y, LINE_WIDTH, LINE_WIDTH);
			}
			else if(e.getButton()==3){
				gImg.setColor(Color.white);
				gImg.fillOval(x,y, LINE_WIDTH, LINE_WIDTH);
				gImg.setColor(Color.black);
				gImg.drawOval(x,y, LINE_WIDTH, LINE_WIDTH);
			}
			repaint();
			
			
		}
		
	

	public void mouseClicked(MouseEvent e) {
	} // MouseListener

	public void mouseEntered(MouseEvent e) {
	} // MouseListener

	public void mouseExited(MouseEvent e) {
	} // MouseListener

	public void mouseReleased(MouseEvent e) {
	} // MouseListener

	public static void main(String[] args) {
		new Exercise13_7("OmokTest");
	}
}
