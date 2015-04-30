package p150401_Chapter07;

import java.util.Date;

/* ȸ�簡 ����ϴ� ���� ������ �������� ��Ÿ������ �Ѵ�.
 * 
 * ������ ���������� �������������� ������.
 * ������������ �ӽ������� ���ϻ������ ������.
 * 
 * ��� ������ ��������(kind), �̸�(name), �ּ�(address)�� �ҼӺμ�(dept)�� ������ �ִ�.
 * �߰������� ���������� ������ȣ(empNo), ����(position), ����(ySalary)�� ���ʽ�������(bonusRate)�� ������ �ִ�.
 * ������������ ��ุ����(expireDate)�� �⺻ �ӱ�(mSalary)�� ������ �ִ�.
 * �ӽ� ������ �ð��� �ӱ�(hSalary)�� �ٹ� �ð�(hTime)�� ������ �ְ�
 * ���ϻ���� �ӱ����޷�(payRate) ������ �ִ�.
 * ���� Employee Ŭ������
 * ���������� formalEmployee Ŭ������
 * ������������ InfomalEmployee Ŭ������
 * �ӽ������� TempEmployee Ŭ������
 * ���ϻ���� InternEmployee Ŭ������ �Ѵ�
 * 
 * ���������� ���� : (����/12 * ���ʽ� ������ )
 * ���������� ���� :  �⺻�ӱ�
 * �ӽ� ������ �ӱ�: (�ð��� �ӱ� * �ٹ� �ð�)
 * ���ϻ���� �ӱ� : �⺻�ӱ� * �ӱ� ������
 */
public class Ex07_05_EmployeeEx {
	public static class Employee{
		String kind;
		String name;
		String address;
		String dept;
		
		private static int empCnt = 0;
		protected int grantEmpNumber(){ return ++empCnt;}
		
		int getPay(){		return 0;	}
		public Employee(String kind, String name, String address, String dept) {
			super();
			this.kind = kind;
			this.name = name;
			this.address = address;
			this.dept = dept;			
		}
		@Override
		public String toString() {
			return  kind+ "\t" +name+ "\t" +address+ "\t" +dept;
		}
	}
	public static class FormalEmployee extends Employee{
		String empNo;			// �����ȣ
		String position;		// ����
		int ySalary;				// ����
		float bonusRate;		// ���ʽ�������
		@Override 
		int getPay(){			return	 (int)Math.round(((float)ySalary / 12.0f * (1.0f+ bonusRate)));		}
		public FormalEmployee(String name, String address,
				String dept, String position, int ySalary,
				float bonusRate) {
			super("������", name, address, dept);
			this.position = position;
			this.ySalary = ySalary;
			this.bonusRate = bonusRate;
			
			this.empNo = String.format("%08d", grantEmpNumber());
		}		
		@Override
		public String toString() {
			return super.toString()+ "\t" +empNo+ "\t" +position+ "\t" +ySalary+ "\t" +bonusRate;
		}
	}
	public static class ImfomalEmployee extends Employee{
		Date expireDate;		// ��ุ����
		int mSalary ; 			// �⺻�ӱ�
		@Override
		int getPay(){		return mSalary;}
		public ImfomalEmployee(String kind, String name, String address,
				String dept, Date expireDate, int mSalary) {
			super(kind, name, address, dept);
			this.expireDate = expireDate;
			this.mSalary = mSalary;
		}		
		@Override
		public String toString() {
			return super.toString()+ "\t" +expireDate+ "\t" +mSalary;
		}
	}
	public static class TempEmployee extends ImfomalEmployee{
		int hSalary;				// �ð����ӱ�
		int hTime;					// �ٹ��ð�
		@Override
		int getPay(){		return hSalary*hTime;	}
		public TempEmployee(String name, String address,
				String dept, Date expireDate, int hSalary,
				int hTime) {
			super("�ӽ���", name, address, dept, expireDate, 0);
			this.hSalary = hSalary;
			this.hTime = hTime;
		}		
		@Override
		public String toString() {			
			return super.toString()+ "\t" +hSalary+ "\t" +hTime;
		}
	}
	public static class InternEmployee extends ImfomalEmployee{
		double payRate;				// �ӱ����޷�
		@Override
		int getPay(){			return (int)(mSalary*payRate);		}
		public InternEmployee(String name, String address,
				String dept, Date expireDate, int mSalary, double payRate) {
			super("����", name, address, dept, expireDate, mSalary);
			this.payRate = payRate;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+ "\t" +payRate;
		}
	}	
	public static void main(String[] args) {
		FormalEmployee employee = 
				new FormalEmployee("������", "����� ��걸", "ȫ����", "����", 4000, 0.3f);
		System.out.println(employee);
		TempEmployee tempEmployee = 
				new TempEmployee("�̺���", "����� ������", "�ѹ���", new Date("2016/1/8"), 1, 8);
		System.out.println(tempEmployee);
		InternEmployee internEmployee =	
				new InternEmployee("������", "����� ���α�", "��ȹ��", new Date("2015/8/8"), 200, 0.7);
		System.out.println(internEmployee);
				
	}
}
//������	������	����� ��걸	ȫ����	00000001	����	4000	0.3
//�ӽ���	�̺���	����� ������	�ѹ���	Fri Jan 08 00:00:00 KST 2016	0	1	8
//����	������	����� ���α�	��ȹ��	Sat Aug 08 00:00:00 KST 2015	200	0.7
