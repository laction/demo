package p150330_Chapter06;

/*
 가로와 세로의 길이를 가지고 있는 직사각형(Rectangle)의 
 클래스 만들기. 넓이 둘레를 구하는 기능을 가진다.
 */
class Rectangle {
	private int x, y, w, h;
	Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public int area() {
		return w * h;
	}
	public int length() {
		return 2 * (w + h);
	}
}
/*동물클래스(Animal)
 * 이름과 나이 멤버랑 먹는(eat) 기능이 있다.
 * 결과 : 이름 : 원숭이
 * 			나이 : 20
 * 			맛있다!!!
 * */
class Animal{
	String name;
	int age;
	Animal(String name,int age){
		this.name = name ; this.age = age;
	}
	void status(){	System.out.println("이름(name) : "+name+"\n나이(age) : "+age);	}
	void eat(){		System.out.println("맛있다!");	}
}
// main메서드가 존재하는 클래스를 구동 클래스라 한다.
// 구동 클래스의 이름과 파일 이름이 같아야 한다.
// 자바에서는 public class의 이름과 파일이름은 반드시 같아야 한다.
// 하나의 파일에 public class는 한개만 가능하다.
public class Ex06_02_RectangleEx {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,20,50,60);
		
		System.out.println("area : "+r.area());
		System.out.println("length : "+r.length());
		
		System.out.println("-----예제1------");
		
		Animal monkey = new Animal("원숭이",20);
		monkey.status();
		monkey.eat();
		Animal dog = new Animal("강아지", 3);
		dog.status();
		dog.eat();
	}
}
//area : 3000
//length : 220
//-----예제1------
//이름(name) : 원숭이
//나이(age) : 20
//맛있다!
//이름(name) : 강아지
//나이(age) : 3
//맛있다!

