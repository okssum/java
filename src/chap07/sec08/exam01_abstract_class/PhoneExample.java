package chap07.sec08.exam01_abstract_class;

/* 추상 클래스 */
public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); (x)
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
