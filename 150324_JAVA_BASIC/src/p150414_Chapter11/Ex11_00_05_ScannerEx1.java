package p150414_Chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11_00_05_ScannerEx1 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		String input = "";
		do{
			System.out.println("문자를 입력하세요 (Q:입력종료) : ");
			input = scan.nextLine();
			System.out.println("입력 내용 : "+input);
		}while(!input.equals("Q"));
		scan = new Scanner(new File("data.txt"));
		int cnt = 0 ; 
		int total = 0;
		while(scan.hasNextLine()){
			String line = scan.nextLine();
			Scanner sc = new Scanner(line);
			// 정규식표현 : \\s* : 공백문자 0개이상
			sc.useDelimiter("\\s*,\\s*");
			int sum = 0;
			while(sc.hasNextInt())
				sum += sc.nextInt();
			System.out.println(line + ", sum : " + sum);
			total += sum;
			cnt++;
		}
		System.out.println("input line : "+cnt + "합계 : "+ total);
	}	
}

//문자를 입력하세요 (Q:입력종료) : 
//I am Input
//입력 내용 : I am Input
//문자를 입력하세요 (Q:입력종료) : 
//Q
//입력 내용 : Q
//100,	100,       100, sum : 300
//200, 200,		200, sum : 600
//300,     300,300, sum : 900
//400,400,400, sum : 1200
//500,500,500 , sum : 1000
//input line : 5합계 : 4000
