package p150327_Chapter05;

public class Ex05_03_ArrayEx3 {
	public static void main(String[] args) {
		// 1. 배열의 선언
		int []  arr [] ;
		// 2. 배열의 생성
		arr = new int [3] [2];
		// 3. 배열의 초기화
		arr [0] [0] = 10;	arr [0] [1] = 20;
		arr [1] [0] = 30;	arr [1] [1] = 40;
		arr [2] [0] = 50;	arr [2] [1] = 60;
		for(int i = 0 ; i< arr.length ; i ++ )
			for(int j = 0 ; j< arr[i].length ; j ++ )
			System.out.println(
					"arr["+i+"]["+j+"]=" + arr[i][j]
					);
		arr [1] = new int [] {100,200,300};
		for(int i = 0 ; i< arr.length ; i ++ )
			for(int j = 0 ; j< arr[i].length ; j ++ )
			System.out.println(
					"arr["+i+"]["+j+"]=" + arr[i][j]
					);		
	}
}
//arr[0][0]=10
//arr[0][1]=20
//arr[1][0]=30
//arr[1][1]=40
//arr[2][0]=50
//arr[2][1]=60
//arr[0][0]=10
//arr[0][1]=20
//arr[1][0]=100
//arr[1][1]=200
//arr[1][2]=300
//arr[2][0]=50
//arr[2][1]=60
