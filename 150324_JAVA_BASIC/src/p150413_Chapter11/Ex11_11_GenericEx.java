package p150413_Chapter11;


public class Ex11_11_GenericEx {
	public static void main(String[] args) {
		Integer[] i = {10,20,30};
		String str [] = {"����","���", "�ȴ�"};
		GenericEx ge = new GenericEx();			// ���׸� ��ü�� ���׸��� �ڷ����� ������� ������ Warning �߻�. 
		ge.set(i);		ge.print();		System.out.println();
		ge.set(str);	ge.print();		System.out.println();
		
		GenericEx<Integer> ge2 = new GenericEx<Integer>();
		ge2.set(i);		ge2.print();		System.out.println();
//		ge2.set(str);	ge2.print();		System.out.println();	// ������ ����. ��õ� Ÿ�Կ� ���� �ڷ�����ȯ �Ұ�.
	}
	
	static class GenericEx<T> {
		T[] v;
		public void set(T[] n){
			v = n;
		}
		public void print(){
			for(T s : v) System.out.print(s+ "  ");
		}
	}
}
//10  20  30  
//����  ���  �ȴ�  
//10  20  30  
