import java.util.ArrayList;

public class Exercise7_19 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
	
	static class Buyer {
		int money = 1000;
		ArrayList<Product> cart = new ArrayList<Product>();

		void buy(Product p) {
			/*
			 * (1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 1.1 ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�.
			 * 1.2 ���� ���� ����ϸ�, ��ǰ�� ������ ���� ������ ���� 1.3 ��ٱ��Ͽ� ������ ������ ��´�.(add�޼��� ȣ��)
			 */
			if(p.price > money) {System.out.println("�ܾ��� �����Ͽ� "+p+"�� �� �� �����ϴ�");return;}
			money-=p.price;
			add(p);		
		}

		void add(Product p) {
			/*
			 * (2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ�� 1.1.1 ������
			 * ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� �����Ѵ�. 1.1.2 ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�. 1.1.3 ���ο�
			 * ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�. 1.2 ������ ��ٱ���(cart)�� �����Ѵ�. �׸��� i�� ���� 1 ������Ų��.
			 */
//			if(i+1 >= cart.length){
//				Product[] res= new Product[cart.length*2];
//				for(int idx = 0 ; idx < cart.length ; idx++)
//					res [idx] = cart[idx];
//				cart =res;
//			}
//			cart[i++] = p;
			cart.add(p);
		} // add(Product p)

		void summary() {
			/*
			 * (3) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�. 1.1 ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�. 1.2 ��ٱ��Ͽ�
			 * ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�. 1.3 ������ ��� ���� �ݾ�(money)�� ����Ѵ�.
			 */
			int sum = 0 ;
			for(int idx = 0 ; idx < cart.size(); idx++){
				System.out.println(cart.get(idx)+" : " + cart.get(idx).price);
				sum += cart.get(idx).price;
			}
			System.out.println("�Ѿ� : "+sum);
			System.out.println("�ܾ� : "+ money);
		} // summary()
	}

	static class Product {
		int price; // ��ǰ�� ����

		Product(int price) {
			this.price = price;
		}
	}

	static class Tv extends Product {
		Tv() {
			super(100);
		}

		public String toString() {
			return "Tv";
		}
	}

	static class Computer extends Product {
		Computer() {
			super(200);
		}

		public String toString() {
			return "Computer";
		}
	}

	static class Audio extends Product {
		Audio() {
			super(50);
		}

		public String toString() {
			return "Audio";
		}
	}
}

