import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class ����̱� {
	
	final static int ����� = 12;
	final static int �̱�� = 12;
	final static int ��_����� = 4;
	
	final static boolean �ߺ���� = false;
	
	static ArrayList<String> �ߺ���� = new ArrayList<String>();	
	
	public static void main(String[] args) throws Exception {				
		Map<String, String> �� = new HashMap<>();
		Map<String, String> �� = new HashMap<>();
		
//		Properties Pr
		
		for(int j = 0 ; j < 1 ; j ++){
			for(int i =0 ; i < �̱�� ; i++){			
				if(�ߺ����.size() >= �����) �ߺ����.clear();
				
				String ������� = ����̱�();
				if(�ߺ���� || !!! �ߺ����.contains(�������)){
					�ߺ����.add(�������);		
				}
				else { i--; continue;}
				System.out.print(�ߺ����.get(i)+"\t");	
				if(i == �̱��/2-1) System.out.println();
			}
			System.out.println();System.out.println();
		}
//		
//		File f = new File("���.txt");
//		Scanner sc = new Scanner(f);
//		while(sc.hasNext())
//			System.out.println(sc.nextLine());
//		File f2 = new File("���.txt");		
//		
//		f2.setWritable(true);	
//		f2.createNewFile();		
//		
//		 try {
//		      ////////////////////////////////////////////////////////////////
//		      BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
//		      String s = "��� ���Ͽ� ����� �̷� ���� ���ڿ��Դϴ�.";
//
//		      out.write(s); out.newLine();
//		      out.write(s); out.newLine();
//
//		      out.close();
//		      ////////////////////////////////////////////////////////////////
//		    } catch (IOException e) {
//		        System.err.println(e); // ������ �ִٸ� �޽��� ���
//		        System.exit(1);
//		    }
		
		
		
		
		// �����б�
//		File f = new File("���.txt");
//		Scanner sc = new Scanner(f);
//		while(sc.hasNext())
//			System.out.println(sc.nextLine());
//		File f2 = new File("���.txt");		
		// �м�
		// L1. ��� ���
		// L2. ��� ���
		// C3. �߸��� �Է� ó�� - �����޽���, L2
		// C4. ���� �ʱ�ȭ - L2
		// C5. ���� - ���� ����
		// ����
	}
	
	static class ���{
		���(){}
		���(String codeStr){};
	}
	
	
	
	private static String ����̱�(){
		
		double t=0;
		try{	for(int j = 0 ; j < �����*����� ; j ++)		t+=Math.random();	}
		catch(Exception e){}
		
		int result = (int)(t*�����*�����)%�����+1;			
		int �� =  (result-1) / ��_����� + 1;
		int �� = (result-1) % ��_����� + 1;		
		return result+"\t"+��+"�� "+��+"��";
	}
}
