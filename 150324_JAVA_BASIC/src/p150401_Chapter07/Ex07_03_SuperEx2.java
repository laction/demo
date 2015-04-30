package p150401_Chapter07;
// super 생성자 : 부모 생성자 호출
/* 부모클래스의 생성자 중 매개변수가 있는 생성자만 존재하면
 * 반드시 자손클래스의 생성자에서 super()를 자손생성자 선언부 맨 처음에 호출해야 한다.
 * 	매개변수가 없는 부모클래스 생성자가 존재하면 super() 생략 가능.  
 * */
/* 오버라이딩.
 * 	부모클래스의 메서드를 자손클래스가 재정의하여 사용
 * 	메서드의 선언부가 동일해야한다.
 * 	리턴타입, 메서드이름 (매개변수) 가 모두 같아야 함.
 * 	자손메서드의 접근제어자는 부모메서드보다 덜 제한적이거나 같아야 한다.
 * 		ex ) protected 부모메서드 =(오버라이딩)=> public 자손메서드   
 * */

public class Ex07_03_SuperEx2 {
	public static void main(String[] args) {
		System.out.println(new Point3D(10,20,30).getLocation());
	}	
	public static class Point {
		int x; 
		int y;
		Point(int x , int y){
			this.x = x;
			this.y = y;
		}
		String getLocation(){
			return "x : " + x + ", y : " + y;
		}	
	}
	public static class Point3D extends Point{
		int z;
		Point3D(int x, int y, int z){
//			this.x = x;	// 에러
//			this.y = y;
			super(x,y);		// 생성자 선언부에 맨 먼저 선언.
			this.z = z;
		}
		@Override			// 생략가능. 부모의 메서드를 재정의 함.
		String getLocation(){
			return "x : " + x + ", y : " + y +", z : " + z ;
		}	
	}
}
//x : 10, y : 20, z : 30