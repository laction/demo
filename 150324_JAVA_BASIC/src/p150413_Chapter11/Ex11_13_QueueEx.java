package p150413_Chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/* Queue �������̽� ����
 * LinkedList�� ���� Ŭ����
 * Queue�� �ֿ� �޼���
 * 	offer(Object) 	: ť���� �����͸� �����ϴ� ���
 * 	pool()					: ť���� �����͸� ������ �����͸� ����
 * 	peek()				: ť���� �����͸� ��ȸ�Ͽ� ����
 * 
 *  Stack�� �ֿ� �޼���
 *  	push(Object)	: ���ÿ� �����͸� ����
 *  	pop()					: �������κ��� �����͸� ������, �����͸� �����Ѵ�.
 */
public class Ex11_13_QueueEx {
	public static void main(String[] args) {
		String [] cars = {"�ҳ�Ÿ", "�׷���", "SMS", "K5"};
		Queue<String> queue = new LinkedList<String>();
		for(String c : cars)		queue.offer(c);
		System.out.println("ťũ�� : "+queue.size());
		String data = "";
		while((data = queue.poll()) != null)
			System.out.print(data + " ����    ");		
		System.out.println("\nťũ�� : "+queue.size());
		
		System.out.println("---------------------------");
		
		Stack<String> stack = new Stack<String>();
		for(String s : cars)		stack.push(s);
		System.out.println(stack.peek());
		System.out.println("���� ũ�� : " + stack.size());
		while(!stack.empty())
			System.out.print(stack.pop()+ " ");
		System.out.println();
		System.out.println("���� ũ�� : " + stack.size());
	}
}
//ťũ�� : 4
//�ҳ�Ÿ ����    �׷��� ����    SMS ����    K5 ����    
//ťũ�� : 0
//---------------------------
//K5
//���� ũ�� : 4
//K5 SMS �׷��� �ҳ�Ÿ 
//���� ũ�� : 0
