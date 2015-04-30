
public class Unicode {
	public static void main(String[] args) {
		int cntEndLine = 80;
		for(int c =1;c<Math.pow(2, 16)-1;c++){
			if(c!='?'){
			System.out.print(String.format("U+%04X" ));
			if(c%cntEndLine==cntEndLine-1)System.out.println();
			}
		}
	}
}
