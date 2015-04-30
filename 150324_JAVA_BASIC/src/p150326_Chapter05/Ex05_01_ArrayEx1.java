package p150326_Chapter05;
import java.util.Scanner;
/* �迭
 *  C�� �迭�� �޸�, Java������ �迭�� ��ü�� �ν��Ѵ�. ��, Container Ŭ������ ��ӹ��� ��ü�̴�.
 *  Java������ �޸� �����Ҵ�Ǵ� ��� �޸𸮴� ������ �÷��ǿ��� �����Ǹ�, 
 *  		���������� �Ҵ���� �ʴ� ������ ������ �÷��ǿ� ���� �޸� ���� �ȴ�.   
 * */
public class Ex05_01_ArrayEx1 {	
	public static void main(String[] args) {		
		{
			int [] arr = new int [5];
			arr[0] = 10;			arr[1] = 20;			arr[2] = 30;			arr[3] = 40;			arr[4] = 50;
			for(int i = 0; i< arr.length ; i ++ ){
				System.out.println(arr[i]);
			}
		}System.out.println("-----�迭1-----");
		{
			int [] arr = {10,20,30,40,50};
			arr = new int [] {100,200,300};
			for(int i = 0; i < arr.length ; i ++ )
				System.out.println(arr[i]);
		}System.out.println("-----�迭2-----");
		{
			// 1~10�� ������ �л��� ������ Ű����� �Է��ϰ�, 
			// ������ ���, ������ ���ϴ� ����, ���� �� ����϶�. 
			int total = 0;
			Scanner scan = new Scanner(System.in);
			int score[] = new int [10];
			for(int i=0; i<score.length; i++){
				System.out.printf("%2d���� ���� : ",i+1);
				score[i]=scan.nextInt();
				total += score[i];
			}
			System.out.print("��� : " + ((float)total/score.length) );
			System.out.print("���� : ");
			for(int i = 0 ; i < score.length - 1 ; i++ ){
				System.out.print(score[i] + "+");
			}
			System.out.print(score[score.length - 1]);
			System.out.print("="+total);			
		}	System.out.println("-----����1-----");	
		{
			int [] lottoNo = new int [6];
			int curCnt = 0;
			for (int i = 0; i < lottoNo.length ; i++){		// ��� ��ĭ�� ����
				int num;
				while(true){
					num = (int)(Math.random()*45)+1;		// ���ڸ� �̴´�.
					int index;
					for( index = 0; index < curCnt; index++ )	// �ߺ��� �ִ��� Ȯ���Ѵ�.
						if( lottoNo[index] == num )		break;	
					if(index != curCnt)	continue;					// �ߺ��� ������ ó������
					else{													// �ߺ��� ������ ���� �ְ� �� 
						lottoNo[curCnt++] = num  ;
						break;
					}
				}											// �ݺ�
			}
			for(int i : lottoNo)System.out.print(i + "\t\t");
			System.out.println();
		}System.out.println("-----�ζ� �̱�-----");
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
			System.out.print( "�ζǰ� : " );
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
			System.out.print( "���İ� : " );
			for(int i =0 ; i < 6 ; i++ )
				System.out.print( lottoBall[i] + "\t\t");
			System.out.println();
		}System.out.println("-----�ٸ� �ζ� �̱� �� ����-----");
	}	
}
//10
//20
//30
//40
//50
//-----�迭1-----
//100
//200
//300
//-----�迭2-----
// 1���� ���� : 11
// 2���� ���� : 22
// 3���� ���� : 33
// 4���� ���� : 44
// 5���� ���� : 55
// 6���� ���� : 66
// 7���� ���� : 77
// 8���� ���� : 88
// 9���� ���� : 99
//10���� ���� : 12
//��� : 50.7���� : 11+22+33+44+55+66+77+88+99+12=507-----����1-----
//43		4		41		12		6		27		
//-----�ζ� �̱�-----
//�ζǰ� : 41		38		31		13		40		24		
//���İ� : 13		24		31		38		40		41		
//-----�ٸ� �ζ� �̱� �� ����-----

