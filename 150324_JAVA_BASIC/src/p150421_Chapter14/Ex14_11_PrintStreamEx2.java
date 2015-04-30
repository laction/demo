package p150421_Chapter14;

public class Ex14_11_PrintStreamEx2 {
	public static void main(String[] args) {
		System.out.printf("%c%n",'A');		// A 출력
		System.out.printf("%5c%n",'A');		// 5자리 확보 후 A 출력
		System.out.printf("%-5c%n%n",'A');	// 5자리 확보 후 왼쪽정렬로 A 출력
		
		System.out.printf("%d%n",12345);		// 10진수 출력
		System.out.printf("%o%n",12345);		// 8진수 출력
		System.out.printf("%x%n",12345);		// 16진수 출력		
		System.out.printf("%10d%n",12345);		// 10자리 확보
		System.out.printf("%010d%n%n",12345);	// 빈자리 0 채움
		
		System.out.printf("%f%n",12.12745);		// 실수
		System.out.printf("%g%n",12.12745);		// 근사 실수
		System.out.printf("%e%n",12.12745);		// 지수방식 실수
		System.out.printf("%10.2f%n%n",12.12745);	// 10자리 확보(소수점과 실수부까지 포함), 소수점 2째까지 반올림
		
		System.out.printf("%s%n","홍길동");		// 문자형 출력
		System.out.printf("%s%n%s%n","홍길동","김삿갓");
		
		System.out.printf("%b%n",true);		// boolean 출력
		
		// 형식제어문자 사용가능한 함수. String String.format()
		System.out.println(String.format("%8.3f%n", 12.12745));
		
		System.out.printf("%x%n",255);
		System.out.printf("%X%n",255);		// 대문자로 hexa값 출력
	}
}
