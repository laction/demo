package p150410_Chapter11;

import java.util.Set;
import java.util.TreeSet;

/* Set�� �ߺ��Ұ��� Ư¡�� �̿��Ͽ� �ζǹ�ȣ ������ ���α׷�
 * TreeSet : ���ĵ� set ��ü�� ���
 * */
public class Ex11_04_LottoEx {
	public static void main(String[] args) {
		Set lotto = new TreeSet();
		while(true) {
			lotto.add((int)(Math.random()*45 + 1));
			if(lotto.size() >= 6) break;
		}
		System.out.println(lotto);
	}
}
//[1, 3, 17, 21, 22, 24]
