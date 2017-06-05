package chap02.sec03.exam03_accuracy;

/* 정수 타입을 실수 타입으로 변환할 때 정밀도 손실을 피한다. */
public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // int 값이 float 가수 23비트로 표현 가능한 값이어야 함
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}

