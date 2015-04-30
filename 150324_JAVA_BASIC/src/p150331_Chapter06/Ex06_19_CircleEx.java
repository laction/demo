package p150331_Chapter06;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Ex06_19_CircleEx {
	/* 1. 원 클래스를 생성하라.
	 * 	1) 멤버변수들을 작성하라.
	 * 		반지름, 원점x좌표, 원점y좌표, 원의 번호,
	 * 		원의 번호를 생성시켜주는 count (static으로)
	 * 	2) 생성자 3개를 만들어라.
	 * 		a. 매개변수 없이 객체를 생성하면
	 * 				반지름 1, 중앙점(1,1) 객체생성
	 * 		b. 매개변수가 1개(r)이면 반지름이 r이고
	 * 				중앙점이 (1,1)인 객체 생성
	 * 		c. 매개변수가 3개(r,x,y) 이면 반지름 r, 
	 * 				중앙점이 (x,y)인 객체 생성
	 * 
	 * 	3)	a. area : 원의 넓이를 계산하는 메소드
	 * 			b. move : 원을 이동시키는 메소드 ( x+ mx, y + my )
	 * 			c. scale : 원을 확대 / 축소하는 메소드 ( r = r * 3 )
	 * 			d. toString : 현재 중심점과 반지름을 출력하는 메소드
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
			System.out.printf("%2d번  C(%3d,%3d) \t  r=%2d\n",number,x,y,ratio);
		}	
		public double area(){	return Math.PI  * ratio * ratio;	}
		public void move(double mx,double my){	x+=mx; y+=my;	}
		public void scale(double val){	ratio*=val;	}
		public String toString(){	return String.format("r = %3d  C(%3d,%3d)\n", ratio,x,y);	}
	}
	/* 2. 메인 메서드
	 * 	1)	각 생성자들을 이용하여 원 객체들을 여러개 생성하라.
	 * 	2)	각 원의 번호, 반지름, x좌표, y좌표를 출력하기.
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
//0번  C( -1, -2) 	  r= 3
//1번  C(  1,  1) 	  r= 4
//2번  C(  1,  1) 	  r= 8
//3번  C(  1,  1) 	  r= 1
//4번  C( -9,  9) 	  r= 3
//5번  C(  1,  1) 	  r= 2
//6번  C(  1,  1) 	  r= 1
//7번  C(  1,  1) 	  r= 3
//8번  C(  1,  1) 	  r= 3
//9번  C(  8,  8) 	  r= 3
//r =   1  C( 10,  6)