package p150409_Chapter11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Collection 
 * - Set(�ߺ��Ұ�) : HashSet(����X), TreeSet(����)
 * - List(��������) : ArrayList,Vector
 * - Queue(FIFO) : LinkedList
 * 
 * Map((Ű->��ü) ����) : HashMap(����X), HashTable(����X), TreeMap(����)  					
 */

/* Collection  -  JDK 1.2���� �߰��� ����
 * �����Ͽ��� �߰��Ǵ� ��ü�� �ڷ����� ǥ���ϱ� ���� ����� �߰��� ( JDK 5.0 => ���׸� ) 
 * 
 * ArrayList�� ����޼���� �����忡 ����ȭ �Ǿ����� �ʴ�.
 * 	Vector�� ����޼���� �����忡 ����ȭ �Ǿ� �ִ�.
 * */

//ArrayList ����
public class Ex11_01_ArrayListEx1 {
	public static void main(String[] args) {
		//List list1 = new ArrayList();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(5);
		list1.add(4);
		list1.add(0);
		list1.add(3);
		ArrayList<Integer> list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
			// Collections Ŭ����
			// Collection �������̽�
		Collections.sort(list1);
		Collections.sort(list2);		// compareTo() �޼���.
		print(list1,list2);
		System.out.println(list1.containsAll(list2));		// ����Ȯ��
//		list2.add("B");			// ������ ����. ���׸� ���� ��õ� Ÿ�Ը� ���ҷμ� ����.
//		list2.add("C");			
		print(list1,list2);		
//		list2.add(3,"A");		// 3��°�� �߰�
		print(list1,list2);
//		list2.set(3, "AA");
		print(list1,list2);
		for(Object o : list1)		System.out.println(o);	// �迭ó�� ���. Ojbect Ŭ������ ����� �������� �����ؼ� ���Ҹ� ��� ����.
		System.out.println();		
	}
	private static void print(List list1,List list2) {
		System.out.println(list1);
		System.out.println(list2);
	}
}
//[1, 2, 5, 4, 0, 3]
//[2, 5, 4]
//[0, 1, 2, 3, 4, 5]
//[2, 4, 5]
//true
//[0, 1, 2, 3, 4, 5]
//[2, 4, 5]
//[0, 1, 2, 3, 4, 5]
//[2, 4, 5]
//[0, 1, 2, 3, 4, 5]
//[2, 4, 5]
//0
//1
//2
//3
//4
//5
//
