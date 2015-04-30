public class Exercise9_6 {
	public static String fillZero(String src, int length) {
		/*
		 * (1) fillZero�޼��带 �ۼ��Ͻÿ�. 1. src�� ���̰ų� src.length()�� length�� ������ src��
		 * �״�� ��ȯ�Ѵ�. 2. length�� ���� 0���� ���ų� ������ �� ���ڿ�("")�� ��ȯ�Ѵ�. 3. src�� ���̰�
		 * length�� ������ ũ�� src�� length��ŭ �߶� ��ȯ�Ѵ�. 4. ���̰� legnth�� char�迭�� ��������.
		 * 5. 4���� ������ char�迭�� '0'���� ä���. 6. src���� ���ڹ迭�� �̾Ƴ��� 4���� ������ �迭�� �����Ѵ�.
		 * 7. 4���� ������ �迭�� String�� �����ؼ� ��ȯ�Ѵ�.
		 */
		
		if(src == null || src.length() == length) return src;
		else if (length <= 0) return "";
		else if (src.length() > length) return src.substring(0,length);
		else{
			char ch [] = new char [length];
			for(int i = 0 ; i < ch.length ; i ++) ch[i] = '0';
			for(int i = 0 ; i < src.length() ; i++) ch[i+(length-src.length())] = src.charAt(i);
			return new String(ch);
		}
	}

	public static void main(String[] args) {
		String src = "12345";
		System.out.println(fillZero(src, 10));
		System.out.println(fillZero(src, -1));
		System.out.println(fillZero(src, 3));
	}
}