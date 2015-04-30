package p150327_Chapter05;

/* 가변 배열 예제
 * 1. 다차원 배열에서만 가능, n-1차원은 결정
 * 2. 다차원 배열은 배열의 배열로 표현한다.
 * 		2차원배열은 1차원배열의 참조변수의 배열이다.
 * */
public class Ex05_07_ArrayEx7 {
	public static void main(String[] args) {
		
		{
			int[][] num = new int[3][];
			num[0] = new int[] { 10, 20, 30 };
			num[1] = new int[] { 40, 50 };
			num[2] = new int[] { 60, 70, 80, 90 };
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
					System.out.print("num[" + i + "][" + j + "]=" + num[i][j]
							+ "\t");
				}
				System.out.println();
			}
		}
		System.out.println("-----예제-----");
		{
			final int SQUARE = 10;

			int num[][] = new int[SQUARE][SQUARE];
			int cur = 1;

			for (int x = SQUARE-1; x >= 0; x--){
				num[x]=new int [x+1];
				for (int y = x; y <= SQUARE-1; y++) {
//					System.out.println(x+" "+y);
					num[y][x] = cur++; 
				}	
			}			
			for (int y = 0; y < num.length ; y++){				 
				for (int x = 0; x < num[y].length; x++) {
					System.out.printf("%2d\t",num[y][x]);
				}
				System.out.println();
			}			
		}
		System.out.println("-----문제-----");
	}
}
//num[0][0]=10	num[0][1]=20	num[0][2]=30	
//num[1][0]=40	num[1][1]=50	
//num[2][0]=60	num[2][1]=70	num[2][2]=80	num[2][3]=90	
//-----예제-----
//46	
//47	37	
//48	38	29	
//49	39	30	22	
//50	40	31	23	16	
//51	41	32	24	17	11	
//52	42	33	25	18	12	 7	
//53	43	34	26	19	13	 8	 4	
//54	44	35	27	20	14	 9	 5	 2	
//55	45	36	28	21	15	10	 6	 3	 1	
//-----문제-----
