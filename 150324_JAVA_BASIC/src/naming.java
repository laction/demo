/*
 * ������ ����̴� �۸��ϴµ� ���� �����ؼ� ���� Ŀ�õ��� ����Ʈ���� ����� �����ͼ� �¾�� ���̵��� �̸��� �����ֱ⸦ ��û�Ѵ�.

�׵��� �� ���� �̸��� ���� �¾ ���̰� ���� ��⸦ �ٶ���. �̸��� ���� �۾��� ������ �۾��̾ �������� ���ε带 ���� ����̴� ������ ���� �⸷�� �˰����� ��� �ߴ�.

�ܰ�1. �ƹ����� �̸��� ��Ӵ��� �̸��� ���ļ� �ϳ��� ���ο� ���ڿ� S �� �����Ѵ�.
�ܰ�2. �� ���ڿ� S ���� prefix(���ξ�) �� �ǰ� suffix(���̾�) �� �Ǵ� ���ڿ��� ã�´�.

���� �ƹ����� �̸��� ala �̰� ��Ӵ��� �̸��� la �̸� ��ģ ���ڿ� S = alala �̴�. �� ���ڿ����� prefix �� suffix �� ���ÿ� �Ǵ� ���ڿ���

a
ala
alala

�� ������ �����Ѵ�.

���ڿ��� �޾� prefix �� suffix �� ���ÿ� ������ ���ڿ��� ũ�⸦ ���ϴ°� �����̴�.


�� �Էµ����ʹ� �ҹ��ڸ��� �Էµǰ�, ���ڿ��� ���̴� 1 �̻� 400,000 �����̴�.
�� �Էµ����� �� ����� ������������ ����Ѵ�.


ababcababababcabab

2 4 9 18

aaaaa

1 2 3 4 5

 */

public class naming {
	public static void main(String[] args) {
		String fName = "aaaaaa";
		String mName  = "";
				
		String target = fName + mName;
		Fix f = new Fix(target.length());{
			
			for(int i = 1 ; i <= target.length() ; i++ ){
				final int indexOfEnd = target.length()  ;
				String prefix = target.substring(0,i);
				String suffix = target.substring(indexOfEnd-i,indexOfEnd);
				//				System.out.println( prefix.equals(suffix)+ " \t" + prefix + "   "+suffix );
				if(prefix.equals(suffix))		f.push(prefix); 
			}			
		}
		System.out.println("--------");
		f.view();		
	}
	
	public static class Fix{		// �信 �ش��ϴ� ������ ��.
		String [] e;			// element
		int cnt;				// count of element
		Fix(int maxCountOfStrings){
			e = new String[maxCountOfStrings];
			cnt = 0 ;
		}
		void push(String str){
			e[cnt++] = str;
		}
		void view(){
			for(int i = 0 ; i <cnt ; i++){
				System.out.print( e[i] + "\t" );
			}
			System.out.println();
			for(int i = 0 ; i <cnt ; i++){
				System.out.print( e[i].length() + "\t");
			}
		}
	}
}
