

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class DicePlayEx {
	/* 구동클래스 (DicePlayEx) 를 작성하라.
	 *  주사위의 값의 합이 큰 사람이 승리한다.
	 *  승리한 사람의 승점을 증가 시킨다.
	 *  게임 계속 여부를 물어본다.
	 *  아니오라는 문자가 입력되면, 
	 *  두 게임자의 승점을 출력한 후 
	 *  프로그램을 종료한다.
	 *  
	 *  결과] 게임을 계속하시겠습니까? (예 혹은 아니오) : 아니오
	 *   홍길동 : 김삿갓 => 5 : 4 홍길동 승리!
	 *   프로그램 종료
	 *  */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Player p[] = new Player [2];
		PairOfDice pod = new PairOfDice();
		
		p[0] = new Player("이혁종",25,pod);
		p[1] = new Player("김준영",26,pod);
		
		System.out.println(
				p[0].getName() + "(" + p[0].getAge() + ")" 
							+ " vs " + 
				p[1].getName() + "(" + p[1].getAge() + ")"
		);
		
		boolean isGameRun = true;
		do{
			int sum[] = new int [2];
			
			for(int i = 0 ; i<   p.length   ; i++){
				Player player = p[i%2];
				
				player.play();
				sum[i] = pod.getDiceValue1()+pod.getDiceValue2();
			}
			System.out.print(sum[0]+ " : "+sum[1] + "\t\t" );
			
			Player winner ;
					if(sum[0]>sum[1]) winner = p[0];
			else if(sum[1]>sum[0]) winner = p[1];
			else 									winner=null;
				
			if(winner!=null){
				winner.winTotal++;
				System.out.println(winner.getName()+"님 승점 1점 획득 " + p[0].winTotal +"  :  " +p[1].winTotal);
			}else{
				System.out.println("무승부임.");
			}
			
			while(true){
				System.out.print( "결과] 게임을 계속하시겠습니까? (예 혹은 아니오) : ");				
				String req	= new String(sc.next());
							
						if(req.trim().equals("예")) 		isGameRun = true;
				else if(req.trim().equals("아니오")) isGameRun = false;
				else {
					System.out.println("제대로 입력해주세요.");
					continue;
				}
				break;
			}
			 
		}while(isGameRun);
		
		if(p[0].winTotal>p[1].winTotal)				System.out.println(p[0].getName() + "님 승리!!");
		else if(p[0].winTotal<p[1].winTotal)		System.out.println(p[1].getName() + "님 승리!!");
		else																	System.out.println("비겼네요 헝헝");
		
	}
	
	/* 두개의 주사위(PairOfDice) 정보를 표현하는 클래스를 작성하라.
	 * 멤버변수로는 두개의 주사위값을 가진다.
	 * diceValue1, DiceValue2
	 * 멤버메서드 : 
	 * 	void roll()
	 * 		기능 : 각각의 주사위를 던져서 주사위의 값을 변경한다
	 * 	int getDiceValue1()
	 * 		기능 : 첫번째 주사위 값을 조회한다
	 * 	int getDiceValue2()
	 * 		기능 : 두번째 주사위 값을 조회한다.
	 * */	
	public static class PairOfDice{
		int diceValue1,diceValue2;
		
		public PairOfDice() {
			roll();
		}
		
		public void roll(){
			this.diceValue1 = 1+(int)(6.0*Math.random());
			this.diceValue2 = 1+(int)(6.0*Math.random());
		}

		public int getDiceValue1() {		return diceValue1;		}
		public int getDiceValue2() {		return diceValue2;		}		
	}
	
	/* 주사위 게임 선수(Player)를 표현하는 클래스를 구현하시오
	 * Player 클래스는 Person 클래스를 상속받고 Playable 인터페이스를 구현해야 한다.
	 * 	멤버 변수 : 승점(wintotal)
	 * Playeable 인터페이스는 play(PairOfDice) 메서드를 멤버로 갖는다.
	 * */
	
	public static class Player extends Person implements Playable{
		private PairOfDice pod;
		public int winTotal;
		public Player(String name, int age,PairOfDice pod) {			
			super(name,age);
			this.winTotal = 0;
			this.pod = pod;
		}
		@Override		public void play() {
			this.pod.roll();			
		}
	}
	
	public static interface Playable{
		void play();
	}
	 
	
	/* 사람(Person)을 표현하는 클래스를 구현하시오.
	 * 	멤버변수 : 이름, 나이
	 * 	생성자 : 1. 이름을 입력받아 객체를 생성
	 * 					2. 나이를 입력받아 객체를 생성
	 * 					3. 이름과 나이를 입력받아 객체를 생성
	 * 	메서드 : 멤버변수의 getter, setter를 작성하시오
	 */
	
	public static class Person{
		private String name;
		private int age;		
				
		public Person(String name){						this.name=name;		}
		public Person(int age){									this.age=age;		}
		public Person(String name,int age){			this.name=name;	this.age=age;		}
		
		public String getName() {								return name;		}
		public void setName(String name) {				this.name = name;		}
		public int getAge() {										return age;		}
		public void setAge(int age) {							this.age = age;		}
		
		}
}
