package p150330_Chapter06;

public class Ex06_07_ShuffleEx {
	// 여기에 shuffle 메서드 구현하기
	public static int [] shuffle(int [] arrays){
		int [] arr = arrays.clone();
		for (int i = 0 ; i < 10000 ; i++){
			int index = (int)( Math.random() * arrays.length );
			int temp = arr[index];
			arr[index] = arr[0];
			arr[0] = temp;			
		}
		return arr;	//	!!
	}
	public static void main(String[] args) {
		int [] orig = {1,2,3,4,5,6,7,8,9};
		for( int i : orig )		// JDK 5.0 이후 버젼. 개선된 for문
			System.out.print( i + "\t" );
		System.out.println();
		int [] result = shuffle(orig);
		for( int i : result )
			System.out.print( i + "\t" );
		System.out.println();
		for( int i : orig )
			System.out.print( i + "\t" );
	}
}
//1	2	3	4	5	6	7	8	9	
//4	6	7	9	1	5	2	8	3	
//1	2	3	4	5	6	7	8	9	