package chap07.sec08.exam02_abstract_method;

/* 추상 메소드 오버라이딩 */
public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}