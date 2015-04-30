package p150330_Chapter06;
 public class Ex06_06_IsNumberEx{
	/* �� ���� �Ÿ��� ����ϴ� getDistance()�� �ϼ��Ͻÿ�.
	 * [Hint] ������ ����� Math.sqrt(double a)�� ����ϸ� �ȴ�.
	 * */
	static double getDistance(int x1, int y1 , int x2, int y2){
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));		
	}
	/* ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
	 * �޼���� : isNumber
	 * 		��� : �־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ���Ѵ�.
	 * 					��� ���ڷθ� �̷���� ������ true�� ��ȯ�ϰ�, �׷��� ������ false�� ��ȯ.
	 * 		��ȯŸ�� : boolean
	 * 		�Ű����� : String str - �˻��� ���ڿ�
	 * String Ŭ������ charAt(int i ) �޼��带 ����ϸ� ���ڿ��� i��° ��ġ�� ���ڸ� ���� �� �ִ�.
	 * */
	static boolean isNumber(String str){
		// str.charAt(0) // ���ڿ��� ù��° ���� ����
		for(int i = 0 ; i < str.length() ; i++){
			char ch = str.charAt(i); 
			if( ( '0' <= ch && ch <= '9')  ) ;
				 else return false;			
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(getDistance(10,15,13,11));
		
		System.out.println(isNumber("123456"));
		System.out.println(isNumber("ABCDEF"));
		System.out.println(isNumber("12ABC6"));		
	}	
}
// 5.0
// true
// false
// false
