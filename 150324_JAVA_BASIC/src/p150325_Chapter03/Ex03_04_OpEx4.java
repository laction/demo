package p150325_Chapter03;
//shift 연산자 : <<(좌측이동), >>(우측이동부호유지), >>>(우측이동)
public class Ex03_04_OpEx4 {
	public static void main(String[] args) {
		
		System.out.println( Integer.toString( 0b1000	<<	2 , 2 ) ); // LSB에 0으로 채워짐
		System.out.println( Integer.toString( 0b1000	>>	2 , 2 ) );	// MSB에 0으로 채워짐
		System.out.println( Integer.toString( 0b1000	>>>	2 , 2 ) );	// MSB에 0으로 채워짐
		
		System.out.println("-----------------");
		
		System.out.println( Integer.toString( -0b1000	<<	2 , 2 ) ); // LSB에 1로 채워짐
		System.out.println( Integer.toString( -0b1000	>>	2 , 2 ) );	// MSB에 1로 채워짐
		System.out.println( Integer.toString( -0b1000	>>>	2 , 2 ) );	// MSB에 0으로 채워짐 -> 부호 연산자가 0으로 채워져버림.
		
	}
}

//100000
//10
//10
//-----------------
//-100000
//-10
//111111111111111111111111111110
