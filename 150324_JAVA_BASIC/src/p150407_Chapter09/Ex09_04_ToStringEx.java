package p150407_Chapter09;
/* toString 메서드 예제
 * 객체의 문자열화에 관여하는 메서드
 * Object 클래스에서 구현된 toString 메서드는
 * 클래스명 @ 해쉬코드  값으로 표현된다.
 * 
 * Object.getClass() 함수를 통해 패키지 정보를 알아낼 수 있다.
 * */
public class Ex09_04_ToStringEx {
	
	public static void main(String[] args) {
		Value v1 = new Value(100);
		Value v2 = new ValueOfValue(100);
		
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println(v1.getClass());
		System.out.println(Value.class);
	}
	
	public static class Value{
		public int value;
		Value(int value){			this.value = value;		}		
	}
	public static class ValueOfValue extends Value{
		ValueOfValue(int value) {			super(value);		}
		@Override	public String toString() {			return String.valueOf(value);		}
	}
}
//p150407_Chapter09.Ex09_04_ToStringEx$Value@1db9742
//100
//class p150407_Chapter09.Ex09_04_ToStringEx$Value
//class p150407_Chapter09.Ex09_04_ToStringEx$Value
