package p150402_Chapter07;

/* 1. ���� Ŭ���� : Figure
 * 	1) ������� : ��������
 * 	2) ������ : ���������� �Է¹޾� ��ü ����
 * 	3) �߻�޼��� : ������ ���� - area();, ������ �ѷ� - length()
 * 2. ��Ŭ���� : Circle => Figure Ŭ������ ��ӹ޾� �ۼ��ϱ�
 * 	1) ����������� �ۼ��϶�.
 * 		������, ���� x ��ǥ, ���� y ��ǥ, ���� ��ȣ
 * 	2) ������ �Ű����� 3�� (r,x,y)
 * 	3) �޼��� �ۼ�
 * 3. �簢�� : Rectangle => Figure Ŭ������ ��ӹ޾� �ۼ��ϱ�
 * 	1) ������� : x1 , y1, x2, y2 ��ǥ, �簢���� ��ȣ
 * 	2) ������ : �ΰ��� �� (x1,y1,x2,y2)�� ����Ͽ� ��ü ����
 * 	3) �޼��� �ۼ�  
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
			return String.format("%s   :   ���� - %5.1f    �ѷ� - %5.1f ", (String)this.toString() , (double)area() , (double)length());	
		}
	}
}
//C1( 5.0, 10.0, 8.0 )
//R1( -3.0, 3.0, 0.0, 5.0 )
//C2( 3.0, -18.0, 5.0 )   :   ���� -  28.3    �ѷ� -  18.8 
//C3( 17.0, -1.0, -9.0 )   :   ���� - 907.9    �ѷ� - 106.8 
//C4( 10.0, -17.0, 14.0 )   :   ���� - 314.2    �ѷ� -  62.8 
//R2( -15.0, -4.0, 2.0, 11.0 )   :   ���� - 255.0    �ѷ� -  64.0 
//R3( 17.0, 20.0, 14.0, -9.0 )   :   ���� -  87.0    �ѷ� -  64.0 
//C5( 18.0, 8.0, -14.0 )   :   ���� - 1017.9    �ѷ� - 113.1 
//R4( 2.0, 12.0, -8.0, 5.0 )   :   ���� -  70.0    �ѷ� -  34.0 
//C6( 2.0, 17.0, 9.0 )   :   ���� -  12.6    �ѷ� -  12.6 
//C7( 15.0, -10.0, 5.0 )   :   ���� - 706.9    �ѷ� -  94.2 
//R5( 14.0, 5.0, 14.0, 13.0 )   :   ���� -   0.0    �ѷ� -  16.0 
