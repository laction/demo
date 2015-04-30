package p150403_Chapter07;
/* 각 가전 제품들의 전기 소모량은 모두 다르다.
 * 그러므로 특정 클래스에서 소모량을 정하고 상속을 줄 수도 없다.
 * 이럴 때 필요한 것이 추상 클래스인데 가전 제품들에 적용될 다음의 [조건]을 보고 추상클래스를 정의해 보자!
 * [조건] 
 *  - 에너지 소모량을 저장하는 int형의 energe라는 변수
 *  - 제품의 이름을 저장할 수 있는 name이라는 변수
 *  - energe값을 반환하는 메서드
 *  - 제품의 이름을 반환하는 메서드				: getName()
 *  - 제품의 이름을 설정(변경)하는 메서드	: setName(String name)
 *  - 에너지 소모량을 증가하는 electricMeter() 추상 메서드 
 *  
 *  Tv는 에너지 소모량이 100
 *  Audio 에너지 소모량이 10
 *  Computer 에너지 소모량이 500
 * */
/* getter. setter
 *  멤버변수에 대해 반환(get) 및 설정(set) 함수를 사용함으로서, 클래스를 구조화.
 *  
 *  final, abstract 제어자는 동시에 사용할 수 없다.
 * */
public class Ex07_19_EnergyEx {
	public static void main(String[] args) {
		Tv 	tv = new Tv();			
				tv.setName("23인치 TV");
		Audio 	audio = new Audio();
						audio.setName("오디오 스피커");
		Computer computer = new Computer();		
							computer.setName("인텔 펜티엄");
		
		System.out.println(tv.getName() + "," + tv.electricMeter());
		System.out.println(audio.getName() + "," + audio.electricMeter());
		System.out.println(computer.getName() + "," + computer.electricMeter());
	}
	
	public static class Tv extends Product{
		@Override		public int electricMeter() {	return 100;		}
	}
	public static class Audio extends Product{
		@Override		public int electricMeter() {	return 10;		}
	}
	public static class Computer extends Product{
		@Override		public int electricMeter() {	return 500;		}
	}
	
	public static abstract class Product{
		private String name;		
		public String getName(){								return name;	}
		public void setName(String name){			this.name = name;		}
		public abstract int electricMeter();		
	}
}
//23인치 TV,100
//오디오 스피커,10
//인텔 펜티엄,500


