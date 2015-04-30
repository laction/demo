package p150403_Chapter07;


public class Ex07_22_ShapeEx {
	
	/* 메서드 : sumArea
	 * 	기능 : 도형 배열의 모든 넓이의 합을 구하는 메서드
	 * 	반환타임 : double
	 * 	매개변수 : Shape [] arr
	 * */
	public static double sumArea(Shape[] arr){
		double res = 0;
		for(Shape s : arr) res +=s.calcArea();		
		return res;		
	}
	
	public static void main(String[] args) {		
		Shape [] arr = {		new Circle(new Point(),1),
										new Circle(5),
										new Rectangle(new Point(),4,6),
										new Rectangle(2,2)										
									};		
		System.out.println("총 넓이 합 : "+sumArea(arr));
		
		for(Shape s : arr)
			if(s instanceof Rectangle){				
				Rectangle r = (Rectangle) s;				
				System.out.println("R("+r.width+","+r.height+")   isSqare : "+ r.isSqare()  );			
			}		
		
	}	
	
	/*두개의 점(x,y)을 가지는 Point 클래스 구현하기
	 * 생성자 : 매개변수가 없는 경우 (0,0)
	 *          x,y값을 입력 받는 경우
	 * 메서드 : toString
	 * 기능   : x,y좌표 출력
	 */
	public static class Point{
		public int x,y;
		Point (){			this(0,0);		}
		Point(int x,int y) { this.x=x; this.y=y;}
		public String toString(){
			return "(" + x + "," + y + ")";			
		}
	}
	/* 한개의 점 (Point)을 멤버로 가지는 도형 클래스 Shape 클래스 구현하기
	 *  한개의 점으로 위치를 표시
	 *  	생성자 : 매개변수가 없는 경우 0,0 의 위치를 가진 도형 생성
	 *  				Point 를 매개변수로 받아 도형 생성
	 *  	메서드 : getPosition
	 *  		매개변수 : 없음
	 *  		리턴타입 : Point
	 *  	메서드 : setPosition
	 *  		매개변수 : Point
	 *  		리턴타입 : void
	 *  	메서드 : calcArea
	 *  		매개변수 : 없음
	 *  		리턴타입 : double
	 */
	public static abstract class Shape{
		public Point p;
		public Shape(Point point) {		this.p = point;	}
		public Shape(){	this(new Point(0,0));	}		
		public Point getPosition() { return p; }
		public void setPoint(Point point) { this.p = point; }
		public abstract double calcArea();
	}		
	/* Shape 클래스의 하위 클래스로 원(Circle) 클래스 구현하기 
	 * 	조상클래스 : Shape
	 * 		생성자 : 반지름을 입력받기
	 * 			멤버변수 : double r - 반지름 		
	 */	
	public static class Circle extends Shape{
		public int r;
		public Circle(){this(1);}
		public Circle(Point p){	this(p,1); }
		public Circle(int r){	this(new Point(),r); }
		public Circle(Point p,int r){	super(p);	this.r=r;	}		
		@Override		public double calcArea() {				return Math.PI * r * r ;		}
	}	
	/* Shpae 클래스의 하위 클래스로 사각형(Rectangle) 클래스 구현하기
	 * 	조상클래스 : Shape
	 * 		멤버변수 : int width; - 폭
	 * 						int height;  - 높이
	 * 		생성자 : width, height를 매개변수로 받아 객체 생성하기.
	 * 		메서드 : 
	 * 			1. 메서드명 : isSquare
	 * 				기능 : 정사각형인지 아닌지를 알려준다.
	 * 				반환타입 : boolean
	 * 				매개변수	: 없음
	 * */
	public static class Rectangle extends Shape{
		public int width,height;		
		public Rectangle(int w,int h) {	 this(new Point(),w,h);	}
		public Rectangle(Point p,int w,int h) { super(p); this.width=w; this.height=h; } 
		boolean isSqare(){	return (width==height)?true:false;}
		@Override		public double calcArea() {	return width*height;	}
	}
}
//총 넓이 합 : 109.68140899333463
//R(4,6)   isSqare : false
//R(2,2)   isSqare : true
