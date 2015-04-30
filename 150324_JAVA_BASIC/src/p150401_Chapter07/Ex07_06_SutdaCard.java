package p150401_Chapter07;
public class Ex07_06_SutdaCard {
	/*����ī�� 20���� �����ϴ� ����ī�� �� ��(SutdaDeckŬ����)�� ������ ���̴�.
	 * ����ī�� 20���� ��� SutdaCard�迭�� �ʱ�ȭ�Ͻÿ�.
	 * ��, ����ī��� 1���� 10������ ���ڰ� ���� ī�尡 �ѽ־� �ְ�,
	 * ���ڰ� 1,3,8�� ��쿡�� �� ���� �� ���� ��(Kwang)�̾�� �Ѵ�.
	 * ��, SutdaCard�� �ν��Ͻ����� isKwang�� ���� true�̾�� �Ѵ�.
	 * 
	 * �޼����	: shuffle
	 * 	���		: �迭 cards�� ��� ī���� ��ġ�� �ڼ��´�.
	 * 					(Math.random() ���)
	 * ��ȯŸ��	: ����
	 * �Ű�����	: ����
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
					int idx = (int) (  Math.random() * ((double)cardCnt)   ) ;		// ������ ī�带				
					player.card[ i ] = cards[idx];									// �÷��̾�� �ְ�					
					if( idx == cardCnt - 1 ) cards[idx] = null;			// ����� ī��� ���� �ؾ������.
					else {	
						cards [ idx ] = cards[cardCnt-1];
						cards[cardCnt-1] = null;
					}
					cardCnt -- ;				// ī���� �� ���� ����
				}								// ��ߵ� ī�� ���� ŭ				
				return true;
			}
			else return false;
		}
		public boolean takeFromPlayer(Player player){
			if(player.isCardEmpty())
				return false;
			else{			// ī�尡 ������
				for(int i = 0 ; i < player.card.length ; i ++){
												// ī�带 ���� �߰��ϰ�
					cards[cardCnt] = player.card[i];
					cardCnt ++ ;
												// �÷��̾ ī�带 �ؾ������ �Ѵ�.
					player.card[i] = null;
				}		// �÷��̾��� ī�� ���� ��ŭ
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
			
			// ���(4,6)
			//���(10,4) - 
			//���(10,1) - 
			//����(9,1) - 
			// ����(4,1) - 
			// �˸� (2,1)
			// �� : �϶�~ �嶯 
			// ���� : 1,3 - 1,8 - 3,8
			
			
			
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
			System.out.println(i+1+"��° �����Դϴ�.");
			
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
//1��° �����Դϴ�.
//3K,6,7,1,6,5,9,10,4,2,5,7,1K,2,8K,8,9,3,10,4,
//p1 : 6	8K	
//p2 : 1K	2	
//3K,4,7,1,6,5,9,10,4,2,5,7,3,9,10,8,
//2��° �����Դϴ�.
//3K,4,7,1,6,5,9,10,4,2,5,7,3,9,10,8,6,8K,1K,2,
//p1 : 10	7	
//p2 : 8K	1K	
//3K,4,7,1,6,5,9,10,4,2,5,6,3,9,2,8,
//3��° �����Դϴ�.
//3K,4,7,1,6,5,9,10,4,2,5,6,3,9,2,8,10,7,8K,1K,
//p1 : 5	8K	
//p2 : 10	6	
//3K,4,7,1,10,1K,9,7,4,2,5,6,3,9,2,8,
//=== Game ====

