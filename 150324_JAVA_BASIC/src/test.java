public class test {
public static void main(String[] args) {
	
	{
		char ch = 'z';
		boolean b = ( ( 'a' <= ch && ch <= 'z'
								||	'A' <= ch && ch <= 'Z'
								||	'0' <= ch && ch <= '9'
				) );
		System.out.println(b);
	}
	
	{		System.out.println(((double)1/3));
	System.out.println(((float)1/3));
	}
	
	
	{ double F = 100;
		double C = 5.0/9 * (F-32);
		double out = ((int)(C*100+0.5))/100.0  ;
		System.out.println(C);
		System.out.println(out);
	}
	
	{ int num = 17;
	System.out.println(10 - num%10);
	}
	
	{int num = 545;
	System.out.println((int)(num/100)*100);}
	
}
}
