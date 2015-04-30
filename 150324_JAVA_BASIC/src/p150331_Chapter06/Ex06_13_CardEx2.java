package p150331_Chapter06;
// �����ڴ� �ν��Ͻ� ����̴�. Ŭ�������(static)�� ���ϼ� ����.
/* this ������ : ������ Ŭ������ �ٸ� ������ ȣ��� ���. 
 * this �������� : ������ ��ü �ν��Ͻ� ����� ������ ���.
 * 						�ν��Ͻ� �޼��忡 ���������� �ڵ� �����.
 * */
class Card2{
	String kind;
	int number;
	static int width = 100;
	static int height = 250 ;
	Card2(){		
		this("Clover",2);	
	}
	Card2(String kind){
		//		System.out.println();		// �ּ��� Ǯ�� ����. �޼ҵ忡�� �����ڴ� ���� ���� ȣ�� �Ǿ�� �Ѵ�.
		this(kind,5);
	}
	Card2(String kind , int num){
		this.kind = kind ;		// this ���������� ����, Ŭ������ �ν��Ͻ� ������ �Ķ������ ���������� ����.
		number = num;
	}
	Card2(Card2 c){
		this(c.kind,c.number);
	}
	public void view(){
		System.out.println(kind+","+number);
	}
	@Override
	public String toString() {
		return kind+","+number;
	}	
}
public class Ex06_13_CardEx2 {
	public static void main(String[] args) {
		Card2 card = new Card2("Heart", 7);
		card.view();
		
		Card2 card2 = new Card2();
		card2.view();
		
		Card2 card3 = new Card2();		card3.kind = "Spade";		card3.number = 1;
		card3.view();
		
		Card2 card4 = new Card2("Diamond");
		System.out.println(card4); 	//	toString�Լ��� ����� ���. ��� ��ü�� toString�Լ��� �������̵� �� �� �ִ�.
		
		Card2 card5 = new Card2(card4);
		card5.view();		
	}
}
//Heart,7
//Clover,2
//Spade,1
//Diamond,5
//Diamond,5

