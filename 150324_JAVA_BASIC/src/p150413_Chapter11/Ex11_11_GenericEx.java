package p150413_Chapter11;


public class Ex11_11_GenericEx {
	public static void main(String[] args) {
		Integer[] i = {10,20,30};
		String str [] = {"하이","헬롱", "안뇽"};
		GenericEx ge = new GenericEx();			// 제네릭 객체는 제네릭의 자료형을 명시하지 않으면 Warning 발생. 
		ge.set(i);		ge.print();		System.out.println();
		ge.set(str);	ge.print();		System.out.println();
		
		GenericEx<Integer> ge2 = new GenericEx<Integer>();
		ge2.set(i);		ge2.print();		System.out.println();
//		ge2.set(str);	ge2.print();		System.out.println();	// 컴파일 에러. 명시된 타입에 대해 자료형변환 불가.
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
//하이  헬롱  안뇽  
//10  20  30  
