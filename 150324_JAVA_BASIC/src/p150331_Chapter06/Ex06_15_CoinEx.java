package p150331_Chapter06;
/* 1.������ ǥ���ϴ� Coin Ŭ������ �����ϰ� �����϶�.
 * ������ ������ �� �ְ�, �ո��̳� �޸��� �����ش�.
 * ���� : side
 * �޼��� : flip()
 * 		��� : ������ ���� ������ ���� �����Ѵ�.
 * ��ü ������ ������ ���� �Է��ؾ� �Ѵ�.
 * ������ ���� �Էµ��� ���� ��� �ո����� ���Ѵ�.
*/
class Coin{
	private boolean side;
	Coin(){side = true;}
	Coin(boolean side ){		this.side = side;	}
	Coin(String str){	if(str.equals("��"))  side= true ; else if(str.equals("��"))  side = false ;	}
	boolean getSide(){return side;}
	Coin flip(){		side = (	Math.random() >= 0.5	) ? true : false;		return this;	}
	Coin view(){		System.out.print( (side)?"��":"��" );		return this;	}
}
/* 2. ����Ŭ���� CoinEx�� �ۼ��϶�.
* �� Ŭ������ main �޼ҵ忡�� �ΰ��� ������ ���� ���� ���� ���¸� ����϶�
*/
public class Ex06_15_CoinEx {
	public static void main(String[] args) {
		//coin.view();
		new Coin().view();
		new Coin("��").view();
		new Coin(false).view();
		System.out.println();
		for(	int i = 0 ; i < 4 ; i++ ){
			new Coin().flip().view();
			new Coin().flip().view();
			System.out.println();
		}
	}
}
//�յڵ�
//�վ�
//�յ�
//�ڵ�
//�ھ�
