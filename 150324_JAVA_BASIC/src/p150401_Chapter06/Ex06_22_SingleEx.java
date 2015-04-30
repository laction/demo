package p150401_Chapter06;
// 싱글톤 패턴인 클래스 : 오직 하나뿐인 클래스
class Single {		
	private Single() {}		// new로 생성을 못하는 클래스가 됨
	public int x = 100;
	private static Single single = new Single();	
	public static Single getInstance(){
		return single;
	}
}
public class Ex06_22_SingleEx {
	public static void main(String[] args) {
		//new Single().x		// 오류
		Single s1 = Single.getInstance();	// "클래스이름@해쉬코드"를 출력.
		System.out.println(s1);
		Single s2 = Single.getInstance();	// 오직 하나뿐인 객체 참조한다.
		System.out.println(s2);
		System.out.println(s1.x);
		System.out.println(s2.x);
		s1.x = 200;		
		System.out.println(s1.x);	// 클래스 변수를 변경 했으므로, 동일클래스의 변수 값이 바뀜.
		System.out.println(s2.x);
	}
}
//p150401_Chapter06.Single@1db9742
//p150401_Chapter06.Single@1db9742
//100
//100
//200
//200