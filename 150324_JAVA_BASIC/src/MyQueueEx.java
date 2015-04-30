
/* Queue 인터페이스를 작성하라
	 *    boolean isEmpty();		// 큐의 내용이 없는지 여부를 리턴
	 *    void add(int x);			// 큐의 마지막에 내용을 추가
	 *    int del();							// 큐의 마지막의 내용을 제거
	 * */
interface Queue{
		boolean isEmpty();		// 큐의 내용이 없는지 여부를 리턴
		void add(int x);			// 큐의 마지막에 내용을 추가
		int del();						// 큐의 마지막의 내용을 제거
}


/* First-In-First-Out의 특성을 가지는 자료 구조 큐를 구현하는 프로그램을 작성하시오.
 * 출력 프로그램은 다음과 같은 제한 사항을 가진다.
 * 	① 큐에 들어갈 수 있는 자료는 정수로 한정한다.
 *		② 큐는 50개의 요소를 가진 배열로 구현한다.
 * 		큐에는 50개 이상의 요소가 저장될 수 없다고 가정한다.
 * 		50개가 넘으면 큐가 차 있다는 메시지를 출력하고 프로그램 종료
 * 	③ 아래에 정의된 인터페이스를 사용한다.
 *  		큐의 기능은 데이터를 입력하고, 입력된 데이터를 출력하는 기능이 있다. 
 * 	④ 큐가 현재 비어있는지를 검사하는 기능이 있다.
 * 		데이터를 출력할 때 큐에 데이터가 없으면 데이터가 없다는 메시지를 출력하고 프로그램 종료
 * 	⑤ 데이터가 입력되거나 출력될 때 메시지를 출력한다.
 * */

public class MyQueueEx implements Queue {

	public static void main(String[] args) {
		MyQueueEx q = new MyQueueEx();
		
		for(int i = 0 ; i < 10 ; i ++)
			q.add((int)(100.0*Math.random()));
		
		q.add(120,9);
		q.view();
//		for(int i = 0 ; i < 51; i++)
//			q.del();
//		q.view();
	}
	
	
	final static int length = 50;
	int [] e = new int [length];
	int cnt = 0 ;	
	int tail = 0 ;
	
	@Override
	public void add(int x) {
			add(x,cnt);
	}
	public void add(int x, int idx){
		if(cnt>=50) { 
			System.out.println("큐가 꽉참");
			System.exit(0);
		}else{
			System.out.println(x+ " 입력.");
		
			if (idx >= cnt)	e[cnt] = x;
			else {					
				for(int i = idx ; i < cnt; i++)
					e[i+1] = e[i];
				e[idx] = x;
			}
		}
		cnt++;
	}
	@Override
	public int del() {
		int output = e[0];
		if(cnt<=0){
			System.out.println("큐가 비어있음");
			System.exit(0);
		}
		for(int i = 0 ; i < cnt-1 ; i++){
			e[i] = e[i+1];
		}
		cnt--;
		System.out.println(output + " 출력.");
		return output;
	}
	@Override	public boolean isEmpty() {				return cnt<=0;		}
	void view () {	
		for(int i = 0 ; i < cnt ; i ++)
			System.out.print(String.format("%4.0f"+((i%10==9)?"\n":""),(double)e[i]));
	}
	
	
}