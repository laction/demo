package p150325_Chapter04;
/*  	for( �ʱ�� ; ���ǽ� ; ������ ) ����
 * 		�ʱ���� �ѹ� �����ϰ�,
 * 		���ǽ��� ������ ���,	������ �������� �ʰ� ����.
 * 		���ǽ��� ���� ���, ���ǽ��� ������ �� ���� ������ �����ϰ� �������� ������ �ݺ�
 * 		
 *		for( �񱳺��� : �迭 ) ����
 *			�迭�� ���� ���� ���, ������ �������� �ʰ� ����.
 *			�迭�� ���� ���� ���,	�迭�� ���� ���� ������ �񱳺����� ���� �ְ� ������ ������ �ݺ�.
 *			�迭�� ���� �迭�� �� ���� ���, ������ �����ϰ� ����.
 *
 *		while( ���ǽ� )	����
 *			���ǽ��� ������ ���, ������ �������� �ʰ� ����
 *			���ǽ��� ���� ���, ���ǽ��� ������ �� ���� ������ ����
 *						
 *		do ���� while (���ǽ�) ����
 *			ó���� ������ �����ϰ�,
 *			���ǽ��� ������ ���, ������ �������� �ʰ� ����
 *			���ǽ��� ���� ���, ���ǽ��� ������ �� ���� ������ ����
 * */
public class Ex04_04_LoopEx1 {
	public static void main(String[] args) {
		System.out.print(1+"  ");
		System.out.print(2+"  ");
		System.out.print(3+"  ");
		System.out.print(4+"  ");
		System.out.print(5+"  ");
		System.out.print(6+"  ");
		System.out.print(7+"  ");
		System.out.print(8+"  ");
		System.out.print(9+"  ");
		System.out.print(10+"  ");
		
		System.out.println("----�ܼ��ݺ�-----");
		
		for(int i=1; i<= 10; i++)
			System.out.print(i+"  ");
		
		System.out.println("-----for-----");
		
		int i = 1;
		while(i <=10){
			System.out.print(i+"  ");
			i++;
		}
		System.out.println("-----while-----");
		
		i=1;
		do{
			System.out.print(i+"  ");
			i++;
		}while(i<=10);	
		System.out.println("-----do~while-----");
	
		// ����. 1���� 100������ ���� ������ �ݺ������� �����ϱ� 
		int sum;
		i=1; sum= 0;
		for(i=1; i<=100; i++) sum+=i;
		System.out.println(sum);
		
		i=1; sum=0;
		while(i<=100)	sum+=i++;
		System.out.println(sum);
		
		i=1; sum=0;
		do sum+=i++;
		while(i<=100);
		System.out.println(sum);
		
		System.out.println("-----����1-----");
		
		// ����. for���� �̿��ؼ� 1~ 100 ������ ¦���� �� ���ϱ�
		sum = 0;
		for( i = 2 ; i<=100 ;  i += 2 ) sum+=i;
		System.out.println(sum);
		System.out.println("-----����2-----");
		// ����. 1~100������ ���� 2�� 3�� ����� �ƴ� ���� �� ���ϱ�
		i=1; sum=0;
		for(i=1; i<=100; i++)
			if( i%2!=0 && i%3 != 0 ) sum+=i;
		System.out.println(sum);
		System.out.println("-----����3-----");
	}	
}
//1  2  3  4  5  6  7  8  9  10  ----�ܼ��ݺ�-----
//1  2  3  4  5  6  7  8  9  10  -----for-----
//1  2  3  4  5  6  7  8  9  10  -----while-----
//1  2  3  4  5  6  7  8  9  10  -----do~while-----
//5050
//5050
//5050
//-----����1-----
//2550
//-----����2-----
//1633
//-----����3-----
