package p150324_Chapter02;

// 특수 문자 예제 : \ 표현함
// \n : 새로운 Line
// \t : Tab 표시
// \" : 문자 "
// \\ : 문자 \
// .properties 파일을 사용해, Unicode를 쉽게 알아 낼 수 있다.

public class Ex02_03_SpecialCharEx {

	public static void main(String[] args) {
		System.out.println( "\"\n\t\\");
		System.out.println("----------------------");
		
		char single = '\'';
		String quote = "Hello \"홍길동!\"";
		String root = "c:\\";
		System.out.println(single);
		System.out.println(quote);
		System.out.println(root);
		System.out.println("서\t대\t부");
		System.out.println("안녕하세요\n이부분은 다음줄에");
		System.out.println("\ud64d\uae38\ub3d9");
	}
}
