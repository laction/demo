package p150402_Chapter07;

/* 1. 도형 클래스 : Figure
 * 	1) 멤버변수 : 도형종류
 * 	2) 생성자 : 도형종류를 입력받아 객체 생성
 * 	3) 추상메서드 : 도형의 넓이 - area();, 도형의 둘레 - length()
 * 2. 원클래스 : Circle => Figure 클래스를 상속받아 작성하기
 * 	1) 멤버변수들을 작성하라.
 * 		반지름, 원점 x 좌표, 원점 y 좌표, 원의 번호
 * 	2) 생성자 매개변수 3개 (r,x,y)
 * 	3) 메서드 작성
 * 3. 사각형 : Rectangle => Figure 클래스를 상속받아 작성하기
 * 	1) 멤버변수 : x1 , y1, x2, y2 좌표, 사각형의 번호
 * 	2) 생성자 : 두개의 점 (x1,y1,x2,y2)를 사용하여 객체 생성
 * 	3) 메서드 작성  
 * */
public class Ex07_13_FigureEx {
	public static void main(String[] args) {
		Figure[] f = new Figure[12];
		f[0] = new Circle(5,10,8);
		f[1] = new Rectangle(-3,3,0,5);
		System.out.println(f[0]);
		System.out.println(f[1]);		
		
		for(int i = 2 ; i < f.length ; i++)
			if(Math.random()>=0.5) 
				System.out.println(   (f[i]=new Circle( 	Math.round(1+Math.random()*20.0),
																						Math.round(-20+Math.random()*40.0),
																						Math.round(-20+Math.random()*40.0)													
														)   ).strStatus()	);
			else System.out.println(   (f[i] = new Rectangle(	Math.round(-20+Math.random()*40.0),
																										Math.round(-20+Math.random()*40.0),
																										Math.round(-20+Math.random()*40.0),
																										Math.round(-20+Math.random()*40.0)
													)   ).strStatus() );
	}
	
	public static class Circle extends Figure {
		
		public Circle(double r, double x, double y){
			super("C");
			grantedNumber();
			this.r = (r<=0) ? (1.0) : r;
			this.x=x;
			this.y=y;
		}
		
		protected static int cnt = 1;
		private int number = 0;
		public int number(){return number;}
		public void grantedNumber(){	if(number == 0) number = cnt++;	 }		
		
		public double r,x,y;					
		@Override		public double area() {		return Math.PI * r * r ;		}
		@Override		public double length() {	return 2 * Math.PI * r ;		}
		@Override		public String toString(){	return type+number+"( "+r+", "+x+", "+y+" )";		}
		
	}
	public static class Rectangle extends Figure {
		
		public Rectangle(double x1,double y1, double x2, double y2) {
			super("R");
			grantedNumber();
			this.x1 = x1;			this.y1 = y1;
			this.x2 = x2;			this.y2 = y2;
		}
		
		protected static int cnt = 1;
		public int number = 0;
		public int number(){return number;}
		public void grantedNumber(){	if(number == 0) number = cnt++;	 }		
		
		public double x1,y1,x2,y2;				
		@Override		public double area() {		return Math.abs(  (x1-x2)*(y1-y2)  );		}
		@Override		public double length() {	return 2 * (     Math.abs ( x1-x2 ) + Math.abs( y1-y2 )     );		}
		@Override		public String toString(){	return type+number+"( "+x1+", "+y1+", "+x2+", "+y2+" )";		}				
	}
	
	public static abstract class Figure {		
		public String type ;
		Figure(String type){	this.type = type;	}
		public abstract double area();
		public abstract double length();		
		public String strStatus(){	
			return String.format("%s   :   넓이 - %5.1f    둘레 - %5.1f ", (String)this.toString() , (double)area() , (double)length());	
		}
	}
}
//C1( 5.0, 10.0, 8.0 )
//R1( -3.0, 3.0, 0.0, 5.0 )
//C2( 3.0, -18.0, 5.0 )   :   넓이 -  28.3    둘레 -  18.8 
//C3( 17.0, -1.0, -9.0 )   :   넓이 - 907.9    둘레 - 106.8 
//C4( 10.0, -17.0, 14.0 )   :   넓이 - 314.2    둘레 -  62.8 
//R2( -15.0, -4.0, 2.0, 11.0 )   :   넓이 - 255.0    둘레 -  64.0 
//R3( 17.0, 20.0, 14.0, -9.0 )   :   넓이 -  87.0    둘레 -  64.0 
//C5( 18.0, 8.0, -14.0 )   :   넓이 - 1017.9    둘레 - 113.1 
//R4( 2.0, 12.0, -8.0, 5.0 )   :   넓이 -  70.0    둘레 -  34.0 
//C6( 2.0, 17.0, 9.0 )   :   넓이 -  12.6    둘레 -  12.6 
//C7( 15.0, -10.0, 5.0 )   :   넓이 - 706.9    둘레 -  94.2 
//R5( 14.0, 5.0, 14.0, 13.0 )   :   넓이 -   0.0    둘레 -  16.0 
