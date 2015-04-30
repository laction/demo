package p150415_Chapter12;
/* Process : OS상에서 실행되는 프로그램
 * 	Process 클래스 - OS의 프로세스를 관리하는 클래스
 * Runtime 객체 : OS에게 프로세스 실행 권한을 빌려옴
 * */
public class Ex12_01_ProcessEx1 {	
	public static void main(String[] args) {		
		try{
			Process p1 = Runtime.getRuntime().exec("calc.exe");
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			Process p3 = Runtime.getRuntime().exec("notepad.exe");
			p1.waitFor();			// p1 이 종료시까지 내가 대기
			p2.destroy();			// p1 종료후 p2,p3 강제 종료.
			p3.destroy();			// 
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}

