package p150401_Chapter07;
public class Ex07_06_SutdaCard {
	/*섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다.
	 * 섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
	 * 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한쌍씩 있고,
	 * 숫자가 1,3,8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다.
	 * 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
	 * 
	 * 메서드명	: shuffle
	 * 	기능		: 배열 cards에 담긴 카드의 위치를 뒤섞는다.
	 * 					(Math.random() 사용)
	 * 반환타임	: 없음
	 * 매개변수	: 없음
	 */
	public static class SutdaDeck{
		final int CARD_NUM = 20;
		
		int cardCnt = CARD_NUM;		
		SutdaCard[] cards = new SutdaCard[CARD_NUM];
		
		public SutdaDeck(){
			for(int i  = 0; i < cards.length/2 ; i++){
				cards[2*i] = new SutdaCard( i+1,false);				
			}
			for(int i  = 0; i < cards.length/2 ; i++){
				cards[2*i+1] = new SutdaCard( i+1,( i+1==1 || i+1 == 3 || i+1 == 8)? true : false);				
			}
		}
		public void Suffle(){
			for(int i = 0 ; i < 1000 + (int)(8000.0*Math.random()) ; i++){
				int idx = 1+(int)(Math.random()*(double)(cards.length-1));
				SutdaCard temp = cards[0];
				cards[0] = cards[idx];
				cards[idx] = temp;
			}
		}
		public boolean giveToPlayer(Player player){
			if(player.isCardEmpty()){				
				for(int i = 0 ; i < player.card.length ; i ++){					
					int idx = (int) (  Math.random() * ((double)cardCnt)   ) ;		// 임의의 카드를				
					player.card[ i ] = cards[idx];									// 플레이어에게 주고					
					if( idx == cardCnt - 1 ) cards[idx] = null;			// 줘버린 카드는 덱이 잊어버린다.
					else {	
						cards [ idx ] = cards[cardCnt-1];
						cards[cardCnt-1] = null;
					}
					cardCnt -- ;				// 카드의 총 개수 감소
				}								// 줘야될 카드 수만 큼				
				return true;
			}
			else return false;
		}
		public boolean takeFromPlayer(Player player){
			if(player.isCardEmpty())
				return false;
			else{			// 카드가 있으면
				for(int i = 0 ; i < player.card.length ; i ++){
												// 카드를 덱에 추가하고
					cards[cardCnt] = player.card[i];
					cardCnt ++ ;
												// 플레이어가 카드를 잊어버리게 한다.
					player.card[i] = null;
				}		// 플레이어의 카드 개수 만큼
				return true;
			}
		}
		public void view(){
			for ( int i = 0 ; i < cardCnt ; i++ )
				System.out.print(cards[i]+ ",");
			System.out.println();
		}	
//		private public WinningCondition(int card1, int card2){
//			
//		}
		public static int Winner(Player [] players){			
			int [] p = new int[5];			
			
			// 쎄륙(4,6)
			//장사(10,4) - 
			//장삥(10,1) - 
			//구삥(9,1) - 
			// 세삥(4,1) - 
			// 알리 (2,1)
			// 땡 : 일땡~ 장땡 
			// 광땡 : 1,3 - 1,8 - 3,8
			
			
			
			return 0;			
		}
	}
	public static class SutdaCard{
		int num;
		boolean isKwang;
		SutdaCard(){
			this(1,true);
		}
		public SutdaCard(int num, boolean isKwang){
			this.num = num;
			this.isKwang = isKwang;
		}
		public String toString(){
			return num + (isKwang ? "K" : "");
		}
	}
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for (int i =0; i < deck.cards.length ; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		deck.Suffle();
		for (int i =0; i < deck.cards.length ; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		
		System.out.println("=== test ====");
		
		Player p1 = new Player(),p2= new Player();		
		for(int i = 0 ; i<3 ; i ++){
			System.out.println(i+1+"번째 게임입니다.");
			
			deck.view();
			
			p1.pickTwoSutdaCard(deck);		
			System.out.println( "p1 : " + p1.CardStatus());
		
			p2.pickTwoSutdaCard(deck);
			System.out.println("p2 : " + p2.CardStatus());
			
			deck.view();
						
			p1.drawCardToDeck(deck);			
			p2.drawCardToDeck(deck);			
		}			
		System.out.println("=== Game ====");
	}	
	public static class Player{
		SutdaCard [] card = new SutdaCard[]{null,null};
		boolean isCardEmpty(){
			for(Object o : card) if(o!=null)	return false;
			return true;
		}
		void pickTwoSutdaCard(SutdaDeck deck){
			deck.giveToPlayer(this);
		}
		void drawCardToDeck(SutdaDeck deck){
			deck.takeFromPlayer(this);
		}
		public String CardStatus(){
			String res = "";
			for(int i = 0 ; i < card.length ; i++){
				res += (card[i]==null)  ?  "" : card[i].toString() + "\t";				
			}
			return res;
		}
	}
}
//1,1K,2,2,3,3K,4,4,5,5,6,6,7,7,8,8K,9,9,10,10,
//3K,6,7,1,6,5,9,10,4,2,5,7,1K,2,8K,8,9,3,10,4,
//=== test ====
//1번째 게임입니다.
//3K,6,7,1,6,5,9,10,4,2,5,7,1K,2,8K,8,9,3,10,4,
//p1 : 6	8K	
//p2 : 1K	2	
//3K,4,7,1,6,5,9,10,4,2,5,7,3,9,10,8,
//2번째 게임입니다.
//3K,4,7,1,6,5,9,10,4,2,5,7,3,9,10,8,6,8K,1K,2,
//p1 : 10	7	
//p2 : 8K	1K	
//3K,4,7,1,6,5,9,10,4,2,5,6,3,9,2,8,
//3번째 게임입니다.
//3K,4,7,1,6,5,9,10,4,2,5,6,3,9,2,8,10,7,8K,1K,
//p1 : 5	8K	
//p2 : 10	6	
//3K,4,7,1,10,1K,9,7,4,2,5,6,3,9,2,8,
//=== Game ====

