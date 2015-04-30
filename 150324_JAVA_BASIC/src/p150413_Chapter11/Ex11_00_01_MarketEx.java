package p150413_Chapter11;

import java.util.ArrayList;
import java.util.List;

/* 클래스 Product
 * 	멤버변수 : String name - 가전제품명
 * 						int price : 가격
 * 						int point : 포인트
 * 	생성자 : (name, price) 두배의 변수를 초기화 필요
 * 				point는 가격의 5%로 한다.
 * 				단 소숫점이하 버림
 * 클래스 Mart
 * 	멤버변수 : List items - 판매대에 있는 가전제품목록
 * 	Mart 생성시 세개의 제품을 초기 목록으로 가지고 있음
 * 	멤버메서드 : 
 * 		sell(Product) : 물건이 판매
 * 			기능 : 가전제품 목록에서 해당 물품이 제거됨
 * 			매개변수 : Product
 * 			리턴타입 : void
 * 		refund (Product) : 물건이 반품됨
 * 			기능 : 가전제품 목록에 해당 물품이 추가됨
 * 			매개변수 : Product
 * 			리턴타입 : void
 * 		list() : 현재 보유중인 목록을 출력
 * */

public class Ex11_00_01_MarketEx {
	
	public static void main(String[] args) {
		
		Product p[] = { new Product("사과",400),new Product("소주",1200),new Product("삽겹살",3200)};
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
				System.out.println(p + " : 판매 완료");
				items.remove(p);				
			} 
			else
				System.out.println(p+" : 판매물품이 아닙니다.");	
		}
		void refund(Product p){
			items.add(p);
			System.out.println(p + "가 반납되었습니다.");
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
//(TV,100) : 판매 완료
//(Computer,200) (Audio,50) 
//(Computer,200) : 판매 완료
//(Audio,50) 
//(Audio,50) : 판매 완료
//
//(TV,100)가 반납되었습니다.
//(Computer,200) : 판매물품이 아닙니다.
//(TV,100) 
