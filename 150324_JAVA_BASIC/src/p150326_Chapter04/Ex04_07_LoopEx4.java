package p150326_Chapter04;

import java.util.Scanner;

public class Ex04_07_LoopEx4 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++){			
			if( i == 5 ) break;
		//	if( i >= 5 ) continue;			
			System.out.println("\n"+i+"��");
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
		System.out.println("�հ� : " + sum);
		System.out.println("-----1------");

	/* ������ ���ڸ��߱� ������ �ۼ��� ���̴�.
	 * 1�� 100������ ���� �ݺ������� �Է��ؼ�
	 * ��ǻ�Ͱ� ������ ���� ���߸� ������ ������.
	 * ����ڰ� ���� �Է��ϸ�, ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش�.
	 * ����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ������ ������ �� �� ���� ���ڸ� ������� �˷��ش�.
	 * (1)~(2)�� �˸´� �ڵ带 �־� ���α׷��� �ϼ��Ͻÿ�.
	 * */
	int answer = (int)(Math.random()*100) + 1 ; // (1) ; Math.random() �Լ�
	int input = 0;
	int count = 0;
//	Scanner s = new Scanner(System.in);
	Scanner s = new Scanner(System.in);
	do {
		count ++;
		System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
		input = s.nextInt();
		if(answer < input){
			System.out.println("DOWN");
			continue;
		}
		else if(answer > input){
			System.out.println("UP");
			continue;
		}
		System.out.println("!!! ������ "+answer+"!!!  "+count+"������ ���߼̳׿�!");
		break;		
	}while(true);	
	}
}
//2��
//2 * 1 = 2
//2 * 2 = 4
//2 * 3 = 6
//2 * 4 = 8
//
//3��
//3 * 1 = 3
//3 * 2 = 6
//3 * 3 = 9
//3 * 4 = 12
//
//4��
//4 * 1 = 4
//4 * 2 = 8
//4 * 3 = 12
//4 * 4 = 16
//-----break, continue------
//�հ� : 1633
//-----1------
//1�� 100������ ���� �Է��ϼ��� : 40
//DOWN
//1�� 100������ ���� �Է��ϼ��� : 20
//UP
//1�� 100������ ���� �Է��ϼ��� : 30
//UP
//1�� 100������ ���� �Է��ϼ��� : 35
//DOWN
//1�� 100������ ���� �Է��ϼ��� : 32
//UP
//1�� 100������ ���� �Է��ϼ��� : 34
//DOWN
//1�� 100������ ���� �Է��ϼ��� : 33
//!!! ������ 33!!!  7������ ���߼̳׿�!

