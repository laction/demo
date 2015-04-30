package p150331_Chapter06;

import java.util.function.Function;

/* 1. 앞의 Coin 클래스를 이용하여 두개의 동전 객체를 던져서 먼저 세번 연속 앞면이 나온 동전이
 * 	승리하는 프로그램을 작성하라
 * 	단, 던지기는 어느 한 동전이 경기를 이길 때 까지 계속 한다.
 * 	동전을 던질 때 마다 그 결과를 출력하라
 * 	문자열 비교 : 
 * 		coin.side.equals("앞면");
 * */
public class Ex06_16_CoinEx2 {
	public static void main(String[] args) {
		Coin c1 = new Coin();
		Coin c2 = new Coin();
		
		int p1 = 0, p2 = 0;
		
		while ( true ){
			if(c1.flip().getSide()) p1 ++;
			else p1 = 0;
			if(c2.flip().getSide()) p2 ++;
			else p2 = 0;
						
			System.out.print( " 1 : " );		c1.view();
			System.out.print( ", 2 : " );	c2.view();
			System.out.println();
			
			if(p1>=3 && p2>=3 ){	System.out.println("무승부");	break;}
			else if(p1>=3) {	System.out.println("1번이 승리");	break;}
			else if(p2>=3) {	System.out.println("2번이 승리");	break;}
			else continue;
		}
	}
}
//1 : 앞, 2 : 앞
//1 : 뒤, 2 : 뒤
//1 : 앞, 2 : 뒤
//1 : 앞, 2 : 앞
//1 : 뒤, 2 : 앞
//1 : 뒤, 2 : 앞
//2번이 승리
