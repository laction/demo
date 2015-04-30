package p150330_Chapter06;
/* ����, ��ȭ��ȣ, �𵨸�, serial��ȣ�� ��������� ������ Ŭ����(Phone) ����
 * ��ȭ�� �ް�(receive), ������ (send) ����� ������ ��ȭ(Phone) ��ü�� ������
 * ����Ŭ�������� 
 * 	010-123-4567��ü : serialNo = 1
 * 	010-987-6543��ü : serialNo = 2
 * 	010-123-8796��ü : serialNo = 3
 * �� ������
 * �� ������ ��ü�� ���� �ٸ� serial ��ȣ�� ������
 * */
// Ŭ������ ������� �Ӽ� : ( ������� / ����޼��� ) / ������ / ����������
// �޼��� :  ����������   ����Ÿ��    �޼����̸�   ( �Ű����� ) { ���� (������) }
// 
class Phone{
	String color;
	String phoneNo;
	String modelNo;
	int no;
	static int serialNo;
	void send(){
		System.out.println("��ȭ�Ŵ� ��! ~~~~");
	
	}
	private void receive() {
		System.out.println("��ȭ�Ծ��! ring ring ~~");
	}	
	public void view(){
		System.out.println(phoneNo + ":" + color + " : " + modelNo + no);
	}
}
public class Ex06_04_PhoneEx {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.color = "black";
		p1.phoneNo = "010-123-4567";
		p1.modelNo = "������";
		p1.no = ++Phone.serialNo;
		Phone p2 = new Phone();
		p2.color = "���";
		p2.phoneNo = "010-987-6543";
		p2.modelNo = "������";
		p2.no = ++Phone.serialNo;
		Phone p3 = new Phone();
		p3.color = "ȸ��";
		p3.phoneNo = "010-123-8796";
		p3.modelNo = "��Ƽ�ӽ�";
		p3.no = ++Phone.serialNo;
		
		p1.view();	p2.view();	p3.view();
			
	}
}
//010-123-4567:black : ������1
//010-987-6543:��� : ������2
//010-123-8796:ȸ�� : ��Ƽ�ӽ�3

