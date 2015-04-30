package p150413_Chapter11;

import java.util.ArrayList;
import java.util.List;

/* Ŭ���� Product
 * 	������� : String name - ������ǰ��
 * 						int price : ����
 * 						int point : ����Ʈ
 * 	������ : (name, price) �ι��� ������ �ʱ�ȭ �ʿ�
 * 				point�� ������ 5%�� �Ѵ�.
 * 				�� �Ҽ������� ����
 * Ŭ���� Mart
 * 	������� : List items - �ǸŴ뿡 �ִ� ������ǰ���
 * 	Mart ������ ������ ��ǰ�� �ʱ� ������� ������ ����
 * 	����޼��� : 
 * 		sell(Product) : ������ �Ǹ�
 * 			��� : ������ǰ ��Ͽ��� �ش� ��ǰ�� ���ŵ�
 * 			�Ű����� : Product
 * 			����Ÿ�� : void
 * 		refund (Product) : ������ ��ǰ��
 * 			��� : ������ǰ ��Ͽ� �ش� ��ǰ�� �߰���
 * 			�Ű����� : Product
 * 			����Ÿ�� : void
 * 		list() : ���� �������� ����� ���
 * */

public class Ex11_00_01_MarketEx {
	
	public static void main(String[] args) {
		
		Product p[] = { new Product("���",400),new Product("����",1200),new Product("����",3200)};
		Mart m = new Mart();
		
		m.list();
		m.sell(m.items.get(0));
		m.list();
		m.sell(new Product("Computer",200));
		m.list();
		m.sell(m.items.get(0));
		m.list();
		m.refund(new Product("TV",100));
		m.sell(new Product("Computer",200));
		m.list();
	}
	
	static class Mart{
		private List<Product> items = new ArrayList<Product>();
	
		Mart(Product [] pList){
			for(Product p : pList) items.add(p);
		}
		Mart(){
			items.add(new Product("TV",100));
			items.add(new Product("Computer",200));
			items.add(new Product("Audio",50));
		}
		void sell(Product p){	
			if(items.contains(p)){
				System.out.println(p + " : �Ǹ� �Ϸ�");
				items.remove(p);				
			} 
			else
				System.out.println(p+" : �ǸŹ�ǰ�� �ƴմϴ�.");	
		}
		void refund(Product p){
			items.add(p);
			System.out.println(p + "�� �ݳ��Ǿ����ϴ�.");
		}
		void list(){	
			for(Product p : items)	System.out.print(p+" ");
			System.out.println();
		}
	}	
	static class Product {
		String name ;
		int price;
		int point;
		Product(String name,int price){			this.name = name;	this.price = price;	this.point = (int)(price*0.05);		}
		@Override
		public String toString() {		return "("+name+","+price+")";		}
		@Override
		public boolean equals(Object obj) {
			Product p  = (Product)obj;
			return this.name == p.name && this.price == p.price ;
		}
		@Override
		public int hashCode() {
			return name.hashCode() + price;
		}
	}
}
//(TV,100) (Computer,200) (Audio,50) 
//(TV,100) : �Ǹ� �Ϸ�
//(Computer,200) (Audio,50) 
//(Computer,200) : �Ǹ� �Ϸ�
//(Audio,50) 
//(Audio,50) : �Ǹ� �Ϸ�
//
//(TV,100)�� �ݳ��Ǿ����ϴ�.
//(Computer,200) : �ǸŹ�ǰ�� �ƴմϴ�.
//(TV,100) 
