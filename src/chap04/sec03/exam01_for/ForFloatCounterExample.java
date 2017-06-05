package chap04.sec03.exam01_for;

/* float 타입 카운터 변수 */
public class ForFloatCounterExample {
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) { // 루프 카운트 변수를 선언할 때 부동소수점 타입을 사용하지 말아야 함
			System.out.println(x);
		}
	}
}


