package chap11.sec12.exam01_wrapper;

/* 자동 박싱과 언박싱 */
public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
	
		//대입시 자동 Unboxing
		int value = obj;  	
		System.out.println("value: " + value);
		
		//연산시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}

