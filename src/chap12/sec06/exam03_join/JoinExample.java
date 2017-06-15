package chap12.sec06.exam03_join;

/* 다른 스레드가 종료될 때까지 일시 정지 상태 유지 */
public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}

