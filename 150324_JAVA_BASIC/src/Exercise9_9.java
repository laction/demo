
public class Exercise9_9 {
	/*
	 (1) delChar메서드를 작성하시오.
	*/
	static String delChar(String src, String delCh){
		StringBuffer sb = new StringBuffer(src);
		
		for(int i = 0;  i < delCh.length() ; i ++){
			int idx;
			while(  (idx = sb.toString().indexOf(delCh.charAt(i)))  >= 0 )
				sb.deleteCharAt(idx);
		}		
		return sb.toString();
	}
	public static void main(String[] args) {
	System.out.println("(1!2@3^4~5)"+" -> "
	 + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
	System.out.println("(1 2 3 4\t5)"+" -> "
	 + delChar("(1 2 3 4\t5)"," \t"));
	}

}
