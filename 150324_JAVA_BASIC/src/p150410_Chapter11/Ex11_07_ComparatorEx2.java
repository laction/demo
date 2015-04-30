package p150410_Chapter11;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex11_07_ComparatorEx2 {
	static class Phone implements Comparable{
		String name;
		int number;
		Phone(String name, int number){
			this.name = name ; 
			this.number = number;			
		}
		@Override
		public String toString(){
			return name + ":" + number;
		}
		@Override
		public int compareTo(Object o) {
			Phone p = (Phone)o;
			return name.compareTo(p.name);		// �̸��� ����
//			return this.number - p.number;				// ��ȭ��ȣ �� ����			
		}
		public static class NumberSort implements Comparator{
			@Override
			public int compare(Object o1, Object o2) {
				Phone p1 = (Phone)o1 ; 
				Phone p2 = (Phone)o2;
				return p1.number - p2.number;
			}
		}
	}
	public static void main(String[] args) {
		TreeSet<Object> list = new TreeSet();
		list.add(new Phone("���",1235));
		list.add(new Phone("�̸���",3245));
		list.add(new Phone("ȫ�浿",5215));
		list.add(new Phone("�Ӳ���",1111));
		System.out.println(list);
		System.out.println();
		
		TreeSet<Object> list2 = new TreeSet( new Phone.NumberSort());
		list2.add(new Phone("���",1235));
		list2.add(new Phone("�̸���",3245));
		list2.add(new Phone("ȫ�浿",5215));
		list2.add(new Phone("�Ӳ���",1111));
		System.out.println(list2);
		// ���� : list1�� �̸����� ����
						//list2�� ��ȭ��ȣ�� ����
	}
}

//[���:1235, �̸���:3245, �Ӳ���:1111, ȫ�浿:5215]
//
//[�Ӳ���:1111, ���:1235, �̸���:3245, ȫ�浿:5215]
