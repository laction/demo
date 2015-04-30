package p150327_Chapter06;
/* 클래스.
 * 멤버변수와 멤버메소드를 선언할 수 있다.
 * 클래스와 멤버는 public,protected,default,private 등의 접근제한자로 외부에서의 접근을 제한할 수 있다.
 * 클래스는 new 명령을 통해 동적할당 되며, 동시에 생성자를 호출한다.
 * 클래스변수는 참조변수이다.
 * 클래스는 상속될 수 있고, 클래스 / 추상클래스 / 인터페이스 를 상속 받을 수 있다.
 * */
/* JVM 메모리 구조
 * 클래스 / 스택 / 힙 영역이 존재한다.
 * 클래스 영역 : 클래스의 기본 정보가 로드된다. 호출이 필요한 외부영역의 정보를 찾기위해 필요하다.
 * 스택 영역 : 메서드 정보((지역)정적변수 및 코드)가 로드된다.
 * 힙 영역 : 참조변수가 가리키는 동적할당된 데이터가 존재한다.
 * 네이티브 메서드 스택 : JVM이 설치된 플랫폼의 시스템 메서드들의 기본정보를 로드함. 
 * PC 레지스터 : 현재 수행중인 명령어의 주소.
 * */
class Tv {
	String color;
	boolean power;
	int channel ; 
	Tv power(){		power = !power;		return this;	}
	Tv channelUp()		{		if(power)++channel;		return this;	}
	Tv channelDown(){		if(power)--channel;		return this;	}	
}
public class Ex06_01_TvTest {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.color = "검정";
		tv.channel = 11;
		tv.power = true;
		
		System.out.println(tv.color + ":" + tv.channel + ":" + tv.power);		
		tv.channelUp().channelUp();
		System.out.println(tv.color + ":" + tv.channel + ":" + tv.power);
		
		Tv tv2 = new Tv();
		System.out.println(tv2.color + ":" + tv2.channel + ":" + tv2.power);
		
		tv2=tv;
		System.out.println(tv2.color + ":" + tv2.channel + ":" + tv2.power);	
	}
}
//검정:11:true
//검정:13:true
//null:0:false
//검정:13:true
