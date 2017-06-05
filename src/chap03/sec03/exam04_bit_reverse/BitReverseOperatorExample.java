package chap03.sec03.exam04_bit_reverse;

/* 비트 반전 연산자 */
public class BitReverseOperatorExample {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1; // 비트 반전 연산자 산출값 + 1을 하면 부호가 반대인 정수를 얻을 수 있음
		System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4) + " (십진수: " + v4 + ")");
		System.out.println(toBinaryString(v5) + " (십진수: " + v5 + ")");
		System.out.println(toBinaryString(v6) + " (십진수: " + v6 + ")");
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value); // 정수값을 총 32비트의 이진 문자열로 리턴
		while(str.length() < 32) { //앞의 비트가 모두 0이면 0은 생략되고 나머지 문자열만 리턴됨. 32개의 문자열 모두 얻기
			str = "0" + str;
		}
		return str;
	}
}
