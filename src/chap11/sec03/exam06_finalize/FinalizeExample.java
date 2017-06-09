package chap11.sec03.exam06_finalize;

/* finalize() 메소드 실행 확인 */
public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for(int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			counter = null; // Counter 객체를 쓰레기로 만듬
			System.gc(); // 쓰레기 수집기 실행 요청
		}
	}
}
