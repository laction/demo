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
	
	final int LINE_NUM = 9; // 오목판 줄 수
	final int LINE_WIDTH = 30; // 오목판 줄 간격
	final int BOARD_SIZE = LINE_WIDTH * (LINE_NUM - 1); // 오목판의 크기
	final int STONE_SIZE = (int) (LINE_WIDTH * 0.8); // 돌의 크기
	final int X0; // x 오목판 시작위치 좌표
	final int Y0; // y 오목판 시작위치 좌표
	final int FRAME_WIDTH; // Frame의 폭
	final int FRAME_HEIGHT; // Frame의 높이
	Image img = null;
	Graphics gImg = null;
	
	ArrayList<String> record = new ArrayList<String>();

	public Exercise13_7(String title) {
		super(title);
		// Event Handler . 를 등록한다
		addMouseListener(this);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		setVisible(true); // Frame . 을 화면에 보이게 한다
		Insets insets = getInsets(); // Insets . 화면에 보이기 전에는 의 값을 얻을 수 없다
		// (LEFT, TOP) X0, Y0 . 오목판 그려질 위치 의 좌표 를 지정한다
		X0 = insets.left + LINE_WIDTH;
		Y0 = insets.top + LINE_WIDTH;
		// Frame . 의 크기를 계산한다
		FRAME_WIDTH = BOARD_SIZE + LINE_WIDTH * 2 + insets.left + insets.right;
		FRAME_HEIGHT = BOARD_SIZE + LINE_WIDTH * 2 + insets.top + insets.bottom
				+20;
		
		setLayout(null);		
		Button btnReset = new Button("다시하기");
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
		
		Button btnPrevious = new Button("되돌리기");
		btnPrevious.setSize(FRAME_WIDTH/2,20);
		btnPrevious.setLocation(FRAME_WIDTH/2,FRAME_HEIGHT-20);
		add("South",btnPrevious);		
		
		// Frame (100,100) . 을 화면의 의 위치에 계산된 크기로 보이게 한다
				setBounds(100, 100, FRAME_WIDTH, FRAME_HEIGHT);
				img = createImage(FRAME_WIDTH, FRAME_HEIGHT);
				gImg = img.getGraphics();
				setResizable(false); // Frame . 의 크기를 변경하지 못하게 한다
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
		g.drawImage(img, 0, 0, this); // Frame 가상화면에 그려진 그림을 에 복사
	}

	public void mousePressed(MouseEvent e) { // MouseListener
		int x = e.getX(); // x 마우스 포인터의 좌표
		int y = e.getY(); // y 마우스 포인터의 좌표
		/*
		 * (1) . 아래의 로직에 맞게 코드를 작성하시오 1. x y . 와 의 값이 오목판의 밖을 벗어난 곳이면 돌을 그리지 않는다
		 * 2. x y .( ) 와 의 값을 클릭한 곳에서 가장 가까운 교차점으로 변경한다 반올림 3. x y (STONE_SIZE)
		 * . 와 의 값에서 돌의 크기 의 절반을 빼야 클릭한 곳에 돌이 그려진다 4. , (x,y) 눌러진 버튼이 마우스 왼쪽
		 * 버튼이면 의 위치에 검은 돌을 그리고 눌러진 버튼이 마우스 오른쪽 버튼이면 의 위치에 흰 돌을 그린다 , (x,y) . (
		 * .) 흰 돌을 그릴 때 검은 색 테두리도 같이 그린다 5. repaint() . 를 호출한다
		 */
		// left < x   && x< right   && 	top < y && y < bottom 		then   draw it
		// 
		
			int 	bx = X0 - LINE_WIDTH/2, 	// 절대기준자표
					by = Y0 - LINE_WIDTH/2;		
			
			int dx = x-bx; 	// 가상기준좌표에서의 좌표. ( 기준좌표가 0,0 이라 봄)
			int dy = y-by;
			
			System.out.println(x+" "+y+"     "+dx+" "+dy);
			
			if(  	dx <= 0 || ( LINE_WIDTH*LINE_NUM ) <= dx ||
					dy <= 0 || ( LINE_WIDTH*LINE_NUM ) <= dy)
				return; 
			
			dx = dx - dx%LINE_WIDTH - LINE_WIDTH/2;	// 기준좌표를 -LINE_WIDTH/2 만큼 보정
			dy = dy - dy%LINE_WIDTH - LINE_WIDTH/2;
			
			x = bx + dx + LINE_WIDTH/2;		// 실제 그리는 시작 위치는 
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
