package p150407_Chapter09;

/* == �񱳿����ڿ� ������ Object.equals(Object) �Լ��� ������ �ٸ��� �ʴ�. 
 */
public class Ex09_01_EqualsEx1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1 == v2)			System.out.println("v1 == v2");
		else							System.out.println("v1 != v2");
		
		if (v1.equals(v2))	System.out.println("v1.equals(v2) : true");
		else								System.out.println("v1.equals(v2) : false");
	}

	public static class Value extends Object {
		public int value;
		public Value(int value) {			this.value = value;		}		
	}
}
//v1 != v2
//v1.equals(v2) : false
