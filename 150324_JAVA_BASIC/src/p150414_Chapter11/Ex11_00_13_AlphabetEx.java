package p150414_Chapter11;
import java.util.Random;

/* RandomŬ������ �̿��Ͽ� ���ĺ� �빮�ڵ� �� �������� �����Ͽ�
 * ���� [����]�� ���� �������� ����� ����
 * [����]
 * G		K		O		P		W
 * R		V		T		S		K
 * B		Z		Q		U		Y
 * */
public class Ex11_00_13_AlphabetEx {
	public static void main(String[] args) {
		Random r= new Random(System.currentTimeMillis());
		
		for(int i = 0 ; i < 3 ; i ++){
			for (int j = 0 ; j < 5 ; j++)
				System.out.print((char)('A'+r.nextInt('Z'-'A'+1))+"\t");
			System.out.println();
		}
	}
}
//Q	S	K	J	C	
//C	G	C	S	P	
//S	A	K	D	M	
