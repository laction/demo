package p150408_Chapter09;
/* switch ������ ���ǰ����� ��밡���� �ڷ���
 *   byte		Byte
 *   short	Short
 *   int			Integer
 *   char		Character
 *   String		// JDK 7.0 ����
 * */
public class Ex09_13_WrapperEx3 {
	public static void main(String[] args) {
		String s = "1";
		switch(s){
			case "1" : System.out.println("����"); break;
			default : System.out.println("����");
		}
		Byte b = 1;
		switch(b){
			case 1 : System.out.println("����"); break;
			default : System.out.println("����");
		}		
	}
}
//����
//����
