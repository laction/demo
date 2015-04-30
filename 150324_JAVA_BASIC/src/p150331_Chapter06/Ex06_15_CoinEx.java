package p150331_Chapter06;
/* 1.동전을 표현하는 Coin 클래스를 설계하고 구현하라.
 * 동전은 던져질 수 있고, 앞면이나 뒷면을 보여준다.
 * 변수 : side
 * 메서드 : flip()
 * 		기능 : 동전을 던져 동전을 면을 변경한다.
 * 객체 생성시 동전의 면을 입력해야 한다.
 * 동전의 면이 입력되지 않은 경우 앞면으로 정한다.
*/
class Coin{
	private boolean side;
	Coin(){side = true;}
	Coin(boolean side ){		this.side = side;	}
	Coin(String str){	if(str.equals("앞"))  side= true ; else if(str.equals("뒤"))  side = false ;	}
	boolean getSide(){return side;}
	Coin flip(){		side = (	Math.random() >= 0.5	) ? true : false;		return this;	}
	Coin view(){		System.out.print( (side)?"앞":"뒤" );		return this;	}
}
/* 2. 구동클래스 CoinEx를 작성하라.
* 이 클래스의 main 메소드에서 두개의 동전을 던져 던진 후의 상태를 출력하라
*/
public class Ex06_15_CoinEx {
	public static void main(String[] args) {
		//coin.view();
		new Coin().view();
		new Coin("뒤").view();
		new Coin(false).view();
		System.out.println();
		for(	int i = 0 ; i < 4 ; i++ ){
			new Coin().flip().view();
			new Coin().flip().view();
			System.out.println();
		}
	}
}
//앞뒤뒤
//앞앞
//앞뒤
//뒤뒤
//뒤앞
