package p150410_Chapter11;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/* TreeSet ���� : �ߺ��Ұ�, ���ĵ�
 * TreeSet�� SortedSet�� ��ӹ���.
 * SortedSet�� subSet�Լ��� ����Ѵ�.
 * 
 * Comparator �������̽� : ���Ĺ���� ����.
 * 		compare(Object,Object)
 * Comparable �������̽� : ���� ����
 * 		compareTo() : ������ ������(��)���� �ν�.
 * 									����� ū��(��)���� �ν�
 * 
 * TreeSet Ŭ������ ���Ĺ�� ����
 * 	new TreeSet(Comparator com) : com �� compare �޼��带 �������� ����.
 *  */
public class Ex11_05_TreeSetEx1 {
	public static void main(String[] args) {
		SortedSet set = new TreeSet<>(new Descending());
		String from = "bat";
		String to = "d";
		
		Object [] obj = {
				"abc","alien","bat","disc","dance","dZZZZ","dzzzz","elevator","fan","flower"		};
		for(int i = 0 ; i < obj.length ; i ++)	set.add(obj[i]);
		System.out.println(set);
		
		System.out.println("from : " + to + "~ to : "  + from);
		System.out.println(set.subSet(to,from));
		System.out.println(
				"from : " + to + "~ to : " + from + " zzzz");
		System.out.println(set.subSet(to+ "zzzz", from ));
		
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
//[flower, fan, elevator, dzzzz, disc, dance, dZZZZ, bat, alien, abc]
//from : d~ to : bat
//[]
//from : d~ to : bat zzzz
//[dzzzz, disc, dance, dZZZZ]

