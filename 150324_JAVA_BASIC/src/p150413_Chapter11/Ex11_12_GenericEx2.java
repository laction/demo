package p150413_Chapter11;

public class Ex11_12_GenericEx2<T> {
	T v ;
	Ex11_12_GenericEx2(T n){		v=n;	}
	T get(){return v;}
	
	public static void main(String[] args) {
					// ? super GenericEx2 : GenericEx2�� �θ�Ŭ������ GenericEx2�� ���.
			Ex11_12_GenericEx2<? super Father> allowSuper;
			allowSuper = new Ex11_12_GenericEx2<Ancestor>(new Child());
			allowSuper = new Ex11_12_GenericEx2<Father>(new Child());
		//	allowSuper = new Ex11_12_GenericEx2<Child>(new Child());		// ������ ����.
			
			System.out.println("C.msg	: "+((Child)allowSuper.get()).msg);
			System.out.println("C.get	: "+((Child)allowSuper.get()).getMsg());
			System.out.println("F.msg	: "+((Father)allowSuper.get()).msg);
			System.out.println("F.get	: "+((Father)allowSuper.get()).getMsg());
			System.out.println("A.msg	: "+((Ancestor)allowSuper.get()).msg);
			System.out.println("A.get	: "+((Ancestor)allowSuper.get()).getMsg());
			
			System.out.println("------------<? super Father>----------------");
			
					// <? extends GenEx2> : GenericEx2�� �ڼ�Ŭ������ GenericEx2�� ���
			Ex11_12_GenericEx2<? extends Father> allowExtends; 
		//	allowExtends = new Ex11_12_GenericEx2<Ancestor>(new Child());	// ������ ����.
			allowExtends = new Ex11_12_GenericEx2<Father>(new Child());
			allowExtends = new Ex11_12_GenericEx2<Child>(new Child());
			
			System.out.println("C.msg	: "+((Child)allowExtends.get()).msg);
			System.out.println("C.get	: "+((Child)allowExtends.get()).getMsg());
			System.out.println("F.msg	: "+((Father)allowExtends.get()).msg);
			System.out.println("F.get	: "+((Father)allowExtends.get()).getMsg());
			System.out.println("A.msg	: "+((Ancestor)allowExtends.get()).msg);
			System.out.println("A.get	: "+((Ancestor)allowExtends.get()).getMsg());
			
			System.out.println("-------------<? extends Father>---------------");
			
				// <?> : ����Ÿ���̵� �������. ? extends Object �� ����.
			Ex11_12_GenericEx2<?> allowEveryone = new Ex11_12_GenericEx2<Child>(new Child());
			allowEveryone = new Ex11_12_GenericEx2<Ancestor>(new Child());
			allowEveryone = new Ex11_12_GenericEx2<Father>(new Child());
			allowEveryone = new Ex11_12_GenericEx2<Child>(new Child());
			
			System.out.println("C.msg	: "+((Child)allowEveryone.get()).msg);
			System.out.println("C.get	: "+((Child)allowEveryone.get()).getMsg());
			System.out.println("F.msg	: "+((Father)allowEveryone.get()).msg);
			System.out.println("F.get	: "+((Father)allowEveryone.get()).getMsg());
			System.out.println("A.msg	: "+((Ancestor)allowEveryone.get()).msg);
			System.out.println("A.get	: "+((Ancestor)allowEveryone.get()).getMsg());
			
			System.out.println("-------------<?>---------------");
			System.out.println("--super�� ����ϸ� \"������,������\"����, extends�� ����ϸ� \"�����\"���� ���--");
	}
	static class Ancestor {
		String msg = "Ancestor";
		String getMsg(){return msg;}		
	}
	static class Father extends Ancestor{
		String msg = "Father";
		String getMsg(){return msg;}		
	}
	static class Child extends Father{
		String msg = "Child";
		String getMsg(){return msg;}		
	}
}
//C.msg	: Child
//C.get	: Child
//F.msg	: Father
//F.get	: Child
//A.msg	: Ancestor
//A.get	: Child
//------------<? super Father>----------------
//C.msg	: Child
//C.get	: Child
//F.msg	: Father
//F.get	: Child
//A.msg	: Ancestor
//A.get	: Child
//-------------<? extends Father>---------------
//C.msg	: Child
//C.get	: Child
//F.msg	: Father
//F.get	: Child
//A.msg	: Ancestor
//A.get	: Child
//-------------<?>---------------
//--super�� ����ϸ� "������,������"����, extends�� ����ϸ� "�����"���� ���--
