public class Exercise9_11{
	public static void main(String[] args) {
		
		int begin = 0;
		int end = 0;
					
		if(args.length !=2){
			System.out.println("두개만 필요해요");
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}		
		try{
			begin = Integer.parseInt(args[0]);
			end=Integer.parseInt(args[1]);
		}catch(Exception e){
			System.out.println("숫자를 입력하세요");
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
		}
		
		if( args.length != 2
				||	!!! ( 2 <= begin && begin <= 9 )
				||  !!! ( 2 <= end && end <= 9 )){				
				System.out.println("2~9 사이의 숫자를 입력하세요");
				System.out.println("USAGE : GugudanTest 3 5");
				System.exit(0);
		}	
		
		for(int i = begin ; i <= end; i++){
			for(int j = 1 ; j <= 9; j++)
				System.out.println(i+"*"+j+"="+(i*j));
			System.out.println();
		}		
	}
}
