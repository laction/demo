package p150326_Chapter05;
import java.util.Scanner;
/* 배열
 *  C의 배열과 달리, Java에서는 배열도 객체로 인식한다. 즉, Container 클래스를 상속받은 객체이다.
 *  Java에서는 메모리 동적할당되는 모든 메모리는 가비지 컬렉션에서 관리되며, 
 *  		참조변수에 할당되지 않는 변수는 가비지 컬렉션에 의해 메모리 해제 된다.   
 * */
public class Ex05_01_ArrayEx1 {	
	public static void main(String[] args) {		
		{
			int [] arr = new int [5];
			arr[0] = 10;			arr[1] = 20;			arr[2] = 30;			arr[3] = 40;			arr[4] = 50;
			for(int i = 0; i< arr.length ; i ++ ){
				System.out.println(arr[i]);
			}
		}System.out.println("-----배열1-----");
		{
			int [] arr = {10,20,30,40,50};
			arr = new int [] {100,200,300};
			for(int i = 0; i < arr.length ; i ++ )
				System.out.println(arr[i]);
		}System.out.println("-----배열2-----");
		{
			// 1~10번 까지의 학생의 점수를 키보드로 입력하고, 
			// 점수의 평균, 총합을 구하는 계산식, 총합 을 출력하라. 
			int total = 0;
			Scanner scan = new Scanner(System.in);
			int score[] = new int [10];
			for(int i=0; i<score.length; i++){
				System.out.printf("%2d번의 점수 : ",i+1);
				score[i]=scan.nextInt();
				total += score[i];
			}
			System.out.print("평균 : " + ((float)total/score.length) );
			System.out.print("총합 : ");
			for(int i = 0 ; i < score.length - 1 ; i++ ){
				System.out.print(score[i] + "+");
			}
			System.out.print(score[score.length - 1]);
			System.out.print("="+total);			
		}	System.out.println("-----문제1-----");	
		{
			int [] lottoNo = new int [6];
			int curCnt = 0;
			for (int i = 0; i < lottoNo.length ; i++){		// 모든 빈칸에 대해
				int num;
				while(true){
					num = (int)(Math.random()*45)+1;		// 숫자를 뽑는다.
					int index;
					for( index = 0; index < curCnt; index++ )	// 중복이 있는지 확인한다.
						if( lottoNo[index] == num )		break;	
					if(index != curCnt)	continue;					// 중복이 있으면 처음부터
					else{													// 중복이 없으면 집어 넣고 끝 
						lottoNo[curCnt++] = num  ;
						break;
					}
				}											// 반복
			}
			for(int i : lottoNo)System.out.print(i + "\t\t");
			System.out.println();
		}System.out.println("-----로또 뽑기-----");
		{
			int [] lottoBall = new int [45];
			for(int i = 0 ; i < lottoBall.length ; i ++ )
				lottoBall [ i ] = i + 1 ;
			for (int i = 0 ; i < 10000 ; i++ ) {
				int index = (int) (Math.random()*45);
				int temp = lottoBall [ index ] ;
				lottoBall [ index ] = lottoBall [ 0 ];
				lottoBall [ 0 ] = temp;					
			}
			System.out.print( "로또값 : " );
			for(int i =0 ; i < 6 ; i++ )
				System.out.print( lottoBall[i] + "\t\t");
			System.out.println();
			for(int lv = 6 - 1 ; lv > 0 ; lv -- ){
				for(int index = 0 ; index < lv ; index ++ ){
					if( lottoBall [ index ] > lottoBall [ index + 1 ] ) {
						int temp = lottoBall [ index ] ;
						lottoBall [ index ] = lottoBall [ index + 1 ];
						lottoBall [ index + 1 ] = temp;
					}
				}
			}
			System.out.print( "정렬값 : " );
			for(int i =0 ; i < 6 ; i++ )
				System.out.print( lottoBall[i] + "\t\t");
			System.out.println();
		}System.out.println("-----다른 로또 뽑기 및 정렬-----");
	}	
}
//10
//20
//30
//40
//50
//-----배열1-----
//100
//200
//300
//-----배열2-----
// 1번의 점수 : 11
// 2번의 점수 : 22
// 3번의 점수 : 33
// 4번의 점수 : 44
// 5번의 점수 : 55
// 6번의 점수 : 66
// 7번의 점수 : 77
// 8번의 점수 : 88
// 9번의 점수 : 99
//10번의 점수 : 12
//평균 : 50.7총합 : 11+22+33+44+55+66+77+88+99+12=507-----문제1-----
//43		4		41		12		6		27		
//-----로또 뽑기-----
//로또값 : 41		38		31		13		40		24		
//정렬값 : 13		24		31		38		40		41		
//-----다른 로또 뽑기 및 정렬-----

