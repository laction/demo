package p150325_Chapter04;
/* switch ���� ����
 *  switch ( ���ǰ� ) { case �� 1 : ����1  case ��2 : ����2 .... default : ���� n }
 *  break : �ش� switch ������ ������.
 *  ���ǰ����� ����� ������ �ڷ�����   byte, short, int, char, String(jdk 7.0 ����)
 *	 ��� switch���� if else������ ���� ����. ��� if���� switch �������δ� ������ �� ����.  
 * */
public class Ex04_02_SwitchEx1 {
	public static void main(String[] args) {
		int score = 100;		
		switch( score / 10 ){
			case 10:
			case 9 :		System.out.println("A����");	break;
			case 8 :		System.out.println("B����");	break;
			case 7 :		System.out.println("C����");	break;
			case 6 :		System.out.println("D����");	break;
			default :		System.out.println("F����");	break;
		}		
	}
}
//A����
