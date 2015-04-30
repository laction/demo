package p150331_Chapter06;
// 생성자는 인스턴스 멤버이다. 클래스멤버(static)에 쓰일수 없음.
/* this 생성자 : 동일한 클래스의 다른 생성자 호출시 사용. 
 * this 참조변수 : 동일한 객체 인스턴스 멤버를 참조시 사용.
 * 						인스턴스 메서드에 지역변수로 자동 선언됨.
 * */
class Card2{
	String kind;
	int number;
	static int width = 100;
	static int height = 250 ;
	Card2(){		
		this("Clover",2);	
	}
	Card2(String kind){
		//		System.out.println();		// 주석을 풀면 에러. 메소드에서 생성자는 가장 먼저 호출 되어야 한다.
		this(kind,5);
	}
	Card2(String kind , int num){
		this.kind = kind ;		// this 참조변수를 통해, 클래스의 인스턴스 변수와 파라미터인 지역변수를 구별.
		number = num;
	}
	Card2(Card2 c){
		this(c.kind,c.number);
	}
	public void view(){
		System.out.println(kind+","+number);
	}
	@Override
	public String toString() {
		return kind+","+number;
	}	
}
public class Ex06_13_CardEx2 {
	public static void main(String[] args) {
		Card2 card = new Card2("Heart", 7);
		card.view();
		
		Card2 card2 = new Card2();
		card2.view();
		
		Card2 card3 = new Card2();		card3.kind = "Spade";		card3.number = 1;
		card3.view();
		
		Card2 card4 = new Card2("Diamond");
		System.out.println(card4); 	//	toString함수를 사용해 출력. 모든 객체는 toString함수를 오버라이딩 할 수 있다.
		
		Card2 card5 = new Card2(card4);
		card5.view();		
	}
}
//Heart,7
//Clover,2
//Spade,1
//Diamond,5
//Diamond,5

