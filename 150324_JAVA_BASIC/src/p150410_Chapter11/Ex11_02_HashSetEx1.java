package p150410_Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* HashSet 예제
 * HashSet : 중복불가, 순서는 잘 모름
 * LinkedHashSet : 중복불가, 순서는 유지
 * boolean add(Object) : 객체를 추가기능
 * 			추가성공 : true 리턴
 * 			추가실패 : false 리턴
 *  */
public class Ex11_02_HashSetEx1 {
	public static void main(String[] args) {
		Object[] objArr = {
				"1", new Integer(1), "2","2","3","3","4","4","4"};
		Set set = new HashSet();
		Set set2 = new HashSet();
		Set set3 = new HashSet();
		for(int i = 0 ; i < objArr.length ; i++){
			if(!set.add(objArr[i]))			// HashSet의 add(Object) : 이미 존재하면, false
				if(!set2.add(objArr[i]))		// 때문에 중복되서 들어가지 못한 원소들은 다음 Set으로 들어간다.
					set3.add(objArr[i]);
		}
		System.out.println(set);		// 
		System.out.println(set2);		// 
		System.out.println(set3);
		
		Object [] obj =  set.toArray();
		for (Object o : obj)
		{
			if(o instanceof String)
				System.out.print((String)o+ " ");
			if(o instanceof Integer)
				System.out.print((Integer)o+ " ");			
		}System.out.println();
		
		Set set4 =new LinkedHashSet();
		for(int i = 0 ; i < objArr.length ; i++)
			set4.add(objArr[i]);
		
		System.out.println(set4);
	}
}
//[1, 1, 2, 3, 4]
//[2, 3, 4]
//[4]
//1 1 2 3 4 
//[1, 1, 2, 3, 4]
