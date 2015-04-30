package p150325_Chapter04;

import java.util.Scanner;

// 키보드로 부터 점수를 입력 받아 점수의 합계와 평균을 출력하기
// 단 점수가 999점이 들어오면 점수의 입력을 끝낸다.
/**
 * 
 * @author C-PC
 * Test
 */
public class Ex04_05_LoopEx2 {
	public static void main(String[] args) {
		int score = 0, tot=0,cnt=0;
		double avg = 0; 
		System.out.println("점수를 입력하세요, 종료(999) : ");
		Scanner sc = new Scanner(System.in);		
		
		while((score = sc.nextInt())!=999 ){
			tot+=score;	
			cnt ++;
			avg = (double)tot/cnt;			
		}		
		
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + avg);
	}
}
//점수를 입력하세요, 종료(999) : 
//10
//30
//50
//80
//200
//999
//합계 : 370
//평균 : 74.0
