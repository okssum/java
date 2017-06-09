package chap07.sec08.exam02_abstract_method;

/* 추상 메소드 선언 */
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();
}

