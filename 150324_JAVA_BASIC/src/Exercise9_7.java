public class Exercise9_7 {
	/*
	 * (1) contains�޼��带 �ۼ��Ͻÿ�.
	 */
	static boolean contains(String src, String target){
		return src.contains(target);	
	}
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}
}