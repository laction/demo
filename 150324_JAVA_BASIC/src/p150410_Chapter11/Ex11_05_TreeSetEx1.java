package p150410_Chapter11;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/* TreeSet 예제 : 중복불가, 정렬됨
 * TreeSet은 SortedSet을 상속받음.
 * SortedSet은 subSet함수를 사용한다.
 * 
 * Comparator 인터페이스 : 정렬방식을 지정.
 * 		compare(Object,Object)
 * Comparable 인터페이스 : 순서 지정
 * 		compareTo() : 음수를 작은값(앞)으로 인식.
 * 									양수를 큰값(뒤)으로 인식
 * 
 * TreeSet 클래스의 정렬방식 지정
 * 	new TreeSet(Comparator com) : com 의 compare 메서드를 기준으로 정렬.
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

