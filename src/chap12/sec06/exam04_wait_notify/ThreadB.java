package chap12.sec06.exam04_wait_notify;

/* WorkObject의 methodB()를 실행하는 스레드 */
public class ThreadB extends Thread {
	private WorkObject workObject;

	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
}
