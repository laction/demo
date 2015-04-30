package p150402_Chapter07;
/* 다형성을 이용해, 각 Computer,Tv 등의 물품이 아닌, Product 형으로 함수를 처리한다.
 * Object.toString() 으로 오버라이드 된 Computer.toString()을 사용할 수 있다.
 * */
public class Ex07_09_ProductEx {
	
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		b.buy(tv);
		b.buy(com);
		System.out.println("현재 잔액 : " + b.money);
		System.out.println("현재 포인트 : " + b.bonusPoint);
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
				System.out.println("잔액부족");
				return;
			}
			money -= p.price;
			bonusPoint += p.bonusPoint;
			items[index++] = p;
			System.out.println(p+" 구입");
		}
		public void summary(){
			int sum = 0;
			String itemList = "";
			for(Product p : items){
				if(p==null) break;
				sum += p.price;
				itemList += p.toString() + ",";
			}
			System.out.println("구입 총액 : " + sum);
			System.out.println("구입 제품 목록 : " + itemList);
		}		
	}		
}
//Tv 구입
//Computer 구입
//현재 잔액 : 700
//현재 포인트 : 30
//구입 총액 : 300
//구입 제품 목록 : Tv,Computer,

