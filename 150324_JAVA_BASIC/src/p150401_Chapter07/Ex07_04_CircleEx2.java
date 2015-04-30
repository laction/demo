package p150401_Chapter07;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import p150331_Chapter06.Ex06_19_CircleEx.Circle;

public class Ex07_04_CircleEx2 {
	public static void main(String[] args) {
		Circle c1=new Circle(100,50,50),c2= new Circle(30,80,40),c3 = new Circle(20,30,60);		
		
		Canvas canvas = new MyCanvas(c1,c2,c3);
		Frame f= new Frame();
		canvas.setBackground(Color.yellow);
		f.add(canvas);
		f.setLocation(300,300);
		f.setSize(200,200);
		f.setVisible(true);
		
		while(true){
			try{
				Thread.sleep(1000);				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			c1.scale(1.01);
			canvas.repaint();
		}
	}
	static class MyCanvas extends Canvas{
		Circle c1,c2,c3;
		
		MyCanvas (Circle c1, Circle c2, Circle c3){
			this.c1 = c1; this.c2 = c2; this.c3 = c3;
		}
		@Override		//	Canvas의 기본적인 함수를 오버라이드
		public void paint(Graphics g){
			g.setColor(Color.red);
			g.fillOval(c1.getX()-c1.getRatio()/2, c1.getY()-c1.getRatio()/2, c1.getRatio(), c1.getRatio());
			g.setColor(Color.blue);
			g.fillOval(c2.getX()-c2.getRatio()/2,c2.getY()-c2.getRatio()/2,c2.getRatio(),c2.getRatio());
			g.setColor(Color.green);
			g.fillOval(c3.getX()-c3.getRatio()/2,c3.getY()-c3.getRatio()/2,c3.getRatio(),c3.getRatio());
		}
	}
}