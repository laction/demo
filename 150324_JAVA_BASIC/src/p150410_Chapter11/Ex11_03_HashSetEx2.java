package p150410_Chapter11;

import java.util.HashSet;
/* Set객체의 중복여부 확인에 필요한 메서드
 * 
 * equals() : 결과가 참이면 중복대상
 * hashCode() : 결과가 동일하면 중복대상
 * 	두가지 메서드의 결과가 참이고 해쉬값이 같은경우 중복객체로 본다.
 * */
class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person(" + name +","+ age + ")";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof  Person){
			Person p = (Person)obj;
			if(name.equals(p.name) && age == p.age)
				return true;
			else return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
class t {}

public class Ex11_03_HashSetEx2 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		System.out.println(new Person("David1",10).hashCode());
		System.out.println(new Person("David3",10).hashCode());
		System.out.println(set);
	}
}

//2039983207
//2039983209
//[Person(David,10), abc]
