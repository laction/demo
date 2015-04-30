package p150326_Chapter05;

import java.util.Scanner;

/* �ڷ����� �⺻��.
 * ���� : 0, �������� : null, boolean : false  
 * */
public class Ex05_02_ArrayEx2 {
	public static void main(String[] args) {
		// digit�� �ش��ϴ� ������ 10������ �����ϱ�
		{
			int num, div, mod, i = 0, digit = 16;
			char hexa[] = new char[32];
			System.out.print("10�� �ڿ����� �Է��ϼ��� : ");
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt();
			while (num != 0) {
				int res = num % digit;
				if (res >= 9)
					hexa[i++] = (char) ('A' + res % 10);
				else
					hexa[i++] = (char) ('0' + res);
				num /= digit;
			}
			for (int j = i - 1; j >= 0; j--)
				System.out.print(hexa[j]);
			System.out.println();
		}
		System.out.println("-----dec2digit-----");
		// ���̽��� ���� �����
		{
			final int MAX = 4;
			Scanner sc = new Scanner(System.in);
			int[] v = new int[MAX];

			for (int i = 0; i < v.length; i++) {
				int idx;
				while (true) {
					v[i] = (int) (Math.random() * 10); // ���ڸ� ����
					for (idx = 0; idx < i; idx++)
						if (v[i] == v[idx])
							break; // ���� ���� �����ϸ� �ٽ� �̱�
					if (idx == i)
						break; // ������ ���� �� �̱�
				}
			}
			for (int i = 0; i < v.length; i++)
				System.out.print(v[i]);
			while (true) {
				System.out.print(" : ");
				int cnt = 0;
				int input = sc.nextInt();
				int[] in = new int[MAX];
				int stkCnt = 0, ballCnt = 0;

				for (int i = in.length - 1; i >= 0; i--) {
					in[i] = input % 10;
					input /= 10;
				}

				for (int i = 0; i < in.length; i++)
					System.out.print(in[i]);
				System.out.println();

				for (int i = 0; i < in.length; i++)
					for (int j = 0; j < in.length; j++)
						if (in[i] == v[j]) {
							if (i == j)
								stkCnt++;
							else
								ballCnt++;
						}
				System.out.println(stkCnt + "��Ʈ����ũ " + ballCnt + "��");
				if (stkCnt == MAX)
					break;
			}
			System.out.println("������ϴ�.");
		}
		System.out.println("-----���̽��� ����-----");
		{
			int strike = 0, ball = 0, i, j, data = 0;
			int answer[] = { -1, -1, -1, -1 };
			int rcvData[] = new int[4];
			Scanner scan = new Scanner(System.in);

			while (true) {
				data = (int) (Math.random() * 10);
				for (i = 0; i < 4; i++) {
					if (answer[i] == -1) {
						answer[i] = data;
						break;
					}
					if (data == answer[i])
						break;
				}
				if (i == 4)
					break;
			}

			while (true) {
				System.out.print("���δٸ� 4�ڸ� ���� �Է��ϼ��� : ");
				int num = scan.nextInt();
				rcvData[0] = num / 1000;
				rcvData[1] = (num % 1000) / 100;
				rcvData[2] = (num % 100) / 10;
				rcvData[3] = num % 10;
				strike = 0;
				ball = 0;
				for (i = 0; i < 4; i++)
					for (j = 0; j < 4; j++) {
						if (rcvData[i] == answer[j]) {
							if (i == j)
								strike++;
							else
								ball++;
						}
					}
				if (strike == 4) {
					System.out.println("������ϴ�");
					break;
				} else {
					System.out.println(String.format("%02d", num) + " : "
							+ strike + "��Ʈ����ũ , " + ball + "��\n");
				}
			}

		}

	}
}
//
//10�� �ڿ����� �Է��ϼ��� : 16
//10
//-----dec2digit-----
//5841 : 5841
//5841
//4��Ʈ����ũ 0��
//������ϴ�.
//-----���̽��� ����-----
//���δٸ� 4�ڸ� ���� �Է��ϼ��� : 1234
//1234 : 0��Ʈ����ũ , 3��
//
//���δٸ� 4�ڸ� ���� �Է��ϼ��� : 5678
//5678 : 0��Ʈ����ũ , 1��
//
//���δٸ� 4�ڸ� ���� �Է��ϼ��� : 1290
//1290 : 0��Ʈ����ũ , 2��
//
//���δٸ� 4�ڸ� ���� �Է��ϼ��� : 2190
//2190 : 1��Ʈ����ũ , 1��
//
//���δٸ� 4�ڸ� ���� �Է��ϼ��� : 2091
//2091 : 1��Ʈ����ũ , 1��
//
//���δٸ� 4�ڸ� ���� �Է��ϼ��� : 2019
//2019 : 2��Ʈ����ũ , 0��
//
//���δٸ� 4�ڸ� ���� �Է��ϼ��� : 2519
//2519 : 2��Ʈ����ũ , 0��
//
//���δٸ� 4�ڸ� ���� �Է��ϼ��� : 2619
//2619 : 2��Ʈ����ũ , 0��
//
//���δٸ� 4�ڸ� ���� �Է��ϼ��� : 2719
//2719 : 2��Ʈ����ũ , 1��
//
//���δٸ� 4�ڸ� ���� �Է��ϼ��� : 2317
//2317 : 3��Ʈ����ũ , 0��
//
//���δٸ� 4�ڸ� ���� �Է��ϼ��� : 2417
//������ϴ�

