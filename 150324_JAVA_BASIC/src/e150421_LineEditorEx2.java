import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class e150421_LineEditorEx2 {
	public static void main(String[] args) throws IOException {
		File f;		
		try{			f = new File(args[0]);		}
		catch(ArrayIndexOutOfBoundsException e ){	f = new File("noname.txt");	}
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> list = new ArrayList<String>();
		String data ;
		int line = 0;
		while((data = br.readLine())!=null){
			System.out.println(++line + ":"+data);
			list.add(data);
		}
		br.close();fr.close();
		BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			System.out.println("������ ������ �����ϼ���(����:9999)");
			String updatedate = sysin.readLine();
			int uline = Integer.parseInt(updatedate);
			if(uline == 9999)break;
			System.out.println("������ ������ �Է��ϼ���.");
			updatedate = sysin.readLine();
			list.set(uline-1, updatedate);
		}
				// list ��ü�� ����� ������ �����.
		FileWriter fw = new FileWriter(f);
		for( String s : list){
			fw.write(s + "\n");			
		}
		fw.flush();
		fw.close();
		sysin.close();	
	}
}
