package p150324_Chapter02;

/* 주석예제
 * 주석이란 : 컴파일 제외 부분 즉 기계어 처리가 안됨.
 * 1. /* ... * / 	: 여러줄 주석
 * 2. //				: 한줄 주석
 * 3. /** ... * / 	: 문서화 주석
 *								클래스 밖, 메서드 밖에서만 유효함.
 * javadoc 자바소스명.java : 해당소수만 문서화
 * javadoc *.java					: 모든 소스를 문서화
 * 실행후
 * index.html로 문서화 시작
 * */

public class Ex02_05_CommentEx {
	/**
	 * main 메서드 : 프로그램의 시작
	 * @param args
	 *  출력 : Hello, Java ! 출력됨
	 */
	public static void main(String[] args){
		System.out.println("Hello, Java!");
	}
}
