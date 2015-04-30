package p150409_Chapter11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Collection 
 * - Set(중복불가) : HashSet(순서X), TreeSet(정렬)
 * - List(순서유지) : ArrayList,Vector
 * - Queue(FIFO) : LinkedList
 * 
 * Map((키->객체) 모임) : HashMap(순서X), HashTable(순서X), TreeMap(정렬)  					
 */

/* Collection  -  JDK 1.2에서 추가된 내용
 * 컴파일에서 추가되는 객체의 자료형을 표시하기 위한 방법이 추가됨 ( JDK 5.0 => 제네릭 ) 
 * 
 * ArrayList의 멤버메서드는 스레드에 동기화 되어있지 않다.
 * 	Vector의 멤버메서드는 스레드에 동기화 되어 있다.
 * */

//ArrayList 예제
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
			// Collections 클래스
			// Collection 인터페이스
		Collections.sort(list1);
		Collections.sort(list2);		// compareTo() 메서드.
		print(list1,list2);
		System.out.println(list1.containsAll(list2));		// 포함확인
//		list2.add("B");			// 컴파일 에러. 제네릭 사용시 명시된 타입만 원소로서 쓰임.
//		list2.add("C");			
		print(list1,list2);		
//		list2.add(3,"A");		// 3번째에 추가
		print(list1,list2);
//		list2.set(3, "AA");
		print(list1,list2);
		for(Object o : list1)		System.out.println(o);	// 배열처럼 사용. Ojbect 클래스를 사용해 다형성을 보장해서 원소를 사용 가능.
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
