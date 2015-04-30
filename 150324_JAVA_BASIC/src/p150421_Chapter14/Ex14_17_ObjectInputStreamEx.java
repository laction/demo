package p150421_Chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import p150421_Chapter14.Ex14_16_ObjectOutputStreamEx.Customer;

public class Ex14_17_ObjectInputStreamEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"));
		Customer dc1 = (Customer)ois.readObject(); 
		System.out.println("°í°´ 1 : "+dc1);
		Customer dc2 = (Customer)ois.readObject();
		System.out.println("°í°´ 2 : "+dc2);
		dc2.setName("ÀÌ¸ù·æ");
		System.out.println("°í°´ 2 ÀÌ¸§ º¯°æ : "+dc2);
		ois.close();
	}
}
