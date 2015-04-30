class Exercise7_23 {
	/*
	 * (1) sumArea메서드를 작성하시오.
	 */
	static double sumArea(Shape [] arr){
		double res =0;
		for(int i = 0 ; i < arr.length; i++)
			res+=arr[i].calcArea();
		return res;
	}
	
	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합:" + sumArea(arr));
		
		
	}
	static class Rectangle extends Shape{
		int w,h;
		public Rectangle(int w, int h) {
			this.w = w; this.h = h;
		}
		@Override
		double calcArea() {			
			return w*h;
		}
	}
	static class Circle extends Shape{
		double r;
		public Circle(double r) {
			this.r = r;
		}
		@Override
		double calcArea() {
			return Math.PI * r * r;
		}
	}

	static abstract class Shape {
		Point p;

		Shape() {
			this(new Point(0, 0));
		}

		Shape(Point p) {
			this.p = p;
		}

		abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

		Point getPosition() {
			return p;
		}

		void setPosition(Point p) {
			this.p = p;
		}
	}

	static class Point {
		int x;
		int y;

		Point() {
			this(0, 0);
		}

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return "[" + x + "," + y + "]";
		}
	}

}
