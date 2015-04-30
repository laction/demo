package p150414_Chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11_00_05_ScannerEx1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		String input = "";
		do{
			System.out.println("���ڸ� �Է��ϼ��� (Q:�Է�����) : ");
			input = scan.nextLine();
			System.out.println("�Է� ���� : "+input);
		}while(!input.equals("Q"));
		scan = new Scanner(new File("data.txt"));
		int cnt = 0 ; 
		int total = 0;
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			Scanner sc = new Scanner(line);
			// ���Խ�ǥ�� : \\s* : ���鹮�� 0���̻�
			sc.useDelimiter("\\s*,\\s*");
			int sum = 0;
			while(sc.hasNextInt())
				sum += sc.nextInt();
			System.out.println(line + ", sum : " + sum);
			total += sum;
			cnt++;
		}
		System.out.println("input line : "+cnt + "�հ� : "+ total);
	}	
}

//���ڸ� �Է��ϼ��� (Q:�Է�����) : 
//I am Input
//�Է� ���� : I am Input
//���ڸ� �Է��ϼ��� (Q:�Է�����) : 
//Q
//�Է� ���� : Q
//100,	100,       100, sum : 300
//200, 200,		200, sum : 600
//300,     300,300, sum : 900
//400,400,400, sum : 1200
//500,500,500 , sum : 1000
//input line : 5�հ� : 4000
