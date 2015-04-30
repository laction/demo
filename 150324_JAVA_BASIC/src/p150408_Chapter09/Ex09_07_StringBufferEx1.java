package p150408_Chapter09;
/* StringBuffer 클래스 예제
 * 가변적인 문자열 객체임
 * 기본적으로 16개의 버퍼를 내부에 가지고 있다.
 * new StringBuffer(100) => 116개의 버퍼를 가진다.
 * 대체로 8K 정도의 버퍼용량이 적당하다고 봄.
 * 
 * equals 메서드가 오버라이딩 되지 않았다.
 * 	=> 내용비교는 toString 메서드로 String 객체로 변경 후 equals 메서드를 사용해야 함.
 * */
public class Ex09_07_StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		if(sb == sb2)	System.out.println("sb == sb2");
					else		System.out.println("sb != sb2");
		
		System.out.println("sb.equals(sb2) : " + sb.equals(sb2));
		System.out.println(	"sb.toString().equals(sb2.toString()) : "
										+		  sb.toString().equals(sb2.toString()));		
	}
}
//sb != sb2
//sb.equals(sb2) : false
//sb.toString().equals(sb2.toString()) : true

