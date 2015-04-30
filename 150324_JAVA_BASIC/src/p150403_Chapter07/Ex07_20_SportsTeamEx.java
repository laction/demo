package p150403_Chapter07;
/* 스포츠 팀을 모델링 하기
 * 변수 : 팀의 이름
 * 			팀의 점수
 * 			팀의 인원
 * 생성자
 * 			매개변수로 팀의 이름, 인원
 * 메서드
 * 			getTeamName()	:	팀이름을 조회
 * 			getTeamScore()	:	팀점수를 조회
 * 			toString()				:	팀의 정보를 조회
 * 			getRule()				:	팀의 게임방식 조회
 * 
 * 농구팀 클래스
 * 		생성자 매개변수 없는 생성자
 * 			getRule()				:	팀의 게임방식 조회
 * 배구팀 클래스
 * 야구팀 클래스
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
		BaseBallTeam(){			super("야구팀",9);		}		
		@Override		public String getRule() {			return "노 벤치클리어링";		}		
	}
	public static class BasketBallTeam extends SportsTeam{
		BasketBallTeam(){			super("농구팀",5);		}		
		@Override		public String getRule() {			return "마이클조단 영입";		}		
	}
	public static class SoccerTeam extends SportsTeam{
		SoccerTeam(){			super("축구팀",11);		}		
		@Override		public String getRule() {			return "메시를 이길수 없어";		}		
	}
	public static class ValleyBallTeam extends SportsTeam{
		ValleyBallTeam(){			super("배구팀",6);		}		
		@Override		public String getRule() {			return "잘 모름";		}		
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
			return (	"팀이름 : "	+	name + "\n"
					+ 		"팀점수 : "	+	score + "\n" 
					+ 		"팀인원 : "	+	crewNum + "\n"
					+		"팀규칙 : "	+ getRule() + "\n"
					);
		}
		public abstract String getRule();
	}	
}
//팀이름 : 농구팀
//팀점수 : 0
//팀인원 : 5
//팀규칙 : 마이클조단 영입
//
//팀이름 : 배구팀
//팀점수 : 0
//팀인원 : 6
//팀규칙 : 잘 모름
//
//팀이름 : 축구팀
//팀점수 : 0
//팀인원 : 11
//팀규칙 : 메시를 이길수 없어
//
//팀이름 : 배구팀
//팀점수 : 0
//팀인원 : 6
//팀규칙 : 잘 모름
//

