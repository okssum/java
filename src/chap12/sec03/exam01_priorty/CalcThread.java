package chap12.sec03.exam01_priorty;

/* 작업 스레드 */
public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i=0; i<2000000000; i++) {
		}
		System.out.println(getName());
	}
}
