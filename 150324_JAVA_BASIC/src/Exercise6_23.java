//�޼���� : max
//�� �� : �־��� int�� �迭�� �� �߿��� ���� ū ���� ��ȯ�Ѵ� 
//			���� �־��� �迭�� null�̰ų� ũ�Ⱑ 0�� ���  -999999�� ��ȯ�Ѵ� 
//��ȯŸ�� : int
//�Ű����� �ִ밪�� ���� �迭

public class Exercise6_23 {
	static int max(int [] data){
		if(data==null || data.length == 0) return -999999;
		int curMax = 0;		
		for(int i : data) curMax = (curMax<i)?(i):(curMax);
		return curMax;
	}
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("�ִ밪 :" + max(data));
		System.out.println("�ִ밪 :" + max((int[])null)); 
		System.out.println("�ִ밪 :" + max(new int[] {})); // 0ũ�Ⱑ �� �迭
		
	}	
}
