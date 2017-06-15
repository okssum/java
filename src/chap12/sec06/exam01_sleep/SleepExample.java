package chap12.sec06.exam01_sleep;

import java.awt.Toolkit;

/* 3초 주기로 10번 비프음 발생 */
public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();		
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {			
			}		
		}	
	}
}
