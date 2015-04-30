package p150402_Chapter07;

/* 1. �ķ�ǰ�� �緯 ���忡 ���ϴ�
 * ���� ���� ��ٱ��ϸ� ������ ���ϴ�.
 * �� Ŭ���� Buyer
			public int money;		//	��
			public int point;			//	����Ʈ
			public Food[] cart;	//	��ٱ���
			public int fruitCnt;		//	���ϰ���
			public int drinkCnt;	//	���ᰳ��
			public int snackCnt;	//	���ڰ���
			public int cnt;				//	�Ѱ���
			public void buy(Food f){		//	����				
 * ������ �춧���� ���ݸ�ŭ �����ݾ׿��� �����ǰ�
 * �ķ�ǰ�� ����Ʈ��ŭ ����Ʈ�� �����ȴ�
 * � ������ ����� ��ǰ��� ������ ȭ�鿡 ����ϰ�, ��ü�� ���Ű����� �����˴ϴ�.
 * ��ٱ��� �ش� ������ �ִ´�.
 * 
 * 2. ��� �ķ�ǰ(Food)�� ���ݰ� �ǸŰ���, ���ʽ�����Ʈ�� ������ �ֽ��ϴ�.
 * �ķ�ǰ ��ü�� �����ϱ� ���ؼ��� ������ �Է¹޾ƾ� �մϴ�.
 * �ķ�ǰ�� �����δ� ����(Fruit), ����(Drink), ����(Snack)�� ������ ���ϴ�.
 * ������ ����(brix)��, ����� �뷮 ml�� ���ڴ� ����(gram) ������ ������ �ֽ��ϴ�.
 * ���Ͽ��� ���(Apple)�� ������(Peach)
 * ���ῡ�� �ݶ�(Coke) ���̴�(Cider)
 * ���ڴ� ��Ŷ(Biscuit)�� ��Ű(Cookie)�� �ֽ��ϴ�.
 * 
 * ���, �����ƴ� ���ݰ� �絵�� �Է��Ͽ� ��ü�� �����ϰ�,
 * �ݶ�, ���̴ٴ� ����, �뷮�� ���ڴ� ����, ���Ը� �Է��Ͽ� ��ü�� �����մϴ�.		 
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
		
		/* ��ٱ��ϸ� ��ȸ�ؼ� ���� ��ǰ ��ϰ� �Ѱ��� �� ������ ���ʽ�����Ʈ�� ����ϴ� �޼��带 ����ÿ�.
		 * ���� ������ ����, ����, ����, ���ں��� ����� ����ϰ� ���� �ݾ��� ����Ͻÿ�.
		 * */
		
		b.view();
	}	
	
	public static class Buyer{
			public int money	 = 10000	;	//	��
			public int point;			//	����Ʈ
			public Food[] cart = new Food [50] ;	//	��ٱ���
			public int fruitCnt;		//	���ϰ���
			public int drinkCnt;	//	���ᰳ��
			public int snackCnt;	//	���ڰ���
			public int cnt;				//	�Ѱ���
			public void buy(Food f){		//	����
				if ( money < f.price )	{	System.out.println("���� �����ؿ�!");		return;} 
				money -= f.price;
				point += f.bonusPoint;
				System.out.println(f + "�� �����߽��ϴ�.   ���� : " + f.price + 
						"   ���� �� : "+ money + 
						"   ����Ʈ : "+ point + "(+"+f.bonusPoint+")");
				cart[cnt++] = f;
				f.sellCnt ++; 
				
						if(f instanceof Fruit)		fruitCnt++;
				else if(f instanceof Drink)		drinkCnt++;
				else if(f instanceof Snack)	snackCnt++;				
			}
			public void view(){
				int sum = 0;
				System.out.print("\n�� ���� ��� : \t");
				for(Food f : cart){
					if(f==null)break;
					System.out.print(f+",");
					sum+=f.price;
				}
				System.out.println();
				System.out.println("���Ű����� : "+sum+",\t��������Ʈ : "+point+",\t\t���� �� : "+money);
				System.out.print("���Ű��ϰ��� : "+fruitCnt + "\t=>\t");
				for(Food f : cart){
					if(f==null)break;
					if(f instanceof Fruit)	System.out.print(f+",");					
				}
				System.out.println();
				System.out.print("�������ᰳ�� : "+drinkCnt  + "\t=>\t");
				for(Food f : cart){
					if(f==null)break;
					if(f instanceof Drink)	System.out.print(f+",");					
				}
				System.out.println();
				System.out.print("���Ű��ڰ��� : "+snackCnt + "\t=>\t");
				for(Food f : cart){
					if(f==null)break;
					if(f instanceof Snack)	System.out.print(f+",");					
				}
				System.out.println();
			}
	}
	public static class Apple extends Fruit{
		public Apple(int price,int brix) {				super(price,brix);		}	
		@Override public String toString(){return "���";}
	}
	public static class Peach extends Fruit{
		public Peach(int price,int brix) {				super(price,brix);		}
		@Override public String toString(){return "������";}
	}
	public static abstract class Fruit extends Food{
		public int brix;	
		public Fruit(int price,int brix) {			super(price);		this.brix = brix;		}		
	}	
	
	public static class Cookie extends Snack{
		public Cookie(int price,int gram) {				super(price,gram);		}
		@Override public String toString(){return "��Ű";}
	}
	public static class Biscuit extends Snack{
		public Biscuit(int price,int gram) {				super(price,gram);		}
		@Override public String toString(){return "��Ŷ";}
	}
	public static abstract class Snack extends Food{
		public int gram;		
		public Snack(int price,int gram) {			super(price);			this.gram=gram;		}
	}
		
	public static class Coke extends Drink{
		public Coke(int price,int ml) {				super(price,ml);		}
		@Override public String toString(){return "�ݶ�";}
	}
	public static class Cider extends Drink{
		public Cider(int price,int ml) {				super(price,ml);		}
		@Override public String toString(){return "���̴�";}
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
//����� �����߽��ϴ�.   ���� : 1000   ���� �� : 9000   ����Ʈ : 100(+100)
//�����Ƹ� �����߽��ϴ�.   ���� : 2000   ���� �� : 7000   ����Ʈ : 300(+200)
//�ݶ� �����߽��ϴ�.   ���� : 500   ���� �� : 6500   ����Ʈ : 350(+50)
//���̴ٸ� �����߽��ϴ�.   ���� : 600   ���� �� : 5900   ����Ʈ : 410(+60)
//��Ŷ�� �����߽��ϴ�.   ���� : 800   ���� �� : 5100   ����Ʈ : 490(+80)
//��Ű�� �����߽��ϴ�.   ���� : 1200   ���� �� : 3900   ����Ʈ : 610(+120)
//
//�� ���� ��� : 	���,������,�ݶ�,���̴�,��Ŷ,��Ű,
//���Ű����� : 6100,	��������Ʈ : 610,		���� �� : 3900
//���Ű��ϰ��� : 2	=>	���,������,
//�������ᰳ�� : 2	=>	�ݶ�,���̴�,
//���Ű��ڰ��� : 2	=>	��Ŷ,��Ű,

