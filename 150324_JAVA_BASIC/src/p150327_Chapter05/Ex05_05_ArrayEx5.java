package p150327_Chapter05;
/* 5명 학생의 국어(1) 영어(2) 수학(3) 점수를 입력받아 
 * 학생별 총점과 평균과 과목별 총점을 출력하는 프로그램 작성하기
 * 		1번		국어  영어  수학  총점  평균
 * 		2번		국어  영어  수학  총점  평균
 * 			...
 * 		총점  국어합계  영어합계  수학합계
 */
public class Ex05_05_ArrayEx5 {
	public enum Subjects {
		국어,영어,수학,eoe
	};
	final static int STUDENTS_NUMBER = 5;
	final static int SUBJECTS_NUMBER = Subjects.eoe.ordinal();	
	
	public static void main(String[] args) {		
		int [][] score = new int [STUDENTS_NUMBER][SUBJECTS_NUMBER];
		int [] totalScore = new int [SUBJECTS_NUMBER];
		
		{	for(int i = 0 ; i<STUDENTS_NUMBER ; i++)
				for(int j = 0 ; j<SUBJECTS_NUMBER ; j++)
					score[i][j] = (int)(Math.random()*101);			
		}		
		System.out.printf("번호\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균\n");
		System.out.println("==================================");	
		
		for( int i = 0 ; i < STUDENTS_NUMBER ; i++ ){
			System.out.print((i+1) + "번\t\t");
			for (int j = 0 ; j < SUBJECTS_NUMBER ; j ++ ){	
				System.out.print(score[i][j] + "\t\t");
				totalScore[j] += score[i][j];
			}
			int total = 0;
			float avg = 0;
			for (int j = 0 ; j < SUBJECTS_NUMBER ; j++) total+=score[i][j];
			avg = (float)total / SUBJECTS_NUMBER;
			System.out.println(total + "\t\t" + String.format("%.1f", avg));	
		}
		System.out.print("총합\t\t");
		for (int j = 0 ; j < SUBJECTS_NUMBER ; j ++ ){	
			System.out.print(totalScore[j] + "\t\t");
		}	
	}
	public double randomRatio(){
		
		double res = Math.random() + Math.random(); 
		
		return res;
	}
}
//번호		국어		영어		수학		총점		평균
//==================================
//1번		14		19		64		97		32.3
//2번		15		42		74		131		43.7
//3번		42		60		24		126		42.0
//4번		61		68		9		138		46.0
//5번		19		10		74		103		34.3
//총합		151		199		245		