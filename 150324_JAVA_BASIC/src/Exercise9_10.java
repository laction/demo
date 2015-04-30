public class Exercise9_10 {
	/*
	 * (1) format�޼��带 �ۼ��Ͻÿ�. 1. length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ�Ѵ�. 2.
	 * 1�� ��찡 �ƴϸ�, lengthũ���� char�迭�� �����ϰ� �������� ä���. 3. ��������(alignment)�� ���� ����
	 * ���ڿ�(str)�� ������ ��ġ�� �����Ѵ�. (System.arraycopy()���) 4. 2���� ������ char�迭�� ���ڿ���
	 * ���� ��ȯ�Ѵ�.
	 */
	 static String format(String str, int length, int alignment){
		 
		 if(length <= str.length()) return str.substring(0,length);
		 
		 char ch [] = new char [length];
		 for(int i = 0 ; i < ch.length ; i++) ch[i] = ' ';
		 int destPos ;
		 switch(alignment){
		 default:
		 case 0 :
			 destPos = 0;
			 break;
		 case 1:
			 destPos = (length-str.length())/2;
			 break;
		 case 2:		
			 destPos=length-str.length();
			 break;
		 }		 
		 System.arraycopy(str.toCharArray(), 0, ch, destPos, str.length());		  
		 return new String(ch);
	 }
	public static void main(String[] args) {
		String str = "������";
		System.out.println(format(str, 7, 0)); // ���� ����
		System.out.println(format(str, 7, 1)); // ��� ����
		System.out.println(format(str, 7, 2)); // ������ ����
	}
}
