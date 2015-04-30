package p150331_Chapter06;
/* Package.
 * 모든 클래스이름은 패키지명을 포함한다.    패키지명.클래스명  처럼 사용한다.
 * package 구문은 반드시 파일 제일 첫줄에 기술한다.
 * 하나의 파일의 모든 클래스는 동일한 패키지이다. * 
 * */
/* Package 생략가능한 클래스.
 * 1. 동일 패키지의 클래스
 * 2. java.lang 패키지에 속한 클래스
 * 3. import를 사용한 다른 패키지의 클래스.
 * */
import p150330_Chapter06.Ex06_07_ShuffleEx;

public class Ex06_18_PackageEx {
	static void testPrint(){
		System.out.println("PackageEx의 testPrint()");
	}
	public static void main(String[] args) {
		System.out.println(   java.lang.Math.random()   );
		
		p150331_Chapter06.Ex06_18_PackageEx.testPrint();
		
		System.out.println("-----1-----");
		Ex06_07_ShuffleEx.main(null);
		System.out.println("-----2-----");
		p150330_Chapter06.Ex06_06_IsNumberEx.main(null);
		System.out.println("-----3-----");
	}
}
//0.6436876726169328
//PackageEx의 testPrint()
//-----1-----
//1	2	3	4	5	6	7	8	9	
//8	4	2	9	3	6	7	1	5	
//1	2	3	4	5	6	7	8	9	-----2-----
//5.0
//true
//false
//false
//-----3-----
