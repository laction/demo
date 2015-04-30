package p150330_Chapter06;

/* ������ ���� ��������� ���� Student Ŭ������ �����Ͻÿ�
 * Ÿ��     ������     ����
 * String name      �л��̸�
 * int       ban          ��
 * int       no            ��ȣ
 * int       kor           ��������
 * int       eng          ��������
 * int       math       ��������
 * 
 * 1. �޼��� �� : getTotal
 * 	��� : ����(kor) ,  ����(eng), ����(math)�� ������ ��� ���ؼ� ��ȯ�Ѵ�.
 * 	��ȯŸ�� : int
 * 	�Ű����� : ����
 * 2. �޼���� : getAverage
 * 	��� : ����(�������� + �������� + ��������)�� ������� ���� ����� ���Ѵ�. 
 * 		�Ҽ� ��°�ڸ����� �ݿø��� ��
 * 	��ȯŸ�� : int
 * 	�Ű����� : ����
 * */

class Student {
	String name;
	int ban;	int no;
	int kor;	int eng;	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;		this.ban = ban;		this.no = no;
		this.kor = kor;				this.eng = eng;		this.math = math;
	}
	int getTotal() {		return kor + eng + math;	}
	float getAverage() {		return Math.round(((double) getTotal() / 3.0) * 100) / 100.0f;	}
	void view(){
		System.out.println(ban+"�� "+no+"�� "+name);
		System.out.println("���� : " + getTotal());
		System.out.println("��� : " + getAverage());
	}
}
public class Ex06_09_StudentsEx {
	public static void main(String[] args) {
		Student st = new Student("Lee H. J.", 4, 1, 40, 50, 59);
		st.view();
	}
}
//4�� 1�� Lee H. J.
//���� : 149
//��� : 49.67

