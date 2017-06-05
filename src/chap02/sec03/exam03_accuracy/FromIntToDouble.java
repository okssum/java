package chap02.sec03.exam03_accuracy;

/* 정수 타입을 실수 타입으로 변환할 때 정밀도 손실을 피한다. */
public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2; // int 크기는 32비트. double의 가수 52비트보다 작기 때문에 어떠한 int 값이라도 변환 가능
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}

