package p150325_Chapter04;

import java.util.Scanner;

// Ű����� ���� ������ �Է� �޾� ������ �հ�� ����� ����ϱ�
// �� ������ 999���� ������ ������ �Է��� ������.
/**
 * 
 * @author C-PC
 * Test
 */
public class Ex04_05_LoopEx2 {
	public static void main(String[] args) {
		int score = 0, tot=0,cnt=0;
		double avg = 0; 
		System.out.println("������ �Է��ϼ���, ����(999) : ");
		Scanner sc = new Scanner(System.in);		
		
		while((score = sc.nextInt())!=999 ){
			tot+=score;	
			cnt ++;
			avg = (double)tot/cnt;			
		}		
		
		System.out.println("�հ� : " + tot);
		System.out.println("��� : " + avg);
	}
}
//������ �Է��ϼ���, ����(999) : 
//10
//30
//50
//80
//200
//999
//�հ� : 370
//��� : 74.0
