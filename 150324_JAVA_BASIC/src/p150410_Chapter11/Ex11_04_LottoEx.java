package p150410_Chapter11;

import java.util.Set;
import java.util.TreeSet;

/* Set의 중복불가의 특징을 이용하여 로또번호 생성기 프로그램
 * TreeSet : 정렬된 set 객체를 얻기
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
