package p150331_Chapter06;
/* new ������ ����
 * 1. �޸� �Ҵ�
 * 2. ��� ������ �⺻������ �ʱ�ȭ
 * 3. ������ ȣ��
 * 4. �Ҵ�� �޸��� ������(��ġ��)�� ��ȯ��. 
 */
// (private ������)�� ���� ��ü������ ���� ���� �ִ�. (ex - Math Ŭ����)
/* ������ : ��üȭ�� ȣ��Ǵ� �޼���
 * 				������ ���� ��ü ������ ����.
 * 				�ַ� �ν��Ͻ� ������ �ʱ�ȭ�� ���.
 * 				�����ε� ����.
 * �⺻������ : �����ڰ� ������� ������, �ڵ����� �⺻�����ڰ� ������ (�����Ϸ��� ����).
 * 				�����ڴ� ����Ÿ���� ������ �ʴ´�.
 * */
class Data1{
	int value;
	Data1(){}
	Data1(int val){ value= val;}
}
public class Ex06_12_ConstructorEx {
	public static void testFunction(Data1 d){System.out.println(d.value);}
	public static Data1 testFunction(Data1 d,int nonVal){System.out.println(d.value); return d;}
	public static void main(String[] args) {
		Data1 d1 = new Data1();		
		testFunction(new Data1(10));
		Data1 d2 = testFunction(new Data1(20),1);
	}
}
//10
//20
