package p150403_Chapter07;
/* ������ ���� �𵨸� �ϱ�
 * ���� : ���� �̸�
 * 			���� ����
 * 			���� �ο�
 * ������
 * 			�Ű������� ���� �̸�, �ο�
 * �޼���
 * 			getTeamName()	:	���̸��� ��ȸ
 * 			getTeamScore()	:	�������� ��ȸ
 * 			toString()				:	���� ������ ��ȸ
 * 			getRule()				:	���� ���ӹ�� ��ȸ
 * 
 * ���� Ŭ����
 * 		������ �Ű����� ���� ������
 * 			getRule()				:	���� ���ӹ�� ��ȸ
 * �豸�� Ŭ����
 * �߱��� Ŭ����
 * */
public class Ex07_20_SportsTeamEx {
	
	public static void main(String[] args) {
		SportsTeam t [] = new SportsTeam[] {
						new BasketBallTeam(),
						new ValleyBallTeam(),
						new SoccerTeam(),
						new ValleyBallTeam()
					};
		for(SportsTeam team : t){
			System.out.println(team);
		}
	}
	
	public static class BaseBallTeam extends SportsTeam{
		BaseBallTeam(){			super("�߱���",9);		}		
		@Override		public String getRule() {			return "�� ��ġŬ���";		}		
	}
	public static class BasketBallTeam extends SportsTeam{
		BasketBallTeam(){			super("����",5);		}		
		@Override		public String getRule() {			return "����Ŭ���� ����";		}		
	}
	public static class SoccerTeam extends SportsTeam{
		SoccerTeam(){			super("�౸��",11);		}		
		@Override		public String getRule() {			return "�޽ø� �̱�� ����";		}		
	}
	public static class ValleyBallTeam extends SportsTeam{
		ValleyBallTeam(){			super("�豸��",6);		}		
		@Override		public String getRule() {			return "�� ��";		}		
	}
	
	public static abstract class SportsTeam{
		private String name;
		private int score;
		private int crewNum;
		
		public String getName() {			return name;		}
		public void setName(String name) {			this.name = name;		}
		public int getScore() {			return score;		}
		public void setScore(int score) {			this.score = score;		}
		public int getCrewNum() {			return crewNum;		}
		public void setCrewNum(int crewNum) {			this.crewNum = crewNum;		}
		
		public SportsTeam(String name, int crewNum) {
			this.name = name; this.crewNum = crewNum;
		}	
		public  String toString(){
			return (	"���̸� : "	+	name + "\n"
					+ 		"������ : "	+	score + "\n" 
					+ 		"���ο� : "	+	crewNum + "\n"
					+		"����Ģ : "	+ getRule() + "\n"
					);
		}
		public abstract String getRule();
	}	
}
//���̸� : ����
//������ : 0
//���ο� : 5
//����Ģ : ����Ŭ���� ����
//
//���̸� : �豸��
//������ : 0
//���ο� : 6
//����Ģ : �� ��
//
//���̸� : �౸��
//������ : 0
//���ο� : 11
//����Ģ : �޽ø� �̱�� ����
//
//���̸� : �豸��
//������ : 0
//���ο� : 6
//����Ģ : �� ��
//

