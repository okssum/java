package chap08.sec03.exam02_noname_implement_class;

/* 익명 구현 클래스 */
public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() { /*실행문*/ }	
			public void turnOff() { /*실행문*/ }
			public void setVolume(int volume) { /*실행문*/ }
		};
	}
}
