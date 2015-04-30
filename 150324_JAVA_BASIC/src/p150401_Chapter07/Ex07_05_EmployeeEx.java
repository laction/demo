package p150401_Chapter07;

import java.util.Date;

/* 회사가 고용하는 여러 유형의 직원들을 나타내고자 한다.
 * 
 * 직원은 정규직원과 비정규직원으로 나뉜다.
 * 비정규직원은 임시직원과 인턴사원으로 나뉜다.
 * 
 * 모든 직원은 직원구분(kind), 이름(name), 주소(address)와 소속부서(dept)를 가지고 있다.
 * 추가적으로 정규직원은 직원번호(empNo), 직급(position), 연봉(ySalary)과 보너스지급율(bonusRate)을 가지고 있다.
 * 비정규직원은 계약만료일(expireDate)과 기본 임금(mSalary)을 가지고 있다.
 * 임시 직원은 시간당 임금(hSalary)과 근무 시간(hTime)을 가지고 있고
 * 인턴사원은 임금지급률(payRate) 가지고 있다.
 * 직원 Employee 클래스로
 * 정규직원은 formalEmployee 클래스로
 * 비졍규직원은 InfomalEmployee 클래스로
 * 임시직원은 TempEmployee 클래스로
 * 인턴사원은 InternEmployee 클래스로 한다
 * 
 * 정규직원의 봉급 : (연봉/12 * 보너스 지급율 )
 * 비정규직의 봉급 :  기본임금
 * 임시 직원의 임금: (시간당 임금 * 근무 시간)
 * 인턴사원의 임금 : 기본임금 * 임금 지급율
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
		String empNo;			// 사원번호
		String position;		// 직급
		int ySalary;				// 연봉
		float bonusRate;		// 보너스지급율
		@Override 
		int getPay(){			return	 (int)Math.round(((float)ySalary / 12.0f * (1.0f+ bonusRate)));		}
		public FormalEmployee(String name, String address,
				String dept, String position, int ySalary,
				float bonusRate) {
			super("정규직", name, address, dept);
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
		Date expireDate;		// 계약만료일
		int mSalary ; 			// 기본임금
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
		int hSalary;				// 시간당임금
		int hTime;					// 근무시간
		@Override
		int getPay(){		return hSalary*hTime;	}
		public TempEmployee(String name, String address,
				String dept, Date expireDate, int hSalary,
				int hTime) {
			super("임시직", name, address, dept, expireDate, 0);
			this.hSalary = hSalary;
			this.hTime = hTime;
		}		
		@Override
		public String toString() {			
			return super.toString()+ "\t" +hSalary+ "\t" +hTime;
		}
	}
	public static class InternEmployee extends ImfomalEmployee{
		double payRate;				// 임금지급률
		@Override
		int getPay(){			return (int)(mSalary*payRate);		}
		public InternEmployee(String name, String address,
				String dept, Date expireDate, int mSalary, double payRate) {
			super("인턴", name, address, dept, expireDate, mSalary);
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
				new FormalEmployee("김정규", "서울시 용산구", "홍보팀", "과장", 4000, 0.3f);
		System.out.println(employee);
		TempEmployee tempEmployee = 
				new TempEmployee("이비정", "서울시 성동구", "총무팀", new Date("2016/1/8"), 1, 8);
		System.out.println(tempEmployee);
		InternEmployee internEmployee =	
				new InternEmployee("나인턴", "서울시 구로구", "기획팀", new Date("2015/8/8"), 200, 0.7);
		System.out.println(internEmployee);
				
	}
}
//정규직	김정규	서울시 용산구	홍보팀	00000001	과장	4000	0.3
//임시직	이비정	서울시 성동구	총무팀	Fri Jan 08 00:00:00 KST 2016	0	1	8
//인턴	나인턴	서울시 구로구	기획팀	Sat Aug 08 00:00:00 KST 2015	200	0.7
