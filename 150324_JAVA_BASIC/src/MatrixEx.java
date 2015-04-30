import java.util.Vector;

public class MatrixEx {
	public static void main(String[] args) throws Exception {
		
		{
			int data[][] = { 		
				{0,7,1},
				{8,5,2},
				{4,2,3},
				{2,6,4},
				{3,1,5}
				};	
			MatrixCode mc = new MatrixCode(10,10,data.length,data );
			mc.viewCode();	
			System.out.println();
			mc.viewDecode();			
		}		
		System.out.println("-----------Example : Decode--------------");
		{
			int deData[][] = {
					{0,0,0,9},
					{0,1,0,0},
					{0,0,0,0},
					{0,0,7,0},
					{0,0,0,0},
					{3,0,0,0},
					{0,0,0,0}		
			};
			MatrixCode mc2 = new MatrixCode(deData);
			mc2.viewDecode();
			System.out.println();
			mc2.viewCode();
		}
		System.out.println("-----------Example : Encode--------------");		
		
		Vector<Integer> v = new Vector<Integer>();
		Integer i = new Integer(10);
		v.add(10);
		v.addElement(20);
		System.out.println(v.indexOf(10));
		System.out.println(v.indexOf(20));
	}	
	public static class MatrixCode{
		final static int ROW = 0;
		final static int COL = 1;
		final static int VAL = 2;
		private int row,col,cnt;
		private int data [][] ;
		public MatrixCode(int row,int col, int cnt,int [][] data) throws RuntimeException{
			this.row = row; this.col = col; this.cnt = cnt;
			
			this.data = new int [data.length][];
			for(int i = 0 ; i <data.length; i ++){
				if(data[i].length != 3) 
					throw new RuntimeException("열의 크기는 무조건 3이여야 한다.");									
				else{
					this.data[i] = new int [data[i].length];
					for(int j =0 ; j < data[i].length ; j++){
						this.data[i][j] = data[i][j];
					}					
				}
			}			
		}
		public MatrixCode(int [][] decodeData) throws RuntimeException{
			int lenChk = decodeData[0].length;
			int idx;
			for( idx = 1 ; idx < decodeData.length ; idx ++ )
				if(decodeData[idx].length != lenChk)	throw new RuntimeException("행열은 직사각형이여야 한다.");
						
			if(idx == decodeData.length){
				row = decodeData.length;
				col = decodeData[0].length;
				
				data = new int [row*col][3];
				
				int __TotalCnt = 0;
				for(int i = 0 ; i < decodeData.length; i++)
					for(int j = 0 ; j < decodeData[i].length ; j++)
						if(decodeData[i][j] != 0){ 
							this.data[__TotalCnt][ROW] = i;
							this.data[__TotalCnt][COL] = j;
							this.data[__TotalCnt][VAL] = decodeData[i][j];
							__TotalCnt++;
						}
				cnt = __TotalCnt;
				
				/// 필요없는 row 버리기.
				int [][] res = new int [cnt][3];
				for(int i =0; i < cnt ; i++)
					res[i] = data[i];				
				data = res;
			}
			else ;		
		}
		public void viewCode(){
			System.out.printf("%2.0f \t %2.0f \t %2.0f\n",(double)row,(double)col,(double)cnt);
			for(int i = 0; i < cnt ; i++){
				System.out.printf("%2.0f \t %2.0f \t %2.0f\n",(double)data[i][0],(double)data[i][1],(double)data[i][2]);
				;
			}
		}
		public void viewDecode(){
			int res [][] = new int [row][col];
			for(int i = 0; i < res.length ; i ++)
				for(int j = 0 ; j < res[i].length ; j++)
					res[i][j] = 0;
			
			for(int i = 0 ; i < cnt ; i ++ )
				res[ data[i][ROW]  ][ data[i][COL]  ] = data[i][VAL];
			
			for(int i = 0 ; i < res.length ; i ++){
				for ( int j = 0 ; j < res[i].length ; j ++){
					System.out.printf("%2.0f \t",(double)res[i][j]);
				}
				System.out.println();
			}
		}
	}	
}