package p150325_Chapter03;

import java.util.Scanner;

// 조건연산자 (삼항연산자) : (조건식)?참:거짓
public class Ex03_06_OpEx6 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		System.out.println( x + "," + y + " 중 더 큰수는 " 
																		+ (   (x>y) ? (x) : (y)  )  );
		System.out.println("-----1-----");
		// 문제 : score가 60 이상이면, 합격이고 아니면 불합격 출력
		int score = 80;
		System.out.println( "합격여부 : " + (( score >= 60) ? ("합격") : ("불합격")) );
		
		/* 아래의 코드는 사과를 담는데 필요한 바구니의 수를 구하는 코드이다. 
		 * 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 
		 * 13개의 바구니가 필요하다. (1)에 알맞는 코드를 넣으시오.
		 * */		
		int numOfApples = 123;
		int sizeofBucket = 10;
		int numOfBucket = (  numOfApples / sizeofBucket + ((numOfApples%sizeofBucket != 0)? (1):(0)) );
		System.out.println("필요한 바구니의 수 : "+ numOfBucket);
		
		System.out.println("-----2-----");		
		/* 변수 num의 값에 따라
		 * '양수', '음수', '0' 을 출력하는 코드이다.
		 *  삼항 연산자를 이용하여 프로그램 작성하기.
		 * */		
		int num = 0;
		System.out.println(num + ":" + 
			(	(num>0)?	("양수"):
				(num<0)?	("음수"):
									("제로")
			)
		);
		
		/* 90점 이상인 경우 'A'학점
		 * 80점 이상인 경우 'B'학점
		 * 70점 이상인 경우 'C'학점
		 * 60점 이상인 경우 'D'학점
		 * 나머지 경우 'F'학점 출력하기
		 * */
		int point = 99;
		System.out.println(point + "점은"+
				(	(point>=90)?		("A"):
					(point>=80)?		("B"):
					(point>=70)?		("C"):
					(point>=60)?		("D"):
													("F")
				)
				+	"학점입니다."
		);
	}
}
