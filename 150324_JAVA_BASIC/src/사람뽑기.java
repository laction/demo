import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class 사람뽑기 {
	
	final static int 사람수 = 12;
	final static int 뽑기수 = 12;
	final static int 행_사람수 = 4;
	
	final static boolean 중복허용 = false;
	
	static ArrayList<String> 중복기록 = new ArrayList<String>();	
	
	public static void main(String[] args) throws Exception {				
		Map<String, String> 좌 = new HashMap<>();
		Map<String, String> 우 = new HashMap<>();
		
//		Properties Pr
		
		for(int j = 0 ; j < 1 ; j ++){
			for(int i =0 ; i < 뽑기수 ; i++){			
				if(중복기록.size() >= 사람수) 중복기록.clear();
				
				String 뽑은사람 = 사람뽑기();
				if(중복허용 || !!! 중복기록.contains(뽑은사람)){
					중복기록.add(뽑은사람);		
				}
				else { i--; continue;}
				System.out.print(중복기록.get(i)+"\t");	
				if(i == 뽑기수/2-1) System.out.println();
			}
			System.out.println();System.out.println();
		}
//		
//		File f = new File("사람.txt");
//		Scanner sc = new Scanner(f);
//		while(sc.hasNext())
//			System.out.println(sc.nextLine());
//		File f2 = new File("사람.txt");		
//		
//		f2.setWritable(true);	
//		f2.createNewFile();		
//		
//		 try {
//		      ////////////////////////////////////////////////////////////////
//		      BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
//		      String s = "출력 파일에 저장될 이런 저런 문자열입니다.";
//
//		      out.write(s); out.newLine();
//		      out.write(s); out.newLine();
//
//		      out.close();
//		      ////////////////////////////////////////////////////////////////
//		    } catch (IOException e) {
//		        System.err.println(e); // 에러가 있다면 메시지 출력
//		        System.exit(1);
//		    }
		
		
		
		
		// 파일읽기
//		File f = new File("사람.txt");
//		Scanner sc = new Scanner(f);
//		while(sc.hasNext())
//			System.out.println(sc.nextLine());
//		File f2 = new File("사람.txt");		
		// 분석
		// L1. 결과 출력
		// L2. 명령 대기
		// C3. 잘못된 입력 처리 - 에러메시지, L2
		// C4. 파일 초기화 - L2
		// C5. 선택 - 변수 동작
		// 종료
	}
	
	static class 사람{
		사람(){}
		사람(String codeStr){};
	}
	
	
	
	private static String 사람뽑기(){
		
		double t=0;
		try{	for(int j = 0 ; j < 사람수*사람수 ; j ++)		t+=Math.random();	}
		catch(Exception e){}
		
		int result = (int)(t*사람수*사람수)%사람수+1;			
		int 행 =  (result-1) / 행_사람수 + 1;
		int 열 = (result-1) % 행_사람수 + 1;		
		return result+"\t"+행+"행 "+열+"열";
	}
}
