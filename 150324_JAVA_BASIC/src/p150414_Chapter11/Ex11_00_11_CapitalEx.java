package p150414_Chapter11;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/* 대한민국, 캐나다, 영국, 스위스 , 중국, 미국 등의 수도를 각각 HashMap에 저장하고
 * 원하는  나라를 화면으로 부터 입력받아 해당 나라의 수도를 화면에 출력하는 프로그램 작성하기
 * HashMap 클래스 사용하기
 */
public class Ex11_00_11_CapitalEx {
	public static void main(String[] args) {
		String nation[] = new String[]{"대한민국","캐나다","영국","스위스","중국","미국"};
		String cap [] = new String[]{"서울","오타와","런던","베른","베이징","워싱턴DC"};
		Map map = new HashMap();
		for(int i = 0 ; i < Math.max(nation.length, cap.length); i++)
			map.put(nation[i], cap[i]);
		
		Scanner sc = new Scanner(System.in);
		String input = "";
		do{
			System.out.print("입력해 : ");
			input = sc.nextLine();
			if(map.containsKey(input))
				System.out.println(input + " : " + map.get(input));
			else	System.out.println("등록된나라아님");
		}while(!input.equals("종료"));
		System.out.println("하얗게 불태웠어");
	}
}
//입력해 : 대한민국
//대한민국 : 서울
//입력해 : 캐나다
//캐나다 : 오타와
//입력해 : 미국
//미국 : 워싱턴DC
//입력해 : 종료
//등록된나라아님
//하얗게 불태웠어
