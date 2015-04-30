package p150401_Chapter07;
// super ������ : �θ� ������ ȣ��
/* �θ�Ŭ������ ������ �� �Ű������� �ִ� �����ڸ� �����ϸ�
 * �ݵ�� �ڼ�Ŭ������ �����ڿ��� super()�� �ڼջ����� ����� �� ó���� ȣ���ؾ� �Ѵ�.
 * 	�Ű������� ���� �θ�Ŭ���� �����ڰ� �����ϸ� super() ���� ����.  
 * */
/* �������̵�.
 * 	�θ�Ŭ������ �޼��带 �ڼ�Ŭ������ �������Ͽ� ���
 * 	�޼����� ����ΰ� �����ؾ��Ѵ�.
 * 	����Ÿ��, �޼����̸� (�Ű�����) �� ��� ���ƾ� ��.
 * 	�ڼո޼����� ���������ڴ� �θ�޼��庸�� �� �������̰ų� ���ƾ� �Ѵ�.
 * 		ex ) protected �θ�޼��� =(�������̵�)=> public �ڼո޼���   
 * */

public class Ex07_03_SuperEx2 {
	public static void main(String[] args) {
		System.out.println(new Point3D(10,20,30).getLocation());
	}	
	public static class Point {
		int x; 
		int y;
		Point(int x , int y){
			this.x = x;
			this.y = y;
		}
		String getLocation(){
			return "x : " + x + ", y : " + y;
		}	
	}
	public static class Point3D extends Point{
		int z;
		Point3D(int x, int y, int z){
//			this.x = x;	// ����
//			this.y = y;
			super(x,y);		// ������ ����ο� �� ���� ����.
			this.z = z;
		}
		@Override			// ��������. �θ��� �޼��带 ������ ��.
		String getLocation(){
			return "x : " + x + ", y : " + y +", z : " + z ;
		}	
	}
}
//x : 10, y : 20, z : 30