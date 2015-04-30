package p150325_Chapter03;
// 정수형 = 정수형 op 정수형
// 실수형 = 실수형 op 정수형

// 나머지 연산자 : %
// 나머지 연산 결과의 부호는 비젯수의 부호를 따른다. 
public class Ex03_03_OpEx3 {

	public static void main(String[] args) {
		System.out.println("10 / 8 =" + (10 / 8));
		System.out.println("10 % 8 =" + (10 % 8));
		System.out.println("-10 % 8 =" + (-10 % 8));
		System.out.println("10 % -8 =" + (10 % -8));
		System.out.println("-10 % -8 =" + (-10 % -8));
		
		System.out.println("--------1-------");
		
		/* 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 
		 * 만일 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다. 
		 * 결과값을 구하시오.
		 * */		
		int num = 456;
		int result = num - num%100;
		System.out.println(result);
	}
}
//10 / 8 =1
//10 % 8 =2
//-10 % 8 =-2
//10 % -8 =2
//-10 % -8 =-2
//--------1-------
//400
