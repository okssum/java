package chap06.sec09.exam01_instance_member;

/* 인스턴스 멤버와 this */
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}
