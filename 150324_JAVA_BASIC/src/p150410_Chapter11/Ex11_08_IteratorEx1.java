package p150410_Chapter11;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/* Iterator 인터페이스
 * Collection 객체는 모두 Iterator 객체로 변환이 가능하다.
 * 변환 메서드 : iterator()
 * Iterator 인터페이스의 멤버 메서드
 * 		hasNext() : 조회할 객체(요소, Element) 존재여부 확인
 * 		next () 		: 순서에 해당하는 객체를 리턴
 * 		remove()	: 반드시 next()메서드 이후 사용가능함. 객체를 삭제 기능
 * 
 * Enumeration 인터페이스 : Iterator 구버젼
 * 	Vector, Hashtable에서만 사용 가능
 * 	멤버 메서드
 * 		hasMoreElemente() : hasNext()와 동일
 * 		nextElement() : next()와 동일
 * */

public class Ex11_08_IteratorEx1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");	list.add("2");	list.add("3");	list.add("4");	list.add("5");
		for(int i = 0 ; i < list.size() ; i++)
				System.out.print(list.get(i));
		System.out.println();
		for(int i = 0 ; i < list.size() ; i++)
			System.out.print(list.get(i));
		System.out.println();
				
		List<String> list2 = new Vector<String>();
		list2.add("1");	list2.add("2");	list2.add("3");	list2.add("4");	list2.add("5");
		for(int i = 0 ; i < list2.size() ; i++)
			System.out.print(list2.get(i));
		System.out.println();
		for( String s : list2) System.out.print(s);
		System.out.println();
		
				// set은 get함수가 없다.
		Set<String> set = new HashSet<String>();
		set.add("1");	set.add("2");	set.add("3");	set.add("4");	set.add("5");
		for(String s : set)	System.out.print( s );
		System.out.println();
		
		System.out.println("\nIterator 사용하기");
		Iterator<String> it;
		
		it = list.iterator();
		while(it.hasNext()) System.out.print(it.next());
		System.out.println();
		it = list2.iterator();
		while(it.hasNext()) System.out.print(it.next());
		System.out.println();
		it = set.iterator();
		while(it.hasNext()) System.out.print(it.next());
		System.out.println();
		
		System.out.println("\nEnumeration 객체로 list2 조회");
		Enumeration e = ((Vector)list2).elements();
		while (e.hasMoreElements())
			System.out.print(e.nextElement());			
		System.out.println();
	}
}

