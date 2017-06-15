package chap12.sec02.exam02_threadname;

/* TreadA 클래스 */
public class ThreadA extends Thread {	
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {		
		for(int i=0; i<2; i++) {		
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}

