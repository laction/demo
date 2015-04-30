package p150327_Chapter06;
/* Ŭ����.
 * ��������� ����޼ҵ带 ������ �� �ִ�.
 * Ŭ������ ����� public,protected,default,private ���� ���������ڷ� �ܺο����� ������ ������ �� �ִ�.
 * Ŭ������ new ����� ���� �����Ҵ� �Ǹ�, ���ÿ� �����ڸ� ȣ���Ѵ�.
 * Ŭ���������� ���������̴�.
 * Ŭ������ ��ӵ� �� �ְ�, Ŭ���� / �߻�Ŭ���� / �������̽� �� ��� ���� �� �ִ�.
 * */
/* JVM �޸� ����
 * Ŭ���� / ���� / �� ������ �����Ѵ�.
 * Ŭ���� ���� : Ŭ������ �⺻ ������ �ε�ȴ�. ȣ���� �ʿ��� �ܺο����� ������ ã������ �ʿ��ϴ�.
 * ���� ���� : �޼��� ����((����)�������� �� �ڵ�)�� �ε�ȴ�.
 * �� ���� : ���������� ����Ű�� �����Ҵ�� �����Ͱ� �����Ѵ�.
 * ����Ƽ�� �޼��� ���� : JVM�� ��ġ�� �÷����� �ý��� �޼������ �⺻������ �ε���. 
 * PC �������� : ���� �������� ��ɾ��� �ּ�.
 * */
class Tv {
	String color;
	boolean power;
	int channel ; 
	Tv power(){		power = !power;		return this;	}
	Tv channelUp()		{		if(power)++channel;		return this;	}
	Tv channelDown(){		if(power)--channel;		return this;	}	
}
public class Ex06_01_TvTest {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.color = "����";
		tv.channel = 11;
		tv.power = true;
		
		System.out.println(tv.color + ":" + tv.channel + ":" + tv.power);		
		tv.channelUp().channelUp();
		System.out.println(tv.color + ":" + tv.channel + ":" + tv.power);
		
		Tv tv2 = new Tv();
		System.out.println(tv2.color + ":" + tv2.channel + ":" + tv2.power);
		
		tv2=tv;
		System.out.println(tv2.color + ":" + tv2.channel + ":" + tv2.power);	
	}
}
//����:11:true
//����:13:true
//null:0:false
//����:13:true
