package p150401_Chapter07;
/* Ŭ���� ���.
 * extends�� ���. 
 * 
 * is a ���� : Human is a Mammal . �ΰ��� �������� ��� ����.
 * has a ���� : Human has a Eyes.  
 * 
 * C++�ʹ� �޸�, Ŭ������ ���� ��Ӹ� ����.
 * �θ�Ŭ������ ���� �Ҵ�ǰ�, �ڼ�Ŭ������ �Ҵ�ȴ�.
 * Ŭ������ ��� ���� �ʴ� ��� Ŭ������ Object Ŭ������ ��ӹ޴´�.
 * 		�׷��� ��� Ŭ������ ObjectŬ������  ��ӹ��� �����̴�.
 * */
/* ��� ���迡���� new ������ ���
 * 1. �θ�ü����, �⺻�� �ʱ�ȭ
 * 2. �ڼհ�ü����, �⺻�� �ʱ�ȭ
 * 3. �θ������ ����, ���Ŀ� �ڼջ����� ����
 * */
class Tv{
	boolean power;
	int channel;
	void power(){power = !power;}
	void channelUp(){++channel;	}
	void channelDown(){ -- channel;}
}
class CaptionTv extends Tv{
	boolean caption;
	void dispayCaption (String text){
		if(caption)
			System.out.println(text);
	}
}
public class Ex07_01_CaptionTvEx {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.dispayCaption("�ȳ��ϼ���!");
		ctv.caption = true;
		ctv.dispayCaption("�ȳ��ϼ���!");
	}
}
//11
//�ȳ��ϼ���!
