package p150406_Chapter08;
/* finally : 정상적이거나, 예외발생시 모두 실행되는 블럭
 * 예외발생시 return 구문이 실행되어도 finally 블럭은 실행된다.
 * */
public class Ex08_03_ExceptionEx3 {
	public static void main(String[] args) {
		try {
			System.out.println("1.Before Error");
			System.out.println("2.Error Occure"+1/0);
		} catch (Exception e) {
			System.out.println("3.Error Occure");
			return;			
		}finally {
			System.out.println("4.Finally Block");
		}
		System.out.println("5.After Try-Block");
	}
}
//1.Before Error
//3.Error Occure
//4.Finally Block
