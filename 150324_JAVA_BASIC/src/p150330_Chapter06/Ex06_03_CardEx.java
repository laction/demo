package p150330_Chapter06;
class Class{				//	종류								선언 위치		방법						메모리 할당 시점			메모리 할당 위치
	static int cv;			//	클래스변수					클래스내부		static int cv;		클래스정보 로드시			클래스 영역
	int iv;						//	인스턴스변수(객체)	클래스내부		int iv;					객체화 (인스턴스화)		힙 영역
	void method(){
		int mv;				//	지역변수						메서드내부		int iv;					선언문 실행시					스택 영역
	}
}
class Card{
	String kind ; 
	int number;
	static int width = 100;
	static int height = 250;
	public String toString(){
		return kind + ":" + number + "(" + width + "," + height + ")";
	}	
}
public class Ex06_03_CardEx {
	public static void main(String[] args) {
		System.out.println("카드크기 : "+ Card.width + "," + Card.height);
		
		Card.width = 150;		// 인스턴스와 별개로 동일한 클래스 끼리 공유할 수 있는 변수이다.
		
		Card c1 = new Card();		
		
		c1.kind = "Heart";		// 인스턴스 변수는 객체를 선언(new 사용으로 메모리할당)해야만 사용 가능.
		c1.number = 7;
		System.out.println(c1.toString());
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		System.out.println(c2.toString());
		c1.width = 50 ;
		c1.height = 50 ;
		System.out.println(c1.toString());
		System.out.println(c2.toString());	
		
		int i;						// 지역변수는 함수내에서 사용할 수 있다.
		if(3/2>0) i=1;
		else i = 0;		
		System.out.println(i);	
	}
}
//카드크기 : 100,250
//Heart:7(150,250)
//Spade:1(150,250)
//Heart:7(50,50)
//Spade:1(50,50)
//1

