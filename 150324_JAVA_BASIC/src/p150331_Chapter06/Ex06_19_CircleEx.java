package p150331_Chapter06;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Ex06_19_CircleEx {
	/* 1. �� Ŭ������ �����϶�.
	 * 	1) ����������� �ۼ��϶�.
	 * 		������, ����x��ǥ, ����y��ǥ, ���� ��ȣ,
	 * 		���� ��ȣ�� ���������ִ� count (static����)
	 * 	2) ������ 3���� ������.
	 * 		a. �Ű����� ���� ��ü�� �����ϸ�
	 * 				������ 1, �߾���(1,1) ��ü����
	 * 		b. �Ű������� 1��(r)�̸� �������� r�̰�
	 * 				�߾����� (1,1)�� ��ü ����
	 * 		c. �Ű������� 3��(r,x,y) �̸� ������ r, 
	 * 				�߾����� (x,y)�� ��ü ����
	 * 
	 * 	3)	a. area : ���� ���̸� ����ϴ� �޼ҵ�
	 * 			b. move : ���� �̵���Ű�� �޼ҵ� ( x+ mx, y + my )
	 * 			c. scale : ���� Ȯ�� / ����ϴ� �޼ҵ� ( r = r * 3 )
	 * 			d. toString : ���� �߽����� �������� ����ϴ� �޼ҵ�
	 * */
	public static class Circle{
		private static int count;
		
		private int ratio;
		private int x,y;
		private int number;
		
		public static int count(){return count;}		
		
		public int getRatio(){return ratio;}
		public int getX(){return x;}
		public int getY(){return y;}
		public int getNumber(){return number;}
		
		public Circle(){	this(1,1,1);	}
		public Circle(int r){	this(r,1,1);	}
		public Circle(int r,int x,int y){
			this.ratio = r;		this.x=x;		this.y=y;
			this.number = count++;
		}	
		public void view(){
			System.out.printf("%2d��  C(%3d,%3d) \t  r=%2d\n",number,x,y,ratio);
		}	
		public double area(){	return Math.PI  * ratio * ratio;	}
		public void move(double mx,double my){	x+=mx; y+=my;	}
		public void scale(double val){	ratio*=val;	}
		public String toString(){	return String.format("r = %3d  C(%3d,%3d)\n", ratio,x,y);	}
	}
	/* 2. ���� �޼���
	 * 	1)	�� �����ڵ��� �̿��Ͽ� �� ��ü���� ������ �����϶�.
	 * 	2)	�� ���� ��ȣ, ������, x��ǥ, y��ǥ�� ����ϱ�.
	 */
	public static void main(String[] args) {
		Circle circle[] = new Circle [10];
		for( int i = 0 ; i <circle.length ; i++ ){
			double random = Math.random()*3.0;
			Circle tCircle;
			if(random >= 2.0) tCircle = new Circle();
			else if( random >= 1.0 ) tCircle = new Circle( (int)(2.0+(Math.random() *8.0)) );
			else tCircle = new Circle( 
					2+(int)(Math.random() *8.0d), 
					-10+(int)(Math.random() *20.0d), 
					-10+(int)(Math.random() *20.0d) );
			circle[i] = tCircle;
			circle[i].view();
		}
		
		circle[9].move(2, -2);
		circle[9].scale(0.5);
		System.out.println(circle[9]);		
	}	
}
//0��  C( -1, -2) 	  r= 3
//1��  C(  1,  1) 	  r= 4
//2��  C(  1,  1) 	  r= 8
//3��  C(  1,  1) 	  r= 1
//4��  C( -9,  9) 	  r= 3
//5��  C(  1,  1) 	  r= 2
//6��  C(  1,  1) 	  r= 1
//7��  C(  1,  1) 	  r= 3
//8��  C(  1,  1) 	  r= 3
//9��  C(  8,  8) 	  r= 3
//r =   1  C( 10,  6)