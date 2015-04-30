/*
 * 깜직한 고양이는 작명하는데 아주 유명해서 많은 커플들이 바이트랜드 나라로 몰려와서 태어나는 아이들의 이름을 지어주기를 요청한다.

그들은 잘 지은 이름을 통해 태어난 아이가 명성을 얻기를 바란다. 이름을 짓는 작업은 따분한 작업이어서 혁신적인 마인드를 가진 고양이는 쉽지만 아주 기막힌 알고리즘을 고안 했다.

단계1. 아버지의 이름과 어머니의 이름을 합쳐서 하나의 새로운 문자열 S 를 생성한다.
단계2. 이 문자열 S 에서 prefix(접두어) 도 되고 suffix(접미어) 도 되는 문자열을 찾는다.

예로 아버지의 이름이 ala 이고 어머니의 이름이 la 이면 합친 문자열 S = alala 이다. 이 문자열에서 prefix 와 suffix 가 동시에 되는 문자열은

a
ala
alala

세 가지가 존재한다.

문자열을 받아 prefix 와 suffix 가 동시에 가능한 문자열을 크기를 구하는게 문제이다.


각 입력데이터는 소문자만이 입력되고, 문자열의 길이는 1 이상 400,000 이하이다.
각 입력데이터 당 출력은 오름차순으로 출력한다.


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
	
	public static class Fix{		// 답에 해당하는 종류와 값.
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
