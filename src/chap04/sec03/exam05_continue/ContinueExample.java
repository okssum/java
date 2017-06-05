package chap04.sec03.exam05_continue;

/* continue를 사용한 while문 */
public class  ContinueExample {
	public static void main(String[] args) throws Exception {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}


