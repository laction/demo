package p150327_Chapter05;
// command 라인에서 입력받기
public class Ex05_06_ArrayEx6 {
	public static void main(String[] args){
		System.out.println(args.length);
		for( int i = 0 ; i <args.length ; i ++ ){
			System.out.println("args["+i+"]=" + args[i]);
		}
	}
}
