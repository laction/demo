package p150325_Chapter04;
import java.util.Scanner;
// �ý��۰� ���������� �����ϱ�
public class Ex04_03_SwitchEx2 {
	final static int ���� = 0;
	final static int ���� = 1;
	final static int �� = 2;
	public static void main(String[] args) {
		int jbb;
		/*Math.random() : 0.0���� 0,999999... ���� �߻� �Լ�
		 * 0.0	<= 		Math.random() * 3		<= 2.999999....
		 * 0		<= (int)(Math.random() * 3)	<= 2
		 * */
		jbb = (int)(Math.random() * 3);
		Scanner scan = new Scanner(System.in);
		System.out.println("����(0),����(1),��(2)�� �Է��ϼ���");
		int myjbb = scan.nextInt();
		/* jbb myjbb ���� ��� : ��� ���
		 * jbb(0) myjbb(1) : �̰���ϴ�
		 * jbb(0) myjbb(2) : �����ϴ� */
		
		System.out.println("��ǻ�� (" + strJbb(jbb) +") vs (" + strJbb(myjbb) + ") ��");
		
		if(jbb==myjbb) System.out.println("���");
		else if((jbb-myjbb+3)%3==1) System.out.println("��");
		else System.out.println("�̱�");
		
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
			{
				System.out.print("��ǻ�� (" + strJbb(i) +") vs (" + strJbb(j) + ") �� : ");
				if(i==j) System.out.println("���");
				else if((i-j+3)%3==1) System.out.println("��");
				else System.out.println("�̱�");				
			}		
		System.out.println(-2%3 +"  "+ 1%3);
		System.out.println("% ������  ��ȣ�� �״�� ���󰡴� ������ ��");		
	}
	public static String strJbb(int jbb){
		switch (jbb){
		case 0: return "����";
		case 1: return "����";
		case 2: return "��";
		}
		return null;
	}	
}
//����(0),����(1),��(2)�� �Է��ϼ���
//1
//��ǻ�� (��) vs (����) ��
//��
//��ǻ�� (����) vs (����) �� : ���
//��ǻ�� (����) vs (����) �� : �̱�
//��ǻ�� (����) vs (��) �� : ��
//��ǻ�� (����) vs (����) �� : ��
//��ǻ�� (����) vs (����) �� : ���
//��ǻ�� (����) vs (��) �� : �̱�
//��ǻ�� (��) vs (����) �� : �̱�
//��ǻ�� (��) vs (����) �� : ��
//��ǻ�� (��) vs (��) �� : ���
//-2  1
//% ������  ��ȣ�� �״�� ���󰡴� ������ ��
