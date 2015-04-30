
public class exam {
	public static void main(String[] args) {		
		for(int i = 2 ; i <= 9 ; i+=3){
			for (int j = 1 ; j<=3 ; j ++){
				for(int k = i ; k<i+3; k++)
					if(k>9) break;
					else		System.out.print(k+"*"+j+"="+(k*j)+"\t\t");
				System.out.println();
			}	System.out.println();	
		}		
	}
}
