package p150331_Chapter06;

import java.util.function.Function;

/* 1. ���� Coin Ŭ������ �̿��Ͽ� �ΰ��� ���� ��ü�� ������ ���� ���� ���� �ո��� ���� ������
 * 	�¸��ϴ� ���α׷��� �ۼ��϶�
 * 	��, ������� ��� �� ������ ��⸦ �̱� �� ���� ��� �Ѵ�.
 * 	������ ���� �� ���� �� ����� ����϶�
 * 	���ڿ� �� : 
 * 		coin.side.equals("�ո�");
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
			
			if(p1>=3 && p2>=3 ){	System.out.println("���º�");	break;}
			else if(p1>=3) {	System.out.println("1���� �¸�");	break;}
			else if(p2>=3) {	System.out.println("2���� �¸�");	break;}
			else continue;
		}
	}
}
//1 : ��, 2 : ��
//1 : ��, 2 : ��
//1 : ��, 2 : ��
//1 : ��, 2 : ��
//1 : ��, 2 : ��
//1 : ��, 2 : ��
//2���� �¸�
