package chap07.sec07.exam02_promotion_access;

/* 자동 타입 변환 후의 멤버 접근 */
public class ChildExample {
	public static void main(String[] args) {
		  Child child = new Child();

		  Parent parent = child; // 자동 타입 변환

		  parent.method1();

		  parent.method2(); // 오버라이딩 된 메소드가 호출됨

		  //parent.method3();  (호출 불가능)
	}
}
