package p150415_Chapter12;
/* Process : OS�󿡼� ����Ǵ� ���α׷�
 * 	Process Ŭ���� - OS�� ���μ����� �����ϴ� Ŭ����
 * Runtime ��ü : OS���� ���μ��� ���� ������ ������
 * */
public class Ex12_01_ProcessEx1 {	
	public static void main(String[] args) {		
		try{
			Process p1 = Runtime.getRuntime().exec("calc.exe");
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			Process p3 = Runtime.getRuntime().exec("notepad.exe");
			p1.waitFor();			// p1 �� ����ñ��� ���� ���
			p2.destroy();			// p1 ������ p2,p3 ���� ����.
			p3.destroy();			// 
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}

