package p150403_Chapter07;


public class Ex07_22_ShapeEx {
	
	/* �޼��� : sumArea
	 * 	��� : ���� �迭�� ��� ������ ���� ���ϴ� �޼���
	 * 	��ȯŸ�� : double
	 * 	�Ű����� : Shape [] arr
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
		System.out.println("�� ���� �� : "+sumArea(arr));
		
		for(Shape s : arr)
			if(s instanceof Rectangle){				
				Rectangle r = (Rectangle) s;				
				System.out.println("R("+r.width+","+r.height+")   isSqare : "+ r.isSqare()  );			
			}		
		
	}	
	
	/*�ΰ��� ��(x,y)�� ������ Point Ŭ���� �����ϱ�
	 * ������ : �Ű������� ���� ��� (0,0)
	 *          x,y���� �Է� �޴� ���
	 * �޼��� : toString
	 * ���   : x,y��ǥ ���
	 */
	public static class Point{
		public int x,y;
		Point (){			this(0,0);		}
		Point(int x,int y) { this.x=x; this.y=y;}
		public String toString(){
			return "(" + x + "," + y + ")";			
		}
	}
	/* �Ѱ��� �� (Point)�� ����� ������ ���� Ŭ���� Shape Ŭ���� �����ϱ�
	 *  �Ѱ��� ������ ��ġ�� ǥ��
	 *  	������ : �Ű������� ���� ��� 0,0 �� ��ġ�� ���� ���� ����
	 *  				Point �� �Ű������� �޾� ���� ����
	 *  	�޼��� : getPosition
	 *  		�Ű����� : ����
	 *  		����Ÿ�� : Point
	 *  	�޼��� : setPosition
	 *  		�Ű����� : Point
	 *  		����Ÿ�� : void
	 *  	�޼��� : calcArea
	 *  		�Ű����� : ����
	 *  		����Ÿ�� : double
	 */
	public static abstract class Shape{
		public Point p;
		public Shape(Point point) {		this.p = point;	}
		public Shape(){	this(new Point(0,0));	}		
		public Point getPosition() { return p; }
		public void setPoint(Point point) { this.p = point; }
		public abstract double calcArea();
	}		
	/* Shape Ŭ������ ���� Ŭ������ ��(Circle) Ŭ���� �����ϱ� 
	 * 	����Ŭ���� : Shape
	 * 		������ : �������� �Է¹ޱ�
	 * 			������� : double r - ������ 		
	 */	
	public static class Circle extends Shape{
		public int r;
		public Circle(){this(1);}
		public Circle(Point p){	this(p,1); }
		public Circle(int r){	this(new Point(),r); }
		public Circle(Point p,int r){	super(p);	this.r=r;	}		
		@Override		public double calcArea() {				return Math.PI * r * r ;		}
	}	
	/* Shpae Ŭ������ ���� Ŭ������ �簢��(Rectangle) Ŭ���� �����ϱ�
	 * 	����Ŭ���� : Shape
	 * 		������� : int width; - ��
	 * 						int height;  - ����
	 * 		������ : width, height�� �Ű������� �޾� ��ü �����ϱ�.
	 * 		�޼��� : 
	 * 			1. �޼���� : isSquare
	 * 				��� : ���簢������ �ƴ����� �˷��ش�.
	 * 				��ȯŸ�� : boolean
	 * 				�Ű�����	: ����
	 * */
	public static class Rectangle extends Shape{
		public int width,height;		
		public Rectangle(int w,int h) {	 this(new Point(),w,h);	}
		public Rectangle(Point p,int w,int h) { super(p); this.width=w; this.height=h; } 
		boolean isSqare(){	return (width==height)?true:false;}
		@Override		public double calcArea() {	return width*height;	}
	}
}
//�� ���� �� : 109.68140899333463
//R(4,6)   isSqare : false
//R(2,2)   isSqare : true
