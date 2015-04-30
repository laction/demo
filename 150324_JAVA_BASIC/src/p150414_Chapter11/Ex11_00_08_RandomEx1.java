package p150414_Chapter11;

import java.util.Random;
/* Random 클래스 예제
 *  Math.random : 0.0 ~ 0.99999.... 중 임의의 수 리턴
 *  							seed값 설정 안됨
 *  Random 클래스 : seed 설정 가능
 *  							자료형별로 난수 발생 가능
 *  							범위 지정 가능 nextInt(n) : 0 ~ n-1
 * */
public class Ex11_00_08_RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		// seed 설정
		// System.currentTimeMillis() : 1970년 시작 ~ 현재 밀리초 값을 리턴.
		rand.setSeed(System.currentTimeMillis());
		Random rand2 = new Random();
		rand2.setSeed(System.currentTimeMillis()+1);
		System.out.println(" = rand = ");
		for(int i = 0 ; i < 5 ; i ++)
			System.out.println(i + ":" +rand.nextInt(100));
		System.out.println();
		System.out.println(" = rand2 = ");
		for(int i = 0 ; i < 5 ; i ++)
			System.out.println(i + ":" +rand2.nextInt(100));
	}	
}
//= rand = 
//0:67
//1:8
//2:7
//3:2
//4:14
//
//= rand2 = 
//0:90
//1:92
//2:52
//3:57
//4:49
