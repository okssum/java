package chap07.sec07.exam05_method_polymorphism;

/* 자식 클래스 */
public class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
