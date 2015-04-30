package p150327_Chapter05;
// 2차원 배열 예제 : 초기화
// 문제 : 행과 열의 합계를 구하기
public class Ex05_04_ArrayEx4 {
	public static void main(String[] args) {
		int [] [] arr = { { 10, 20 } ,{ 30, 40,50 } , { 50, 60 } };
		int [] totalRow  = new int [arr.length];
		int [] totalCol ;
		{
			int max= 0;
			for(int i=0; i <arr.length; i++) if ( max < arr[i].length ) max = arr[i].length;
			if (max<= 0) return;			
			totalCol = new int [max];
		}
		
		for (int i = 0; i < arr.length ; i++ ){
			for (int j = 0 ; j < arr[ i ].length ; j++)
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+"\t\t");
			System.out.println();
		}
		
		for(int i=0; i < arr.length ; i++){
			for(int j = 0 ; j<arr[i].length ; j++ ) totalRow[i] += arr[i][j];
			System.out.print(totalRow[i]+"\t\t");			
		}
		System.out.println();
		
		for(int i=0; i < arr.length ; i++){
			for(int j = 0 ; j<arr[i].length ; j++ ) totalCol[j] += arr[i][j];						
		}
		for(int i=0;i<totalCol.length; i++)
			System.out.print(totalCol[i]+"\t\t");
		System.out.println();		
	}
}
//arr[0][0]=10		arr[0][1]=20		
//arr[1][0]=30		arr[1][1]=40		arr[1][2]=50		
//arr[2][0]=50		arr[2][1]=60		
//30		120		110		
//90		120		50		
