package p150408_Chapter09;

public class Ex09_12_WrapperEx2 {
	public static void main(String[] args) {
		char [] data = {'A','a','4','#',' '};
		for(int i = 0 ; i < data.length ; i++){
			System.out.print(data[i] + " 는 ");
			if(Character.isUpperCase(data[i]))				System.out.println("대문자");			
			else if(Character.isLowerCase(data[i]))		System.out.println("소문자");
			else if(Character.isSpaceChar(data[i]))		System.out.println("공백");
			else if(Character.isDigit(data[i]))					System.out.println("숫자");
																		else				System.out.println("일반문자");		
		}
		double d= 10.3/3;
		System.out.println("숫자가 아니니? "+Double.isNaN(d));
		System.out.println("무한대니 ? " + Double.isInfinite(1/0.0));
		
		//	JDK 5.0 이후에 추가된 메서드
		int is = Integer.valueOf("100",8);
		System.out.println(is);
		double ds = Double.valueOf("3.654");
		System.out.println(ds);
	}
}
//A 는 대문자
//a 는 소문자
//4 는 숫자
//# 는 일반문자
//  는 공백
//숫자가 아니니? false
//무한대니 ? true
//64
//3.654
