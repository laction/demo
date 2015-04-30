package p150410_Chapter11;

import java.util.Comparator;
import java.util.TreeSet;

 
public class Ex11_06_ComparatorEx1 {
	public static void main(String[] args) {
		TreeSet set1 = new TreeSet();
		TreeSet set2 = new TreeSet(new Descending());
		int [] score = {30,50,10,20,40};
		for(int i = 0 ; i < score.length ; i ++){
			set1.add(score[i]);
			set2.add(score[i]);
		}
		System.out.println("set1 : "+set1);
		System.out.println("set2 : "+set2);
	}
	static class Descending implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * (-1);
		}
	}
}

//set1 : [10, 20, 30, 40, 50]
//set2 : [50, 40, 30, 20, 10]
