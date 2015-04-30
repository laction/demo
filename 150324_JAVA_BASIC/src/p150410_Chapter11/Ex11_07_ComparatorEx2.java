package p150410_Chapter11;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex11_07_ComparatorEx2 {
	static class Phone implements Comparable{
		String name;
		int number;
		Phone(String name, int number){
			this.name = name ; 
			this.number = number;			
		}
		@Override
		public String toString(){
			return name + ":" + number;
		}
		@Override
		public int compareTo(Object o) {
			Phone p = (Phone)o;
			return name.compareTo(p.name);		// ÀÌ¸§¼ø Á¤·Ä
//			return this.number - p.number;				// ÀüÈ­¹øÈ£ ¼ø Á¤·Ä			
		}
		public static class NumberSort implements Comparator{
			@Override
			public int compare(Object o1, Object o2) {
				Phone p1 = (Phone)o1 ; 
				Phone p2 = (Phone)o2;
				return p1.number - p2.number;
			}
		}
	}
	public static void main(String[] args) {
		TreeSet<Object> list = new TreeSet();
		list.add(new Phone("±è»ñ°«",1235));
		list.add(new Phone("ÀÌ¸ù·æ",3245));
		list.add(new Phone("È«±æµ¿",5215));
		list.add(new Phone("ÀÓ²©Á¤",1111));
		System.out.println(list);
		System.out.println();
		
		TreeSet<Object> list2 = new TreeSet( new Phone.NumberSort());
		list2.add(new Phone("±è»ñ°«",1235));
		list2.add(new Phone("ÀÌ¸ù·æ",3245));
		list2.add(new Phone("È«±æµ¿",5215));
		list2.add(new Phone("ÀÓ²©Á¤",1111));
		System.out.println(list2);
		// ¹®Á¦ : list1Àº ÀÌ¸§À¸·Î Á¤·Ä
						//list2´Â ÀüÈ­¹øÈ£·Î Á¤·Ä
	}
}

//[±è»ñ°«:1235, ÀÌ¸ù·æ:3245, ÀÓ²©Á¤:1111, È«±æµ¿:5215]
//
//[ÀÓ²©Á¤:1111, ±è»ñ°«:1235, ÀÌ¸ù·æ:3245, È«±æµ¿:5215]
