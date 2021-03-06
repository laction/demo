//메서드명 : max
//기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다 
//			만일 주어진 배열이 null이거나 크기가 0인 경우  -999999를 반환한다 
//반환타입 : int
//매개변수 최대값을 구할 배열

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
		System.out.println("최대값 :" + max(data));
		System.out.println("최대값 :" + max((int[])null)); 
		System.out.println("최대값 :" + max(new int[] {})); // 0크기가 인 배열
		
	}	
}
