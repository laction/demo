package p150330_Chapter06;
/* 색상, 전화번호, 모델명, serial번호를 멤버변수로 가지는 클래스(Phone) 구현
 * 전화를 받고(receive), 보내는 (send) 기능을 가지는 전화(Phone) 객체를 만들자
 * 구동클래스에서 
 * 	010-123-4567객체 : serialNo = 1
 * 	010-987-6543객체 : serialNo = 2
 * 	010-123-8796객체 : serialNo = 3
 * 를 만들자
 * 단 세개의 객체는 서로 다른 serial 번호를 가진다
 * */
// 클래스의 구성요소 속성 : ( 멤버변수 / 멤버메서드 ) / 생성자 / 접근제어자
// 메서드 :  접근제어자   리턴타입    메서드이름   ( 매개변수 ) { 문장 (구현부) }
// 
class Phone{
	String color;
	String phoneNo;
	String modelNo;
	int no;
	static int serialNo;
	void send(){
		System.out.println("전화거는 중! ~~~~");
	
	}
	private void receive() {
		System.out.println("전화왔어요! ring ring ~~");
	}	
	public void view(){
		System.out.println(phoneNo + ":" + color + " : " + modelNo + no);
	}
}
public class Ex06_04_PhoneEx {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.color = "black";
		p1.phoneNo = "010-123-4567";
		p1.modelNo = "갤럭시";
		p1.no = ++Phone.serialNo;
		Phone p2 = new Phone();
		p2.color = "흰색";
		p2.phoneNo = "010-987-6543";
		p2.modelNo = "아이폰";
		p2.no = ++Phone.serialNo;
		Phone p3 = new Phone();
		p3.color = "회색";
		p3.phoneNo = "010-123-8796";
		p3.modelNo = "옵티머스";
		p3.no = ++Phone.serialNo;
		
		p1.view();	p2.view();	p3.view();
			
	}
}
//010-123-4567:black : 갤럭시1
//010-987-6543:흰색 : 아이폰2
//010-123-8796:회색 : 옵티머스3

