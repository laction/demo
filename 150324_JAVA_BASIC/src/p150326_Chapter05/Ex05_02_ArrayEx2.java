package p150326_Chapter05;

import java.util.Scanner;

/* 자료형의 기본값.
 * 숫자 : 0, 참조변수 : null, boolean : false  
 * */
public class Ex05_02_ArrayEx2 {
	public static void main(String[] args) {
		// digit에 해당하는 진수로 10진수를 변경하기
		{
			int num, div, mod, i = 0, digit = 16;
			char hexa[] = new char[32];
			System.out.print("10진 자연수를 입력하세요 : ");
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
		// 베이스볼 게임 만들기
		{
			final int MAX = 4;
			Scanner sc = new Scanner(System.in);
			int[] v = new int[MAX];

			for (int i = 0; i < v.length; i++) {
				int idx;
				while (true) {
					v[i] = (int) (Math.random() * 10); // 숫자를 고른다
					for (idx = 0; idx < i; idx++)
						if (v[i] == v[idx])
							break; // 같은 수가 존재하면 다시 뽑기
					if (idx == i)
						break; // 없으면 다음 수 뽑기
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
				System.out.println(stkCnt + "스트라이크 " + ballCnt + "볼");
				if (stkCnt == MAX)
					break;
			}
			System.out.println("맞췄습니다.");
		}
		System.out.println("-----베이스볼 게임-----");
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
				System.out.print("서로다른 4자리 수를 입력하세요 : ");
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
					System.out.println("맞췄습니다");
					break;
				} else {
					System.out.println(String.format("%02d", num) + " : "
							+ strike + "스트라이크 , " + ball + "볼\n");
				}
			}

		}

	}
}
//
//10진 자연수를 입력하세요 : 16
//10
//-----dec2digit-----
//5841 : 5841
//5841
//4스트라이크 0볼
//맞췄습니다.
//-----베이스볼 게임-----
//서로다른 4자리 수를 입력하세요 : 1234
//1234 : 0스트라이크 , 3볼
//
//서로다른 4자리 수를 입력하세요 : 5678
//5678 : 0스트라이크 , 1볼
//
//서로다른 4자리 수를 입력하세요 : 1290
//1290 : 0스트라이크 , 2볼
//
//서로다른 4자리 수를 입력하세요 : 2190
//2190 : 1스트라이크 , 1볼
//
//서로다른 4자리 수를 입력하세요 : 2091
//2091 : 1스트라이크 , 1볼
//
//서로다른 4자리 수를 입력하세요 : 2019
//2019 : 2스트라이크 , 0볼
//
//서로다른 4자리 수를 입력하세요 : 2519
//2519 : 2스트라이크 , 0볼
//
//서로다른 4자리 수를 입력하세요 : 2619
//2619 : 2스트라이크 , 0볼
//
//서로다른 4자리 수를 입력하세요 : 2719
//2719 : 2스트라이크 , 1볼
//
//서로다른 4자리 수를 입력하세요 : 2317
//2317 : 3스트라이크 , 0볼
//
//서로다른 4자리 수를 입력하세요 : 2417
//맞췄습니다

