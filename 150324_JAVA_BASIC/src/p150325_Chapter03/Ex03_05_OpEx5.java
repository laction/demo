package p150325_Chapter03;

// ���������� ���� : ++(1�� ����)
// ������ : ++x;
// ������ : x++; // ������ �켱������ ���� ����.

public class Ex03_05_OpEx5 {

	public static void main(String[] args) {
		
			int x = 0;
			
			x++;			System.out.println("x="+x);
			x--;				System.out.println("x="+x);	
			
			++x;			System.out.println("x="+x);
			--x;				System.out.println("x="+x);
			
			System.out.println("x="+ x++);
			System.out.println("x="+ x--);
			System.out.println("x="+ ++x);
			System.out.println("x="+ --x);
	}
}
//<CONSOL>
//10 / 8 =1
//10 % 8 =2

 