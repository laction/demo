package p150402_Chapter07;

/* 1. 식료품을 사러 시장에 갑니다
 * 고객은 돈과 장바구니를 가지고 갑니다.
 * 고객 클래스 Buyer
			public int money;		//	돈
			public int point;			//	포인트
			public Food[] cart;	//	장바구니
			public int fruitCnt;		//	과일개수
			public int drinkCnt;	//	음료개수
			public int snackCnt;	//	과자개수
			public int cnt;				//	총개수
			public void buy(Food f){		//	구매				
 * 물건을 살때마다 가격만큼 보유금액에서 차감되고
 * 식료품의 포인트만큼 포인트가 증가된다
 * 어떤 물건을 샀는지 물품명과 가격을 화면에 출력하고, 객체의 구매갯수가 증가됩니다.
 * 장바구니 해당 물건을 넣는다.
 * 
 * 2. 모든 식료품(Food)은 가격과 판매갯수, 보너스포인트를 가지고 있습니다.
 * 식료품 객체를 생성하기 위해서는 가격을 입력받아야 합니다.
 * 식료품의 종류로는 과일(Fruit), 음료(Drink), 과자(Snack)로 나누어 집니다.
 * 과일은 당조(brix)를, 음료는 용량 ml를 과자는 무게(gram) 정보를 가지고 있습니다.
 * 과일에는 사과(Apple)와 복숭아(Peach)
 * 음료에는 콜라(Coke) 사이다(Cider)
 * 과자는 비스킷(Biscuit)과 쿠키(Cookie)가 있습니다.
 * 
 * 사과, 복숭아는 가격과 당도를 입력하여 객체를 생성하고,
 * 콜라, 사이다는 가격, 용량을 과자는 가격, 무게를 입력하여 객체를 생성합니다.		 
 */
public class Ex07_11_MarketEx {
	
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Apple apple = new Apple(1000, 15);
		Peach peach = new Peach(2000, 17);
		Coke coke = new Coke(500, 500);
		Cider cider = new Cider(600, 500);
		Biscuit biscuit = new Biscuit(800, 200);
		Cookie cookie = new Cookie(1200, 140);
		
		b.buy(apple);
		b.buy(peach);
		b.buy(coke);
		b.buy(cider);
		b.buy(biscuit);
		b.buy(cookie);
		
		/* 장바구니를 조회해서 구매 물품 목록과 총가격 및 현재의 보너스포인트를 출력하는 메서드를 만드시오.
		 * 또한 과일의 갯수, 과일, 음료, 과자별로 목록을 출력하고 남은 금액을 출력하시오.
		 * */
		
		b.view();
	}	
	
	public static class Buyer{
			public int money	 = 10000	;	//	돈
			public int point;			//	포인트
			public Food[] cart = new Food [50] ;	//	장바구니
			public int fruitCnt;		//	과일개수
			public int drinkCnt;	//	음료개수
			public int snackCnt;	//	과자개수
			public int cnt;				//	총개수
			public void buy(Food f){		//	구매
				if ( money < f.price )	{	System.out.println("돈이 부족해요!");		return;} 
				money -= f.price;
				point += f.bonusPoint;
				System.out.println(f + "를 구매했습니다.   가격 : " + f.price + 
						"   남은 돈 : "+ money + 
						"   포인트 : "+ point + "(+"+f.bonusPoint+")");
				cart[cnt++] = f;
				f.sellCnt ++; 
				
						if(f instanceof Fruit)		fruitCnt++;
				else if(f instanceof Drink)		drinkCnt++;
				else if(f instanceof Snack)	snackCnt++;				
			}
			public void view(){
				int sum = 0;
				System.out.print("\n총 구매 목록 : \t");
				for(Food f : cart){
					if(f==null)break;
					System.out.print(f+",");
					sum+=f.price;
				}
				System.out.println();
				System.out.println("구매가총합 : "+sum+",\t누적포인트 : "+point+",\t\t남은 돈 : "+money);
				System.out.print("구매과일개수 : "+fruitCnt + "\t=>\t");
				for(Food f : cart){
					if(f==null)break;
					if(f instanceof Fruit)	System.out.print(f+",");					
				}
				System.out.println();
				System.out.print("구매음료개수 : "+drinkCnt  + "\t=>\t");
				for(Food f : cart){
					if(f==null)break;
					if(f instanceof Drink)	System.out.print(f+",");					
				}
				System.out.println();
				System.out.print("구매과자개수 : "+snackCnt + "\t=>\t");
				for(Food f : cart){
					if(f==null)break;
					if(f instanceof Snack)	System.out.print(f+",");					
				}
				System.out.println();
			}
	}
	public static class Apple extends Fruit{
		public Apple(int price,int brix) {				super(price,brix);		}	
		@Override public String toString(){return "사과";}
	}
	public static class Peach extends Fruit{
		public Peach(int price,int brix) {				super(price,brix);		}
		@Override public String toString(){return "복숭아";}
	}
	public static abstract class Fruit extends Food{
		public int brix;	
		public Fruit(int price,int brix) {			super(price);		this.brix = brix;		}		
	}	
	
	public static class Cookie extends Snack{
		public Cookie(int price,int gram) {				super(price,gram);		}
		@Override public String toString(){return "쿠키";}
	}
	public static class Biscuit extends Snack{
		public Biscuit(int price,int gram) {				super(price,gram);		}
		@Override public String toString(){return "비스킷";}
	}
	public static abstract class Snack extends Food{
		public int gram;		
		public Snack(int price,int gram) {			super(price);			this.gram=gram;		}
	}
		
	public static class Coke extends Drink{
		public Coke(int price,int ml) {				super(price,ml);		}
		@Override public String toString(){return "콜라";}
	}
	public static class Cider extends Drink{
		public Cider(int price,int ml) {				super(price,ml);		}
		@Override public String toString(){return "사이다";}
	}	
	public static abstract class Drink extends Food{
		public int ml;		
		public Drink(int price,int ml) {			super(price);		this.ml = ml;		}
	}	
	
	public static abstract class Food{
		public int price;
		public int sellCnt;
		public int bonusPoint;
		public Food(int price){			this.price = price;	this.bonusPoint = price/10;}
	}
}
//사과를 구매했습니다.   가격 : 1000   남은 돈 : 9000   포인트 : 100(+100)
//복숭아를 구매했습니다.   가격 : 2000   남은 돈 : 7000   포인트 : 300(+200)
//콜라를 구매했습니다.   가격 : 500   남은 돈 : 6500   포인트 : 350(+50)
//사이다를 구매했습니다.   가격 : 600   남은 돈 : 5900   포인트 : 410(+60)
//비스킷를 구매했습니다.   가격 : 800   남은 돈 : 5100   포인트 : 490(+80)
//쿠키를 구매했습니다.   가격 : 1200   남은 돈 : 3900   포인트 : 610(+120)
//
//총 구매 목록 : 	사과,복숭아,콜라,사이다,비스킷,쿠키,
//구매가총합 : 6100,	누적포인트 : 610,		남은 돈 : 3900
//구매과일개수 : 2	=>	사과,복숭아,
//구매음료개수 : 2	=>	콜라,사이다,
//구매과자개수 : 2	=>	비스킷,쿠키,

