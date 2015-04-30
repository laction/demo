package p150423_Chapter15;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
/* InetAddress : IP �ּ� ������ �����ϴ� Ŭ����
 * InetAddress Ŭ������ �������� ���������ڰ� (default) �̹Ƿ� ��ü ���� �Ұ�
 * ��ü ������ ���� 4���� Ŭ���� �޼��带 ������.
 * 1. InetAddress.getByName(String hostname) : hostname�� IP �ּҸ� �����ϴ� InetAddress ��ü�� ����.
 * 2. getAllAddress(String hostname) : hostname�� IP�ּҸ� ����ϴ� ��� ��ǻ���� InetAddress��ü�� ����.
 * 3. getLocalHost : ���μ����� Ip������ InetAddress��ü�� ����.
 * 4. getByAddress(byte[] ip) : ip�ּҸ� ������ �ִ� ��ǻ���� InetAddress��ü�� ����
 * */
public class Ex15_01_NetworkEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.naver.com");
		System.out.println("getHostName() : "+ ip.getHostName());
		System.out.println("getHostAddress() : "+ ip.getAddress());
		
		byte[] ipAddr = ip.getAddress();		// getAddress() : IPv4 ����� 8��Ʈ�� 4������ ����
		System.out.println("" + Arrays.toString(ipAddr));
		String result = "";
		for(int i = 0 ; i < ipAddr.length ; i++){			// MSB�� ������ �ν� �ϹǷ�, 256��ŭ ����
			result += (ipAddr[i]<0) ? ipAddr[i] + 256 : ipAddr[i];
			result += ".";
		}
		System.out.println("getAddress()+256 : "+result);   
		System.out.println();
														// ���� Host�̸��� ����ϴ� ��� ��ǻ���� IP�ּҸ� ����
		InetAddress[] ipArr = InetAddress.getAllByName("www.google.com");		
		for(int i = 0 ; i < ipArr.length ; i++ ){
			System.out.println("ipArr["+i+"]"+ipArr[i]);
		}
				// 
		ip = InetAddress.getLocalHost();		// ���μ����� �ּҸ� ��������
		System.out.println("getHostName() : "+ip.getHostAddress());
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		
		for(int i = 0 ; i < ipArr.length ; i ++)
			System.out.println(InetAddress.getByAddress( ipArr[i].getAddress()).getHostName());
	}
}
