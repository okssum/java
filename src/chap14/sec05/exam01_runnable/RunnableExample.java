package chap14.sec05.exam01_runnable;

/* 함수적 인터페이스와 람다식 */
public class RunnableExample { 
	public static void main(String[] args) {
		/*Runnable runnable = () -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		};
    	
		Thread thread = new Thread(runnable);
		thread.start();*/
		
		Thread thread = new Thread(() -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		});
		thread.start();
	}
}











