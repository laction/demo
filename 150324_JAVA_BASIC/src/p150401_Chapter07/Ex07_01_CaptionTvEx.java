package p150401_Chapter07;
/* 클래스 상속.
 * extends를 사용. 
 * 
 * is a 관계 : Human is a Mammal . 인간은 포유류를 상속 받음.
 * has a 관계 : Human has a Eyes.  
 * 
 * C++와는 달리, 클래스는 단일 상속만 가능.
 * 부모클래스가 먼저 할당되고, 자손클래스가 할당된다.
 * 클래스를 상속 받지 않는 모든 클래스는 Object 클래스를 상속받는다.
 * 		그래서 모든 클래스는 Object클래스를  상속받은 상태이다.
 * */
/* 상속 관계에서의 new 연산자 기능
 * 1. 부모객체생성, 기본값 초기화
 * 2. 자손객체생성, 기본값 초기화
 * 3. 부모생성자 실행, 이후에 자손생성자 실행
 * */
class Tv{
	boolean power;
	int channel;
	void power(){power = !power;}
	void channelUp(){++channel;	}
	void channelDown(){ -- channel;}
}
class CaptionTv extends Tv{
	boolean caption;
	void dispayCaption (String text){
		if(caption)
			System.out.println(text);
	}
}
public class Ex07_01_CaptionTvEx {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.dispayCaption("안녕하세요!");
		ctv.caption = true;
		ctv.dispayCaption("안녕하세요!");
	}
}
//11
//안녕하세요!
