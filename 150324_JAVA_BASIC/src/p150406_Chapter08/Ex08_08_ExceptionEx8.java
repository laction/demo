package p150406_Chapter08;
/* Exception class를 상속을 받아 MyException 클래스 만들기
 * */
public class Ex08_08_ExceptionEx8 {
	boolean isSpace () {return false;}
	boolean isMemory(){ return true;}
	
	public static void main(String[] args) throws Exception{
		Ex08_08_ExceptionEx8 m = new Ex08_08_ExceptionEx8();
		try{
			if(!m.isMemory())
				throw new MemoryException();
			if(!m.isSpace())
				throw new SpaceException();
		}catch (MemoryException e){
			System.out.println("메모리가 부족합니다.");
			e.printStackTrace();
		}catch(SpaceException e){
			System.out.println("저장 공간이 부족합니다.");
			System.out.println("ERR_CODE : "+e.ERR_CODE);
			e.printStackTrace();
		}
	}	
	public static class MemoryException extends Exception{
		public MemoryException(){
			super("메모리가 부족합니다");
		}
	}
	public static class SpaceException extends Exception {
		final int ERR_CODE;
		public SpaceException(){
			super("설치 공간이 부족합니다.");
			ERR_CODE = 10;
		}
		public int getErrCode(){
			return ERR_CODE;
		}
	}
	
}
