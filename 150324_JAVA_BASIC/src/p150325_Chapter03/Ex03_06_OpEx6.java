package p150325_Chapter03;

import java.util.Scanner;

// ���ǿ����� (���׿�����) : (���ǽ�)?��:����
public class Ex03_06_OpEx6 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		System.out.println( x + "," + y + " �� �� ū���� " 
																		+ (   (x>y) ? (x) : (y)  )  );
		System.out.println("-----1-----");
		// ���� : score�� 60 �̻��̸�, �հ��̰� �ƴϸ� ���հ� ���
		int score = 80;
		System.out.println( "�հݿ��� : " + (( score >= 60) ? ("�հ�") : ("���հ�")) );
		
		/* �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ����� ���� ���ϴ� �ڵ��̴�. 
		 * ���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�, 
		 * 13���� �ٱ��ϰ� �ʿ��ϴ�. (1)�� �˸´� �ڵ带 �����ÿ�.
		 * */		
		int numOfApples = 123;
		int sizeofBucket = 10;
		int numOfBucket = (  numOfApples / sizeofBucket + ((numOfApples%sizeofBucket != 0)? (1):(0)) );
		System.out.println("�ʿ��� �ٱ����� �� : "+ numOfBucket);
		
		System.out.println("-----2-----");		
		/* ���� num�� ���� ����
		 * '���', '����', '0' �� ����ϴ� �ڵ��̴�.
		 *  ���� �����ڸ� �̿��Ͽ� ���α׷� �ۼ��ϱ�.
		 * */		
		int num = 0;
		System.out.println(num + ":" + 
			(	(num>0)?	("���"):
				(num<0)?	("����"):
									("����")
			)
		);
		
		/* 90�� �̻��� ��� 'A'����
		 * 80�� �̻��� ��� 'B'����
		 * 70�� �̻��� ��� 'C'����
		 * 60�� �̻��� ��� 'D'����
		 * ������ ��� 'F'���� ����ϱ�
		 * */
		int point = 99;
		System.out.println(point + "����"+
				(	(point>=90)?		("A"):
					(point>=80)?		("B"):
					(point>=70)?		("C"):
					(point>=60)?		("D"):
													("F")
				)
				+	"�����Դϴ�."
		);
	}
}
