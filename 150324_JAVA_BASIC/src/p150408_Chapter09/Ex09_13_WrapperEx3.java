package p150408_Chapter09;
/* switch 구문의 조건값으로 사용가능한 자료형
 *   byte		Byte
 *   short	Short
 *   int			Integer
 *   char		Character
 *   String		// JDK 7.0 이후
 * */
public class Ex09_13_WrapperEx3 {
	public static void main(String[] args) {
		String s = "1";
		switch(s){
			case "1" : System.out.println("성공"); break;
			default : System.out.println("실패");
		}
		Byte b = 1;
		switch(b){
			case 1 : System.out.println("성공"); break;
			default : System.out.println("실패");
		}		
	}
}
//성공
//성공
