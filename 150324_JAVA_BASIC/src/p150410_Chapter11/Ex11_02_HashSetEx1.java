package p150410_Chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* HashSet ����
 * HashSet : �ߺ��Ұ�, ������ �� ��
 * LinkedHashSet : �ߺ��Ұ�, ������ ����
 * boolean add(Object) : ��ü�� �߰����
 * 			�߰����� : true ����
 * 			�߰����� : false ����
 *  */
public class Ex11_02_HashSetEx1 {
	public static void main(String[] args) {
		Object[] objArr = {
				"1", new Integer(1), "2","2","3","3","4","4","4"};
		Set set = new HashSet();
		Set set2 = new HashSet();
		Set set3 = new HashSet();
		for(int i = 0 ; i < objArr.length ; i++){
			if(!set.add(objArr[i]))			// HashSet�� add(Object) : �̹� �����ϸ�, false
				if(!set2.add(objArr[i]))		// ������ �ߺ��Ǽ� ���� ���� ���ҵ��� ���� Set���� ����.
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
