package p150402_Chapter07;
/* �������� �̿���, �� Computer,Tv ���� ��ǰ�� �ƴ�, Product ������ �Լ��� ó���Ѵ�.
 * Object.toString() ���� �������̵� �� Computer.toString()�� ����� �� �ִ�.
 * */
public class Ex07_09_ProductEx {
	
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		b.buy(tv);
		b.buy(com);
		System.out.println("���� �ܾ� : " + b.money);
		System.out.println("���� ����Ʈ : " + b.bonusPoint);
		b.summary();		
	}	
	
	public static class Product{
		public int price;
		public int bonusPoint;
				
		public Product(int price){			
			this.price = price;
			this.bonusPoint = price/10;
		}
	} 	
	public static class Tv extends Product{
		public Tv(){			super(100);		}
		@Override		public String toString() {			return "Tv";		}
	}
	
	public static class Computer extends Product{
		public Computer(){			super(200);		}
		@Override		public String toString() {			return "Computer";		}
	}
	
	public static class Buyer {
		public int money = 1000;
		public int bonusPoint = 0;
		public Product[] items = new Product[5];
		public int index;
		
		public void buy(Product p){
			if(money < p.price) {
				System.out.println("�ܾ׺���");
				return;
			}
			money -= p.price;
			bonusPoint += p.bonusPoint;
			items[index++] = p;
			System.out.println(p+" ����");
		}
		public void summary(){
			int sum = 0;
			String itemList = "";
			for(Product p : items){
				if(p==null) break;
				sum += p.price;
				itemList += p.toString() + ",";
			}
			System.out.println("���� �Ѿ� : " + sum);
			System.out.println("���� ��ǰ ��� : " + itemList);
		}		
	}		
}
//Tv ����
//Computer ����
//���� �ܾ� : 700
//���� ����Ʈ : 30
//���� �Ѿ� : 300
//���� ��ǰ ��� : Tv,Computer,

