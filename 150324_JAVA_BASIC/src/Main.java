import java.util.*;
public class Main {
	public static void main(String[] args) {

		int cnt = 0 ;
		int sort = 0 ;

		@SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
		
		cnt = cin.nextInt();
		sort = cin.nextInt();			
	

		switch (sort) {
		case 1:
			for (int i = 0; i < cnt; i++) {
				for (int j = 0; j < cnt; j++)
					System.out.print((i >= j) ? "*" : "");
				System.out.println();
			}
			break;
		case 2:
			for (int i = 0; i < cnt; i++) {
				for (int j = 0; j < cnt; j++)
					System.out.print((j >= i) ? "*" : "");
				System.out.println();
			}
			break;
		case 3:
			for (int i = 0; i < cnt; i++) {
				for (int j = cnt - 1; j > 0; j--)
					System.out.print((i >= j) ? "*" : " ");
				for (int j = 0; j < cnt; j++)
					System.out.print((i >= j) ? "*" : "");
				System.out.println();
			}
			break;
		}

	}

}
