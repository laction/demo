package p150414_Chapter11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;


/* 1~10000번 까지 번호를 갖는 복권 중에서
 * 1등 1장, 2등 2장, 3등 3장을 추첨하는 프로그램을 작성하세요.
 * <결과> 1~10000 사이의 복권 추첨입니다.
 * 1등 복권은 : 1749
 * 2등 복권(1) : 2102
 * 2등 복권(2) : 1729
 * 3등 복권(1) : 8734
 * 3등 복권(2) : 51
 * 3등 복권(3) : 7755
 * 복권 프로그램은 총 6장의 번호를 출력햐아 합니다.
 * 6장의 번호는 서로 중복되는 수가 출력되면 안 됩니다.
 * Random 클래스 사용하기.
 * */
public class Ex11_00_12_LotteryEx {
	public static void main(String[] args) {
		
		Random r = new Random();
		r.setSeed(System.currentTimeMillis());
		
		System.out.println("<결과> 1~10000 사이의 복권 추첨입니다.");
		String str [] = { "1등 복권은 : ",
				"2등 복권(1) : ",
				"2등 복권(2) : ",
				"3등 복권(1) : ",
				"3등 복권(2) : ",
				"3등 복권(3) : "};
		
		Set set = new HashSet();
		List list = new ArrayList();
						
		int cur;
		int cnt = 0;
		for(int i = 3 ; i >= 1; i--){
			System.out.println(i+"등 추첨");
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
//<결과> 1~10000 사이의 복권 추첨입니다.
//3등 추첨
//4054
//1791
//7410
//2등 추첨
//4580
//1191
//1등 추첨
//7184
//
//1등 복권은 : 7184
//2등 복권(1) : 1191
//2등 복권(2) : 4580
//3등 복권(1) : 7410
//3등 복권(2) : 1791
//3등 복권(3) : 4054

