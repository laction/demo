package p150325_Chapter04;
// ���ǹ� if ����
// if(���ǽ�) { ���� } else { ���� }
// ���ǽ��� ����� ���ΰ�츸 ������ ����.
public class Ex04_01_IfEx1 {
	public static void main(String[] args) {
		int score = 65;
		if ( score >= 60 ) { 
			System.out.println("�հ��� �����մϴ�.");
		}else { // �׷��� ������
			System.out.println("���հ� ! ������ȸ��...");
		}
		System.out.println( (score>=0)?"���":"����" );
		if(score >= 0)	System.out.println("���");
		else						System.out.println("����");
		
					if(score >= 90){	System.out.println("A����");
		}else 	if(score >= 80){	System.out.println("B����");
		}else 	if(score >= 70){	System.out.println("C����");
		}else 	if(score >= 60){	System.out.println("D����");
		}else {									System.out.println("F����");		}
					
		System.out.println("----------1---------");
		
		// ���ڰ� �빮�ڸ� �빮�����, �ҹ��ڸ� �ҹ��ڷ� ����ϱ�.
		// ���ڸ� ���ڷ� ���. �׿� ���ڴ� �Ϲݹ��ڷ� ����ϱ�.					
		char ���� = 'C';										System.out.println(����);		
				
				if( 'a' <= ���� && ���� <='z')		System.out.println("�ҹ���");
		else if( 'A' <= ���� && ���� <='Z') 	System.out.println("�빮��");
		else if( '0' <= ���� && ���� <='9') 	System.out.println("����");
		else															System.out.println("�Ϲݹ���");		
	}
}
//�հ��� �����մϴ�.
//���
//���
//D����
//----------1---------
//C
//�빮��
