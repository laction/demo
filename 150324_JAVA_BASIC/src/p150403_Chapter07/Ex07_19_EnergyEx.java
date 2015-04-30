package p150403_Chapter07;
/* �� ���� ��ǰ���� ���� �Ҹ��� ��� �ٸ���.
 * �׷��Ƿ� Ư�� Ŭ�������� �Ҹ��� ���ϰ� ����� �� ���� ����.
 * �̷� �� �ʿ��� ���� �߻� Ŭ�����ε� ���� ��ǰ�鿡 ����� ������ [����]�� ���� �߻�Ŭ������ ������ ����!
 * [����] 
 *  - ������ �Ҹ��� �����ϴ� int���� energe��� ����
 *  - ��ǰ�� �̸��� ������ �� �ִ� name�̶�� ����
 *  - energe���� ��ȯ�ϴ� �޼���
 *  - ��ǰ�� �̸��� ��ȯ�ϴ� �޼���				: getName()
 *  - ��ǰ�� �̸��� ����(����)�ϴ� �޼���	: setName(String name)
 *  - ������ �Ҹ��� �����ϴ� electricMeter() �߻� �޼��� 
 *  
 *  Tv�� ������ �Ҹ��� 100
 *  Audio ������ �Ҹ��� 10
 *  Computer ������ �Ҹ��� 500
 * */
/* getter. setter
 *  ��������� ���� ��ȯ(get) �� ����(set) �Լ��� ��������μ�, Ŭ������ ����ȭ.
 *  
 *  final, abstract �����ڴ� ���ÿ� ����� �� ����.
 * */
public class Ex07_19_EnergyEx {
	public static void main(String[] args) {
		Tv 	tv = new Tv();			
				tv.setName("23��ġ TV");
		Audio 	audio = new Audio();
						audio.setName("����� ����Ŀ");
		Computer computer = new Computer();		
							computer.setName("���� ��Ƽ��");
		
		System.out.println(tv.getName() + "," + tv.electricMeter());
		System.out.println(audio.getName() + "," + audio.electricMeter());
		System.out.println(computer.getName() + "," + computer.electricMeter());
	}
	
	public static class Tv extends Product{
		@Override		public int electricMeter() {	return 100;		}
	}
	public static class Audio extends Product{
		@Override		public int electricMeter() {	return 10;		}
	}
	public static class Computer extends Product{
		@Override		public int electricMeter() {	return 500;		}
	}
	
	public static abstract class Product{
		private String name;		
		public String getName(){								return name;	}
		public void setName(String name){			this.name = name;		}
		public abstract int electricMeter();		
	}
}
//23��ġ TV,100
//����� ����Ŀ,10
//���� ��Ƽ��,500


