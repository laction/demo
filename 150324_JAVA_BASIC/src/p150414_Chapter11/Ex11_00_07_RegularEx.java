package p150414_Chapter11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* ���Խ� ���� : ������ ���� ���� ��
 * */
public class Ex11_00_07_RegularEx {
	public static void main(String[] args) {
		String[] data= {"bat","baby","bonus","cA","ca","co","c.","c0","car","combat","count","data","disk"};
		Pattern p = Pattern.compile("c[a-z]*");	// c�� �����ϸ� ���ĺ� �ҹ����� ������ 0�� �̻��� ����.
		for(int i = 0 ; i < data.length ; i++){
			Matcher m = p.matcher(data[i]);		// ���Ͽ� ��ġ�Ǵ� ���� �ѱ�. 
			if(m.matches())
				System.out.print(data[i] + ",");
		}
		System.out.println();
		String source = "HP:011-1111-1111, HOME:02-999-9999 ";
		// \\d : 10�� ������.
		// {1,2} : ���ڰ� 1�� �Ǵ� 2��
		String patturn = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
		p = Pattern.compile(patturn);
		Matcher m = p.matcher(source);
		int i = 0;
		while(m.find()){			// Matcher.fine() : ���Ͽ� �´� String�� ã�´�.
			System.out.println(++i + ":" + m.group() 	// ���Ͽ� �´� ���� group()���� �����Ѵ�.
												+ "->" + m.group(1) + ", "
												+ m.group(2) + "," + m.group(3)
			);
		}
		String str = "ȫ�浿 , ���, �̸���, �Ӳ��� , ����";
		String [] tokens = str.split("\\s*");
		for(String s : tokens)
			System.out.println(s + "***");
	}
}
//ca,co,car,combat,count,
//1:011-1111-1111->011, 1111,1111
//2:02-999-9999->02, 999,9999
//ȫ***
//��***
//��***
//***
//,***
//***
//��***
//��***
//��***
//,***
//***
//��***
//��***
//��***
//,***
//***
//��***
//��***
//��***
//***
//,***
//***
//��***
//��***
//��***
