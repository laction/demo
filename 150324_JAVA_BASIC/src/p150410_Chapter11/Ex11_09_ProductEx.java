package p150410_Chapter11;

import java.util.HashSet;
/* ��ǰ(Product) Ŭ���� �����
 * ��� ���� : ��ǰ��(name), ��ǰ����(price),
 * 				�𵨸�(modelName)
 * ����޼��� : toString �޼��常 �������̵�
 * ������ : ��� ��������� �Է¹޵��� ����
 * 
 * ��ǰŬ������ Set�� ������ �� ������ ������ ��ü�� ������� �ʵ��� Product Ŭ���� ����
 * */
import java.util.Set;
import java.util.TreeSet;

public class Ex11_09_ProductEx {
	
	public static void main(String[] args) {
		Product [] item = {
				new Product("TV",100,"S1000"),
				new Product("TV",140,"S2000"),
				new Product("TV",120,"S3000"),
				new Product("TV",110,"S4000"),
				new Product("��ǻ��",150,"CS500"),
				new Product("��ǻ��",150,"CS500"),
				new Product("��ǻ��",165,"CS550"),
				new Product("TV",100,"S4000"),
		};
		
		Set<Product> set = new HashSet();
		for(Product e : item)set.add(e);
		for(Product p : set)
			System.out.println(p);
		System.out.println();
		/* set2 ��ȸ�� ��ǰ������ �������� ���ĵǵ��� �� ��
		 * */
		Set<Product> set2 = new TreeSet();
		for(Product e : item)set2.add(e);
		for(Product p : set2)
			System.out.println(p);
		System.out.println();
				
	}	
	static class Product implements Comparable{
		String ��ǰ��;
		int ����;
		String �𵨸�;
		
		public Product(String ��ǰ��, int ����, String �𵨸�) {
			this.��ǰ�� = ��ǰ��;
			this.���� = ����;
			this.�𵨸� = �𵨸�;
		}
		
		@Override		public String toString() {	return "(" + ��ǰ�� +","+ ���� +","+ �𵨸�+")";	}		
		@Override		public int hashCode() {		return ��ǰ��.hashCode() + ���� + �𵨸�.hashCode() ;		}
		@Override
		public boolean equals(Object obj) {
			if ( obj instanceof Product){
				Product p = (Product)obj;
				if(��ǰ��.equals(p.��ǰ��)
						&& ���� == p.���� 
						&& �𵨸�.equals(p.�𵨸�))
						return true;
				else return false;
			}else return false;			
		}	
		
		static int cnt = 0;
		@Override
		public int compareTo(Object o) {
//			return cnt++;
			Product p = (Product)o;
			if(this.��ǰ�� != p.��ǰ��)
				return this.��ǰ��.compareTo(p.��ǰ��);
			else if(this.���� != p.����)
				return this.���� - p.����;
			else if(this.�𵨸� != p.�𵨸�)
				return this.�𵨸�.compareTo(p.�𵨸�);
			else return 0;

		}
	}
}
//(TV,100,S1000)
//(TV,120,S3000)
//(TV,110,S4000)
//(TV,140,S2000)
//(��ǻ��,165,CS550)
//(��ǻ��,150,CS500)
//(TV,100,S4000)
//
//(TV,100,S1000)
//(TV,100,S4000)
//(TV,110,S4000)
//(TV,120,S3000)
//(TV,140,S2000)
//(��ǻ��,150,CS500)
//(��ǻ��,165,CS550)
//
