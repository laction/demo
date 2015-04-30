package p150413_Chapter11;

import java.util.ArrayList;
import java.util.List;

/* [1]. 섯다카드 20장을 포함하는 섯다카드 한벌 (SutdaDeck클래스) 을  정의한 것이다.
 *  섯다카드 20장을 담는 SutdaCard List을 초기화하시오.
 *  단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
 *  숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다.
 *  즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true이어야 한다.
 * */
/* [2]. 다음 메서드를 추가하라.
 * 1. 메서드명 : shuffle
 * 		기능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.
 * 			(Collections.shuffle(list) 사용)
 * 			반환타입 : 없음
 * 			매개변수 : 없음
 * 2. 메서드명 : pick
 * 		기능 : List cards 에서 지정된 위치의 SutdaCard를 반환한다.
 * 			반환타입 : SutdaCard
 * 			매개변수 : int index - 위치
 * 3. 메서드명 : pick
 * 		기능 : List cards에서 임의의 위치의 SutdaCard를 반환한다. ( Math.random() 사용 )
 * 			반환타입 : SutdaCard
 * 			매개변수 : 없음
 * 4. 메서드명 : print
 * 		기능 : list의 SutdaCard를 출력한다.
 * 			반환타입 : void
 * 			매개변수 : 없음
 *  */
public class Ex11_00_02_SutdaCardEx {
	
	public static void main(String[] args) {
		SutdaDeck sd = new SutdaDeck();
		sd.shuffle();		System.out.println(sd);	
		for(int i = 0 ; i < sd.CARD_NUM ; i ++)
			System.out.print(sd.pick()+"  ");
		System.out.println();
		for(int i = 0 ; i < sd.CARD_NUM ; i ++)
			System.out.print(sd.pick(i)+"  ");
		System.out.println();
		
	}
	
	static class SutdaDeck{
		final int CARD_NUM = 20;
		List<SutdaCard> cards = new ArrayList<SutdaCard> ();		
		SutdaDeck(){
			for(int i = 1 ; i <= CARD_NUM/2 ; i ++){
				cards.add(new SutdaCard(i,false));
				cards.add(new SutdaCard(i,(i==1 || i==3 || i==8)));
			}
		}
		@Override	public String toString() {			return cards.toString();		}
		void shuffle(){
			for(int i = 0 ; i < CARD_NUM ; i ++){ 
				int idx = ((int) (Math.random() * (CARD_NUM- i)));
				cards.add( cards.get(idx) );
				cards.remove(idx);
			}
		}
		SutdaCard pick(int index){			return cards.get(index);		}
		SutdaCard pick(){							return cards.get(  (int)(Math.random() * cards.size())  ) ;		}
		void print(){		System.out.println(this.toString());	}
		
		static class SutdaCard{
			final int num;
			final boolean isKwang;
			SutdaCard(){ this(1,true);}
			SutdaCard(int num, boolean isKwang){
				this.num = num;
				this.isKwang = isKwang;
			}
			public String toString(){
				return num + (isKwang ? "K" : "");
			}
		}
	}	
}
//[6, 7, 1K, 10, 10, 4, 1, 7, 8K, 5, 9, 6, 8, 2, 3, 9, 4, 5, 2, 3K]
//10  4  2  7  2  1  1  10  1  8K  5  6  9  8  1  4  7  5  4  3K  
//6  7  1K  10  10  4  1  7  8K  5  9  6  8  2  3  9  4  5  2  3K  

