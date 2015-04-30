package p150326_Chapter04;

import java.util.Scanner;

public class Ex04_07_LoopEx4 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++){			
			if( i == 5 ) break;
		//	if( i >= 5 ) continue;			
			System.out.println("\n"+i+"단");
			for(int j=1;j<=9;j++){
			//	if( j == 5 ) break;
				if( j >= 5 ) continue;
				System.out.println(
						i + " * " + j + " = " + (i*j) 
						);
			}			
		}
		System.out.println("-----break, continue------");
		int sum = 0;
		for ( int i = 1; i <= 100 ; i++){
			if( i % 2 == 0)		continue;
			if( i % 3 == 0)		continue;
			sum += i;
		}
		System.out.println("합계 : " + sum);
		System.out.println("-----1------");

	/* 다음은 숫자맞추기 게임을 작성한 것이다.
	 * 1과 100사이의 값을 반복적으로 입력해서
	 * 컴퓨터가 생각한 값을 맞추면 게임이 끝난다.
	 * 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
	 * 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다.
	 * (1)~(2)에 알맞는 코드를 넣어 프로그램을 완성하시오.
	 * */
	int answer = (int)(Math.random()*100) + 1 ; // (1) ; Math.random() 함수
	int input = 0;
	int count = 0;
//	Scanner s = new Scanner(System.in);
	Scanner s = new Scanner(System.in);
	do {
		count ++;
		System.out.print("1과 100사이의 값을 입력하세요 : ");
		input = s.nextInt();
		if(answer < input){
			System.out.println("DOWN");
			continue;
		}
		else if(answer > input){
			System.out.println("UP");
			continue;
		}
		System.out.println("!!! 정답은 "+answer+"!!!  "+count+"번만에 맞추셨네요!");
		break;		
	}while(true);	
	}
}
//2단
//2 * 1 = 2
//2 * 2 = 4
//2 * 3 = 6
//2 * 4 = 8
//
//3단
//3 * 1 = 3
//3 * 2 = 6
//3 * 3 = 9
//3 * 4 = 12
//
//4단
//4 * 1 = 4
//4 * 2 = 8
//4 * 3 = 12
//4 * 4 = 16
//-----break, continue------
//합계 : 1633
//-----1------
//1과 100사이의 값을 입력하세요 : 40
//DOWN
//1과 100사이의 값을 입력하세요 : 20
//UP
//1과 100사이의 값을 입력하세요 : 30
//UP
//1과 100사이의 값을 입력하세요 : 35
//DOWN
//1과 100사이의 값을 입력하세요 : 32
//UP
//1과 100사이의 값을 입력하세요 : 34
//DOWN
//1과 100사이의 값을 입력하세요 : 33
//!!! 정답은 33!!!  7번만에 맞추셨네요!

