package p150330_Chapter06;
class Class{				//	����								���� ��ġ		���						�޸� �Ҵ� ����			�޸� �Ҵ� ��ġ
	static int cv;			//	Ŭ��������					Ŭ��������		static int cv;		Ŭ�������� �ε��			Ŭ���� ����
	int iv;						//	�ν��Ͻ�����(��ü)	Ŭ��������		int iv;					��üȭ (�ν��Ͻ�ȭ)		�� ����
	void method(){
		int mv;				//	��������						�޼��峻��		int iv;					���� �����					���� ����
	}
}
class Card{
	String kind ; 
	int number;
	static int width = 100;
	static int height = 250;
	public String toString(){
		return kind + ":" + number + "(" + width + "," + height + ")";
	}	
}
public class Ex06_03_CardEx {
	public static void main(String[] args) {
		System.out.println("ī��ũ�� : "+ Card.width + "," + Card.height);
		
		Card.width = 150;		// �ν��Ͻ��� ������ ������ Ŭ���� ���� ������ �� �ִ� �����̴�.
		
		Card c1 = new Card();		
		
		c1.kind = "Heart";		// �ν��Ͻ� ������ ��ü�� ����(new ������� �޸��Ҵ�)�ؾ߸� ��� ����.
		c1.number = 7;
		System.out.println(c1.toString());
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 1;
		System.out.println(c2.toString());
		c1.width = 50 ;
		c1.height = 50 ;
		System.out.println(c1.toString());
		System.out.println(c2.toString());	
		
		int i;						// ���������� �Լ������� ����� �� �ִ�.
		if(3/2>0) i=1;
		else i = 0;		
		System.out.println(i);	
	}
}
//ī��ũ�� : 100,250
//Heart:7(150,250)
//Spade:1(150,250)
//Heart:7(50,50)
//Spade:1(50,50)
//1

