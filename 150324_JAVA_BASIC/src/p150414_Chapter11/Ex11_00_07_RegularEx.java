package p150414_Chapter11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* 정규식 예제 : 문자의 형식 지정 식
 * */
public class Ex11_00_07_RegularEx {
	public static void main(String[] args) {
		String[] data= {"bat","baby","bonus","cA","ca","co","c.","c0","car","combat","count","data","disk"};
		Pattern p = Pattern.compile("c[a-z]*");	// c로 시작하며 알파벳 소문자인 패턴이 0개 이상인 패턴.
		for(int i = 0 ; i < data.length ; i++){
			Matcher m = p.matcher(data[i]);		// 패턴에 매치되는 값을 넘김. 
			if(m.matches())
				System.out.print(data[i] + ",");
		}
		System.out.println();
		String source = "HP:011-1111-1111, HOME:02-999-9999 ";
		// \\d : 10진 정수값.
		// {1,2} : 숫자가 1개 또는 2개
		String patturn = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		p = Pattern.compile(patturn);
		Matcher m = p.matcher(source);
		int i = 0;
		while(m.find()){			// Matcher.fine() : 패턴에 맞는 String을 찾는다.
			System.out.println(++i + ":" + m.group() 	// 패턴에 맞는 값을 group()으로 리턴한다.
												+ "->" + m.group(1) + ", "
												+ m.group(2) + "," + m.group(3)
			);
		}
		String str = "홍길동 , 김삿갓, 이몽룡, 임꺽정 , 장길산";
		String [] tokens = str.split("\\s*");
		for(String s : tokens)
			System.out.println(s + "***");
	}
}
//ca,co,car,combat,count,
//1:011-1111-1111->011, 1111,1111
//2:02-999-9999->02, 999,9999
//홍***
//길***
//동***
//***
//,***
//***
//김***
//삿***
//갓***
//,***
//***
//이***
//몽***
//룡***
//,***
//***
//임***
//꺽***
//정***
//***
//,***
//***
//장***
//길***
//산***
