package chap06.sec10.exam01_static_member;

/* 정적 멤버 사용 */
public class Calculator {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}

