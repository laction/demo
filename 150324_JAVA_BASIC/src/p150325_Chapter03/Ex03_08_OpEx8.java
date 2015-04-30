package p150325_Chapter03;
/*아래는 화씨( Fahrenheit)를 섭씨(Celcius)로 변환하는
 * 코드이다. 변환공식이 C=5/9 * (F-32) 라고 할 때,
 * (1)에 알맞는 코드를 넣으시오.
 * 단, 변환 결과값은 소수셋째자리에서 반올림해야한다.
 * */
public class Ex03_08_OpEx8 {
	public static void main(String[] args) {
		int f = 100;
		float c = (float) 5 / 9 * (f - 32); // (1)

		System.out.println("화씨:" + f);
		System.out.println("섭씨:" + c);
		System.out.println("섭씨:" + (((c * 1000 - (c * 1000) % 1) / 1000) // 절삭
				+ (((float) (c * 1000) % 1 >= 0.5f) ? (0.001f) : (0.0f)) // 반올림
				));
	}
}
