package p150421_Chapter14;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

// RandomAccessFile ���� 2
public class Ex14_15_RandomAccessFileEx2{
	public static void main(String[] args) throws IOException{
		int score [] = {1,100,90,90,
				2,70,90,100,
				3,100,100,100,
				4,70,60,80,
				5,70,90,100};
		int sum = 0;
		RandomAccessFile ra = new RandomAccessFile("score.dat","rw");
		for(int i = 0 ; i < score.length ; i++)
			ra.writeInt(score[i]);
		ra.seek(0);
		try{
//			while(true)
//				System.out.println(ra.readInt());
			int seek = 4;		// �ι�° int������ �б�		
			int data = 0;
			while(true){
				ra.seek(seek);
				sum+=ra.readInt();
				seek += 16;			// ���� 4��° int �� �б�
			}
		}catch(EOFException e){
			System.out.println("������ �� �о����ϴ�.");
		}
		System.out.println(sum);		
	}
}
