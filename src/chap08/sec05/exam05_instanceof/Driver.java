package chap08.sec05.exam05_instanceof;

/* 객체 타입 확인 */
public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
