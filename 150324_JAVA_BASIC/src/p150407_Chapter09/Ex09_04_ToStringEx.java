package p150407_Chapter09;
/* toString �޼��� ����
 * ��ü�� ���ڿ�ȭ�� �����ϴ� �޼���
 * Object Ŭ�������� ������ toString �޼����
 * Ŭ������ @ �ؽ��ڵ�  ������ ǥ���ȴ�.
 * 
 * Object.getClass() �Լ��� ���� ��Ű�� ������ �˾Ƴ� �� �ִ�.
 * */
public class Ex09_04_ToStringEx {
	
	public static void main(String[] args) {
		Value v1 = new Value(100);
		Value v2 = new ValueOfValue(100);
		
		System.out.println(v1);
		System.out.println(v2);
		
		System.out.println(v1.getClass());
		System.out.println(Value.class);
	}
	
	public static class Value{
		public int value;
		Value(int value){			this.value = value;		}		
	}
	public static class ValueOfValue extends Value{
		ValueOfValue(int value) {			super(value);		}
		@Override	public String toString() {			return String.valueOf(value);		}
	}
}
//p150407_Chapter09.Ex09_04_ToStringEx$Value@1db9742
//100
//class p150407_Chapter09.Ex09_04_ToStringEx$Value
//class p150407_Chapter09.Ex09_04_ToStringEx$Value
