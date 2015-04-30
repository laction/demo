package p150406_Chapter08;
/* 정상처리 : try문이 실행됨.
 * 예외처리 : 에러 발생된 "줄"("에러 발생 함수" 및 "해당 함수를 참조하는 함수 모두") 이전까지만 실행.
 * 				해당 에러에 해당하는 블록문 실행.
 * 				이후, finally문 부터 실행. 			
 * 
 * 자바는 예외처리가 필수.
 * 	단, RuntimeException인 경우는 예외처리를 생략할 수 있다.
 * 		RuntimeException을 상속받은 모든 객체는 생략 가능하다. 	
 * try문 내에서 Exception 클래스는 이름은 모두 달라야 한다.	
 * 예외처리문은 모두 블럭으로 둘러쌓여야 한다.
 * */
public class Ex08_01_ExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("1.Non-Error Block Before Error Block");
		try{
			System.out.println("2.Before Error");
			System.out.println("3.Error Occure" + 2/0);	// java.lang.ArithmeticException: / by zero													
			System.out.println("4.After Error At Same");
		}catch(ArithmeticException e){
			System.out.println("5.Catch Error And Throw This");
		}finally {
			System.out.println("6.Finally Block");
		}
		System.out.println("7.Non-Error Block After Error Block");
	}
}
//Non-Error Block Before Error Block
//Before Error
//Catch Error And Throw This
//Finally Block
//Non-Error Block After Error Block
