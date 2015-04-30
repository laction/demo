package p150414_Chapter11;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/* ���ѹα�, ĳ����, ����, ������ , �߱�, �̱� ���� ������ ���� HashMap�� �����ϰ�
 * ���ϴ�  ���� ȭ������ ���� �Է¹޾� �ش� ������ ������ ȭ�鿡 ����ϴ� ���α׷� �ۼ��ϱ�
 * HashMap Ŭ���� ����ϱ�
 */
public class Ex11_00_11_CapitalEx {
	public static void main(String[] args) {
		String nation[] = new String[]{"���ѹα�","ĳ����","����","������","�߱�","�̱�"};
		String cap [] = new String[]{"����","��Ÿ��","����","����","����¡","������DC"};
		Map map = new HashMap();
		for(int i = 0 ; i < Math.max(nation.length, cap.length); i++)
			map.put(nation[i], cap[i]);
		
		Scanner sc = new Scanner(System.in);
		String input = "";
		do{
			System.out.print("�Է��� : ");
			input = sc.nextLine();
			if(map.containsKey(input))
				System.out.println(input + " : " + map.get(input));
			else	System.out.println("��ϵȳ���ƴ�");
		}while(!input.equals("����"));
		System.out.println("�Ͼ�� ���¿���");
	}
}
//�Է��� : ���ѹα�
//���ѹα� : ����
//�Է��� : ĳ����
//ĳ���� : ��Ÿ��
//�Է��� : �̱�
//�̱� : ������DC
//�Է��� : ����
//��ϵȳ���ƴ�
//�Ͼ�� ���¿���
