package p150414_Chapter11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;


/* 1~10000�� ���� ��ȣ�� ���� ���� �߿���
 * 1�� 1��, 2�� 2��, 3�� 3���� ��÷�ϴ� ���α׷��� �ۼ��ϼ���.
 * <���> 1~10000 ������ ���� ��÷�Դϴ�.
 * 1�� ������ : 1749
 * 2�� ����(1) : 2102
 * 2�� ����(2) : 1729
 * 3�� ����(1) : 8734
 * 3�� ����(2) : 51
 * 3�� ����(3) : 7755
 * ���� ���α׷��� �� 6���� ��ȣ�� ������ �մϴ�.
 * 6���� ��ȣ�� ���� �ߺ��Ǵ� ���� ��µǸ� �� �˴ϴ�.
 * Random Ŭ���� ����ϱ�.
 * */
public class Ex11_00_12_LotteryEx {
	public static void main(String[] args) {
		
		Random r = new Random();
		r.setSeed(System.currentTimeMillis());
		
		System.out.println("<���> 1~10000 ������ ���� ��÷�Դϴ�.");
		String str [] = { "1�� ������ : ",
				"2�� ����(1) : ",
				"2�� ����(2) : ",
				"3�� ����(1) : ",
				"3�� ����(2) : ",
				"3�� ����(3) : "};
		
		Set set = new HashSet();
		List list = new ArrayList();
						
		int cur;
		int cnt = 0;
		for(int i = 3 ; i >= 1; i--){
			System.out.println(i+"�� ��÷");
			cnt += i;
			while((cur=set.size())!=cnt){
				int num = r.nextInt(10000)+1;
				if(set.contains(r.nextInt(10000)+1))		continue;
				System.out.println(num);				
				set.add(num);
				list.add(0,num);
			}
		}
		System.out.println();
				
		for(int i = 0 ; i < str.length ; i ++)
			System.out.println(str[i] + list.get(i));
	}
}
//<���> 1~10000 ������ ���� ��÷�Դϴ�.
//3�� ��÷
//4054
//1791
//7410
//2�� ��÷
//4580
//1191
//1�� ��÷
//7184
//
//1�� ������ : 7184
//2�� ����(1) : 1191
//2�� ����(2) : 4580
//3�� ����(1) : 7410
//3�� ����(2) : 1791
//3�� ����(3) : 4054

