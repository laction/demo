

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;


public class DicePlayEx {
	/* ����Ŭ���� (DicePlayEx) �� �ۼ��϶�.
	 *  �ֻ����� ���� ���� ū ����� �¸��Ѵ�.
	 *  �¸��� ����� ������ ���� ��Ų��.
	 *  ���� ��� ���θ� �����.
	 *  �ƴϿ���� ���ڰ� �ԷµǸ�, 
	 *  �� �������� ������ ����� �� 
	 *  ���α׷��� �����Ѵ�.
	 *  
	 *  ���] ������ ����Ͻðڽ��ϱ�? (�� Ȥ�� �ƴϿ�) : �ƴϿ�
	 *   ȫ�浿 : ��� => 5 : 4 ȫ�浿 �¸�!
	 *   ���α׷� ����
	 *  */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Player p[] = new Player [2];
		PairOfDice pod = new PairOfDice();
		
		p[0] = new Player("������",25,pod);
		p[1] = new Player("���ؿ�",26,pod);
		
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
				System.out.println(winner.getName()+"�� ���� 1�� ȹ�� " + p[0].winTotal +"  :  " +p[1].winTotal);
			}else{
				System.out.println("���º���.");
			}
			
			while(true){
				System.out.print( "���] ������ ����Ͻðڽ��ϱ�? (�� Ȥ�� �ƴϿ�) : ");				
				String req	= new String(sc.next());
							
						if(req.trim().equals("��")) 		isGameRun = true;
				else if(req.trim().equals("�ƴϿ�")) isGameRun = false;
				else {
					System.out.println("����� �Է����ּ���.");
					continue;
				}
				break;
			}
			 
		}while(isGameRun);
		
		if(p[0].winTotal>p[1].winTotal)				System.out.println(p[0].getName() + "�� �¸�!!");
		else if(p[0].winTotal<p[1].winTotal)		System.out.println(p[1].getName() + "�� �¸�!!");
		else																	System.out.println("���׿� ����");
		
	}
	
	/* �ΰ��� �ֻ���(PairOfDice) ������ ǥ���ϴ� Ŭ������ �ۼ��϶�.
	 * ��������δ� �ΰ��� �ֻ������� ������.
	 * diceValue1, DiceValue2
	 * ����޼��� : 
	 * 	void roll()
	 * 		��� : ������ �ֻ����� ������ �ֻ����� ���� �����Ѵ�
	 * 	int getDiceValue1()
	 * 		��� : ù��° �ֻ��� ���� ��ȸ�Ѵ�
	 * 	int getDiceValue2()
	 * 		��� : �ι�° �ֻ��� ���� ��ȸ�Ѵ�.
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
	
	/* �ֻ��� ���� ����(Player)�� ǥ���ϴ� Ŭ������ �����Ͻÿ�
	 * Player Ŭ������ Person Ŭ������ ��ӹް� Playable �������̽��� �����ؾ� �Ѵ�.
	 * 	��� ���� : ����(wintotal)
	 * Playeable �������̽��� play(PairOfDice) �޼��带 ����� ���´�.
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
	 
	
	/* ���(Person)�� ǥ���ϴ� Ŭ������ �����Ͻÿ�.
	 * 	������� : �̸�, ����
	 * 	������ : 1. �̸��� �Է¹޾� ��ü�� ����
	 * 					2. ���̸� �Է¹޾� ��ü�� ����
	 * 					3. �̸��� ���̸� �Է¹޾� ��ü�� ����
	 * 	�޼��� : ��������� getter, setter�� �ۼ��Ͻÿ�
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
