package p150423_Chapter15;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
/* InetAddress : IP 주소 정보를 관리하는 클래스
 * InetAddress 클래스의 생성자의 접근제어자가 (default) 이므로 객체 생성 불가
 * 객체 생성을 위한 4개의 클래스 메서드를 제공함.
 * 1. InetAddress.getByName(String hostname) : hostname인 IP 주소를 관리하는 InetAddress 객체를 리턴.
 * 2. getAllAddress(String hostname) : hostname인 IP주소를 사용하는 모든 컴퓨터의 InetAddress객체를 리턴.
 * 3. getLocalHost : 프로세스의 Ip정보의 InetAddress객체를 리턴.
 * 4. getByAddress(byte[] ip) : ip주소를 가지고 있는 컴퓨터의 InetAddress객체를 리턴
 * */
public class Ex15_01_NetworkEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.naver.com");
		System.out.println("getHostName() : "+ ip.getHostName());
		System.out.println("getHostAddress() : "+ ip.getAddress());
		
		byte[] ipAddr = ip.getAddress();		// getAddress() : IPv4 방식의 8비트씩 4개정보 리턴
		System.out.println("" + Arrays.toString(ipAddr));
		String result = "";
		for(int i = 0 ; i < ipAddr.length ; i++){			// MSB를 보수로 인식 하므로, 256만큼 보정
			result += (ipAddr[i]<0) ? ipAddr[i] + 256 : ipAddr[i];
			result += ".";
		}
		System.out.println("getAddress()+256 : "+result);   
		System.out.println();
														// 같은 Host이름을 사용하는 모든 컴퓨터의 IP주소를 리턴
		InetAddress[] ipArr = InetAddress.getAllByName("www.google.com");		
		for(int i = 0 ; i < ipArr.length ; i++ ){
			System.out.println("ipArr["+i+"]"+ipArr[i]);
		}
				// 
		ip = InetAddress.getLocalHost();		// 프로세스의 주소를 가져오기
		System.out.println("getHostName() : "+ip.getHostAddress());
		System.out.println("getHostAddress() : " + ip.getHostAddress());
		
		for(int i = 0 ; i < ipArr.length ; i ++)
			System.out.println(InetAddress.getByAddress( ipArr[i].getAddress()).getHostName());
	}
}
