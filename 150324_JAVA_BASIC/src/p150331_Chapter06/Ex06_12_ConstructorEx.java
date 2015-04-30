package p150331_Chapter06;
/* new 연산자 가능
 * 1. 메모리 할당
 * 2. 멤버 변수를 기본값으로 초기화
 * 3. 생성자 호출
 * 4. 할당된 메모리의 참조값(위치값)을 반환함. 
 */
// (private 생성자)를 통해 객체생성을 막을 수도 있다. (ex - Math 클래스)
/* 생성자 : 객체화시 호출되는 메서드
 * 				생성자 없는 객체 생성은 없다.
 * 				주로 인스턴스 변수를 초기화시 사용.
 * 				오버로딩 가능.
 * 기본생성자 : 생성자가 선언되지 않으면, 자동으로 기본생성자가 형성됨 (컴파일러에 의해).
 * 				생성자는 리턴타입을 가지지 않는다.
 * */
class Data1{
	int value;
	Data1(){}
	Data1(int val){ value= val;}
}
public class Ex06_12_ConstructorEx {
	public static void testFunction(Data1 d){System.out.println(d.value);}
	public static Data1 testFunction(Data1 d,int nonVal){System.out.println(d.value); return d;}
	public static void main(String[] args) {
		Data1 d1 = new Data1();		
		testFunction(new Data1(10));
		Data1 d2 = testFunction(new Data1(20),1);
	}
}
//10
//20
