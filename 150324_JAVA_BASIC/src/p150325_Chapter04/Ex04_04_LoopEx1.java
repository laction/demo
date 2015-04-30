package p150325_Chapter04;
/*  	for( 초기식 ; 조건식 ; 증감식 ) 문장
 * 		초기식을 한번 수행하고,
 * 		조건식이 거짓일 경우,	문장을 수행하지 않고 끝냄.
 * 		조건식이 참일 경우, 조건식이 거짓일 때 까지 문장을 수행하고 증감식을 수행을 반복
 * 		
 *		for( 비교변수 : 배열 ) 문장
 *			배열의 값이 없을 경우, 문장을 수행하지 않고 끝냄.
 *			배열의 값이 있을 경우,	배열의 끝을 만날 때까지 비교변수에 값을 넣고 문장을 수행을 반복.
 *			배열의 값이 배열의 끝 값일 경우, 문장을 수행하고 끝냄.
 *
 *		while( 조건식 )	문장
 *			조건식이 거짓일 경우, 문장을 수행하지 않고 끝냄
 *			조건식이 참일 경우, 조건식이 거짓일 때 까지 문장을 수행
 *						
 *		do 문장 while (조건식) 문장
 *			처음에 문장을 수행하고,
 *			조건식이 거짓일 경우, 문장을 수행하지 않고 끝냄
 *			조건식이 참일 경우, 조건식이 거짓일 때 까지 문장을 수행
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
		
		System.out.println("----단순반복-----");
		
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
	
		// 문제. 1부터 100까지의 합을 세가지 반복문으로 구현하기 
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
		
		System.out.println("-----문제1-----");
		
		// 문제. for문을 이용해서 1~ 100 까지의 짝수의 합 구하기
		sum = 0;
		for( i = 2 ; i<=100 ;  i += 2 ) sum+=i;
		System.out.println(sum);
		System.out.println("-----문제2-----");
		// 문제. 1~100까지의 수중 2와 3의 배수가 아닌 수의 합 구하기
		i=1; sum=0;
		for(i=1; i<=100; i++)
			if( i%2!=0 && i%3 != 0 ) sum+=i;
		System.out.println(sum);
		System.out.println("-----문제3-----");
	}	
}
//1  2  3  4  5  6  7  8  9  10  ----단순반복-----
//1  2  3  4  5  6  7  8  9  10  -----for-----
//1  2  3  4  5  6  7  8  9  10  -----while-----
//1  2  3  4  5  6  7  8  9  10  -----do~while-----
//5050
//5050
//5050
//-----문제1-----
//2550
//-----문제2-----
//1633
//-----문제3-----
