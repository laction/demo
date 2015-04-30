package p150420_Chapter14;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

// ByteArray 스트림 예제
public class Ex14_04_IOEx1 {
	public static void main(String[] args) {
		byte [] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte [] outSrc = null;
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		int data = 0 ; 
		while((data = input.read()) != -1)
			output.write(data);
		outSrc = output.toByteArray();
		System.out.println("input Source : "+
										Arrays.toString(inSrc));
		System.out.println("output Source : "+
										Arrays.toString(outSrc));
		
	}
}
//input Source : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//output Source : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
