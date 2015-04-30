package p150410_Chapter11;

import java.util.HashSet;
/* 제품(Product) 클래스 만들기
 * 멤버 변수 : 제품명(name), 제품가격(price),
 * 				모델명(modelName)
 * 멤버메서드 : toString 메서드만 오버라이딩
 * 생성자 : 모든 멤버변수를 입력받도록 구현
 * 
 * 제품클래스를 Set에 저장할 떄 동일한 정보의 객체는 저장되지 않도록 Product 클래스 수정
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
				new Product("컴퓨터",150,"CS500"),
				new Product("컴퓨터",150,"CS500"),
				new Product("컴퓨터",165,"CS550"),
				new Product("TV",100,"S4000"),
		};
		
		Set<Product> set = new HashSet();
		for(Product e : item)set.add(e);
		for(Product p : set)
			System.out.println(p);
		System.out.println();
		/* set2 조회시 제품명으로 오름차순 정렬되도록 할 것
		 * */
		Set<Product> set2 = new TreeSet();
		for(Product e : item)set2.add(e);
		for(Product p : set2)
			System.out.println(p);
		System.out.println();
				
	}	
	static class Product implements Comparable{
		String 제품명;
		int 가격;
		String 모델명;
		
		public Product(String 제품명, int 가격, String 모델명) {
			this.제품명 = 제품명;
			this.가격 = 가격;
			this.모델명 = 모델명;
		}
		
		@Override		public String toString() {	return "(" + 제품명 +","+ 가격 +","+ 모델명+")";	}		
		@Override		public int hashCode() {		return 제품명.hashCode() + 가격 + 모델명.hashCode() ;		}
		@Override
		public boolean equals(Object obj) {
			if ( obj instanceof Product){
				Product p = (Product)obj;
				if(제품명.equals(p.제품명)
						&& 가격 == p.가격 
						&& 모델명.equals(p.모델명))
						return true;
				else return false;
			}else return false;			
		}	
		
		static int cnt = 0;
		@Override
		public int compareTo(Object o) {
//			return cnt++;
			Product p = (Product)o;
			if(this.제품명 != p.제품명)
				return this.제품명.compareTo(p.제품명);
			else if(this.가격 != p.가격)
				return this.가격 - p.가격;
			else if(this.모델명 != p.모델명)
				return this.모델명.compareTo(p.모델명);
			else return 0;

		}
	}
}
//(TV,100,S1000)
//(TV,120,S3000)
//(TV,110,S4000)
//(TV,140,S2000)
//(컴퓨터,165,CS550)
//(컴퓨터,150,CS500)
//(TV,100,S4000)
//
//(TV,100,S1000)
//(TV,100,S4000)
//(TV,110,S4000)
//(TV,120,S3000)
//(TV,140,S2000)
//(컴퓨터,150,CS500)
//(컴퓨터,165,CS550)
//
