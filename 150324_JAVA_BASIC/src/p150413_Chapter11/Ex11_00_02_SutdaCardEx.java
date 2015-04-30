package p150413_Chapter11;

import java.util.ArrayList;
import java.util.List;

/* [1]. ����ī�� 20���� �����ϴ� ����ī�� �ѹ� (SutdaDeckŬ����) ��  ������ ���̴�.
 *  ����ī�� 20���� ��� SutdaCard List�� �ʱ�ȭ�Ͻÿ�.
 *  ��, ����ī��� 1���� 10������ ���ڰ� ���� ī�尡 �� �־� �ְ�,
 *  ���ڰ� 1, 3, 8�� ��쿡�� �� ���� �� ���� ��(Kwang)�̾�� �Ѵ�.
 *  ��, SutdaCard�� �ν��Ͻ� ���� isKwang�� ���� true�̾�� �Ѵ�.
 * */
/* [2]. ���� �޼��带 �߰��϶�.
 * 1. �޼���� : shuffle
 * 		��� : �迭 cards�� ��� ī���� ��ġ�� �ڼ��´�.
 * 			(Collections.shuffle(list) ���)
 * 			��ȯŸ�� : ����
 * 			�Ű����� : ����
 * 2. �޼���� : pick
 * 		��� : List cards ���� ������ ��ġ�� SutdaCard�� ��ȯ�Ѵ�.
 * 			��ȯŸ�� : SutdaCard
 * 			�Ű����� : int index - ��ġ
 * 3. �޼���� : pick
 * 		��� : List cards���� ������ ��ġ�� SutdaCard�� ��ȯ�Ѵ�. ( Math.random() ��� )
 * 			��ȯŸ�� : SutdaCard
 * 			�Ű����� : ����
 * 4. �޼���� : print
 * 		��� : list�� SutdaCard�� ����Ѵ�.
 * 			��ȯŸ�� : void
 * 			�Ű����� : ����
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

