package p150410_Chapter11;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/* Iterator �������̽�
 * Collection ��ü�� ��� Iterator ��ü�� ��ȯ�� �����ϴ�.
 * ��ȯ �޼��� : iterator()
 * Iterator �������̽��� ��� �޼���
 * 		hasNext() : ��ȸ�� ��ü(���, Element) ���翩�� Ȯ��
 * 		next () 		: ������ �ش��ϴ� ��ü�� ����
 * 		remove()	: �ݵ�� next()�޼��� ���� ��밡����. ��ü�� ���� ���
 * 
 * Enumeration �������̽� : Iterator ������
 * 	Vector, Hashtable������ ��� ����
 * 	��� �޼���
 * 		hasMoreElemente() : hasNext()�� ����
 * 		nextElement() : next()�� ����
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
		
				// set�� get�Լ��� ����.
		Set<String> set = new HashSet<String>();
		set.add("1");	set.add("2");	set.add("3");	set.add("4");	set.add("5");
		for(String s : set)	System.out.print( s );
		System.out.println();
		
		System.out.println("\nIterator ����ϱ�");
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
		
		System.out.println("\nEnumeration ��ü�� list2 ��ȸ");
		Enumeration e = ((Vector)list2).elements();
		while (e.hasMoreElements())
			System.out.print(e.nextElement());			
		System.out.println();
	}
}

