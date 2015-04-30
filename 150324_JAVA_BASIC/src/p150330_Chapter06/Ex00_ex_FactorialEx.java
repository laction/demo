package p150330_Chapter06;
// Factorial 예제 : 재귀함수 예제
// 재귀함수는 XML 파싱에서 많이 쓰인다.
public class Ex00_ex_FactorialEx {
	static int factorial(int num){
		return (num<=0) ? (1) : (num*factorial( num-1 ));
	}
	public static void main(String[] args) {
		System.out.println(factorial(4));		
	}
}
//24
