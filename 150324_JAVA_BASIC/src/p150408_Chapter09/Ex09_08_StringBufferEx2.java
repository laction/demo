package p150408_Chapter09;
// StringBuffer 예제
//JDK 5.0 이후에 StringBuilder 클래스를 새로 만듬
//StringBuffer와  StringBuilder는 메서드가 같다. 
//StringBuffer  	: 모든 메서드가 쓰레드에 동기화 되어있다.
//StringBuilder  	: 모든 메서드가 스레드에 동기화 되어있지 않다.
public class Ex09_08_StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		sb.append("abc").append(123).append(true);
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.insert(5,"@@");
		System.out.println(sb);
		sb.insert(6,7.89);
		System.out.println(sb);
		
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abc");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}	
}
//abc123true
//a123true
//a123rue
//a123r@@ue
//a123r@7.89@ue
//abcDEFG
//GFEDcba
