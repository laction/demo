package p150330_Chapter06;
 public class Ex06_06_IsNumberEx{
	/* 두 점의 거리를 계산하는 getDistance()를 완성하시오.
	 * [Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
	 * */
	static double getDistance(int x1, int y1 , int x2, int y2){
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));		
	}
	/* 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	 * 메서드명 : isNumber
	 * 		기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
	 * 					모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를 반환.
	 * 		반환타입 : boolean
	 * 		매개변수 : String str - 검사할 문자열
	 * String 클래스의 charAt(int i ) 메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다.
	 * */
	static boolean isNumber(String str){
		// str.charAt(0) // 문자열의 첫번째 문자 리턴
		for(int i = 0 ; i < str.length() ; i++){
			char ch = str.charAt(i); 
			if( ( '0' <= ch && ch <= '9')  ) ;
				 else return false;			
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(getDistance(10,15,13,11));
		
		System.out.println(isNumber("123456"));
		System.out.println(isNumber("ABCDEF"));
		System.out.println(isNumber("12ABC6"));		
	}	
}
// 5.0
// true
// false
// false
