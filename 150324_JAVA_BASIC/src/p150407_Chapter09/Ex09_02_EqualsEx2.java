package p150407_Chapter09;

/* Object Ŭ������ equals �޼���� ��ü �񱳹�� ����
 * ��ü �񱳴� == �����ڷε� ����
 * equals �޼���� ������ϴ� ������� ����ϵ��� �������̵��� �ʿ�.
 * 
 * ��κ��� Ŭ������ equals �޼��带 ����񱳹������ �������̵��ؼ� ����ϰ� �ִ�. (String)
 * */
public class Ex09_02_EqualsEx2 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1==v2)			System.out.println("v1 == v2");
				else				System.out.println("v1 != v2");
		
		if(v1.equals(v2))		System.out.println("v1.equals(v2) : true");
				else						System.out.println("v1.equals(v2) : false");		
	}	
	public static class Value extends Object{
		public int value ; 
		public Value(int value){
			this.value = value;
		}
		
		boolean equals(Value v){
			return this.value == v.value;			
		}
	}
}
//v1 != v2
//v1.equals(v2) : true