package p150325_Chapter04;
import java.util.Scanner;
// 시스템과 가위바위보 게임하기
public class Ex04_03_SwitchEx2 {
	final static int 가위 = 0;
	final static int 바위 = 1;
	final static int 보 = 2;
	public static void main(String[] args) {
		int jbb;
		/*Math.random() : 0.0부터 0,999999... 난수 발생 함수
		 * 0.0	<= 		Math.random() * 3		<= 2.999999....
		 * 0		<= (int)(Math.random() * 3)	<= 2
		 * */
		jbb = (int)(Math.random() * 3);
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2)를 입력하세요");
		int myjbb = scan.nextInt();
		/* jbb myjbb 같은 경우 : 비김 출력
		 * jbb(0) myjbb(1) : 이겼습니다
		 * jbb(0) myjbb(2) : 졌습니다 */
		
		System.out.println("컴퓨터 (" + strJbb(jbb) +") vs (" + strJbb(myjbb) + ") 나");
		
		if(jbb==myjbb) System.out.println("비김");
		else if((jbb-myjbb+3)%3==1) System.out.println("짐");
		else System.out.println("이김");
		
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
			{
				System.out.print("컴퓨터 (" + strJbb(i) +") vs (" + strJbb(j) + ") 나 : ");
				if(i==j) System.out.println("비김");
				else if((i-j+3)%3==1) System.out.println("짐");
				else System.out.println("이김");				
			}		
		System.out.println(-2%3 +"  "+ 1%3);
		System.out.println("% 연산은  부호를 그대로 따라가니 주의할 것");		
	}
	public static String strJbb(int jbb){
		switch (jbb){
		case 0: return "가위";
		case 1: return "바위";
		case 2: return "보";
		}
		return null;
	}	
}
//가위(0),바위(1),보(2)를 입력하세요
//1
//컴퓨터 (보) vs (바위) 나
//짐
//컴퓨터 (가위) vs (가위) 나 : 비김
//컴퓨터 (가위) vs (바위) 나 : 이김
//컴퓨터 (가위) vs (보) 나 : 짐
//컴퓨터 (바위) vs (가위) 나 : 짐
//컴퓨터 (바위) vs (바위) 나 : 비김
//컴퓨터 (바위) vs (보) 나 : 이김
//컴퓨터 (보) vs (가위) 나 : 이김
//컴퓨터 (보) vs (바위) 나 : 짐
//컴퓨터 (보) vs (보) 나 : 비김
//-2  1
//% 연산은  부호를 그대로 따라가니 주의할 것
