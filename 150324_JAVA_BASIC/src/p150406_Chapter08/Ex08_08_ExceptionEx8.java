package p150406_Chapter08;
/* Exception class�� ����� �޾� MyException Ŭ���� �����
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
			System.out.println("�޸𸮰� �����մϴ�.");
			e.printStackTrace();
		}catch(SpaceException e){
			System.out.println("���� ������ �����մϴ�.");
			System.out.println("ERR_CODE : "+e.ERR_CODE);
			e.printStackTrace();
		}
	}	
	public static class MemoryException extends Exception{
		public MemoryException(){
			super("�޸𸮰� �����մϴ�");
		}
	}
	public static class SpaceException extends Exception {
		final int ERR_CODE;
		public SpaceException(){
			super("��ġ ������ �����մϴ�.");
			ERR_CODE = 10;
		}
		public int getErrCode(){
			return ERR_CODE;
		}
	}
	
}
