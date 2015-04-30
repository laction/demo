package p150414_Chapter11;

import java.util.Random;
/* Random Ŭ���� ����
 *  Math.random : 0.0 ~ 0.99999.... �� ������ �� ����
 *  							seed�� ���� �ȵ�
 *  Random Ŭ���� : seed ���� ����
 *  							�ڷ������� ���� �߻� ����
 *  							���� ���� ���� nextInt(n) : 0 ~ n-1
 * */
public class Ex11_00_08_RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		// seed ����
		// System.currentTimeMillis() : 1970�� ���� ~ ���� �и��� ���� ����.
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
