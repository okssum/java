package chap12.sec06.exam04_wait_notify;

/* WorkObject의 methodA()를 실행하는 스레드 */
public class ThreadA extends Thread {
	private WorkObject workObject;

	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}

