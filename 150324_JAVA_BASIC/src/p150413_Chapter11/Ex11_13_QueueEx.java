package p150413_Chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/* Queue 인터페이스 예제
 * LinkedList가 구현 클래스
 * Queue의 주요 메서드
 * 	offer(Object) 	: 큐에서 데이터를 저장하는 기능
 * 	pool()					: 큐에서 데이터를 꺼내고 데이터를 리턴
 * 	peek()				: 큐에서 데이터를 조회하여 리턴
 * 
 *  Stack의 주요 메서드
 *  	push(Object)	: 스택에 데이터를 저장
 *  	pop()					: 스택으로부터 데이터를 꺼내고, 데이터를 리턴한다.
 */
public class Ex11_13_QueueEx {
	public static void main(String[] args) {
		String [] cars = {"소나타", "그랜저", "SMS", "K5"};
		Queue<String> queue = new LinkedList<String>();
		for(String c : cars)		queue.offer(c);
		System.out.println("큐크기 : "+queue.size());
		String data = "";
		while((data = queue.poll()) != null)
			System.out.print(data + " 삭제    ");		
		System.out.println("\n큐크기 : "+queue.size());
		
		System.out.println("---------------------------");
		
		Stack<String> stack = new Stack<String>();
		for(String s : cars)		stack.push(s);
		System.out.println(stack.peek());
		System.out.println("스택 크기 : " + stack.size());
		while(!stack.empty())
			System.out.print(stack.pop()+ " ");
		System.out.println();
		System.out.println("스택 크기 : " + stack.size());
	}
}
//큐크기 : 4
//소나타 삭제    그랜저 삭제    SMS 삭제    K5 삭제    
//큐크기 : 0
//---------------------------
//K5
//스택 크기 : 4
//K5 SMS 그랜저 소나타 
//스택 크기 : 0
