package p150408_Chapter09;

public class Ex09_12_WrapperEx2 {
	public static void main(String[] args) {
		char [] data = {'A','a','4','#',' '};
		for(int i = 0 ; i < data.length ; i++){
			System.out.print(data[i] + " �� ");
			if(Character.isUpperCase(data[i]))				System.out.println("�빮��");			
			else if(Character.isLowerCase(data[i]))		System.out.println("�ҹ���");
			else if(Character.isSpaceChar(data[i]))		System.out.println("����");
			else if(Character.isDigit(data[i]))					System.out.println("����");
																		else				System.out.println("�Ϲݹ���");		
		}
		double d= 10.3/3;
		System.out.println("���ڰ� �ƴϴ�? "+Double.isNaN(d));
		System.out.println("���Ѵ�� ? " + Double.isInfinite(1/0.0));
		
		//	JDK 5.0 ���Ŀ� �߰��� �޼���
		int is = Integer.valueOf("100",8);
		System.out.println(is);
		double ds = Double.valueOf("3.654");
		System.out.println(ds);
	}
}
//A �� �빮��
//a �� �ҹ���
//4 �� ����
//# �� �Ϲݹ���
//  �� ����
//���ڰ� �ƴϴ�? false
//���Ѵ�� ? true
//64
//3.654
