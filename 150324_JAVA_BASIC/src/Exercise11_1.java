import java.util.ArrayList;

public class Exercise11_1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // 교집합
		ArrayList cha = new ArrayList(); // 차집합
		ArrayList hap = new ArrayList(); // 합집합
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		/*
		 * (1) . 알맞은 코드를 넣어 완성하시오
		 */
//		for(int i = 0 ; i < list1.size(); i++)
//				if(list2.contains(list1.get(i))) kyo.add(list1.get(i));
//		
//		for(int i = 0 ; i < list1.size(); i++)
//			if( !!! list2.contains(list1.get(i))) cha.add(list1.get(i));
//		
//		hap.addAll(list1);
//		for(int i = 0 ; i < list2.size(); i++)
//			if( !!! hap.contains(list2.get(i))) hap.add(list2.get(i));
		
		kyo.addAll(list1);
		kyo.retainAll(list2);
		
		cha.addAll(list1);
		cha.removeAll(list2);
		
		hap.addAll(list1);
		hap.removeAll(list2);
		hap.addAll(list2);
		
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
	}
}
