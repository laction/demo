package p150413_Chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* HashMap : Map �������̽��� ������ ���� Ŭ����
 * 						Map�� (Ű,��) ������ ��ü�� ������ �����ϴ� ��ü
 * */
public class Ex11_10_HashMapEx {
	public static void main(String[] args) {
		Map map = new HashMap();
									// HashTable() �� ����. ������ HashMap�� �� ����.
									// TreeMap()�� ������ ���� ��밡��.

		String aName [] = { "ȫ�浿","���","�̸���","�Ӳ���","���"};
		int [] aKey = { 1234,4567,5678,7890,9870 };

		for( int i = 0 ; i < aName.length ; i ++)
			map.put(aName[i], aKey[i]	);

		System.out.println(map);			// ���ο� ����� ������ �����ȴ�.
		System.out.println(map.get("ȫ�浿"));	// get() : Ű�� Value�� �����´�.						

		for(Object obj : map.keySet())		// keySet() : Ű�� ���� ��������.
			System.out.print(obj + " " );
		System.out.println();
		for(Object obj : map.values())		// values() : ������ ���� ����. Collection ����
			System.out.print(obj + " ");
		System.out.println();
		for(Object obj : map.entrySet()){		// entrySet : Ű�� �� ��� ��������.
			System.out.print(obj + " ");
			System.out.println(((Map.Entry)obj).getKey()+":"+ ((Map.Entry)obj).getValue().toString() );
		}
		System.out.println();

		Iterator it ;										// Iterator�� �����ϱ�.
		it =map.keySet().iterator();	
		while(it.hasNext())
			System.out.print(it.next()+ " ");		
		System.out.println();
		
		it = map.values().iterator();	
		while(it.hasNext())
			System.out.print(it.next()+ " ");		
		System.out.println();
		
		it = map.entrySet().iterator();	
		while(it.hasNext()){
			Object obj = it.next();
			System.out.print(obj + " ");
			System.out.println(((Map.Entry)obj).getKey()+":"+ ((Map.Entry)obj).getValue().toString() );
		}
		System.out.println();	
	}
}
//{���=9870, ȫ�浿=1234, �̸���=5678, �Ӳ���=7890}
//1234
//��� ȫ�浿 �̸��� �Ӳ��� 
//9870 1234 5678 7890 
//���=9870 ���:9870
//ȫ�浿=1234 ȫ�浿:1234
//�̸���=5678 �̸���:5678
//�Ӳ���=7890 �Ӳ���:7890
//
//��� ȫ�浿 �̸��� �Ӳ��� 
//9870 1234 5678 7890 
//���=9870 ���:9870
//ȫ�浿=1234 ȫ�浿:1234
//�̸���=5678 �̸���:5678
//�Ӳ���=7890 �Ӳ���:7890
//

