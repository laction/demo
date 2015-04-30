package p150407_Chapter09;

/* Object 클래스의 equals 메서드는 객체 비교방식 구현
 * 객체 비교는 == 연산자로도 가능
 * equals 메서드는 내용비교하는 방식으로 사용하도록 오버라이딩이 필요.
 * 
 * 대부분의 클래스는 equals 메서드를 내용비교방식으로 오버라이딩해서 사용하고 있다. (String)
 * */
public class Ex09_02_EqualsEx2 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1==v2)			System.out.println("v1 == v2");
				else				System.out.println("v1 != v2");
		
		if(v1.equals(v2))		System.out.println("v1.equals(v2) : true");
				else						System.out.println("v1.equals(v2) : false");		
	}	
	public static class Value extends Object{
		public int value ; 
		public Value(int value){
			this.value = value;
		}
		
		boolean equals(Value v){
			return this.value == v.value;			
		}
	}
}
//v1 != v2
//v1.equals(v2) : true