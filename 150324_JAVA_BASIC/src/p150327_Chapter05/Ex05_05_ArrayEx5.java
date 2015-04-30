package p150327_Chapter05;
/* 5�� �л��� ����(1) ����(2) ����(3) ������ �Է¹޾� 
 * �л��� ������ ��հ� ���� ������ ����ϴ� ���α׷� �ۼ��ϱ�
 * 		1��		����  ����  ����  ����  ���
 * 		2��		����  ����  ����  ����  ���
 * 			...
 * 		����  �����հ�  �����հ�  �����հ�
 */
public class Ex05_05_ArrayEx5 {
	public enum Subjects {
		����,����,����,eoe
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
		System.out.printf("��ȣ\t\t����\t\t����\t\t����\t\t����\t\t���\n");
		System.out.println("==================================");	
		
		for( int i = 0 ; i < STUDENTS_NUMBER ; i++ ){
			System.out.print((i+1) + "��\t\t");
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
		System.out.print("����\t\t");
		for (int j = 0 ; j < SUBJECTS_NUMBER ; j ++ ){	
			System.out.print(totalScore[j] + "\t\t");
		}	
	}
	public double randomRatio(){
		
		double res = Math.random() + Math.random(); 
		
		return res;
	}
}
//��ȣ		����		����		����		����		���
//==================================
//1��		14		19		64		97		32.3
//2��		15		42		74		131		43.7
//3��		42		60		24		126		42.0
//4��		61		68		9		138		46.0
//5��		19		10		74		103		34.3
//����		151		199		245		